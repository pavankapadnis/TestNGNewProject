package Com.DataProviderInTestNg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSeconfClass {
	
	@DataProvider
	public Iterator<String[]> getTestData() throws IOException {
		
		ArrayList<String[]> testData = DataProviderFirtsClass.getDataFromExcel();
		
		return testData.iterator();		
	}

	@Test(dataProvider="getTestData")
	public void readdata(String fname, String lname, String gender, String country) {
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(country);
		System.out.println();
	}
}
