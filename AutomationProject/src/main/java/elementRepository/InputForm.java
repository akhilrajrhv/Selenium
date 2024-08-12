package elementRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputForm extends BaseClass {
	
	public void singleinput() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Test Message");
		
		//Explict Wait
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement click_showmessage=driver.findElement(By.id("button-one"));
		wait.until(ExpectedConditions.elementToBeClickable(click_showmessage));
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
