package Intro;

import org.testng.annotations.Test;

public class Child extends Parent {
	@Test
	public void myname() {
		getTest();
		int a = 3;
		parent2 ab = new parent2(a);
		System.out.println(ab.increment());
		System.out.println(ab.decrement());
		//Parent3 aa = new Parent3();
		System.out.println(ab.multiplyThree());
	}
}
