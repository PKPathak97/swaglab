package pom;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.WaitClass;

public class Products extends WaitClass {
	
	@FindBy(id="react-burger-menu-btn") private WebElement OpenMenu;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropdown;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement shoppingcart;
	@FindBy(xpath="//span[text()='Products']") private WebElement product;
	@FindBy(xpath="//div[@class='pricebar']//button") private List<WebElement> addcart;
	
	public Products(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void menulink()
	{
		OpenMenu.click();
	}
	public void dropDown(String valueselect)
	{
		dropdown.click();
		Select sc = new Select(dropdown);
		sc.selectByVisibleText(valueselect);
		
	}
	public void carts()
	{
		takewait(By.xpath("//a[@class='shopping_cart_link']"));
		shoppingcart.click();
	}
	public String getProductText()
	{
		String text =product.getText();
		return text;
	}
	public List<WebElement> AddToCart()
	{
		
		
		takewait(By.xpath("//div[@class='pricebar']//button"))	;
			
		return addcart;
		
	}
	public WebElement getproductbyName(String name)
	{
		WebElement prod = addcart.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(name)).findFirst().orElse(null);
	return prod;
			
	}
	
	public void addProducttocart(String name)
	{
		WebElement prod = getproductbyName( name);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}

}
