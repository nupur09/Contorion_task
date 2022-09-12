package de.contorion.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import de.contorion.base.TestBase;

public class SearchPage extends TestBase {

	@FindBy(xpath = "//input[@id='search-input']")
	WebElement searchBox;

	@FindBy(xpath = "//div[@class='button__inner']")
	WebElement searchBtn;
	@FindBy(xpath = "(//img[@alt='STIER'])[1]")

	WebElement productResult;

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	public String getCurrenturl() {
		String homePageUrl = driver.getCurrentUrl();
		return homePageUrl;

	}

	public ProductResultPage searchProduct(String sch) {
		searchBox.sendKeys(sch);
		searchBtn.click();
		return new ProductResultPage();

	}

	public boolean isProductAvailable() {
		return productResult.isDisplayed();
	}

}
