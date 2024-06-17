package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Production_TC006 extends Base_class {

	@Test
	public void job_orders_TC005() throws InterruptedException
	{
		System.out.println("Test case Start");
		driver.findElement(By.xpath("//span[normalize-space()='Production']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='View Job Orders'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[normalize-space()='Add Job Order'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='select__input-container css-ackcql']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='DS Enterprises']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[2]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='adding for testing purpose']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'css-1d8n9bt')])[3]")).click();
		Thread.sleep(1000);
		List<WebElement> case_owner=driver.findElements(By.xpath("//div[contains(@id,'react-select-3-option')]"));
		
		for(WebElement owner_list:case_owner)
		{
			String name=owner_list.getText();
			System.out.println(name);
			if(name.equals("Prashant Agarwal"))
			{
				owner_list.click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter PO number']")).sendKeys("15112");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter the order subject']")).sendKeys("Adding for testing purpose");
		driver.findElement(By.xpath("(//textarea)[2]")).sendKeys("Software Design ");
		Thread.sleep(1000);
		WebElement units=driver.findElement(By.xpath("(//select[contains(@name,'units')])[1]"));
		Select sel=new Select(units);
		sel.selectByVisibleText("Sq.Ft.");
		Thread.sleep(1000);
		WebElement quan=driver.findElement(By.xpath("//div[3]//div[3]//input[1]"));
		quan.clear();
		Thread.sleep(1000);
		quan.sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[11]")).sendKeys("Assert it ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='date'])[1]")).sendKeys("05/26/2024");
		driver.findElement( By.xpath("(//textarea)[3]")).sendKeys("Web App Design ");
		Thread.sleep(1000);
		WebElement units2=driver.findElement(By.xpath("(//select[contains(@name,'units')])[2]"));
		Select sel_unit=new Select(units2);
		sel_unit.selectByVisibleText("Kgs.");
		WebElement quan2=driver.findElement(By.xpath("//div[4]//div[3]//input[1]"));
		quan2.clear();
		quan2.sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[4]//div[4]//input[1]")).sendKeys("IPEM College");
		driver.findElement(By.xpath("(//input[contains(@type,'date')])[2]")).sendKeys("07/10/2024");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//textarea)[4]")).sendKeys("Digital Marketing");
		Thread.sleep(1000);
		WebElement unit3=driver.findElement(By.xpath("(//select[contains(@name,'units')])[3]"));
		Select sel_unit3=new Select(unit3);
		sel_unit3.selectByVisibleText("MTR");
		Thread.sleep(1000);
		WebElement quan3=driver.findElement(By.xpath("//div[5]//div[3]//input[1]"));
		quan3.clear();
		quan3.sendKeys("7");
		driver.findElement(By.xpath("//div[5]//div[4]//input[1]")).sendKeys("Testing");
		driver.findElement(By.xpath("(//input[contains(@type,'date')])[3]")).sendKeys("10/05/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(600,0)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='bck-btn btn btn-outline-primary mt-1'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Search by Name or job no'])[1]")).sendKeys("15115");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='More'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='Delete JO'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='form-control mx-auto mt-3 mb-3'])[1]")).sendKeys("delete");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
	}
}
