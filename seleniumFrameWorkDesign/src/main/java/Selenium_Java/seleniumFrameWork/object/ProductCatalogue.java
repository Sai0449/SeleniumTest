package Selenium_Java.seleniumFrameWork.object;

import java.util.List;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class ProductCatalogue extends AbstractComponent {
	WebDriver driver;
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	//PageFactory
	@FindBy(css =".mb-3")
	List<WebElement> products;
	
	By products11 = By.cssSelector(".mb-3");
	
	public List<WebElement> getproductList() {
		waitforElementtoAppear(products11);
		return products;
	}
	public void getProductbyName(String productName) {
		
	}
}
