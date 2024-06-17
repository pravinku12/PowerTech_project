package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lead_Details_TC002 extends Base_class {

	@Test
	public void lead_TestCase() throws InterruptedException
	{

		driver.findElement(By.xpath("//span[normalize-space()='Sales']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Lead Details']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='View Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search by name or id']")).sendKeys("15013");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Options']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Update Remarks']")).click();
		Thread.sleep(1000);
		WebElement update_remark=driver.findElement(By.xpath("//input[@placeholder='enter the remark']"));
		update_remark.clear();
		update_remark.sendKeys("Updating remark for testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Update'])[2]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='leadfilter']")).click();
		Thread.sleep(1000);
		List<WebElement>lead_filter=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<=lead_filter.size();i++)
		{
			if(i==1 || i==3 || i==5)
			{
				lead_filter.get(i).click();
			}
		}
		
		Thread.sleep(1000);
		WebElement per_page=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select_number=new Select(per_page);
		select_number.selectByVisibleText("100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Export']")).click();
		
		//Add new lead flow
		
		System.out.println("--------Add lead form filling and adding--------");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Lead']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[1]")).click();
		
		List<WebElement> dropDown=driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		
		for(WebElement values:dropDown)
		{
			System.out.println(values.getText());
			String dropList=values.getText();
			
			if(dropList.equals("DS Enterprises"))
			{
				values.click();
				break;
			}
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[2]")).click();
		Thread.sleep(3000);
		List<WebElement> Namelist=driver.findElements(By.xpath("//div[contains(@id,'react-select-3-option')]"));
		
		for(WebElement name:Namelist)
		{
			System.out.println(name.getText());
			String NList=name.getText();
			
			if(NList.equals("Lokesh"))
			{
				name.click();
				break;
			}
			
		}
		Thread.sleep(1000);
		WebElement projectType=driver.findElement(By.xpath("//select[@name='project_type']"));
		Select sel_project=new Select(projectType);
		sel_project.selectByVisibleText("Procurement");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your item subject']")).sendKeys("adding for testing purpose");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your project details']")).sendKeys("Assert it solutions");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
	}
}
