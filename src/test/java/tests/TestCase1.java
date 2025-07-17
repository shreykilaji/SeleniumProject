package tests;

import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test(dataProvider ="credentials",dataProviderClass = DataProviderUtils.class)
	public static void loginExternal(String username, String password) {
		System.out.println(username + " / "+ password);
	}
}
