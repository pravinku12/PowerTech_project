package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class {


	WebDriver driver;

	@BeforeMethod
	public void openURL() throws InterruptedException
	{

		driver=new ChromeDriver();
		driver.get("http://assertit-powertech-dev-server.s3-website.ap-south-1.amazonaws.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sanjeev");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(3000);

	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{ 
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(750,0)");
		System.out.println("Test case passed");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		System.out.println("*******logout successfully**********");
		driver.quit();
		
		
	}
}
