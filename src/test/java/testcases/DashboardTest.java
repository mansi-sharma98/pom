package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import junit.framework.Assert;
import pages.Dashboard;
import pages.LoginPage;

public class DashboardTest extends TestBase{
	LoginPage loginpage;
	Dashboard dashboard;
	
	public DashboardTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialzation();
		loginpage = new LoginPage(); //obj of loginpage
		dashboard = new Dashboard(); //obj of loginpage
		dashboard=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));

	}
	@Test
	public void dashboardTitleTest() throws InterruptedException {
		String title1 = dashboard.validateInboxTitle();
		Assert.assertEquals(title1,"Inbox (3) - test.automation567@gmail.com - Gmail");
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
