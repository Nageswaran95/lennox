package lennox_Initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initializer {
	public static FileInputStream envFis=null;
	public static Properties envProp=null;
	
	public static FileInputStream locatorFis=null;
	public static Properties locatorProp=null;
	
	public static WebDriver wd=null;
	
	public static void initialize() throws IOException {
		envFis=new FileInputStream(new File("C:/seleniumworkspace/Browser_script/src/test/resources/lennox_config/env.properties"));
		envProp=new Properties();
		envProp.load(envFis);
		
		locatorFis=new FileInputStream(new File("C:/seleniumworkspace/Browser_script/src/test/resources/lennox_config/locator.properties"));
		locatorProp=new Properties();
		locatorProp.load(locatorFis);
		
		if(envProp.getProperty("BROWSER").equals("CHROME")){
			System.setProperty("webdriver.chrome.driver","C:/seleniumworkspace/Browser_script/drivers/chromedriver.exe");
			wd = new ChromeDriver();
		}
	} 
	
	public static WebElement geWebElementByXpath(String xpath){
		return wd.findElement(By.xpath(locatorProp.getProperty(xpath)));
		
	}
}

 