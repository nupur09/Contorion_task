package de.contorion.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import de.contorion.base.TestBase;
import de.contorion.pages.SearchPage;
import de.contorion.pages.LandingPage;
import de.contorion.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LandingPage landingpage;
	LoginPage loginpage;
	SearchPage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		landingpage = new LandingPage();
		loginpage = new LoginPage();
		homepage = new SearchPage();
		Thread.sleep(2000);

	}

	@Test(priority = 0)
	public void RegisterTest() {
		loginpage = landingpage.clickOnRegister();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String actualURL = homepage.getCurrenturl();
		String expectedURl = "https://www.contorion.de/";
		Assert.assertEquals(actualURL, expectedURl);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
