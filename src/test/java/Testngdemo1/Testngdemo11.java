package Testngdemo1;

import org.testng.annotations.Test;

public class Testngdemo11 {
  @Test (priority = 1)
  public void Test1() 
  {
	  System.out.println ("Java");
  }
  @Test(priority = 2)
  public void Test2() 
  {
	  System.out.println ("Selenium");
  }
}

