package Assessment2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex_hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hm = new Hashtable<Integer, String>();
		hm.put(0, "Hi");
		hm.put(1, "Sai");
		hm.put(2, "How");
		hm.put(3, "are you");
		//hm.put(4, null);
//		System.out.println(hm.get(3));
//		hm.remove(3);
//		System.out.println(hm.get(3));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}
	}

}
