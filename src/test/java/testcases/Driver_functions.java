package testcases;

import lennox_Initializer.Initializer;

public class Driver_functions extends Initializer{

	public static void loadurl(){
		wd.manage().window().maximize();
		wd.get(envProp.getProperty("URL"));
	}
}
