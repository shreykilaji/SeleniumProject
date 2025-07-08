package learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Two types of xpath-->
//1. Absolute Xpath(contains full path from root to desired element)

//2. Relative Xpath (Majorly used instead of absolute xpath)->
//   it starts with (//)


public class XpathConcept {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launch Chrome->
		driver.get("https://www.saucedemo.com/");
		System.out.println("Chrome browser launched successfully");
		
		//enter user-name using xpath
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		System.out.println("Username entered successfully");
		
		//enter password using xpath
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		System.out.println("Password entered successfully");
		
		//clicking submit button using xpath
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("Successfully clicked on login button.");
		
	}

}
