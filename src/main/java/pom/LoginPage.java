package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitClass;

public class LoginPage extends WaitClass{
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//input[@id='login-button']") private WebElement button;
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUsername(String user)
	{
		username.sendKeys(user);
	}
	public void EnterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void submit()
	{
		button.click();
	}

}
