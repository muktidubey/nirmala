package program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class excel {

	public static void main(String[] args) throws FileNotFoundException {
		String path="www.google.com";
		
	FileInputStream fs=new FileInputStream(path);
	XSSFWorkbook x=new XSSFWorkbook(fs);
    XSSFsheet sheet=x.getsheetAt(0);
    int Row=s.getrow(1);
    int col=s.getrow(1).getLastcol();
    Itrator rit=sheet.itrator();
    while(rit.hasNext())
    {
    	XSSFRow =rit.next();
    }
    Itrator cit= sheet.itrator();
    while(cit.hasnext())
    {
    	XSSFCol=cit.nect();
    }
    
	}
	
	///////////////////////////
	Property prop=new property();
	prop.load(path);
	propr.getProperty("name");
	///////////////////////////////
	
	TakeScreenshot ts=(TakeScreenshot) driver
			File source=ts.getscreenshotAs(OutputTYPE .FILE);
	        File dest=new File("path.png");
	        source.renameto dest;
	///////////////////////////////////
	        
	  driver.manage().timeouts().implicitlywait(Duraion.ofseconds(10));
	  
	  ////////////////////////////////////
	  WebDriver wait=new WebDriver(driver,20);
	  wait.until(expected condition.visibility of element(), element);
	  ////////////////////////////////////////////////////////
	  
	  List<WebElement>link=driver.findelemnts(By(tagname="a"));
	  for(WebElement li:link)
		 String hrefvalue=li.getatrribute("href");
	  if (hrefvalue==null&& hrefvalue.isEmpty())
	  {
		  System.out.println("null link");
	  continue;
	  }
	  URL url=new URL(hrefvalue);
	  url.openConnection();
	  HttpURLConnection conn= HttpURLconnection (url)
	  conn.connect();
	  if (conn.getResponseCode()>=400) {
		  System.out.println("link is  broken");
	  }else {
		  System.out.println("Link is not  broken");
	  }
	  
	  
	  javaScriptexecutor js=(javaScriptexecutor)driver;
	  js.executescrit("argument[0].setattribute('value','john')",element);
	        
	

}
