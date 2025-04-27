package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage {
 
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@name='q']")
WebElement search;

@FindBy (xpath="//div[@class='_75nlfW']//div[contains(text(), 'Nothing Phone')]")
WebElement Item;

@FindBy (xpath="//button[@class='_2iLD__']")
WebElement searchbutton;

@FindBy (xpath="//div[@class='_75nlfW']")
WebElement List;

@FindBy (xpath="//button[@class='QqFHMw vslbG+ In9uk2']")
WebElement AddtoCart;

public void clickonSearch()
{
	search.click();
}
public void Searchforitem()
{
	search.sendKeys("mobile");
}
public void Hitsearch()
{
	searchbutton.click();
}

public void Selectitem()
{
	Item.click();
}
public void Additem()
{
	AddtoCart.click();
}

}
