package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;

	public void initializebrowser() {
		
		driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}
	
	public void driverQuitClose()
	{
		driver.quit();
		//driver.close();
	}
	
	public static void main(String[] args) {
	
		BaseClass obj=new BaseClass();
		obj.initializebrowser();
		obj.driverQuitClose();
	}

}
