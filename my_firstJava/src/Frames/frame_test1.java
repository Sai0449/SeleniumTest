package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\pothukum\\Documents\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("[id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("[id='droppable']"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}


}
