package Strems;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.IFactoryAnnotation;

public class LiveDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//click on the column
		//capture all the web elements into list
		//capture all the element in sorted
		//Sort theoriginal list

	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
	driver.findElement(By.xpath("//tr/th[1]")).click();
	List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
	List<String> originalList  =  elementList.stream().map(s->s.getText()).collect(Collectors.toList());
	List<String> sortedlist = originalList.stream().sorted().collect(Collectors.toList());
	//compare original list with the sorted list
	Assert.assertTrue(originalList.equals(sortedlist));
	List<String> priceneeded;
	do {
	//scan the veg column to get the text ->Rice-->print price of it
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
	priceneeded = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getpriceofveg(s)).collect(Collectors.toList());
	priceneeded.forEach(a->System.out.println(a));
	if(priceneeded.size()<1) {
		driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
	}
	}while(priceneeded.size()<1);
}
	

	private static String getpriceofveg(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
    
}