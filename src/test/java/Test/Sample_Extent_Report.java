package Test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utility.Reports;
@Listeners(Utility.Listener.class)
public class Sample_Extent_Report {
	ExtentReports reports; // declared globally so that you can excess in every method
	ExtentTest test;
	@BeforeTest
	public void reportConfiguration()
	{
		reports =Reports.createReports();
	}
	@Test
	public void test1()
	{
		 test = reports.createTest("test1");
		System.out.println("Test1 Going on");
	}
	@Test(timeOut=1000)
	public void test2() throws InterruptedException
	{
		test =reports.createTest("test2");
		Thread.sleep(2000);
		System.out.println("Test2 is going on");
	}
	@Test(dependsOnMethods="test2")
	public void test3()
	{
		test =reports.createTest("test3");
		System.out.println("test3 is going on");
	}
	@AfterMethod
	public void publishResult(ITestResult result)
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
	public void createReport()
	{
		reports.flush();
	}
	
	

}
