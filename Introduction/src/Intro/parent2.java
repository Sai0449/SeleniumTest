package Intro;

public class parent2 extends parent3 {
	
	int a; // a is class variable
	public parent2(int a) {// here a is instance variable with parameterized constructor
		super(a);//it will invoke a from the Parent3 class
		this.a = a;
	}

public int increment() {
	a = a+1;
	return a;
}
public int decrement() {
	a= a-1;
	return a;
}
}
