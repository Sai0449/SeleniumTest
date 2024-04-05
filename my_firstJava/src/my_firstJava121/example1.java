package my_firstJava121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sa = new Select(element);
		sa.selectByIndex(2);
		System.out.println(sa.getFirstSelectedOption().getText());
		}

}
