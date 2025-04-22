package Cross_Browser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class CrossBrowser 

{
	@BeforeClass 
   public void setup()
   {
		WebDriver driver=Utility.UtilityFOrCrossBrowser("","");
	   
   }
	
}
