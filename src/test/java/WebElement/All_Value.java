package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class All_Value {
	public static void main(String[] args) {
		WebDriver driver =Browser.lunchUrl("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> allRow =driver.findElements(By.xpath("(//table//tbody)[2]//tr"));
		
		for(int i=1;i<=allRow.size();i++)
		{
			List<WebElement> alldata = driver.findElements(By.xpath("(//table//tbody)[2]//tr["+i+"]//td"));
			for(int j=0;j<alldata.size(); j++)
			{
				System.out.print(alldata.get(j).getText());
			}
			System.out.println();
		}
	}

}
