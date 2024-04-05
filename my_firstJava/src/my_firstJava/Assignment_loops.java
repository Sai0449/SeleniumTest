package my_firstJava;

public class Assignment_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =1;
		for(int i =0; i<4;i++) {
			for(int j=1;j<=4-i;j++) {

				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		for(int l = 0;l<=4;l++) {
			int n = 1;
			for(int m = 1;m<=l;m++) {
				System.out.print(n);
				n++;
				System.out.print("\t");
			}
			System.out.println("");
		}
		int o = 1;
		for(int l = 0;l<4;l++) {
			
			for(int m = 1;m<=l;m++) {
				System.out.print(o*3);
				o++;
				System.out.print("\t");
			}
			System.out.println("");
		}
		int n = 1;
		for(int l = 0;l<=4;l++) {
			for(int m = 1;m<=l;m++) {
				System.out.print(n);
				n++;
				System.out.print("\t");
			}
			System.out.println("");
		}
		for(int l = 0;l<=4;l++) {
			for(int m = 1;m<=l;m++) {
				System.out.print(m);
				//n++;
				System.out.print("\t");
			}
			System.out.println("");
		}
		
	}

}
