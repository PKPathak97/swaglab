package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utility.BaseClass;
import Utility.Parameterization;
import Utility.Reports;
import pojo.Browser;
import pom.LoginPage;
import pom.Products;
@Listeners(Utility.Fail_Listener.class)
public class AddProductTC extends BaseClass {
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void creatReport()
	{
		report =Reports.createReports();
	}
	@BeforeMethod
	public void setUp()
	{
		 driver=Browser.lunchUrl("https://www.saucedemo.com/");
	}
	
	@Test
	public void AddAllProduct() throws EncryptedDocumentException, IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		test =report.createTest("AddAllProduct");
		LoginPage login = new LoginPage (driver);
		String user =Parameterization.getExceldata("SwagLab", 0, 0);
		String pass =Parameterization.getExceldata("SwagLab", 1, 0);
		login.EnterUsername(user);
		login.EnterPassword(pass);
		login.submit();
		
		Products selectprod = new Products(driver);
		List<WebElement>  pdts =selectprod.AddToCart();
		selectprod.addProducttocart("name");
		
		String t =selectprod.getProductText();
		String exp ="PRODUCTS";
		Assert.assertEquals(t, exp);
		
		selectprod.AddToCart();
		
		
		selectprod.dropDown("Price (low to high)");
		
	}
	
	@AfterMethod
	public void configreport(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	@AfterTest
	public void tearDown()
	{
		report.flush();
	}

}
