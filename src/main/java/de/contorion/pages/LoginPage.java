package de.contorion.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import de.contorion.base.TestBase;

public class LoginPage extends TestBase {
	//Page Factory -OR:
	
	@FindBy(xpath = "//input[@id='login_email']")
	WebElement emailAddress;

	@FindBy(xpath = "//input[@id='login_password']")
	WebElement password;

	@FindBy(xpath = "//span[contains(text(),'Jetzt anmelden')]")
	WebElement RegisterNowbtn;

	// Initializing the Page Objects:

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
  // Actions:
	public SearchPage login(String un, String pwd) {

		emailAddress.sendKeys(un);
		password.sendKeys(pwd);
		RegisterNowbtn.click();
		return new SearchPage();
	}
}
