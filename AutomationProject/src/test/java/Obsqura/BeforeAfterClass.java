package Obsqura;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterClass {
  @Test
  public void sample() {
	  
	  System.out.println("This is a test method");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before class method");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After class method");
  }

}
