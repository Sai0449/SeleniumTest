package my_firstJava;

public class ConstructDemo {
	// normal default constructor
	public ConstructDemo() {
		System.out.println("I am a constructor");
	}
	// parameterized constructor
	public ConstructDemo(int a,int b) {
		System.out.println("I am a parameterized constructor");
	}
	public void getData() {
		System.out.println();
	}
	public ConstructDemo(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructDemo cd = new ConstructDemo();
		ConstructDemo cd1 = new ConstructDemo(4,5);
		ConstructDemo cd2 = new ConstructDemo("Hello");

	}

}
