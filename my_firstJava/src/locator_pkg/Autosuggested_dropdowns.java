package locator_pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggested_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.id("autosuggest")).getText());
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.linkText("Special Assistance")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class='popup-close2']")).click();
	}

}
