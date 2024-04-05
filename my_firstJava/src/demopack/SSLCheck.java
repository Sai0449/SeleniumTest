package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions operations = new ChromeOptions();
 		operations.setAcceptInsecureCerts(true);
 		WebDriver driver = new ChromeDriver(operations);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
