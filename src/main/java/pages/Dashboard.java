package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class Dashboard extends TestBase{
	 public Dashboard() {
		  PageFactory.initElements(driver, this);
		}
	 
	 @FindBy(xpath ="//title")
	  protected WebElement dashtitle;
	 
	 public String validateInboxTitle() throws InterruptedException {
		 
	     Thread.sleep(5000);
		 return driver.getTitle();
		 
	 }


}
