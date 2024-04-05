package my_firstJava;

import demopack.ParentAirCraft;

public class ChildAirIndia extends ParentAirCraft {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAirIndia as = new ChildAirIndia();
		as.color();
		as.engine();
		as.safetyRulz();
		ParentAirCraft ww = new ChildAirIndia();
		ww.engine();
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Add the color Red with white.");
	}

}
