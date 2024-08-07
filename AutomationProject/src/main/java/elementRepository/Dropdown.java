package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	WebDriver driver;
	
public void dropdownmenue() {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		WebElement menu1=driver.findElement(By.id("dropdowm-menu-1"));
		menu1.click();
		
		Select select=new Select(menu1);
		//select.selectByVisibleText("JAVA");
		//select.selectByIndex(1);
		//select.selectByValue("python");
		
		WebElement first_element=select.getFirstSelectedOption();
		//List<WebElement> all_element=select.getAllSelectedOptions();
		
	}

public void multiselect() {
	
	driver=new ChromeDriver();
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	driver.manage().window().maximize();
	
	WebElement multi=driver.findElement(By.id("multi-select-field"));
	multi.click();
	

	Select select=new Select(multi);
	//select.selectByVisibleText("Green");
	
	//WebElement first_element=select.getFirstSelectedOption();
	List<WebElement> all_element=select.getAllSelectedOptions();
	for(WebElement webElement:all_element){
		webElement.click();
	}
	
}

	public static void main(String[] args) {
		Dropdown obj=new Dropdown();
		//obj.dropdownmenue();
		obj.multiselect();

	}

}
