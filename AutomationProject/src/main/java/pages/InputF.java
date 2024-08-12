package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputF {
	
	WebDriver driver;
	
	public InputF(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);//Page factory defined
	}
@FindBy(xpath="//input[@id='value-a']") WebElement entevaluea;
@FindBy(xpath="//input[@id='value-b']") WebElement entervalueb;
@FindBy(xpath="//button[@id='button-two']") WebElement gettotal;

public void entervalueforA(String valuea) {
	entevaluea.sendKeys(valuea);
}


public void entervalueforB(String valueb) {
	entervalueb.sendKeys(valueb);
}

public void clickgettotal() {
	gettotal.click();
}
	
}
