package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested_frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
