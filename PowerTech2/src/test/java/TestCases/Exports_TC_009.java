package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
	
public class Exports_TC_009 extends Base_class {

	@Test
	public void New_Export_offer() throws InterruptedException
	{
		System.out.println("Admin test Start");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[normalize-space()='Admin Setting'])[1]")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='Employee'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='View Employees'])[1]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Add Employee'])[1]")).click();
		System.out.println("Add Employee test start");
		driver.findElement(By.xpath("(//input[@placeholder='Enter user name'])[1]")).sendKeys("Assert");
		driver.findElement(By.name("password")).sendKeys("Assert@123#");
		driver.findElement(By.name("employee_first_name")).sendKeys("Assert it");
		driver.findElement(By.name("employee_last_name")).sendKeys("Solutions");
		driver.findElement(By.name("employee_email")).sendKeys("Assertit@gmail.com");
		driver.findElement(By.name("employee_mobile")).sendKeys("9821026732");
		WebElement designation=driver.findElement(By.name("designation"));
		Select sel_des=new Select(designation);
		sel_des.selectByVisibleText("Admin");
		WebElement department=driver.findElement(By.name("department"));
		Select sel_dep=new Select(department);
		sel_dep.selectByVisibleText("Purchase");
		driver.findElement(By.name("address")).sendKeys("India: A-13/1, 1st Floor S.S.G.T Road Industrial Area, NH-24 Highway, 201010, Ghaziabad");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(600,0)");
		driver.findElement(By.xpath("(//i[@class='fa fa-chevron-left'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement show_per=driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select sel_per=new Select(show_per);
		sel_per.selectByVisibleText("75");
		Thread.sleep(1000);
		System.out.println("Update record start");
		driver.findElement(By.xpath("(//input[@placeholder='Search by Employee Name'])[1]")).sendKeys("Assert");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='fa fa-pencil text-primary'])[1]")).click();
		Thread.sleep(1000);
		WebElement first_name=driver.findElement(By.name("first_name"));
		first_name.clear();
		first_name.sendKeys("Assert");
		WebElement last_name=driver.findElement(By.name("last_name"));
		last_name.clear();
		last_name.sendKeys("It");
		Thread.sleep(1000);
		WebElement update_des=driver.findElement(By.xpath("(//select[@name='designation'])[1]"));
		Select des_sel=new Select(update_des);
		des_sel.selectByVisibleText("Purchase");
		Thread.sleep(1000);
		WebElement dep=driver.findElement(By.xpath("(//select[@name='department'])[1]"));
		Select dep_sel=new Select(dep);
		dep_sel.selectByVisibleText("Sales");
		Thread.sleep(1000);
		WebElement address=driver.findElement(By.xpath("(//textarea[@placeholder='Address'])[1]"));
		address.clear();
		address.sendKeys("NH-24 Highway, 201010, Ghaziabad");
		WebElement phone_no=driver.findElement(By.name("phone_number"));
		phone_no.clear();
		phone_no.sendKeys("6532456320");
		WebElement email_id=driver.findElement(By.name("email_address"));
		email_id.clear();
		email_id.sendKeys("assertit12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Update'])[1]")).click();
		System.out.println("Record updated successfully");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search by Employee Name'])[1]")).sendKeys("Assert");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//i[@class='fa fa-pencil text-primary'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-trash text-danger'])[1]")).click();
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ant-switch-handle'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[1]")).click();
		
		List<WebElement> employee=driver.findElements(By.xpath("//div[@class='ant-select-item ant-select-item-option']"));
		for(WebElement emp_list:employee)
		{
			String emp_name=emp_list.getText();
			System.out.println(emp_name);
			if(emp_name.equals("devanshu raturi admin"))
			{
				emp_list.click();
				break;
			}
		}*/
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]")).click();
		System.out.println("Record delete successfully");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Search by Employee Name'])[1]")).sendKeys("Assert It");
		System.out.println("Test case done ");
		
		
		
		
		
		
		
		
	}
}
