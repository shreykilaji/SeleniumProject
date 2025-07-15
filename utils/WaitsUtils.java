package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class WaitsUtils {
	
	WebDriver driver;
	
	//waitForElementToBeVisible() method with three parameter-> creating this method static to avoid creating instance to use use method
	//method to Wait till element is visible on page.
	public static void waitForElementToBeVisible(WebDriver driver, WebElement element, int timeoutInSeconds) {
		new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds)).until(ExpectedConditions.visibilityOf(element));
		System.out.println("Element is visible");
	}
	
	//waitForPageTitle()- wait till Page title is loaded.
	public static void waitForPageTitle(WebDriver driver, String title, int timeout) {
		new WebDriverWait(driver,Duration.ofSeconds(timeout)).until(ExpectedConditions.titleContains(title));
		System.out.println("page title is loaded: "+title);
	}
	

}
