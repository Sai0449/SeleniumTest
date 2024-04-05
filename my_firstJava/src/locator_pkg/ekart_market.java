package locator_pkg;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ekart_market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] itemNeeded = {"Cucumber","Brocolli","Beetroot"};
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
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

//	private static void aslist(String[] itemNeeded) {
//		// TODO Auto-generated method stub
//		
//	}
	}

