package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class Max_CurrentPrice {
	
	public static void main(String[] args) {
		
		WebDriver driver = Browser.lunchUrl("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> maxValue=driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		double max =0;
		
		for(int i=0;i<maxValue.size(); i++)
		{
			String h = maxValue.get(i).getText();
			double val = Double.parseDouble(h);
			if(max < val)
			{
				max =val;
			}
		}
		System.out.println("Maximum current Price is => "+max);
	}
	

}
