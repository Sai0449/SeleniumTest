package my_firstJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("d/M/yyyy");
		System.out.println(df.format(d));
		System.out.println(d.toString());
	}

}
