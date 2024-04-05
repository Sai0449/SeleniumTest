package Assessment2;

import java.util.HashSet;
import java.util.Iterator;

public class Ex_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> ab = new HashSet<Integer>();
		ab.add(21);
		ab.add(99);
		ab.add(12);
		ab.add(92);
		Iterator<Integer> ex1 = ab.iterator();
//		while(ex1.hasNext()) {
//			System.out.print(ex1.next()+" ");
//			
//		}
		do{
			System.out.print(ex1.next()+ " ");
		}while(ex1.hasNext());
	}

}
