package my_firstJava;

public class staticVar {
	String name;//= new String();
	String address;//= new String();
	static String city;// = new String(); or 
	//static string city = "Banglore";
	static int i = 0;
	int j = 0;
// if city is initializd as the static no need to add third parameter with 
	//string city we can just skip
	
	staticVar(String name,String address,String city){
		this.name = name;
		this.address = address;
		this.city = city;
		i++;
		System.out.println(i);
		j++;
		System.out.println(j);
	}
	public void getAddress() {
		System.out.println(address+city);
	}
	public static void getcity() {
		System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if we declare city as static no need to call Banglore all the time
		staticVar st= new staticVar("sai","marthanahalli","Banglore");
		staticVar st1= new staticVar("ravi","hebbal","Banglore");
		st.getAddress();
		st1.getAddress();
		System.out.print("\n");
		staticVar.getcity();// static variables can be access directly by the class
		staticVar.i=5;
	}
 
}