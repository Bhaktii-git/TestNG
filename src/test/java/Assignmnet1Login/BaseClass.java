package Assignmnet1Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Helper.Utiility;

public class BaseClass 
{
	WebDriver driver;
	@BeforeClass
	//@BeforeMethod 
	public  void setup() 
	{
		System.out.println("Starting the browser");
		driver=Utiility.StartBrowser("Chrome","https://freelance-learn-automation.vercel.app/login");
	}
	@AfterClass
	//@AfterMethod
	public  void TearDown() 
	{
		System.out.println("Running After the class");
		driver.quit();
	}
}
