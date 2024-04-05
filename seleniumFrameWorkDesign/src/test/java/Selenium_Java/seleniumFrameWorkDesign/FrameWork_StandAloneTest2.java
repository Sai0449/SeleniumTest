package Selenium_Java.seleniumFrameWorkDesign;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.dockerjava.api.model.Driver;

import Selenium_Java.seleniumFrameWork.object.LandingPage;
import Selenium_Java.seleniumFrameWork.object.ProductCatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWork_StandAloneTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emailid = "saikumar@gmail.com";
		String loginpwd = "Sai@1212";
		String nameOfProduct = "ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LandingPage Lp = new LandingPage(driver);
		Lp.goTo();
		Lp.loginApplication(emailid, loginpwd);
		ProductCatalogue productcat = new ProductCatalogue(driver);
		List<WebElement> Products = productcat.getproductList();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
		WebElement productname = Products.stream()
				.filter(prod -> prod.findElement(By.cssSelector("b")).getText().equals(nameOfProduct)).findFirst()
				.orElse(null);
		productname.findElement(By.cssSelector(".card-body button:last-of-type")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#toast-container")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		List<WebElement> CartProducts = driver.findElements(By.cssSelector(".wrap h3"));
		Boolean matches = CartProducts.stream()
				.anyMatch(cartproduct -> cartproduct.getText().equalsIgnoreCase(nameOfProduct));
		Assert.assertTrue(matches);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".totalRow button")));
		driver.findElement(By.cssSelector(".totalRow button")).click();
		Actions aa = new Actions(driver);
		aa.sendKeys(driver.findElement(By.cssSelector("placeholder='Select Country'")), "india").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector(".btnn.action__submit.ng-star-inserted")).click();
		String ConfirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		boolean TextMatch = ConfirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER.");
		Assert.assertTrue(TextMatch);
	}

}