package Assessment2;

import java.security.PublicKey;

public class practice_Exception {
	
	int a = 4;
	static int b = 7;
	static int c = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		try
		{
		int k = b/c;
		
			System.out.println(k);
		
		}
		catch(Exception e){
			System.out.println("I caught the error in calculation");
		}
		//finally block is executed when the program is executed fully or partially 
		finally {
			System.out.println("this is my final block ");
		}
	}

}
