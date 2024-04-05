package Intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Parent {
	public void getTest() {
		System.out.println("Sai");
	}
	@BeforeTest
	public void beforemethod() {
		System.out.println("printing before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("printing after method");
	}
}
