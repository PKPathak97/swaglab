package WebElement;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import pojo.Browser;

public class Practice {
	
	public static void main(String[] args) {
		WebDriver driver =Browser.lunchUrl("https://vctcpune.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
//		Dimension d = new Dimension(200,800);
//		driver.manage().window().setSize(d);
//		
//		Point p = new Point(300,500);
//		driver.manage().window().setPosition(p);
		
//		driver .findElement(By.id("alertbtn")).click();
//		
//		Alert alt =driver.switchTo().alert();
//		
//		//alt.accept();
//		//alt.dismiss();
//		String h =alt.getText();
//		System.out.println(h);
//		
//		alt.accept();
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> st =driver.getWindowHandles();
		Iterator <String>it =st.iterator();
		
//		String  h =it.next();
//		String p =it.next();
//		
//		driver.switchTo().window(p);
//		
//		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		while(it.hasNext())
		{
			String b =it.next();
			driver.switchTo().window(b);
			String exp ="Practice Page";
			String act =driver.getTitle();
			if(exp.equalsIgnoreCase(act))
			{
				System.out.println(act);
				driver.findElement(By.xpath("//input[@value='Radio1']")).click();
			}
		}
		
		
	}

}
