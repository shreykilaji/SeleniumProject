package tests;
import org.testng.annotations.DataProvider;

public class DataProviderUtils {
	@DataProvider(name="credentials")
	public static Object[][] credentialsData(){
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"}
		};
	}

}
