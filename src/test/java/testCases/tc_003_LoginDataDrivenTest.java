package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;
import testBase.baseClass;
import utilities.dataProviders;

public class tc_003_LoginDataDrivenTest extends baseClass {
	
	@Test (dataProvider="LoginData", dataProviderClass = dataProviders.class, groups= "Datadrivern")
	public void verify_loginDDT(String email, String password, String exp) {
		logger.info("**** Starting TC_003_LoginDataDrivenTest *****");
		
		try {
			homePage hp= new homePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			loginPage lp= new loginPage(driver);
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clickLogin();
			Thread.sleep(2000);
			myAccountPage macc= new myAccountPage(driver);
			boolean targetPage=macc.ismyAccountPageExists();
			Thread.sleep(2000);
			if(exp.equalsIgnoreCase("Valid")) {
				if(targetPage==true) {
					macc.clickLogout();
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
			}
			else if (exp.equalsIgnoreCase("Invalid")) {
				if(targetPage==true) {
					macc.clickLogout();
					Assert.assertTrue(false);
				}
				else {
					Assert.assertTrue(true);
				}
			}
			
		
	}
		catch(Exception e) {
			Assert.fail("An exception occurred: " + e.getMessage());
		}
		logger.info("**** Finished TC_003_LoginDataDrivenTest *****");
	}
	

}
