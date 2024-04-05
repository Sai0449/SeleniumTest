package locator_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdown_ex2_passengers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i = 1;
		while(i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		System.out.println(driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).getText());
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//System.out.println(driver.findElement(By.cssSelector(".custom_date_pic.required.picker-first.home-date-pick.valid")).getText());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.cssSelector("div[style='display: block; opacity: 1;']")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("is enabled");
			Assert.assertTrue(true);
		}
		//test will fail when the condition reaches else 
		else {
			Assert.assertTrue(false);
		}
	}	

}
