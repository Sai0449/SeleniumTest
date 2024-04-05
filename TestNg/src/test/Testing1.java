package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing1 {
	@Parameters({"URL"})
	@Test()
	public void geturlname(String urlname) {
		System.out.println(urlname);
	}
	@Test(dataProvider = "getdata")
	public void logindata(String usrname, String pwd) {
		System.out.println(usrname);
		System.out.println(pwd);
		
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0]="firstUserName";
		data[0][1]="firstPassword";
		//coloumns in a row are values for the particular combination
		// 2nd set
		data[1][0]="SecondUserName";
		data[1][1]="SecondPassword";
		// 3rd set
		data[2][0]="thirdUserName";
		data[2][1]="thirdPassword";
		return data;
	}
}
