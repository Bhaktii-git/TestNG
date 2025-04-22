package Assignmnet1Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewUserRegister extends BaseClass
{
	      String NewUseremail="test"+System.currentTimeMillis()+"@email.com";
			String Password="test@"+System.currentTimeMillis();
			
	@Test(priority = 1)
	public void registerNewUser() throws InterruptedException
	{
	 
		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();
		String Tittle=driver.getCurrentUrl();
		Assert.assertTrue(Tittle.contains("signup"),"User not redirected signup page");
		
		WebElement signup=driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));
		Assert.assertFalse(signup.isEnabled(), "Signup button is Enabled");
		
		driver.findElement(By.id("name")).sendKeys("Bhakti12");
		driver.findElement(By.id("email")).sendKeys(NewUseremail);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//div[@class='interests-div']/div[1]")).click();
		driver.findElement(By.id("gender2")).click();
		WebElement dropdown=driver.findElement(By.id("state"));
		Select se=new Select(dropdown);
		se.selectByValue("Goa");
		
		WebElement hobiees=driver.findElement(By.xpath("//select[@id='hobbies']"));
		Select se1=new Select(hobiees);
		se1.selectByValue("Playing");
		se1.selectByValue("Swimming");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Assert.assertTrue(signup.isEnabled(),"Signup button is disbled");
		wait.until(ExpectedConditions.elementToBeClickable(signup));
		
		signup.click();
	    Thread.sleep(2000);
		WebElement messgae=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Signup successfully, Please login!']"))); 
	     String ms1=messgae.getText();
	     Reporter.log("Test is "+ms1,true);
	   Assert.assertTrue(ms1.contains("successfully"),"Sign in failed");
		
	
		
	}
	@Test(priority = 2)
	public void LoginWithNewUser() throws InterruptedException 
	{
		driver.findElement(By.id("email1")).sendKeys(NewUseremail);
		driver.findElement(By.id("password1")).sendKeys(Password);
		driver.findElement(By.className("submit-btn")).click();
		
		WebElement messge=driver.findElement(By.xpath("//h4[@class='welcomeMessage']"));
		String Text=messge.getText();
		System.out.println("welcome message is "+Text);
		Assert.assertTrue(Text.contains("Welcome"),"Tittle is not verified");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		String out=driver.getCurrentUrl();
		System.out.println("Tittle is"+out);

		Assert.assertTrue(out.contains("automation"),"Logout Sucessfully ");
		
	}

}
