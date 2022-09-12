package de.contorion.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import de.contorion.base.TestBase;
import de.contorion.pages.LandingPage;

public class LandingPageTest extends TestBase {

	LandingPage landingpage;

	public LandingPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		landingpage = new LandingPage();

	}

	@Test(priority = 0)
	public void logoImageTest() {
		boolean flag = landingpage.validatelogo();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
