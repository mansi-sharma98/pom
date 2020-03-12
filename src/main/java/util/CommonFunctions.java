package util;

import org.openqa.selenium.WebElement;

import base.TestBase;
import pages.LoginPage;


public class CommonFunctions extends TestBase{
	LoginPage loginpage;
	
	public void enterValues(WebElement ele, String value) {
		try {
		ele.sendKeys(value);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	

}
