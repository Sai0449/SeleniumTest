import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "11";
		String date = "18";
		String year = "1997";
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("(//a[normalize-space()='Top Deals'])[1]")).click();
		Set<String> wdS = driver.getWindowHandles();
		Iterator<String> hcl =  wdS.iterator();
		String parent = hcl.next();
		String child = hcl.next();
		String[] expectedList = {month,date,year};
		driver.switchTo().window(child);
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup__input.react-date-picker__inputGroup__year")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
//		driver.findElement(By.cssSelector(".react-calendar__navigation__prev-button")).click();
		for(int i = 1;i<=3;i++) {
		driver.findElement(By.cssSelector(".react-calendar__navigation__prev-button")).click();
		}
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
//		System.out.println(driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).getText());
		List<WebElement> actual = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int j=0;j<actual.size();j++) {
//			System.out.println(actual.get(j).getAttribute("value"));
			org.testng.Assert.assertEquals(actual.get(j).getAttribute("value"), expectedList[j]);
		}
		System.out.print("Success");
		driver.quit();
//		driver.switchTo().window(parent);
//		driver.close();
	}

}
