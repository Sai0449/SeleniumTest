package Strems;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//switching window
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String parentwd = it.next();
		String childwd = it.next();
		driver.switchTo().window(childwd);
		driver.get("https://rahulshettyacademy.com/");
		String mytext = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentwd);
		//to get screenshot of particular webelement
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(mytext);
		File file1 = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("logo.png"));
		//get height and width of the webElement
		System.out.println( name.getRect().getDimension().getHeight());
		System.out.println( name.getRect().getDimension().getWidth());
	}

}
