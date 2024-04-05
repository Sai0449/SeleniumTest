package Selenium_Java.seleniumFrameWork.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class LandingPage extends AbstractComponent {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	WebElement usrname = driver.findElement(By.id("userEmail"));
	//PageFactory
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id = "userPassword")
	WebElement pwd;
	
	@FindBy(id = "login")
	WebElement submit;
	
	public void loginApplication(String email,String password) {
		userEmail.sendKeys(email);
		pwd.sendKeys(password);
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
}