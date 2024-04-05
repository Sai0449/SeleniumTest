package locator_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class ex2_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String myname = "Saikumar";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(myname);
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(myname);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sai123");
		driver.findElement(By.cssSelector("Input[placeholder='Phone Number']")).sendKeys("9014999299");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys(myname);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
	   Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "You are successfully logged in.");
	   Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+myname+",");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	   driver.close();
	}

}
