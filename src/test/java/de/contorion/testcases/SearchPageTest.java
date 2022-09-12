package de.contorion.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import de.contorion.base.TestBase;
import de.contorion.pages.SearchPage;
import de.contorion.pages.LandingPage;
import de.contorion.pages.LoginPage;
//import de.contorion.pages.ProductResultPage;

public class SearchPageTest extends TestBase {

	SearchPage homepage;

	LoginPage loginpage;
	LandingPage landingpage;

	public SearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		landingpage = new LandingPage();
		loginpage = landingpage.clickOnRegister();
		homepage = new SearchPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 0)
	public void ProductAvailabiltytest() throws InterruptedException {
		homepage.searchProduct(prop.getProperty("search"));
		Thread.sleep(2000);
		boolean result = homepage.isProductAvailable();
		Assert.assertTrue(result);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
