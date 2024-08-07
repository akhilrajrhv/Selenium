package elementRepository;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	
	
	WebDriver driver;
	
	public void multiwinodw() {
		
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contact_click=driver.findElement(By.id("contact-us"));
		contact_click.click();
		WebElement login_click=driver.findElement(By.id("login-portal"));
		login_click.click();
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Winodw:"+parentwindow);
		Set<String> allwinodw=driver.getWindowHandles();
		String title="";
		//System.out.println("All Winodw"+allwinodw);
		for(String temp:allwinodw) {
			if(!temp.equals(parentwindow)) {
			System.out.println("All Winodw Except Parent:"+temp);
			driver.switchTo().window(temp);
			//System.out.println(driver.getTitle());
			title=driver.getTitle();
			}
			
			if(title.equals("WebDriver | Login Portal")){
				WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
				username.sendKeys("Obsqura");
				}
			
			if(title.equals("WebDriver | Contact Us")) {
				WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("Akhil");
			}
		}
	
	}

	public static void main(String[] args) {
	MultipleWindow window=new MultipleWindow();
	window.multiwinodw();

	}

}
