package Utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Fail_Listener extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Login Started ");
	}
	
	public void onTestFailure(ITestResult result)
	{
		try {
			ScreenShot_EclipsFolder.screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test has Skipped");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Login Test Case Is SuccessFull");
	}
	
	

}
