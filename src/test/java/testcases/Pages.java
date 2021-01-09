package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import lennox_Initializer.Initializer;

public class Pages extends Initializer {
	
	public static void loginpage(){
		geWebElementByXpath("HOMEPAGE_TYPE_LOGIN_XPATH").click();
	}

	public static void enterusername(String username){
		geWebElementByXpath("HOMEPAGE_TYPE_USERNAME_XPATH").sendKeys(username);
	}
	
	public static void enterpassword(String password){
		geWebElementByXpath("HOMEPAGE_TYPE_PASSWORD_XPATH").sendKeys(password);
	}
	
	public static void signin(){
		geWebElementByXpath("HOMEPAGE_TYPE_SIGNIN_XPATH").click();
	}
	
	public static void menu(){
		geWebElementByXpath("HOMEPAGE_TYPE_MENU_XPATH").click();
	}
	
	public static void salestools(){
		geWebElementByXpath("HOMEPAGE_TYPE_SALESTOOLS_XPATH").click();
	}
	
	public static void proposal(){
		geWebElementByXpath("HOMEPAGE_TYPE_PROPOSAL_XPATH").click();
	}
	
	public static void lead(){
		geWebElementByXpath("HOMEPAGE_TYPE_LEAD_XPATH").click();
	}
	
	public static void addlead(){
		geWebElementByXpath("HOMEPAGE_TYPE_ADDLEAD_XPATH").click();
	}
	
	public static void addlead2(){
		geWebElementByXpath("HOMEPAGE_TYPE_ADDLEAD2_XPATH").click();
	}
	
	public static void fname(String fname){
		geWebElementByXpath("HOMEPAGE_TYPE_FNAME_XPATH").sendKeys(fname);
	}
	
	public static void lname(String lname){
		geWebElementByXpath("HOMEPAGE_TYPE_LNAME_XPATH").sendKeys(lname);
	}
	
	public static void phone(String phone){
		geWebElementByXpath("HOMEPAGE_TYPE_PHONE_XPATH").sendKeys(phone);
	}
	
	public static void email(String email){
		geWebElementByXpath("HOMEPAGE_TYPE_EMAIL_XPATH").sendKeys(email);
	}
	
	public static void date(String date){
		geWebElementByXpath("HOMEPAGE_TYPE_DATE_XPATH").sendKeys(date);
	}
	
	
	
}
