package locator_pkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrievr.chrome.driver", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String nameofuser =  driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentid);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(nameofuser);
	}
	
}
