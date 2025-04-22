package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utiility 
{
	public static WebDriver StartBrowser() 
	{
	WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 return driver;
		
	}

	
	public static WebDriver StartBrowser(String Browser,String URL) 
	{
		System.out.println("Running Test on Browser");
		WebDriver driver = null;
		if(Browser.contains("Chrome")) 
		{
			driver=new ChromeDriver();
		}else if(Browser.contains("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browser.contains("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 return driver;
		
	}
}
