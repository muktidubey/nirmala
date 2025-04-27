
package TestClass;
import java.awt.Window;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.HomePage;

public class TC001homepage extends Baseclass {

	

	@Test	
	public void verifycart() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.clickonSearch();
		hp.Searchforitem();
		hp.Hitsearch();
		
		List<WebElement> item= driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		//for(WebElement I:item)
		//for(int i=0;i<=item.size();i++)
		
				if (item.size() >= 5)
				{
				    item.get(4).click();
				} else 
				{
				    System.out.println("The list doesn't contain 5 elements.");
				}
				
				Thread.sleep(100); 
				Set<String>win= driver.getWindowHandles();
				for(String w:win) {
					//driver.switch_to.new_window('tab');
				String title=driver.switchTo().window(w).getTitle();
				System.out.println(title);
				}
				
				
				
				//Actions act=new Actions(driver);
						//act.dragAndDropBy(button, 280,1000);
						
				WebElement button=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
						
				JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].scrollIntoView();",button);
				hp.Additem();
			}
	
	       
	
	 
		
}
		
		//hp.Selectitem();
		
		





