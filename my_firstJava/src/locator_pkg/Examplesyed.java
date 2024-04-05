package locator_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplesyed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int number = 5;
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector(".paxinfo")).click();
		for(int i=0;i<number;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click();
		System.out.println("passnge count"+driver.findElement(By.cssSelector(".paxinfo")).getText());
		driver.findElement(By.cssSelector("select[name='ctl00$mainContent$DropDownListCurrency']")).click();
	}
}
