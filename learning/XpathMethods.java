package learning;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class XpathMethods {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Launch URL in chrome->
		driver.get("https://www.saucedemo.com/");
		System.out.println("Successfully launched Url: PASS");
		
		//1. start-with() ->Used to find dynamic element, 
		//Used to find 'starting value' of web element which is 'static'.
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");
		System.out.println("Username entered successfully: PASS");
		
		//2.contains() ->used to find element which are dynamic, Provide partial value to find element.
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("secret_sauce");
		System.out.println("Password entered successfully: PASS");
		
		//3.text() -> generally used with links on html pages
		//driver.findElement(By.xpath("//tagname[text()='Actual text of link']"));
		
	
	}

}
