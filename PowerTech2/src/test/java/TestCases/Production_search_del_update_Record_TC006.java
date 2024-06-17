package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Production_search_del_update_Record_TC006 extends Base_class {

	@Test
	public void production_record() throws InterruptedException
	{
		System.out.println("Test case Start");
		driver.findElement(By.xpath("//span[normalize-space()='Production']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='View Job Orders'])[1]")).click();
		/*Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@placeholder='Search by Name or job no'])[1]")).sendKeys("15083");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='More'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='Delete JO'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='form-control mx-auto mt-3 mb-3'])[1]")).sendKeys("delete");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]")).click();*/
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Search by Name or job no'])[1]")).sendKeys("14831");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='Omega Finvest LLP'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='File Actions'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Upload Files'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='imgCollection'])[1]")).sendKeys("C:\\Users\\Asus\\Downloads\\report.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Upload'])[1]")).click();
		/*Thread.sleep(1000);
		driver.navigate().refresh();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//tbody/tr[1]/td[7]/button[1]/i[1]")).click();
		 Thread.sleep(1000);
		 WebElement des=driver.findElement(By.xpath("(//textarea[contains(@placeholder,'Enter item name/description')])[1]"));
		 des.clear();
		 des.sendKeys("For testing _35 KV coper wire ");
		 Thread.sleep(2000);
		 WebElement quan=driver.findElement(By.xpath("(//input[@value='1'])[1]"));
		 quan.clear();
		 quan.sendKeys("130");
		 Thread.sleep(2000);
		 WebElement edit_unit=driver.findElement(By.xpath("(//select[@name='units'])[1]"));
		 Select sel_edit=new Select(edit_unit);
		 sel_edit.selectByVisibleText("Ft.");
		 Thread.sleep(2000);
		 WebElement pro=driver.findElement(By.xpath("(//input[@value='Power Tech'])[1]"));
		 pro.clear();
		 pro.sendKeys("Nooida");
		 WebElement date=driver.findElement(By.xpath("(//input[@value='2023-07-25'])[1]"));
		 date.clear();
		 date.sendKeys("07/29/2024");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//i[@class='fa fa-check text-primary'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-sm float-right'])[1]")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@id='dropdownMenuButton'])[1]")).click();
		 Thread.sleep(1000);
		 List<WebElement> check_filter=driver.findElements(By.xpath("(//input[@type='checkbox'])"));
		 System.out.println(check_filter.size());
		 Thread.sleep(2000);
			for(int i=0;i<check_filter.size();i++)
			{
				if(i==1 || i==3 || i==5)
				{
					check_filter.get(i).click();
				}
			}
		 
		 
		Thread.sleep(2000);
		WebElement case_owner=driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select sel_owner=new Select(case_owner);
		sel_owner.selectByVisibleText("Rohan Agarwal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@id='dropdownMenuButton'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement( By.xpath("(//button[normalize-space()='Export'])[1]")).click();
		Thread.sleep(1000);
		List<WebElement> export_list=driver.findElements(By.xpath("//label[@class='ant-checkbox-wrapper ant-checkbox-group-item']"));
		for(WebElement export_check:export_list)
		{
			String checkbox_value= export_check.getText();
			System.out.println(checkbox_value);
			if(checkbox_value.equals("Products") ||checkbox_value.equals("Category") || checkbox_value.equals("Order Subject") )
			{
				export_check.click();
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Download Report'])[1]")).click();*/
		
	}
}
