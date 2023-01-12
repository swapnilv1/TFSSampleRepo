package utilities;

import org.openqa.selenium.chrome.ChromeDriver;

import baseTest.BaseClass;

public class InitConfig extends BaseClass{

	public static String env="";
	
	public void initDriver()
	{
		if(env.equalsIgnoreCase("UAT"))
		{
			System.out.println("Environment is UAT.");
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
		}
	}
	
}
