package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class Practice2 {
	
	public static void main(String[] args) {
		WebDriver driver =Browser.lunchUrl("https://demo.guru99.com/test/web-table-element.php");
		
	List<WebElement> headers =	driver.findElements(By.xpath("//table//thead//tr//th"));
	
	for(int i= 0; i<headers.size(); i++)
	{
		String h = headers.get(i).getText();
		System.out.print(h+"  ");
	}
	System.out.println();
	
	
	List<WebElement> maxprize = driver.findElements(By.xpath("(//table)[2]//tbody//td[4]"));
	List<WebElement> companyname = driver.findElements(By.xpath("(//table)[2]//tbody//td[1]"));
	
	String value=maxprize.get(0).getText();
	
	double min = Double.parseDouble(value);
	for(int i=0; i<maxprize.size(); i++)
	{
		String q = maxprize.get(i).getText();
		
		double f = Double.parseDouble(q);
		if(min>f)
		{
			min = f;
		}
		
	}
	 String smin = String.valueOf(min);
	for(int i=0; i<maxprize.size(); i++)
	{
		if(maxprize.get(i).getText().equalsIgnoreCase(smin))
	System.out.println("CompanyName ("+companyname.get(i).getText()+") & "+" min Curent prize is =. "+min);
	}
	}
}
