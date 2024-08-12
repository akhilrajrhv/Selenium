package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputMessage {
	
WebDriver driver;
	
	public InputMessage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);//Page factory defined
	}

	@FindBy(xpath="//input[@id='single-input-field']") WebElement entemessage;
	@FindBy(xpath="//button[@id='button-one']") WebElement showmessage;
	
	
	public void message(String mess) {
		entemessage.sendKeys(mess);
	}

	public void clickbutton() {
		showmessage.click();
	}
		
}
