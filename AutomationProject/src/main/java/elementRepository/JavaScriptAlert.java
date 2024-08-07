package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert extends BaseClass{
	
	WebDriver driver;
	
	public void alert() {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement pops_clickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		pops_clickme.click();
		driver.switchTo().alert().accept();
	}
	
	public void confirm()
	{
		WebElement button_clickconfirm=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		button_clickconfirm.click();
		driver.switchTo().alert().dismiss();
	}
	public void promptBox()
	{
		WebElement promptBox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptBox.click();
		driver.switchTo().alert().sendKeys("Test message");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		JavaScriptAlert obj=new JavaScriptAlert();
		obj.alert();
	}

}
