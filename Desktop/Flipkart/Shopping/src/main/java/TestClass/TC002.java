package TestClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObject.Iteampage;

public class TC002 extends Baseclass {
	
	@Test
	public void verifylink() throws IOException {
	Iteampage IP=new Iteampage(driver);
	List<WebElement> list= driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']//a"));
	{
	 int no =list.size();
	 for (int i=0;i<=no-1;i++)
	{
		Actions actions = new Actions(driver);
		 actions.keyDown(Keys.CONTROL) .click(list.get(i)).keyUp(Keys.CONTROL).build().perform();
		
		Set<String> win = driver.getWindowHandles();
		for (String s:win) {
		driver.switchTo().window(s);
		String link=driver.getCurrentUrl();
		
		URL ur=new URL(link);
	
	HttpURLConnection conn=(HttpURLConnection) ur.openConnection();
	conn.connect();
	if (conn.getResponseCode()>=400)
	{
		System.out.println("Link is broken");
	}else
	{
		System.out.println("Link is not broken");
	}
			
			
			
		}driver.close();
		
	} 
	}


	
	
	
	}
}
