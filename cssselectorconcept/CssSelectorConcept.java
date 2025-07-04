package cssselectorconcept;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CssSelectorConcept {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launch url- "saucedemo.com"
		driver.get("https://www.saucedemo.com/");
		
		
		//cssSelector by Id -> 
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		System.out.println("Successfully Username password: PASS");
		
		//cssSelector by Class->
		driver.findElement(By.cssSelector("input.input_error.form_input[placeholder='Password']")).sendKeys("secret_sauce");
		System.out.println("Successfully Entered password: PASS");
		
		//cssSelector with multiple attributes->
		//driver.findElement(By.cssSelector("input[type='submit'][id='login-button']")).click();
		//System.out.println("Successfully clicked on login button: PASS");
		
		//Advanced cssSelector -> using combination of Tag,Id,Class
		driver.findElement(By.cssSelector("input.submit-button.btn_action[id='login-button']")).click();
		System.out.println("Successfully clicked on login button: PASS");
		
	}

}
