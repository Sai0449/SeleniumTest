import java.util.ArrayList;

import org.testng.annotations.Test;

public class test {
	@Test
	public void regular() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Sai");
		arr.add("Teja");
		arr.add("Jaggu");
		arr.add("Vijay");
		arr.add("Suresh");
		for(int i = 0;i<arr.size();i++) {
			String actual = arr.get(i);
			System.out.println(actual);
		}
	}
}
