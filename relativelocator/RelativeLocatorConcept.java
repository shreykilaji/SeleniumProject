package relativelocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;



// 5 type of relative locators
/*
1. above()
2. below()
3. toLeftOf()
4. toRightOf()
5. near)()
*/

public class RelativeLocatorConcept {
	
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver =new ChromeDriver();
		
		 //launch browser->
		 driver.get("https://www.saucedemo.com/");
		
		 //above()
		 By username = RelativeLocator.with(By.name("user-name")).above(By.name("password"));
		 driver.findElement(username).sendKeys("standard_user");
		 System.out.println("Username Entered successfully: PASS");
		
		 //below()
		 By password = RelativeLocator.with(By.name("password")).below(By.name("user-name"));
		 driver.findElement(password).sendKeys("secret_sauce");
		 System.out.println("Password Entered successfully: PASS");
		
		/*
		 //toLeftOf()
		 By username =RelativeLocator.with(By.name("user-name")).toLeftOf(By.name("password"));
		 driver.findElement(username).sendKeys("standard_user");
		
		 //toRightOf()
		 By password =RelativeLocator.with(By.name("password")).toRightOf(By.name("user-name"));
		 driver.findElement(password).sendKeys("secret_sauce");
		
		 //near()->clicking on login button using near relative locator
		 By loginbutton = RelativeLocator.with(By.id("login-button")).near(By.name(""));
		 driver.findElement(loginbutton).click();
		 System.out.println("Login button clicked successfully: PASS");
		 
		*/
		
		 WebElement loginbutton = driver.findElement(By.id("login-button"));
		 loginbutton.click();
		 System.out.println("Login button clicked successfully: PASS");
	}

}
