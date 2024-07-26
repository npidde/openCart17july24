package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage extends basePage{
	
	public homePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Login']")
	WebElement login;
	
	public void clickMyAccount() {
		myaccount.click();
	}
	
	public void clickRegister() {
		register.click();
	}
	
	public void clickLogin() {
		login.click();
	}
}
