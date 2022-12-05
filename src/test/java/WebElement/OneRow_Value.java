package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class OneRow_Value {
	
	public static void main(String[] args) {
		WebDriver driver = Browser.lunchUrl("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> oneRow =driver.findElements(By.xpath("(//table//tbody)[2]//tr[1]//td"));
		
		for(int i =0; i<oneRow.size(); i++)
		{
		           String value =oneRow.get(i).getText();
		           System.out.print(value+" ");
		}
	}

}
