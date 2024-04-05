package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTest2 {
	@Test
	public void homeloan() {
		System.out.println("my home loan");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("I will print after");
	}
	@Test(groups = {"smoke"})
	public void gaurantee2() {
		System.out.println("confirm2");
	}
	
	
}
