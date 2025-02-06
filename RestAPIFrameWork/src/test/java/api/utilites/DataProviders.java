package api.utilites;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="Data")
	public String[][] getAllData() throws Exception
	{
		String path =System.getProperty("user.dir")+"//Testdata//UserTestData.xlsx";
		ExcelUtlity utilty=new ExcelUtlity(path);
		
		int row =utilty.getRowCount("Sheet1");
		int column= utilty.getColumnCount("Sheet1", 1);
		
		String apidata[][]= new String[row][column];
		for(int i =1;i<=row;i++)
		{
			for(int j=0;j<column;j++)
			{
				apidata[i-1][j]=utilty.getCellData("Sheet1", i, j);
			}
		}
				
		
		return apidata;
	}
	
	@DataProvider(name="getUsername")
	public String[] getUserName() throws Exception
	{
		String path =System.getProperty("user.dir")+"//Testdata//UserTestData.xlsx";
		ExcelUtlity utility = new ExcelUtlity(path);
		int row =utility.getRowCount("Sheet1");
		String data[]= new String[row];
		for(int i=1; i<=row;i++)
		{
		 data[i-1]=utility.getCellData("Sheet1",i, 1);
		 System.out.println("Data is "+data[i-1]);
		}
		return data;
		
	}

}
