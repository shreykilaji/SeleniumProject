package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;

//setup() method to setup browser and launch URL---->
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();
		// launch URL
		driver.get("https://www.saucedemo.com/");
		System.out.println("---------------------------------------------------------------------");
		String URL = driver.getCurrentUrl();
		System.out.println("Browser launched successfully navigated to URL : " + URL);
		System.out.println("---------------------------------------------------------------------");

	}

//tearDown() method to quit browser---->
	public void tearDown() {
		if (driver != null)
			driver.quit();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Browser Closed.");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Execution Ended.");
	}

}
