package tests;
import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		//Login Page scenario ->
		
		//<----Launch URL------>
		driver.get("https://www.saucedemo.com/");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Url launched successfully : PASS");
		
		// Login action->(username, password)
		LoginPage loginPage =new LoginPage(driver);
		loginPage.login("standard_user", "secret_sauce");
		
		//<-----Home Page scenario---->
		HomePage homepage =new HomePage(driver);
		System.out.println("---------------------------------------------------------------------");
		// Check Home page URL
		String currentUrl = driver.getCurrentUrl();
		homepage.currentPageUrl(currentUrl);
		
		//Print Header Text
		homepage.headerLogoText();
		
		//Print Header Secondary Text
		homepage.headerSecondaryText();
		
		System.out.println("---------------------------------------------------------------------");
		
		driver.quit();
		System.out.println("Browser closed");
		System.out.println("Execution Ended");
		
		
	}

}
