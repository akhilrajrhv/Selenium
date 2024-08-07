package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table extends BaseClass {

	
	public void fulltable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		
	}
	
	public void getrow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(row.getText());
		
	}
	
	public void getcoloumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> coloumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement coloumnvalue:coloumn) {
			System.out.println(coloumnvalue.getText());
		}
		
	}
	
	public void searchtoelement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Junior Technical Author";
		List<WebElement> searchelements=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement coloumnvalue:searchelements) {
			if(coloumnvalue.getText().equals(input) ) {
			System.out.println(coloumnvalue.getText());
			}
			
		}
	}
	
	public void selectavalue() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement value=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
		System.out.println(value.getText());
	}
	
	
	public static void main(String[] args) {
		Table table=new Table();
		table.initializebrowser();
		//table.fulltable();
		//System.out.println("***********************");
		//table.getrow();
		//System.out.println("***********************");
		//table.getcoloumn();
		System.out.println("***********************");
		table.searchtoelement();
		System.out.println("***********************");
		//table.selectavalue();
	}

}
