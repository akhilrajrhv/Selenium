package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	WebDriver driver;
	
	public void multicheckbox() {
		
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		//driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> checkone= driver.findElements(By.xpath("//input[@type='checkbox']"));//Use list to store multiple webelements
		for(WebElement webElement:checkone){
			webElement.click();
		}
		
	
	}

	public static void main(String[] args) {
		FindElements obj=new FindElements();
		obj.multicheckbox();

	}

}
