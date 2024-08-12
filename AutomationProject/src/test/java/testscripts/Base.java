package testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Base {

	WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://selenium.qabible.in/simple-form-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	//  driver.quit();
  }

}
