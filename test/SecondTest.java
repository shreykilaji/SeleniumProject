package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utils.WaitsUtils;

public class SecondTest extends BaseTest{
	public static void main(String[] args ) {
		
		/*
		 * Browser Setup & URL launch using setup() method from BaseTest class which is
		 * extended here in SecondTest class, create object of SecondTest class and use method of base class.
		 */
		
		SecondTest test2 =new SecondTest();
		test2.setup(); // Setup browser driver and launch URL from BaseTest Class's setup() method
		
		WebElement username = test2.driver.findElement(By.id("user-name"));
		WaitsUtils.waitForElementToBeVisible(test2.driver, username, 10);
		System.out.println("Waiting for 10 seconds or until username element is visible");
		
		LoginPage login =new LoginPage(test2.driver);
		login.enterUserName("standard_user");
		
		login.enterPassword("secret_sauce");
		login.clickLogin();
		
		HomePage homepage = new HomePage(test2.driver);
		String currentUrl= test2.driver.getCurrentUrl();
		homepage.currentPageUrl(currentUrl);
	}

}
