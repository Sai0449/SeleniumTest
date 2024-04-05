package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void carloan() {
		System.out.println("Car loan");
	}
	@Test
	public void bikeloan() {
		System.out.println("Bike Loan");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I am before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("I am after method");
	}
	@Test(groups = {"smoke"})
	public void gaurantee3() {
		System.out.println("confirm3");
	}
}
