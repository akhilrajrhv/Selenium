package Obsqura;

import org.testng.annotations.Test;

public class NewTest {
	
	  @Test (priority = 1)
	  
	  public void show() {
		  System.out.println("Show method invoked");
	  }
	  
  @Test (priority = 3)//On TestNG by default select method based on alphabetic order
  public void display() {
	  System.out.println("Display method invoked");
  }
  
  @Test (priority = 2)
  public void view() {
	  System.out.println("View method invoked");
  }

}
