package locatorconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Locators in Selenium WebDriver- To identify elements on web page
//(8 Locators to locate element)

public class LocatorConcept {
	public static void main(String[] args) {

		// instance of Web Driver Interface
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		// 1. className()-->
		driver.findElement(By.className("form_input")).sendKeys("standard_user");

		// 2. id()-->
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// 3. name()-->
		WebElement loginButton = driver.findElement(By.name("login-button"));
		System.out.println("Login Button" + loginButton);
		
		// 4. cssSelector()-->
		//WebElement title = driver.findElement(By.cssSelector("Provide CSS SELECTOR"));
		//System.out.println(title);
			
		//5. linkedText()-->
		//driver.findElement(By.linkText("Text of the Anchor Tag"));
		
		//6. partialLinkText()->
		//driver.findElement(By.partialLinkText("partial Text of the Anchor Tag"));
		
		//7. tagName()->
		WebElement submitButton = driver.findElement(By.tagName("input"));
		System.out.println("SubmitButton : " + submitButton);
		
		//8. xpath()->
		WebElement xpath = driver.findElement(By.xpath("//input[@placeholder= 'Username']"));
		System.out.println("xpath : " + xpath);
	}

	
}
