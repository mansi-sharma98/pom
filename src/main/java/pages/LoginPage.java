package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.CommonFunctions;

public class LoginPage extends TestBase{
	 LoginPage loginpage;
	CommonFunctions commonfun;
	
	 @FindBy(xpath ="//title")
	  protected WebElement title;
		 
	 @FindBy(id ="loginbtn")
	 protected WebElement loginbt;
	 
	 @FindAll({
		 @FindBy(id ="loginbtn"),
		 @FindBy(xpath ="//div/loginbtn")
	 })
	 WebElement loginbt1;
	 
	 
	 @FindBy(id="identifierId")
	  WebElement usernameinput;
	
	 @FindBy(id="identifierNext")
	 WebElement nextBtn;
	
	 
	 @FindBy(xpath="//input[@name='password']")
	 WebElement passwordinput;
	 
	 @FindBy(id="passwordNext")
     WebElement submit;
	 
	  
	 String loginbtn = "//input[@id='login']";
	 

	 public LoginPage() {
	  PageFactory.initElements(driver, this);
	}
	 
	 
	 public String validateTitle() {
		 return driver.getTitle();
	 }
	 
	 public Dashboard login(String un , String pwd) {
		 /*commonfun.enterValues(loginpage.usernameinput, un);
		 nextBtn.click();
		 commonfun.enterValues(loginpage.passwordinput, pwd);
		 submit.click();*/
          usernameinput.sendKeys(un);
          nextBtn.click();
          passwordinput.sendKeys(pwd);
          submit.click();
          return new Dashboard();
	 }
	 

}


	
