package my_firstJava121;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Examples1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		a.moveToElement(driver.findElement(By.id("name"))).click().keyDown(Keys.SHIFT).sendKeys("sai").build().perform();
	}

}
