package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.BaseClass;



public class Login{

	@FindBy(xpath = "//input[@name='q']" )
	public WebElement uid;	
	
	@FindBy(xpath = "//input[@name='btnK']" )
	public WebElement enter;
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openBrowser()
	{
		System.out.println("Browser already opened.");
	}
	
	
	
	public void login(String uname,String passwd)
	{
		uid.sendKeys(uname);
		enter.click();
	}
}
