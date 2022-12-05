package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {
	
       WebDriver driver;
	public WaitClass(WebDriver driver) {
		this.driver =driver;
	}

	public  void takewait(By findby)
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(40));
		w.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}

}
