package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import junit.framework.Assert;
import pages.Dashboard;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	Dashboard dashboard;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialzation();
		loginpage = new LoginPage(); //obj of loginpage
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validateTitle();
		Assert.assertEquals(title,"Gmail");
	}
	
	@Test(priority=2)
	public void loginTest() {
		dashboard=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		//loginpage.login("mansi","167738@jkjk");
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
