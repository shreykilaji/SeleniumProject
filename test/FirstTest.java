package test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class FirstTest extends BaseTest {
	public static void main(String[] args) {

		/*
		 * Browser Setup & URL launch using setup() method from BaseTest class which is
		 * extended here in FirstTest class, create object of FirstTest class and use method of base class.
		 */
		FirstTest test = new FirstTest();
		test.setup(); // Setup browser driver and launch URL from BaseTest Class's setup() method

		// Login action->(Username, password)
		LoginPage loginPage = new LoginPage(test.driver);
		loginPage.login("standard_user", "secret_sauce");

		// <-----Home Page scenario---->
		HomePage homepage = new HomePage(test.driver);
		System.out.println("---------------------------------------------------------------------");
		// Check Home page URL
		String currentUrl = test.driver.getCurrentUrl();
		homepage.currentPageUrl(currentUrl);

		// Print Header Text
		homepage.headerLogoText();

		// Print Header Secondary Text
		homepage.headerSecondaryText();

		//calling tearDown() method to close browser and end execution
		test.tearDown();

	}

}
