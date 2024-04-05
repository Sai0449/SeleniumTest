import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox_dropdn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();	
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1;i<4;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("div[class='ad-row align-center']")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
//		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']"));
//		driver.findElement(By.cssSelector("a[value='BLR']")).click();
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}

}
