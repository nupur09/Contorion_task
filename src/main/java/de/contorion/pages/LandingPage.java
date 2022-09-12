package de.contorion.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import de.contorion.base.TestBase;

public class LandingPage extends TestBase {
	
	//Landing page is that page when user enter the url in browser and hit.

	@FindBy(xpath = "//*[name()='path' and @id='light']")
	WebElement logotest;

	@FindBy(xpath = "(//i[contains(@class,'icon--account header__nav-item-icon')])[1]")
	WebElement RegisterLink;

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validatelogo() {
		return logotest.isDisplayed();
	}

	public LoginPage clickOnRegister() {
		RegisterLink.click();
		return new LoginPage();

	}

}
