package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends BaseClass {

	public void singlecheck() {
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement click_singlecheck=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		System.out.println(click_singlecheck.isSelected());
		click_singlecheck.click();
		System.out.println(click_singlecheck.isSelected());
	}
	
public void radiobutton() {
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement click_maleradio=driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		WebElement click_showbutton=driver.findElement(By.id("button-one"));
		System.out.println(click_maleradio.isSelected());
		click_maleradio.click();
		click_showbutton.click();
		System.out.println(click_maleradio.isSelected());
	}
	
	
	public static void main(String[] args) {
		CheckBox obj=new CheckBox();
		obj.initializebrowser();
		obj.singlecheck();
		obj.radiobutton();

	}

}
