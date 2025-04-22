package Assignmnet1Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Assignmnet1Login.BaseClass;

public class LoginWithValidScnario extends BaseClass
{

	@Test(priority = 1)
	public void loinWithValidScnario() 
	{
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		driver.findElement(By.className("submit-btn")).click();
		WebElement messge=driver.findElement(By.xpath("//h4[@class='welcomeMessage']"));
		String Text=messge.getText();
		System.out.println("welcome message is "+Text);
		Assert.assertTrue(Text.contains("Welcome"),"Tittle is not verified");
	}
	@Test(priority = 2 ,dependsOnMethods = "loinWithValidScnario")
	public void logout() throws InterruptedException
{
		
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		String out=driver.getCurrentUrl();
		System.out.println("Tittle is"+out);

		Assert.assertTrue(out.contains("automation"),"Logout Sucessfully ");
		}
}
