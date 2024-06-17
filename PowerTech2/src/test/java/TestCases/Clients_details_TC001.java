package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Clients_details_TC001 extends Base_class {

	
	@Test 
	public void login() throws InterruptedException
	{
		
		//sales section element
		driver.findElement(By.xpath("//span[normalize-space()='Sales']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Clients Details']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search by name or code']")).sendKeys("SETHI ELECTRICAL");
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='SETHI ELECTRICAL']")).click();
		
		Thread.sleep(2000);
		Set<String> windowIDS= driver.getWindowHandles();
		List<String> windowIDSlist=new ArrayList(windowIDS);
		String parentWindowIDS= windowIDSlist.get(0);
		String childWindowIDS=windowIDSlist.get(1);
		driver.switchTo().window(childWindowIDS);
		System.out.println("page title is :"+driver.getTitle());
		
		// Basic information edit
		System.out.println("-------Information edting---- ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-link btn-sm col-md-1 edit_button2']")).click();
		Thread.sleep(1000);
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='Enter Company name']"));
		name.clear();
		name.sendKeys("Assert it");
		Thread.sleep(2000);
		WebElement category=driver.findElement(By.xpath("//select[@name='category']"));
		Select select_drop=new Select(category);
		select_drop.selectByVisibleText("B2C");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Company GSTIN Number']")).sendKeys("GTNM1236985425S");
		WebElement billing_add=driver.findElement(By.xpath("//textarea[@name='billing_address']"));
		billing_add.clear();
		billing_add.sendKeys("New Delhi India");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='client_country']")).sendKeys("Rajasthan India");
		Thread.sleep(1000);
		WebElement shipping_add=driver.findElement(By.xpath("//textarea[@name='shipping_address']"));
		shipping_add.clear();
		shipping_add.sendKeys("South Delhi India");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Update']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-link btn-sm col-md-1 edit_button']")).click();
		Thread.sleep(2000);
		WebElement Fname=driver.findElement(By.xpath("//input[@placeholder='Enter first name']"));
		Fname.clear();
		Fname.sendKeys("Mayank");
		driver.findElement(By.xpath("//input[@placeholder='Enter last name']")).sendKeys("Kumar");
		WebElement EmailAdd=driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		EmailAdd.clear();
		EmailAdd.sendKeys("mayank@assertit.io");
		WebElement Phone_number=driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));
		Phone_number.clear();
		Phone_number.sendKeys("9586325674");
		driver.findElement(By.xpath("//input[@placeholder='Enter alt. phone number']")).sendKeys("7852369812");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Update']")).click();
		
		System.out.println("-------------Information updated successfully----------");
		
		
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowIDS);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		WebElement drop_down=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select drop=new Select(drop_down);
		drop.selectByVisibleText("75");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='clientfilter']")).click();
		driver.findElement(By.xpath("//input[@id='domestic']")).click();
		driver.findElement(By.xpath("//input[@id='b2c']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Export']")).click();
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//label[@class='ant-checkbox-wrapper ant-checkbox-group-item']"));
		
		for(WebElement check:checkbox)
		{
			String checkbox_text= check.getText();
			//Thread.sleep(2000);
			if(checkbox_text.equals("Shipping Address") || checkbox_text.equals("Client Country") || checkbox_text.equals("Client Code"))
			{
				Thread.sleep(1000);
				check.click();
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
		
		System.out.println("*****************Add client test case start********** ");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Client']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Company name']")).sendKeys("Assert It Solutions");
		driver.findElement(By.xpath("//input[@placeholder='Enter Company GSTIN Number']")).sendKeys("GTSN23659811645G");
		driver.findElement(By.xpath("//input[@placeholder='Enter contact person first name']")).sendKeys("Vipul");
		driver.findElement(By.xpath("//input[@placeholder='Enter contact person last name']")).sendKeys("Khare");
		driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Email']")).sendKeys("vipul@assertit.io");
		driver.findElement(By.xpath("//input[@name='contact_person_mobile']")).sendKeys("8965325698");
		driver.findElement(By.xpath("//input[@name='contact_person_alternate_mobile']")).sendKeys("7698325641");
		Thread.sleep(2000);
		WebElement type=driver.findElement(By.xpath("//select[@name='type']"));
		Select tpye_drop=new Select(type);
		tpye_drop.selectByVisibleText("Domestic");
		Thread.sleep(1000);
		WebElement Category=driver.findElement(By.xpath("//select[@name='category']"));
		Select Category_drop=new Select(Category);
		Category_drop.selectByVisibleText("B2C");
		driver.findElement(By.xpath("//textarea[@name='billing_address']")).sendKeys("Dubai Silicon Oasis, DDP, Building A1, Dubai, United Arab Emirates");
		
		Thread.sleep(2000);
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select country_drop=new Select(country);
		country_drop.selectByVisibleText("Colombia");
		driver.findElement(By.xpath("//textarea[@name='shipping_address']")).sendKeys("A-13/1, South Side G.T. Road Industrial Area, NH-9 By Pass, Ghaziabad, U.P.-201010");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
		System.out.println("****Client Add successfully*****");
		
	
		
	}
	
}
