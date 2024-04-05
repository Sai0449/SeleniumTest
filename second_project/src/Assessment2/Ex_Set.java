package Assessment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(21);
		hs.add(29);
		hs.add(29);// duplicates are not allowed
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.remove(29));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		HashSet<String> ss = new HashSet<String>();
		ss.add("Sai");
		ss.add("Ravi");
		ss.add("jagadish");
		ss.add("Teja");
		ss.add("vijay");
		ss.add("Narendra");
		System.out.println(ss);
		Iterator<String> its =ss.iterator();
		System.out.println(its.next());
		System.out.println(its.next());
		System.out.println(its.next());
		System.out.println(its.hasNext());
		System.out.println(".............");
		while(its.hasNext()) {
			System.out.println(its.next());
			
		}


	}

}
