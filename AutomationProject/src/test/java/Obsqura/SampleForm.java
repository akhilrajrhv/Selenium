package Obsqura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SampleForm extends BaseClass {
	
  @Test 
  public void singleinputforms() {
	  
		WebElement message=driver.findElement(By.id("single-input-field"));
		WebElement click_showmessage=driver.findElement(By.id("button-one"));
		message.sendKeys("Test Message");
		click_showmessage.click();
  }
  
  @Test
	public void twoinput() {
		
		WebElement valuea=driver.findElement(By.id("value-a"));
		WebElement valueb=driver.findElement(By.id("value-b"));
		WebElement click_gettotal=driver.findElement(By.id("button-two"));
		valuea.sendKeys("10");
		valueb.sendKeys("20");
		click_gettotal.click();
		System.out.println(click_gettotal.getText());
		
		
	}
}
