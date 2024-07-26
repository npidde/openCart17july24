package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.accountRegistration;
import pageObjects.homePage;
import testBase.baseClass;

public class tc_001_AccountRegistrationTest extends baseClass{

	
	@Test (groups= {"Sanity","Master"})
	public void verify_account_registration() throws InterruptedException {
		
		logger.info("*** Starting tc_001_AccountRegistrationTest ***");
		try {
		homePage hp=new homePage(driver);
		
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link");
		Thread.sleep(2000);
		hp.clickRegister();
		logger.info("Clicked on Register Link");
		
		accountRegistration ar= new accountRegistration(driver);
		logger.info("Providing customer details");
		ar.setFisrtName(randomString().toUpperCase());
		ar.setLastName(randomString().toUpperCase());
		Thread.sleep(1000);
		ar.setEmail(randomString()+"@gmail.com");
		ar.setTelephone(randomNumber());
		
		String password=randomAlphanumeric();
		
		ar.setPassword(password);
		ar.setConfirmPassword(password);
		Thread.sleep(2000);
		
		ar.clickCheckPolicy();
		ar.clickContinue();
		Thread.sleep(2000);
		
		logger.info("Validating expected method");
		String con_msg=ar.getConfirmationMsg();
		if(con_msg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test Failed...!");
			logger.debug("Debug logs..!");
			Assert.assertTrue(false);
		}
		Assert.assertEquals(con_msg, "Your Account Has Been Created!");
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("*** Finished tc_001_AccountRegistrationTest ***");
	}
	
}
