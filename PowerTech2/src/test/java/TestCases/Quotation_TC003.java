package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Quotation_TC003 extends Base_class{

	@Test
	public void Quotation_test() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//span[normalize-space()='Sales']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Quotation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='View Quotations']")).click();
		Thread.sleep(1000);
		System.out.println("Add Quotaion form filling test start");
		driver.findElement(By.xpath("//button[normalize-space()='Add Quotation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='select Client Name__input-container css-ackcql'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='react-select-2-option-7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id='react-select-3-option-0'])[1]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter item name/description']")).sendKeys(" for testing purpose");
		Thread.sleep(1000);
		WebElement unit=driver.findElement(By.xpath("//select[@name='units']"));
		Select unit_sel=new Select(unit);
		unit_sel.selectByVisibleText("Kgs.");
		WebElement qan=driver.findElement(By.xpath("//input[@placeholder='enter quantity']"));
		qan.clear();
		qan.sendKeys("5.3652987402");
		driver.findElement(By.xpath("//input[@placeholder='Ent. rate']")).sendKeys("155");
		driver.findElement(By.xpath("//input[@placeholder='Ent. discount']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@placeholder='Ent. tax']")).sendKeys("18");
		Thread.sleep(2000);
		WebElement cur=driver.findElement(By.xpath("//select[@name='currency']"));
		Select cur_sel=new Select(cur);
		cur_sel.selectByVisibleText("Euro (EUR)");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		System.out.println("Form filled successfully ");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(800,0)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='bck-btn btn btn-outline-primary mt-1'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		System.out.println("Record search ");
		driver.findElement(By.xpath("//input[@placeholder='Search by Client name']")).sendKeys("Dakshiya Enterprises");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Dakshiya Enterprises']")).click();
		Thread.sleep(2000);
		System.out.println("Make Revision start");
		driver.findElement(By.xpath("//button[normalize-space()='Make Revision']")).click();
		Thread.sleep(2000);
		WebElement dis=driver.findElement(By.xpath("//textarea[@placeholder='Enter item name/description']"));
		dis.clear();
		dis.sendKeys("Updating for testing purpose");
		Thread.sleep(2000);
		WebElement units=driver.findElement(By.xpath("//select[@name='units']"));
		Select sel_unit=new Select(units);
		sel_unit.selectByVisibleText("Sq.Ft.");
		Thread.sleep(2000);
		WebElement quantity=driver.findElement(By.xpath("//input[@placeholder='enter quantity']"));
		quantity.clear();
		quantity.sendKeys("10");
		Thread.sleep(2000);
		WebElement rate=driver.findElement(By.xpath("//input[@placeholder='Ent. rate']"));
		rate.clear();
		rate.sendKeys("5000");
		Thread.sleep(2000);
		WebElement discount=driver.findElement(By.xpath("//input[@placeholder='Ent. discount']"));
		discount.clear();
		discount.sendKeys("5");
		Thread.sleep(1000);
		WebElement tax=driver.findElement(By.xpath("//input[@placeholder='Ent. tax']"));
		tax.clear();
		tax.sendKeys("10");
		Thread.sleep(2000);
		WebElement curreny=driver.findElement(By.xpath("//select[@name='currency']"));
		Select sel_cur=new Select(curreny);
		sel_cur.selectByVisibleText("Indian rupee");
		Thread.sleep(3000);
		System.out.println("form filled updated successfully");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Create Revision']")).click();
		
		
	}
}
