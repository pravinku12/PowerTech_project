package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Store_TC007 extends Base_class {

	@Test
	public void Store_Test_Case() throws InterruptedException
	{
		System.out.println("Test Case strat for store");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[normalize-space()='Store'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='MRN'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='View MRN'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Add MRN'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> purchase_order=driver.findElements(By.xpath("//div[@class='select__option css-yt9ioa-option']"));
		for(WebElement order_list:purchase_order)
		{
			String list_name=order_list.getText();
			System.out.println(list_name);
			if(list_name.equals("PO- 2106 - JANS OVERSEA"))
			{
				order_list.click();
				break;			
			}
		}
		Thread.sleep(2000);
		WebElement quan=driver.findElement(By.cssSelector("//tbody/tr/td[5]/input[1]"));
		//Thread.sleep(2000);
		//quan.click();
		//Thread.sleep(3000);
		quan.sendKeys("10");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Assert it");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("Devenshu");
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("10/23/2024");
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("Ghazaibad");
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("7");
	}
}
