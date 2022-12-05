package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 @Listeners(Utility.Listener.class) //(Dont give Semicolum)
public class SmapleTest {
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Test1 invoked");
	}
   
	@Test(dependsOnMethods ="Test3")
	public void test2()
	{
		System.out.println("Test2 Invoked");
	}
	
	@Test(timeOut = 1000)
	public void Test3() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test3 Invoked");
	}
}
