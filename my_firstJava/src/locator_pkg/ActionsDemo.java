package locator_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrievr.chrome.driver", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
//		driver.findElement(By.id("nav-link-accountList"));
		 Actions a = new Actions(driver);
		 WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		 a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("washingmachine").doubleClick().build().perform();
		 //moves to specific element in the wesite
		 a.moveToElement(move).build().perform();
		 a.moveToElement(move).contextClick().build().perform();
			}

}
