package Cross_Browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility 
{

	 public static WebDriver UtilityFOrCrossBrowser(String Browser,String URL) 
	 
	 {
		 WebDriver driver = null;
		 System.out.println("Running the Test On Browser");
		 
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
