package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports createReports()
	{
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter sparkreport = new ExtentSparkReporter("extentReport.html");
		report.attachReporter(sparkreport);
		report.setSystemInfo("Created by ", "Prashant");
		report.setSystemInfo("testSuite", "Regression");
		return report;
		
	}

}
