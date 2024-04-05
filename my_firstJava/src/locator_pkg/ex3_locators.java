package locator_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String myname = "Saikumar";
		String password =  getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(myname);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(password);
		driver.findElement(By.cssSelector("Input[placeholder='Phone Number']")).sendKeys("9014999299");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys(myname);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		driver.close();
//		driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
		}
	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sai123");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordtext.split("'");
		String password = passwordArray[1].split("'")[0];
		return password ;
	}
}
