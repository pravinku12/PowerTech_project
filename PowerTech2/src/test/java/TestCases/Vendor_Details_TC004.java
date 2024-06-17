package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Vendor_Details_TC004 extends Base_class{

	@Test
	public void Vendor_details() throws InterruptedException 
	{
		// purchase section

		driver.findElement(By.xpath("//span[normalize-space()='Purchase']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Vendor Details']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='View Vendors']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add New Vendor']")).click();
		Thread.sleep(2000);
		System.out.println(" Add new Vendor details form  test start");
		driver.findElement(By.xpath("//input[@placeholder='Enter Vendor name']")).sendKeys("Assert it ");
		driver.findElement(By.xpath("//input[@placeholder='Enter Company GSTIN Number']")).sendKeys("GTM1236985470HD");
		Thread.sleep(1000);
		WebElement tilte=driver.findElement(By.xpath("//select[@name='title']"));
		Select sel_title=new Select(tilte);
		sel_title .selectByVisibleText("Mrs");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter contact person first name')]")).sendKeys("Suchi Gupta");
		driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Email']")).sendKeys("test@assertit.io");
		Thread.sleep(1000);
		WebElement code=driver.findElement(By.xpath("//select[@name='countryCode']"));
		Select sel_code=new Select(code);
		sel_code.selectByVisibleText("India (+91)");
		driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Mobile']")).sendKeys("9856325698");
		Thread.sleep(2000); 
		WebElement alt=driver.findElement(By.xpath("//select[@name='alt_countryCode']"));
		Select sel_alt_code=new Select(alt);
		sel_alt_code.selectByValue("44");
		driver.findElement(By.xpath("//input[@placeholder='Enter Contact Person Alt. Mobile']")).sendKeys("2365984525");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Item Name')]")).sendKeys("WebSite Designing");
		Thread.sleep(2000);
		WebElement payment=driver.findElement(By.xpath("//select[@name='payment_terms']"));
		Select sel_payment=new Select(payment);
		sel_payment.selectByVisibleText("within 30 days of MRN");
		driver.findElement(By.xpath("//input[@placeholder='Enter contact person last name']")).sendKeys("Assert");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your Address']")).sendKeys("A-13/1, South Side G.T. Road Industrial Area, NH-9 By Pass, Ghaziabad, U.P.-201010");
		System.out.println("New Vendor details form filled");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement per_page=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sel_page=new Select(per_page);
		sel_page.selectByVisibleText("50");
		System.out.println("Row per page selected ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Export']")).click();
		Thread.sleep(2000);
		List<WebElement> export_field=driver.findElements(By.xpath("//label[@class='ant-checkbox-wrapper ant-checkbox-group-item']"));
		for(WebElement export_check:export_field)
		{
			String checkbox_value= export_check.getText();
			System.out.println(checkbox_value);
			if(checkbox_value.equals("Contact Person") ||checkbox_value.equals("Suppliet Gst") || checkbox_value.equals("Vendor Code") )
			{
				export_check.click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("Search and edit record test ");
		driver.findElement(By.xpath("//input[@placeholder='Search by name or vendor code']")).sendKeys("MAHESH AGENCIES");
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='MAHESH AGENCIES']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(1000);
		WebElement counrty_name=driver.findElement(By.xpath("//input[@placeholder='Enter Company name']"));
		counrty_name.clear();
		counrty_name.sendKeys("Assert Agencies");
		Thread.sleep(1000);
		WebElement pay_tm=driver.findElement(By.xpath("//select[@name='payment_terms']"));
		Select term_pay=new Select(pay_tm);
		term_pay.selectByVisibleText("within 14 days of MRN");
		Thread.sleep(1000);
		WebElement gstin_no=driver.findElement(By.xpath("(//input[@placeholder='Enter Company GSTIN Number'])[1]"));
		gstin_no.clear();
		gstin_no.sendKeys("MNOS1236548RIV");
		WebElement add=driver.findElement(By.xpath("(//textarea[@placeholder='Enter your Address'])[1]"));
		add.clear();
		add.sendKeys("Green Park New Delhi ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Update'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='ant-notification-notice-close'])[1]")).click();
		System.out.println("Basic Information Edited successfully");
		
		Thread.sleep(2000);
		System.out.println("Conatct Information ");
		driver.findElement(By.xpath("(//i[@class='fa fa-pencil text-primary'])[2]")).click();
		Thread.sleep(2000);
		WebElement contact_per=driver.findElement(By.xpath("(//input[@placeholder='Enter name'])[1]"));
		contact_per.clear();
		contact_per.sendKeys("MD.Haris");
		WebElement email=driver.findElement(By.xpath("(//input[@placeholder='Enter email address'])[1]"));
		email.clear();
		email.sendKeys("haris@assertit.io");
		WebElement contact_number=driver.findElement(By.xpath("(//input[@name='phone_number'])[1]"));
		contact_number.clear();
		contact_number.sendKeys("+91 9685321459");
		WebElement alt_number=driver.findElement(By.xpath("(//input[@name='alt_phone_number'])[1]"));
		alt_number.clear();
		alt_number.sendKeys("+91 7856932140");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Update']")).click();
		System.out.println("Contact Information deatils edited successfully");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(600,0)");
		Thread.sleep(2000);
		System.out.println("Seaarch and delete record test case ");
		driver.findElement(By.xpath("//i[@class='fa fa-chevron-left']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search by name or vendor code']")).sendKeys("Assert it ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Delete'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control mx-auto mt-3 mb-3']")).sendKeys("delete");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println("Record delete successfully and all test scenario passes");
		







	}
}
