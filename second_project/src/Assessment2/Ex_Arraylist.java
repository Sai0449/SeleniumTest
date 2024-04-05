package Assessment2;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Ex_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(32);
		arr.add(2);
		arr.add(2,45);
		ArrayList<String> str = new ArrayList<String>();
		str.add("Sai");
		str.add("Sunil");
		str.add("Rahul");
		str.add("Ravi");
		str.add("Sai");
		System.out.println(str);
		System.out.println(arr);
		for(Integer farr : arr) {
		System.out.println(farr);
		}
		System.out.println(str.get(1));
		System.out.println(arr.contains(45));
		System.out.println(str.indexOf("Sai"));
		System.out.println(str.size());
		
	}

}
