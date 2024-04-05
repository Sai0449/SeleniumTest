package Frames;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import java.net.URLConnection;
//import java.sql.ConnectionBuilder;
import java.util.List;
//import java.util.function.IntConsumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Broken_links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		SoftAssert a = new SoftAssert();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection Con = (HttpURLConnection) new URL(url).openConnection();
			Con.setRequestMethod("HEAD");
			Con.connect();
			int CodeNum = Con.getResponseCode();
			System.out.println(CodeNum);
			a.assertTrue(CodeNum < 400,
					"the link with this text" + link.getText() + "is Invalid and with the broken code" + CodeNum);
//		if(CodeNum>400) {
//			System.out.println("the link with this text"+link.getText()+"is Invalid and with the broken code"+CodeNum);
//			Assert.assertTrue(false);
//			continue;
//			}
		}
		a.assertAll();
		
	}

}