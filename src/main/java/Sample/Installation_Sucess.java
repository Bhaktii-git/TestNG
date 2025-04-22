package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Installation_Sucess {
     @Test
	public  void Test1()
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");
		driver.quit();

	}

}
