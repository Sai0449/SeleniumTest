package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String[] password = driver.findElement(By.cssSelector(".text-center.text-white")).getText().split(" ")[6].trim().split("//)");
//		System.out.println(mywordStrings[6]);
//		String[] newword = mywordStrings[6].split("\\)");
//		String[] updatedword = newword.split("\\)");
//		String itt = password[].trim();
//		System.out.println(itt);
	}

}
//(username is rahulshettyacademy and Password is learning)