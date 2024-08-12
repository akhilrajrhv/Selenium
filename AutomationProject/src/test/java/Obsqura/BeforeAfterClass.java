package Obsqura;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterClass {
  @Test //Second execute
  public void sample() {
	  
	  System.out.println("This is a test method");
  }
  @BeforeClass//First execute before class

  public void beforeClass() {
	  
	  System.out.println("Before class method");
  }

  @AfterClass//Third execute
  public void afterClass() {
	  
	  System.out.println("After class method");
  }

}
