package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends BaseClass {
	
	public void singleinput() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		WebElement click_showmessage=driver.findElement(By.id("button-one"));
		message.sendKeys("Test Message");
		click_showmessage.click();
	}
	
	public void twoinput() {
		
		WebElement valuea=driver.findElement(By.id("value-a"));
		WebElement valueb=driver.findElement(By.id("value-b"));
		WebElement click_gettotal=driver.findElement(By.id("button-two"));
		valuea.sendKeys("10");
		valueb.sendKeys("20");
		click_gettotal.click();
		System.out.println(click_gettotal.getText());
		
		
	}

	public static void main(String[] args) {
		InputForm obj=new InputForm();
		obj.initializebrowser();
		obj.singleinput();
		obj.twoinput();
		obj.driverQuitClose();
		
	}

}
