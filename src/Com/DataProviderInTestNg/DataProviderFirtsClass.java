package Com.DataProviderInTestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFirtsClass {
	
	@BeforeSuite
	public static ArrayList<String[]> getDataFromExcel() throws IOException {
		
		ArrayList<String[]> mydata = new ArrayList<String[]>();
		
		FileInputStream file = new FileInputStream("F:\\ExampleExcel.xls");
		
		HSSFWorkbook wbook = new HSSFWorkbook(file);
		
		HSSFSheet sheet = wbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		int cell = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowcount+" "+cell);
		
		for (int i = 1; i<=rowcount; i++) {
			
				HSSFRow row = sheet.getRow(i);
				
				String fname = row.getCell(1).getStringCellValue();
				String lname = row.getCell(2).getStringCellValue();
				String gender = row.getCell(3).getStringCellValue();
				String country = row.getCell(4).getStringCellValue();
			
				String[] ob = {fname,lname,gender,country};
				
				mydata.add(ob);
			
		}
		
		//System.out.println(mydata);
		
		return mydata;
	}
	
}
