package my_firstJava;

import demopack.CentralTraffic;
import demopack.ContinentalTraffic;

public class AusTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AusTraffic();
		ContinentalTraffic b = new AusTraffic();
		a.red();
		a.yellow();
		a.greenGo();
		b.RialGate();
		

	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("move");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go");
	}

	@Override
	public void RialGate() {
		// TODO Auto-generated method stub
		System.out.println("Please Stop while rail is coming");
	}

}
