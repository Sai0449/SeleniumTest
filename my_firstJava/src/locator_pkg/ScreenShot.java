package locator_pkg;

import java.io.File;

//import org.apache.commons.io
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C://screenshot.png"));
	}
}
