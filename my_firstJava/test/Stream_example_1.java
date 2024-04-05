

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Stream_example_1 {
	@Test
	public void regular() {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Sai");
		names.add("Sakshi");
		names.add("Raman");
		names.add("venkat");
		names.add("Shashi");
		int count = 0;
//		System.out.println(names.size());
		for(int i = 0;i<names.size();i++) {
			String actual = names.get(i);
			if(actual.startsWith("S")) {
				count++;
			}
		}
//		System.out.println("number of names starts with letter 'S' is "+count);
	}
	
	@Test
	public void streamfilter()
	{
		List<String> names = new ArrayList<String>();
		names.add("Sai");
		names.add("Sakshi");
		names.add("Raman");
		names.add("venkat");
		names.add("Shashi");
		long con = names.stream().filter(s->s.startsWith("S")).count();
		System.out.println(con);
		}
	}

