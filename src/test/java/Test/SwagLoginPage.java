package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Parameterization;
import Utility.ScreenShot;
import pojo.Browser;
import pom.LoginPage;

public class SwagLoginPage {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver = Browser.lunchUrl("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	
	@Test
	public void loginwithvalidcredential() throws EncryptedDocumentException, IOException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		LoginPage log = new LoginPage(driver);
		String user =Parameterization.getExceldata("SwagLab", 0, 0);
		String pass1 =Parameterization.getExceldata("SwagLab", 1, 0);
		log.EnterUsername(user);
		log.EnterPassword(pass1);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='login-button']"))));
		log.submit();
		String exp ="Swag Labs";
		String Actual =driver.getTitle();
		Assert.assertEquals(Actual, exp);
	}
	
	@AfterMethod
	public void tearDown() throws IOException
	{
		ScreenShot.screenshot(driver, "swag");
		driver.quit();
		
	}

}
