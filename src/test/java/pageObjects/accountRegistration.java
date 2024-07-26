package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class accountRegistration extends basePage{

	public accountRegistration(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='firstname']")
	WebElement input_firstname;
	
	@FindBy(how=How.XPATH, using="//input[@name='lastname']")
	WebElement input_lastname;
	
	@FindBy(how=How.XPATH, using="//input[@name='email']")
	WebElement input_email;
	
	@FindBy(how=How.XPATH, using="//input[@name='telephone']")
	WebElement input_telephone;
	
	@FindBy(how=How.XPATH, using="//input[@name='password']")
	WebElement input_password;
	
	@FindBy(how=How.XPATH, using="//input[@name='confirm']")
	WebElement input_confirmpassword;
	
	@FindBy(how=How.XPATH, using="//input[@type='checkbox']")
	WebElement input_policyaccept;
	
	@FindBy(how=How.XPATH, using="//input[@type='submit']")
	WebElement input_continue;
	
	@FindBy(how=How.XPATH, using="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFisrtName(String fname) {
		input_firstname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		input_lastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		input_email.sendKeys(email);
	}
	
	public void setTelephone(String tele) {
		input_telephone.sendKeys(tele);
	}
	
	public void setPassword(String pass) {
		input_password.sendKeys(pass);
	}
	
	public void setConfirmPassword(String pass) {
		input_confirmpassword.sendKeys(pass);
	}
	
	public void clickCheckPolicy() {
		input_policyaccept.click();
	}
	
	public void clickContinue() {
		input_continue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
    }
	
}
