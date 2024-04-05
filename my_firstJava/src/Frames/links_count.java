package Frames;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement coloumndriver =	footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++) {
			
			String newtabopening =Keys.chord(Keys.CONTROL,Keys.ENTER);
//			Actions aa = new Actions(driver);
//			WebElement a1 = (WebElement) aa.keyDown(Keys.CONTROL);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(newtabopening);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator it = abc.iterator();
		while( it.hasNext()){
			driver.switchTo().window((String) it.next());
			System.out.println(driver.getTitle());
		}
	}

}
