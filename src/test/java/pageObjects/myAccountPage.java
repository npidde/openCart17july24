package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class myAccountPage extends basePage {

	public myAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//h2[contains(text(),'My Account')]")
	WebElement msgHeading;
	
	@FindBy(how=How.XPATH, using="//div[@class='list-group']//a[text()='Logout']")
	WebElement btn_logout;

	public boolean ismyAccountPageExists() {
		try {
		return (msgHeading.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
		}
	
	public void clickLogout() {
		btn_logout.click();
	}
}
