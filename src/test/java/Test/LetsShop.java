package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;
import pojo.Browser;

@Listeners(Utility.Listener.class)
public class LetsShop  {
	WebDriver driver;
	@BeforeMethod
	public void SetUp()
	{
		driver = Browser.lunchUrl("https://rahulshettyacademy.com/client");
	}
	
	@Test
	public void Login()
	{
		driver.findElement(By.id("userEmail")).sendKeys("prashant.pathak@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Prashant@97");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String exp = driver.findElement(By.xpath("//p[text()='Automation Practice']")).getText();
		String act = "Automation";
		
		Assert.assertNotEquals(act, exp);
		driver.findElement(By.xpath("(//div[@class='card-body']//button[@style='float: right;'])[3]")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(40));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='My Cart']")));
		
		Assert.assertEquals(true, driver.findElement(By.xpath("//h3[text()='iphone 13 pro']")));
	}

	
	
	
}
