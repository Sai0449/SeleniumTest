package demopack;

import java.util.List;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sai kumar";
		//StringBuilder stringbuild = new StringBuilder(name);
		//System.out.println(stringbuild.reverse());
		String name121 = "my name is sai";
		String[] arr = name121.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i].toString());
			System.out.print(" ");
		}
	}

}