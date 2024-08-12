package testscripts;

import org.testng.annotations.Test;

import pages.InputF;

public class InputFormPageTest extends Base {
	
  @Test
  public void sumoftwonumbers() {
	  String valuea1="10";
	  String valueb1="20";
	  
	  InputF form=new InputF(driver);
	  form.entervalueforA(valuea1);
	  form.entervalueforB(valueb1);
	  form.clickgettotal();
	
  }
}
