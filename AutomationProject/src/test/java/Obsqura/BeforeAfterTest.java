package Obsqura;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeAfterTest {
  @Test
  public void sum() {
	  int sum,a=3,b=5;
	  sum=a+b;
	  System.out.println("Sum of two numbers is:"+sum);
  }
  @Test
  public void sub() {
	  int sub,a=3,b=5;
	  sub=a-b;
	  System.out.println("Difference of two numbers is:"+sub);
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Invoked");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Invoked");
  }

}
