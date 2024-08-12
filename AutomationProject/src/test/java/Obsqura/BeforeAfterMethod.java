package Obsqura;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod {
  @Test
  public void show() {
	  System.out.println("Show Method Invoked");
  }
  
  @Test
  public void dispaly() {
	  System.out.println("Display Method Invoked");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method Invoked");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method Invoked");
  }

}
