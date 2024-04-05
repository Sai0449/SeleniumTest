package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,600)");
	Thread.sleep(3000);
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	List<WebElement> valuesstored = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int Sum = 0;
	for(int i=0;i<valuesstored.size();i++) {
		Sum = Sum+Integer.parseInt(valuesstored.get(i).getText());
	}
	System.out.println(Sum);
	int Total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
//	String myNum = formattedText[1].trim();
	System.out.println(Total);
	org.testng.Assert.assertEquals(Sum, Total);
	System.out.println("Success");
	}

}
