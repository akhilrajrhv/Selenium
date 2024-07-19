package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowsers {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver(); //Create object for Webdriver interface
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://selenium.qabible.in/index.php");//Launch URL

	}

}
