package locator_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String name = driver.findElement(By.cssSelector("p.text-center.text-white")).getText();
//		String[] formattedname = name.split("()");
//		String 
		}

}
