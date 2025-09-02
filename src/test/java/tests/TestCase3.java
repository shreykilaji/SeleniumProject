package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.WaitsUtils;
import utils.ScreenShotUtils;
import pages.LoginPage;
import pages.HomePage;

public class TestCase3 extends BaseTest {
	WebDriver driver;
	
	BaseTest test = new BaseTest();
	@BeforeClass
	public void launchBrowser() {
		driver = test.setup();
	}

	@Test(groups = { "Smoke", "Regression" })
	public void loginPage() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName("standard_user");
		loginpage.enterPassword("secret_sauce");
		loginpage.clickLogin();
		System.out.print("LoginPage execution completed");
	}

	@Test(groups = { "Regression" })
	public void homePage() {
		HomePage homepage = new HomePage(driver);
		String currentUrl = driver.getCurrentUrl();
		homepage.currentPageUrl(currentUrl);

		// Capture HomePage screenshot
		ScreenShotUtils.takeScreenshot(driver, "HomePage");

		System.out.print("HomePage execution completed");
	}

	@AfterClass
	public void closeBrowser() {
		test.tearDown();

	}
}
