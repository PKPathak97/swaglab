package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class CurrentPrice {

	public static void main(String[] args) {
		WebDriver driver = Browser.lunchUrl("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement curentprice =driver.findElement(By.xpath("(//table//tbody)[2]//tr[1]//td[4]"));
		System.out.println(curentprice.getText());
	}
}
