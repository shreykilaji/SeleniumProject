package test;

//test File

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) {
		
		//Without browser setup(), Using Selenium Manager Dependency at pom.xml file
		WebDriver driver = new ChromeDriver();
		
		//get() method of WebDriver interface to launch Url in browser.
		driver.get("https://mvnrepository.com/");
		
		//quit() method of WebDriver interface to quit browser.
		driver.quit();
		
		
	}

}
