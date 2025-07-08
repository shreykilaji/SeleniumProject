package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public String URL = "https://www.saucedemo.com/inventory.html";
	public String Header = "Swag Labs";
	public String HeaderSecondary = "Products";

	// Constructor of HomePage class (To get driver details from LoginTest.java
	// file)
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// locators to find element
	By header_Text = By.xpath("//div[@class = 'header_label']//child::div");
	By header_Secondary_Text = By.xpath("//span[@data-test = 'title']");

	// Action 1- Verify current Page URL.

	/*
	 * create method currentPageUrl() -to get current page URL and print text on
	 * console.
	 */
	public void currentPageUrl(String currentUrl) {
		if (currentUrl.equals(URL))
			System.out.println("Homepage url loading correctly: \"" + currentUrl + "\" : PASS");
		else
			System.out.println("Homepage not loaded correctly"+ currentUrl + " : FAIL");
	}
	// Action 2- find headerLabel element and getText of element.

	/*
	 * create method headerLogoText() -to find element and print text on console.
	 */
	public void headerLogoText() {
		String appLogoText = driver.findElement(header_Text).getText();

		if (appLogoText.equals(Header))
			System.out.println("Header Text : " + appLogoText + ": PASS");
		else
			System.out.println("Header Text Erro : " + appLogoText + " : FAIL");
	}

	// Action 3- find headerSecondaryLabel element and getText of element.

	/*
	 * create method headerSecondaryText() -to find element and print text on
	 * console.
	 */
	public void headerSecondaryText() {
		String headerSecondaryText = driver.findElement(header_Secondary_Text).getText();

		if (headerSecondaryText.equals(HeaderSecondary))
			System.out.println("header Secondary Text : " + headerSecondaryText + ": PASS");
		else
			System.out.println("Header secondary Text Erro : " + headerSecondaryText + " : FAIL");
	}

}
