package Strems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class RelativeStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	WebElement myElement = driver.findElement(By.name("name"));
	System.out.println(driver.findElement(with(By.tagName("label")).above(myElement)).getText());
	WebElement dateofbirth =  driver.findElement(By.cssSelector("label[for='dateofBirth']"));
	System.out.println( driver.findElement(with(By.tagName("input")).below(dateofbirth)).getText());
	WebElement student = driver.findElement(By.id("inlineRadio1"));
	System.out.println(driver.findElement(with(By.tagName("label")).toLeftOf(student)).getText());
	}

}
