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
		WebElement select_state=driver.findElement(By.name("states[]"));
		//ListBox->Bootstrap List Box
		WebElement select_listbox=driver.findElement(By.name("duallistbox_demo1[]_helper1"));
		//DatePickers->Bootstrap Date Picker
		WebElement text_datepicker=driver.findElement(By.name("daterange"));
		//DatePickers->Jquery Date Picker
		WebElement text_fromdatepicker=driver.findElement(By.name("from"));
		
		
		
	}
	
	public void linkText() {
		
		//Input form->Checkbox Demo
		WebElement link_checkboxdemo=driver.findElement(By.linkText("check-box-demo.php"));
		//Input->Radio Button
		WebElement link_radiobutton=driver.findElement(By.linkText("radio-button-demo.php"));
	}
	
	public void partialLinkText() {
		
		//Input form->Radio Buttons
		WebElement partiallink_radiobutton=driver.findElement(By.partialLinkText("radio-button"));
		//Input form->Ajax from submit
		WebElement partiallink_ajaxform=driver.findElement(By.partialLinkText("Ajax Form"));
		
	}
	
	public void cssselector() {
		
		//
		WebElement element1=driver.findElement(By.cssSelector("input#gridCheck"));//attribute tag#Id-->Method 1 for cssSelector
		WebElement element2=driver.findElement(By.cssSelector("input.form-check-input")); //tag.class-->Method2 for cssSelector
		WebElement element3=driver.findElement(By.cssSelector("input[class=form-check-input]"));//tag[attribute type=attribute value]-->Method3 for cssSelector
		WebElement element4=driver.findElement(By.cssSelector("input.form-check-input[type=checkbox]")); //tag.class attribute value[attribute tag=attribute value]
	}
	public void xpath()
	{
		//Inputform->Checkboc Demo
		WebElement absolute_singlecheckbox=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));//Absolute xpath->From root node
		WebElement relative_singlecheckbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));//relative xpath
		
		//Inputform->Two Input Fields->Get Total Button
		WebElement absolute_gettotal=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button"));
		WebElement relative_gettotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	}
	
	public void dynamicXpath() {
		
		WebElement button_showmessage=driver.findElement(By.xpath("//button[contains(@id,'one')]"));//Xpath using contains
		WebElement button_show=driver.findElement(By.xpath("//button[text()='Show Message']"));//Xpath using text
		WebElement child_xpath=driver.findElement(By.xpath("//button=[@class='navbar-toggler']//child::span[@class='navbar-toggler']"));//Xpath using child tag
		WebElement parent_xpath=driver.findElement(By.xpath("//button=[@class='btn btn-primary']//parent::form"));//child::span[@class='navbar-toggler']"));//Xpath using parent tag
		WebElement following_xpath=driver.findElement(By.xpath("//button=[@id='button-one']//following:://div=[@id='message-one']"));//Xpath using following tag
		WebElement index_xpath=driver.findElement(By.xpath("(//form[@method='POST'])[2]"));//Xpath using index
	}
	
	public static void main(String[] args) {
		
		Locators obj=new Locators();
		obj.initializebrowser();
		
		

	}

}
