package locator_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver lc = new ChromeDriver();
		lc.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lc.get("https://www.udemy.com/join/login-popup/");
		lc.findElement(By.name("email")).sendKeys("pothugantisaikumar67842@gmail.com");
		lc.findElement(By.name("password")).sendKeys("Hello1121");
		lc.findElement(By.className("helpers--auth-submit-button--W3Tqk")).click();
		System.out.println(lc.findElement(By.cssSelector("div.alert-banner-module--text-frame--t5nwh")).getText());
		lc.findElement(By.linkText("Forgot Password")).click();
		lc.findElement(By.xpath("//input[@type='checkbox']")).click();
		//lc.findElement(By.name("content")).isDisplayed();
 	}

}
