package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utils.ScreenShotUtils;
import utils.WaitsUtils;

public class TestCase2 extends BaseTest {

	@Test(priority = 1)
	public void loginPage() {
		// capture screenshot using ScreenShotUtils Class's "takeScreenshot(driver,
		// String screenshotName)" method
		ScreenShotUtils.takeScreenshot(driver, "LoginPage");

		WebElement username = driver.findElement(By.id("user-name"));
		WaitsUtils.waitForElementToBeVisible(driver, username, 10);
		System.out.println("Waiting for 10 seconds or until username element is visible");

		LoginPage login = new LoginPage(driver);
		login.enterUserName("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
	}

	@Test(priority = 2)
	public void homePage() {
		HomePage homepage = new HomePage(driver);
		String currentUrl = driver.getCurrentUrl();
		homepage.currentPageUrl(currentUrl);

		// capture screenshot using ScreenShotUtils Class's "takeScreenshot(driver,
		// String screenshotName)" method
		ScreenShotUtils.takeScreenshot(driver, "HomePage");
	}

}
