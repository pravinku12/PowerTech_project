package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Inventory_TC008 extends Base_class {

	
	@Test
	public void Add_item_add_stoke_assign_view_stoke() throws InterruptedException
	{
		System.out.println("Inventory test case start");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[normalize-space()='Store'])[1]")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='Inventory'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Add Item'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='item_name']")).sendKeys("testing17");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Stock Quantity'])[1]")).sendKeys("29");
		driver.findElement(By.xpath("(//input[@id='inlineCheckbox1'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add Now'])[1]")).click();
		System.out.println("Item added successfully"); 
		//driver.navigate().refresh();
		System.out.println("Add stoke test start");
		driver.findElement(By.xpath("(//a[normalize-space()='Add Stock'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[1]")).click();
		List<WebElement> item_name=driver.findElements(By.xpath("//div[@class='select__option css-yt9ioa-option']"));
		for(WebElement names:item_name)
		{
			String name_list=names.getText();
			System.out.println(name_list);
			if(name_list.equals("I-945 / testing13"))
			{
				names.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//label[normalize-space()='MRN ID'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[2]")).click();
		List<WebElement> mrn=driver.findElements(By.xpath("//div[@class='select__option css-yt9ioa-option']"));
		for(WebElement mrn_list:mrn)
		{
			String mrn_name=mrn_list.getText();
			System.out.println(mrn_name);
			if(mrn_name.equals("M-16"))
			{
				mrn_list.click();
				break;
			}
		}
		driver.findElement(By.name("quantity_to_add")).sendKeys("23");
		driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
		System.out.println("stock added sucessfully");
		driver.findElement(By.xpath("(//a[normalize-space()='Assign Stock'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[1]")).click();
		List<WebElement> drop_names=driver.findElements(By.xpath("//div[@class='select__option css-yt9ioa-option']"));
		for(WebElement n_list:drop_names)
		{
			String Assign_name=n_list.getText();
			System.out.println(Assign_name);
			if(Assign_name.equals("Automation testing"))
			{
				n_list.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[2]")).click();
		List<WebElement> job_orders=driver.findElements(By.xpath("//div[@class='select__option css-yt9ioa-option']"));
		for(WebElement orders_list:job_orders)
		{
			String order_name=orders_list.getText();
			if(order_name.equals("JO-13437"))
			{
				orders_list.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//input[@placeholder='Quantity to Add'])[1]")).sendKeys("10");
		driver.findElement(By.xpath("(//button[normalize-space()='Assign'])[1]")).click();
		System.out.println("Assign Stock successfully ");
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//a[normalize-space()='View Stock'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search by Item Name'])[1]")).sendKeys("phone");
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='ant-dropdown-trigger'][normalize-space()='More'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[1]")).click();
		List<WebElement> update_mrn=driver.findElements(By.xpath("//div[@class='select__option css-yt9ioa-option']"));
		for(WebElement all:update_mrn)
		{
			String id=all.getText();
			if(id.equals("M-18"))
			{
				all.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//input[@placeholder='Quantity to Add'])[1]")).sendKeys("25");
		driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
		System.out.println("Record updated successfully");
		
	}
}