package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends BaseClass {

	public void singlecheck() {
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement click_singlecheck=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		click_singlecheck.click();
	}
	
	public static void main(String[] args) {
		CheckBox obj=new CheckBox();
		obj.initializebrowser();
		obj.singlecheck();

	}

}
