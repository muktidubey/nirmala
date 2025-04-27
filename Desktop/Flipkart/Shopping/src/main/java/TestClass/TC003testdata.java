package TestClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObject.Loginpage;

public class TC003testdata extends Baseclass {
	
	@Test
	public void verifytestdata() throws IOException {
		Loginpage LP=new Loginpage(driver);
		LP.logged();
		String path="C:\\Users\\Deepika\\Desktop\\Flipkart\\Shopping\\TestData\\Book1.xlsx";
		FileInputStream FI=new FileInputStream(path);
		XSSFWorkbook  w=new XSSFWorkbook (FI);
		XSSFSheet s=w.getSheetAt(0);
		int TotalRow= s.getLastRowNum();
		int Totalcol=s.getRow(1).getLastCellNum();
		
		XSSFRow row = s.getRow(2);
		 XSSFCell cell = row.getCell(2);
		// int cellValue = (int)cell.getNumericCellValue();
		long cellValue=(long) cell.getNumericCellValue();
		// str2 =StringcellValue.getStringCellValue();
		
		 String str= String.valueOf(cellValue);
	
		
		System.out.println(str);
	
		LP.mobileno(str);
		LP.OTPReq();
		//System.out.println(TotalRow +" and " +Totalcol);
		
		//for(int r=1;r<=TotalRow;r++) {
			//XSSFRow currentrow= s.getRow(r);
			
		//for(int c=0;c<Totalcol;c++) {
				
				//XSSFCell cell=currentrow.getCell(c);
				//System.out.println(cell.toString()); 
			//}

	    // }
	}
}
