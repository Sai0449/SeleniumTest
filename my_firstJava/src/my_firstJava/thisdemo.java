package my_firstJava;

public class thisdemo {
	int a = 21; // here is a is gobal varaible
	public void getData() {
		int a = 44;// here a is local variable and have scope only in this method
	System.out.println(a);
	System.out.println(this.a);
	int b = a+this.a;
	System.out.println(b);
	}
	public static void main(String[] args) {
		thisdemo td = new thisdemo();
		td.getData();
		
	}
}
