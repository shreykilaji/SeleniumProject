package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;
	
	//Constructor of LoginPage class (To get driver details from LoginTest.java file)
	public LoginPage( WebDriver driver) {
		
		this.driver= driver;
	}
	
	//locators to find element
	By userNameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginButtonField = By.id("login-button");
	
	// Actions on element------->(create method of every action)
	
	/* Example-> Action is Enter Username so create a method enterUsername() to perform 
	   that action
	*/
	
	
// Action1->Enter Username in username textbox.
	
	/*
	 * enterUserName() takes String parameter 'username' from LoginTest.java class &
	 * enter username in senKeys() method to send username to Username textbox.
	 */
	
	public void enterUserName(String username) {
		if (username != null) {
			driver.findElement(userNameField).sendKeys(username);
			System.out.println("Username Entered Successfully : PASS");
		} else
			System.out.println("Username Entered Unsuccessfully : Fail");
	}
	
// Action 2->Enter Password in password Textbox.
	
	/* enterPassword() takes String parameter 'password' from LoginTest.java class &
	 * enter password in senKeys() method to send password to Password textbox.
	 */
	
	public void enterPassword(String password) {
		if (password != null) {
			driver.findElement(passwordField).sendKeys(password);
			System.out.println("Password Entered Successfully : PASS");
		} else
			System.out.println("Password Entered Unsuccessfully : Fail");
	}
	
// Action 3->Click on login button.
	
	/*clickLogin() method to click on login button.
	 */
	
	public void clickLogin() {
		driver.findElement(loginButtonField).click();
	}
	
// Action 4->Login action.
	
	/*create login() method with String type parameter username, password ->
	 *for user to login by calling above methods->(one by one)
	 *enterUserName(), enterPassword(),clickLogin() 
	 */
	
	public void login(String username,String password) {
		
		enterUserName(username); //To call enterUserName() method -> to enter username.
		enterPassword(password); //To call enterPassword() method -> to enter password.
		clickLogin();  //To call clickLogin() method -> to click on login button.
		
		System.out.println("Login Sucessfully : PASS");
	
	}
	
}	
	
	
	
	
	
	
	
	
	

