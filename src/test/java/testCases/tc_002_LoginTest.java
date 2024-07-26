package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;
import testBase.baseClass;

public class tc_002_LoginTest extends baseClass {

	@Test(groups= {"Regression","Master"})
	public void verify_login() {
		logger.info("**** Starting tc_002_LoginTest ****");
	
	try {
	homePage hp=new homePage(driver);
	hp.clickMyAccount();
	logger.info("Clicked on MyAccount");
	Thread.sleep(2000);
	hp.clickLogin();
	logger.info("Clicked on Login");
	
	loginPage lp= new loginPage(driver);
	lp.setEmail(p.getProperty("email"));
	lp.setPassword(p.getProperty("password"));
	Thread.sleep(2000);
	
	lp.clickLogin();
	
	myAccountPage macc=new myAccountPage(driver);
	boolean target_page=macc.ismyAccountPageExists();
	
	Assert.assertEquals(target_page, true);
	Thread.sleep(2000);
	logger.info("****tc_002_LoginTest Finished*****");
	
	}
	catch(Exception e) {
		Assert.fail();
	}
	
}
	
}
		
	

