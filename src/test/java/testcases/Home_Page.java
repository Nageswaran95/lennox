package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import input_reader.inputReader;
import lennox_Initializer.Initializer;

public class Home_Page extends Initializer{
	
	@Test(dataProvider="HomepageTest")
	public void validateHomepage(String username, String password,String fname,String lname,String phone,String email
			,String date) throws IOException{
		initialize();
		Driver_functions.loadurl();
		Pages.loginpage();
		Pages.enterusername(username);
		Pages.enterpassword(password);
		Pages.signin();
		Pages.menu();
		Pages.salestools();
		Pages.proposal();
		Pages.lead();
		Pages.fname(fname);
		Pages.lname(lname);
		Pages.phone(phone);
		Pages.email(email);
		Pages.date(date);
	}

	
	@DataProvider(name="HomepageTest")
	public static Object[][] getHomePage() throws Exception{
		Object[][] data=inputReader.collectSingleData("HomepageTest");
		return data;
		
		
		/*
		data[0][0]="lenproautomation8@lenqat.com";
		data[0][1]="Community17";
		data[0][2]="abc";
		data[0][3]="a";
		data[0][4]="12345";
		data[0][5]="abc@gmail.com";
		data[0][6]="01-13-2021";
		*/
	}
}
