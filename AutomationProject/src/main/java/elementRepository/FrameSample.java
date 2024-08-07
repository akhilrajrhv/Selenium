package elementRepository;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample {
	
	WebDriver driver;
	
	public void frame() {
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(iframe);
		WebElement demopage=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		demopage.click();
		//link_click.click();
		
	}
	public static void main(String[] args) {
		FrameSample framesample=new FrameSample();
		framesample.frame();
	
		

	}

}
