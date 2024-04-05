package Strems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Stream_example_1 {
	@Test
	public void regular() {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
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
		
		Stream.of("Sai","Sakshi","Raman","Venkat","Shashi").filter(s->s.startsWith("S")).count();
		//or
		long d = Stream.of("Sai","Sakshi","Raman","Venkat","Shashi").filter(s->
		{
		s.startsWith("S");
		return true;
		}).count();
		System.out.println(d);
		//print the values in the arraylist
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//print the value greater than 4 in length and first one
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sai");
		names.add("Sakshi");
		names.add("Rama");
		names.add("venka");
		names.add("Shashi");
		Stream.of("Rama","Alekya","Don","Abhijith","Adama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//or
		List<String> arr = Arrays.asList("Rama","Bharatha","Laxmana","Arjun","Krishna");
		arr.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Merging two strings in sorted order
		Stream<String> combineList = Stream.concat(names.stream(), arr.stream());
//		combineList.sorted().forEach(s->System.out.println(s));
		boolean flag = combineList.anyMatch(s->s.equalsIgnoreCase("Raman"));
		Assert.assertTrue(flag);//checks weather Raman is present or not
	}
	@Test
	public void Streamcollect() {
	
		List<String> listing =	Stream.of("Rama","Alekya","Don","Abhijith","Adama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(listing.get(0));
//		
		
	}
}

