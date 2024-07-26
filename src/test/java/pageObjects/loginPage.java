package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage extends basePage{

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='email']")
	WebElement input_email;
	
	@FindBy(how=How.XPATH, using="//input[@name='password']")
	WebElement input_password;
	 
	@FindBy(how=How.XPATH, using="//input[@value='Login']")
	WebElement btn_login;
	
	
	public void setEmail(String email) {
		input_email.sendKeys(email);
	}
	
	public void setPassword(String password) {
		input_password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}

}
