package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;
import Utility.WaitClass;
import pojo.Browser;

@Listeners(Utility.Fail_Listener.class)
public class LetsShop_Screenshot extends BaseClass  {
	
	@BeforeMethod
	public void SetUp()
	{
		driver = Browser.lunchUrl("https://rahulshettyacademy.com/client");
	}
	
	@Test
	public void Login()
	{
		WaitClass wt =new WaitClass(driver);
		driver.findElement(By.id("userEmail")).sendKeys("prashant.pathak@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Prashant@97");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String exp = driver.findElement(By.xpath("//p[text()='Automation Practice']")).getText();
		String act = "Automation";
		
		Assert.assertNotEquals(act, exp);
		driver.findElement(By.xpath("(//div[@class='card-body']//button[@style='float: right;'])[3]")).click();
		wt.takewait(By.xpath("//button[@style='margin-top: -10px;'])[2]"));
		driver.findElement(By.xpath("(//button[@style='margin-top: -10px;'])[2]")).click();;
		
		//w.until(ExpectedConditions.visibilityOf(d));
		
		
//		String act1 = driver.findElement(By.xpath("//h3[text()='iphone 13 pro']")).getText();
//		String exp1 = "IPHONE 13 PRO";
//		Assert.assertEquals(act1, exp1);
//		
//		driver.findElement(By.xpath("(//button[@style='margin-top: -20px;'])[1]")).click();
	}

	
	
	
}
