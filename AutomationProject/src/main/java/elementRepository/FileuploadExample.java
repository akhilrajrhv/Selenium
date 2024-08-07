package elementRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadExample {

	WebDriver driver;
	
	public void sampleupload() {
		
		//file upload using send keys
		 //driver=new ChromeDriver();
		 driver=new FirefoxDriver();
		 driver.get("https://the-internet.herokuapp.com/upload");
		 driver.manage().window().maximize();
		 WebElement selectpdf=driver.findElement(By.id("file-upload"));
		 //selectpdf.click();
		 selectpdf.sendKeys("C:\\Users\\USER\\Desktop\\Obsqura Notes\\sample.pdf");
		 WebElement uploadpdf=driver.findElement(By.id("file-submit"));
		 uploadpdf.click(); 
		 
	}
	
	public void robotClassExample() throws AWTException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement selectPDF=driver.findElement(By.id("file-upload"));
		selectPDF.click();
		StringSelection stringSelect=new StringSelection("C:\\Users\\USER\\Desktop\\Obsqura Notes\\sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelect,null);//paste the above path in to clipboard
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	 public void opennewtab() throws AWTException {
		 //Open a new tab
		 driver=new ChromeDriver();
		// driver=new FirefoxDriver();
		 driver.get("https://the-internet.herokuapp.com/upload");
		 driver.manage().window().maximize();
		
		 Robot r1=new Robot();
		 r1.keyPress(KeyEvent.VK_CONTROL);
		 r1.keyPress(KeyEvent.VK_T);
		 r1.keyRelease(KeyEvent.VK_CONTROL);
		 r1.keyRelease(KeyEvent.VK_T);
	 }
	public static void main(String[] args) throws AWTException {
		
		FileuploadExample fileupload=new FileuploadExample();
		//fileupload.sampleupload();
		fileupload.robotClassExample();
		//fileupload.opennewtab();

	}

}
