package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class Min_currentprize {
	public static void main(String[] args) {
		WebDriver driver =Browser.lunchUrl("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> minprize = driver.findElements(By.xpath("(//table)[2]//tbody//td[4]"));
		List<WebElement> companyName= driver.findElements(By.xpath("(//table)[2]//tbody//td[1]"));
		
		String value = minprize.get(0).getText();
		double min = Double.parseDouble(value);
		
		for(int i =0; i<minprize.size(); i++)
		{
			String a = minprize.get(i).getText();
			double f = Double.parseDouble(a);
			if(min>f)
			{
				min=f;
			}
		}
		
		String minvalue = String.valueOf(min); // converted the Double in String
		
		for(int i =0; i<minprize.size(); i++)
		{
			if(minprize.get(i).getText().equals(minvalue))
			{
			System.out.println("Company name ( "+companyName.get(i).getText()+" ) "+" min Current prize => "+minvalue);
			}
			}
		
	}

}
