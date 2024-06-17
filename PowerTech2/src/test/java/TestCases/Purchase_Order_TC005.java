package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Purchase_Order_TC005 extends Base_class {


	@Test
	public void purchase_order() throws InterruptedException
	{

		System.out.println("Test case start");
		driver.findElement(By.xpath("//span[normalize-space()='Purchase']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='Purchase Order'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()=\"View PO's\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()=\"Add PO's\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[1]")).click();
		List<WebElement> vendor_name=driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		for(WebElement name:vendor_name)
		{
			String name_list=name.getText();
			System.out.println(name_list);
			if(name_list.equals("National Casting Industries"))
			{
				name.click();
				break;
			}
		}
		Thread.sleep(1000);
		WebElement ship=driver.findElement(By.xpath("(//textarea[@placeholder='Please type ship to'])[1]"));
		ship.clear();
		ship.sendKeys("Assert it solution GHZ");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[contains(text(),'Toggle this switch to enter job number instead of ')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Please enter purpose']")).sendKeys("Adding for testing purpose");
		/*driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[2]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@id='react-select-5-option-16']")).click();
		List<WebElement> job_order=driver.findElements(By.xpath("//div[contains(@id,'react-select-6-option')]"));
		for(WebElement job_list:job_order)
		{
			String job_item=job_list.getText();
			System.out.println(job_item);
			if(job_item.equals("15114"))
			{
				job_list.click();
				break;
			}
		}*/

		driver.findElement(By.xpath("//input[@placeholder='Please type PO Subject']")).sendKeys("Automation Testing ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='select__indicator select__dropdown-indicator css-tlfecz-indicatorContainer'])[2]")).click();
		Thread.sleep(2000);
		List<WebElement> item_dep=driver.findElements(By.xpath("//div[contains(@id,'react-select-3-option')]"));
		for(WebElement items:item_dep)
		{
			String item_name=items.getText();
			System.out.println(item_name);

			if(item_name.equals("ashish"))
			{ 
				items.click();
				break;
			}
		}
		Thread.sleep(1000);
		WebElement unitsItme=driver.findElement(By.xpath("//select[@name='units']"));
		Select sel=new Select(unitsItme);
		sel.selectByVisibleText("Kgs.");
		WebElement quantity=driver.findElement(By.xpath("(//input[@value='1'])[1]"));
		quantity.clear();
		quantity.sendKeys("63.0235975555");
		Thread.sleep(1000);
		WebElement rate=driver.findElement(By.xpath("(//input[@value='0'])[1]"));
		rate.clear();
		rate.sendKeys("5692");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input)[22]")).sendKeys("326541");
		Thread.sleep(2000);
		WebElement discount=driver.findElement(By.xpath("(//input[contains(@class,'input  border-0 col-md-12 bg-input')])[3]"));
		discount.clear();
		Thread.sleep(1000);
		discount.sendKeys("5");
		Thread.sleep(2000);
		WebElement tax=driver.findElement(By.xpath("(//input[contains(@class,'input  border-0 col-md-12 bg-input')])[4]"));
		tax.clear();
		tax.sendKeys("18");
		Thread.sleep(2000);
		WebElement rup=driver.findElement(By.xpath("(//select[contains(@name,'currency')])[1]"));
		Select sel_cur=new Select(rup);
		sel_cur.selectByVisibleText("US Dollar (USD)");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(800,0)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-chevron-left']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println("Search record and delete record test");
		driver.findElement(By.xpath("//input[@placeholder='Search by name or po number']")).sendKeys("2107");
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Options'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='Delete PO'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control mx-auto mt-3 mb-3'])[1]")).sendKeys("delete");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("per page,filters and export test case");
		WebElement per_page=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sel_page=new Select(per_page);
		sel_page.selectByVisibleText("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='4'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@id='dropdownMenuButton'])[1]")).click();
		Thread.sleep(1000);
		List<WebElement> filter=driver.findElements(By.xpath("//input[@class='form-check-input']"));
		System.out.println(filter.size());
		Thread.sleep(2000);
		for(int i=0;i<filter.size();i++)
		{
			if(i==1 || i==3 || i==5)
			{
				filter.get(i).click();
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@id='dropdownMenuButton'])[1]")).click();
		System.out.println("Filter apply successfully ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Export'])[1]")).click();
		System.out.println("Test case execute seccessfully");



























	}
}
