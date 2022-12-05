package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_EclipsFolder {
	
	public static void screenshot(WebDriver driver ,String name) throws IOException
	{
		File scource =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Administrator\\Documents\\Prashant Eclips\\SwagLab\\ScreenShots\\TakesScreenshot\\"+name+".png");
		
		FileHandler.copy(scource, dest);
	}

}
