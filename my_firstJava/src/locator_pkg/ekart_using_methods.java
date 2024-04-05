package locator_pkg;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ekart_using_methods {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] itemNeeded = {"Cucumber","Brocolli","Beetroot"};
		String code = "rahulshettyacademy";
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		//InterruptedException b = new InterruptedException();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		additems(driver,itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//		Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys(code);
		driver.findElement(By.cssSelector("button.promoBtn")).click();
//		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	public static void additems(WebDriver driver,String[] itemNeeded) {
		List<WebElement> product= driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for(int i =0;i<product.size();i++) {
		String[] name =	product.get(i).getText().split("-");
		String formattedname = name[0].trim();
		List itemsneededList = Arrays.asList(itemNeeded);
		if(itemsneededList.contains(formattedname)) {
			j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemNeeded.length) {
					break;
				}
			}
			}
	}
}
