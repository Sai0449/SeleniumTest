package my_firstJava;

public class Child_interface extends Parent_interface {

	public void colour() {
		System.out.println(colour);
	}
	public void breaks() {
		System.out.println("break code implemented");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_interface cd = new Child_interface();
		cd.breaks();
		cd.colour();
		cd.engine();
		cd.gear();
		//ChildAirIndia cd1= new ChildAirIndia();
	}

}
