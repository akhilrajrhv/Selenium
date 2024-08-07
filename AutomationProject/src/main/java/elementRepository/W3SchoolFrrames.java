package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolFrrames {
	
	WebDriver driver;
	
	public void framesample() {
		 driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_iframe.asp");
		 driver.manage().window().maximize();
		 WebElement frame=driver.findElement(By.id("google_ads_iframe_/103512698,22511567001/22964681174_0"));
		 driver.switchTo().frame(frame);
		 WebElement click_frame=driver.findElement(By.xpath("//a[@href='https://campus.w3schools.com/products/w3schools-full-access-course']"));
		 click_frame.click();
	}

	public static void main(String[] args) {
		W3SchoolFrrames w3schoolframes=new W3SchoolFrrames();
		w3schoolframes.framesample();
	}

}
