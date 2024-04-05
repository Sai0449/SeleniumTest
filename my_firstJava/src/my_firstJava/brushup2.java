package my_firstJava;

public class brushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,13,14,19,45,44,52};
		
		for(int i = 0;i<=arr.length ;i++) {
			if(arr[i]%2 ==0) {
				System.out.println(arr[i]+" is a even number");
				
			}
			else {
				System.out.println(arr[i]+" is not a even number");
//				continue;
			}
		}

	}

}
