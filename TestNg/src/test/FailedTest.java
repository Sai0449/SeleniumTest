package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest {
	@Test
	public void failedtestcase() {
		System.out.println("trying to Failing test");
		Assert.assertTrue(false);
	}
}
