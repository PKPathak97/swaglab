package Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	public void onTestStart(ITestResult rusult)//invoke when test case in testNG start
	{
		System.out.println("Test Start");
	}
	
	public void onTestSuccess(ITestResult result)// invoke when the test success
	{
		System.out.println("Test Success");
	}
   public void onTestFailure(ITestResult result)//invoked after test get fail in TestNG
   {
	   System.out.println("Test Failure"+result.getName());
   }
   public void onTestSkipped(ITestResult result )//invoked after Test get Skipped
   {
	   System.out.println("Test Skipped");
   }
   
   
   
   
}
