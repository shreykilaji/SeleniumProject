package utils;

//selenium Imports-
import org.openqa.selenium.OutputType; // OutputType is an enum to define the screenshot format (we use FILE).
import org.openqa.selenium.TakesScreenshot; //TakesScreenshot is an interface that allows screenshot capturing.
import org.openqa.selenium.WebDriver; //WebDriver is the Selenium browser driver.

//other imports to handle file creation and errors and generate unique timestamps.
import java.io.IOException; //handles error related to file
import java.io.File;  //handle file creation
import java.text.SimpleDateFormat; //generate unique timestamps
import java.util.Date; //generate unique timestamps


//FileUtils.copyFile() from Apache Commons IO is used to copy the screenshot file from memory to disk.
import org.apache.commons.io.FileUtils;

public class ScreenShotUtils {
	public static void takeScreenshot(WebDriver driver, String screenshotName) {
		
		/*(Step-1) - Create timestamp used to make screeenshot file name unique & avoid overriding.
		 *(Step-2) - Create a File "srcFile" which takes actual screenshot driver cast to "TakeScreenshot",then using getScreenshotAs(File) method return it as a File.
		 *(Step-3) - Creates full path to save Screenshot
		 *(Step-4) - Create try-catch block to use FileUtils.copyFile() to copy the in memory file to the hard disk
		 *			 If there is any error (like path doesn't  exist it catches and print exception.
		 */
		
		//Step-1
		String timestamp = new SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
		//Step-2
		File srcFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Step-3
		String destpath = System.getProperty("user.dir") + "/Screenshot/" + screenshotName + "_" + timestamp + ".png";
		//Step-4
		try {
			FileUtils.copyFile(srcFile, new File (destpath));
			System.out.println("Screenshot saved at : " + destpath);
			
		}catch(IOException e) {
			System.out.println("Failed to save screenshot : " + e.getMessage());
			
		}
	}
}
