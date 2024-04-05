package my_firstJava;

public class bp3_Strings {

	public static void main(String[] args) {
		// String is an object that represents sequence of characters
		// String can be declared in 2 ways 
		// TODO Auto-generated method stub
		//literal declaration: here only one memory is assigned since the content is same
		String s1 = "Welcome Brooh";
		String s2 = "Welcome Brooh";
		// here 2 memory locations can be assigned while using new keyword
		String a1 = new String("Hello brooh");
		String a2 = new String("Hello brooh");
		
		String r1 = "Rahul is my Friend";
		String[] splittedStrings= r1.split(" ");
		for(int i = 0;i<splittedStrings.length;i++) {
		System.out.println(splittedStrings[i]);
		}
		System.out.println("......");
//		for(String d1:splittedStrings) {
//			System.out.println(d1);
//		}
//		System.out.println("......");
//		List<String> myconvertList = Arrays.asList(splittedStrings);
//		myconvertList.add("Sai");
//		System.out.println(myconvertList.contains("Rahul"));
//		for(String d2 : myconvertList) 
//		{
//			System.out.println(d2);
//		}
		String p = ("This is my java prog");
		String[] spilted2= p.split("my");
		System.out.println(spilted2[0]);
		System.out.println(spilted2[4]);

	} 

}
