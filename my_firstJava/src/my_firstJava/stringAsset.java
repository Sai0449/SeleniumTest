package my_firstJava;

public class stringAsset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "my name is john";
		String[] data1 = data.split(" ");
		for(String a : data1) {
			System.out.println(a);
		}
		String mydata = "and my school is vgs";
		System.out.println(data+mydata);
	
		 int[][] arr = { { 1, 2 }, { 3, 4 } };
		 
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	 
	            System.out.println();
	        }
}
}