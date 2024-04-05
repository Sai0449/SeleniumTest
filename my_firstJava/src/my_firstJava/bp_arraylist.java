package my_firstJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bp_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Rahul");
		arr.add("Sai");
		arr.add("Srikanth");
		//arr.remove(0);
		System.out.println(arr.get(0));
		for(int i = 0; i< arr.size();i++) {
			System.out.println(arr.get(i));//accesing the array elements in arrayList by predefined methods get()
		}
		System.out.println("******");
		for(String val: arr) //arrayList using enhancing for loop
		{
			System.out.println(val);
		}
		System.out.println(arr.contains("Rahul")); //accesing the array elements in arrayList by predefined methods contains
		String[] arr2 = {"Ram","Shyam","Ravi"}; //declaring the array
		List<String> namearray= Arrays.asList(arr2); //converting normal array to the arraylist
		System.out.println(namearray.contains("Ram"));//accesing the array elements in arrayList by predefined methods contains
		for(int i = 0;i<namearray.size();i++) {
		System.out.println(namearray.get(i));
		}
		System.out.println("------");
		for(String a1 : namearray)
		{
			System.out.println(a1);
		}
	}
	
 
}
