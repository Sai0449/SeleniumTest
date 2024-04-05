package test;

import org.testng.annotations.Test;

public class BasicTest {
	@Test
	public void executing() {
		System.out.println("Test");
	}

	@Test
	public void secondTest() {
		System.out.println("SecondTest");
	}

	@Test(groups = { "smoke" })
	public void gaurantee1() {
		System.out.println("confirm1");
	}

}
