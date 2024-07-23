package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass {
	
	public void idlocators() {
		
		//Input Form->Single Input Field->Message field
		WebElement textfield_message=driver.findElement(By.id("single-input-field"));
		//Input Form->Single Input Field->Show message button
		WebElement button_showmessage=driver.findElement(By.id("button-one"));
		//Input Form->Single Input Field->Enter value A text field
		WebElement textfield_valuea=driver.findElement(By.id("value-a"));
		
	}
	
	public void classlocators() {
		
		//Header Logo
		WebElement logo=driver.findElement(By.className("top-logo"));
		//Header Links
		WebElement link_header=driver.findElement(By.className("navbar-nav"));
		//List Box->Move all button
		WebElement button_moveall=driver.findElement(By.className("btn moveall btn-outline-secondary"));
		
		
	}

	public void namelocators() {
		
		//Input Form->Jquery Select 2
		WebElement state=driver.findElement(By.name("states[]"));
		//ListBox->Listbox
		WebElement select_listbox=driver.findElement(By.name("duallistbox_demo1[]_helper1"));
		//DatePickers->Bootstrap Date Picker
		WebElement text_datepicker=driver.findElement(By.name("daterange"));
		//DatePickers->Jquery Date Picker
		WebElement text_fromdatepicker=driver.findElement(By.name("from"));
		
		
		
	}
	
	public static void main(String[] args) {
		
		Locators obj=new Locators();
		obj.initializebrowser();
		
		

	}

}
