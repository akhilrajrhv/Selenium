package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleForm extends BaseClass{
	
	WebDriver  driver;
	
	public void inputfields() {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement single_inputfield= driver.findElement(By.id("single-input-field"));
		WebElement button_showmessage= driver.findElement(By.id("button-one"));
		WebElement multia_inputfield= driver.findElement(By.id("value-a"));
		WebElement multib_inputfield= driver.findElement(By.id("value-b"));
		WebElement button_gettotal= driver.findElement(By.id("button-two"));
		
		single_inputfield.sendKeys("This is a test message");
		button_showmessage.click();
		
		multia_inputfield.sendKeys("1400");
		multib_inputfield.sendKeys("1200");
		button_gettotal.click();
		
		
	}

	public static void main(String[] args) {
		
		SimpleForm obj=new SimpleForm();
		obj.inputfields();

	}

}
