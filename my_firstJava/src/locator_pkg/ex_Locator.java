package locator_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("WebDriver.Chrome.driver", "C:/Users/pothukum/Documents/chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
