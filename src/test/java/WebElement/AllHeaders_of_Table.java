package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class AllHeaders_of_Table {
	
	public static void main (String[] args)
	{
		WebDriver driver =Browser.lunchUrl("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> headers=driver.findElements(By.xpath("//table//thead"));
		int s = headers.size();
		
		for(int i=0; i<s;i++)
		{
			WebElement t = headers.get(i);
			System.out.println(t.getText());
		}
	}

}
