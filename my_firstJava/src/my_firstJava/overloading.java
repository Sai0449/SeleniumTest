package my_firstJava;
//function overloading if a class having the multiple methods with 
//same names but different in the arguments count or type of arguments defined
public class overloading {
	public void getdata(int a) {
		System.out.println(a);
	}
	public void getdata(String b) {
		System.out.println(b);
	}
	public void getdata(int a, float b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading load = new overloading();
		load.getdata(23);
		load.getdata("over loaded");
		load.getdata(22,(int)23.22);


	}

}
