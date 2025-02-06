package api.utilites;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellFill;

public class ExcelUtlity {
	private static final int STRING = 1;
	private static final int NUMERIC = 0;
	private static final int BOOLEAN = 2;
	private static final int DATE = 3;
	public static FileInputStream fis;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	static String path;

	public ExcelUtlity(String path) throws Exception {
		
//		//File file= new File("C:\\Users\\Daniel.george\\eclipse-workspace\\SeleniumPractise\\Data\\file_example_XLS_10 (2).xlsx");
//		File file = new File(excelPath);
//		FileInputStream fis = new FileInputStream(file);
//		XSSFWorkbook book = new XSSFWorkbook(fis);
//		XSSFSheet sheet= book.getSheetAt(0);
//		
		this.path=path;
		
	}
	public Object ColunmData(String ColunName, int rowValue) throws IOException
	{
		int colunmNum=0;
		String data= null;
		System.out.println("column number is"+colunmNum );
		System.out.println("row number is"+rowValue );
		File file= new File("C:\\Users\\Daniel.george\\eclipse-workspace\\SeleniumPractise\\Data\\file_example_XLS_10 (2).xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet= book.getSheetAt(0);
	 STRING:   data =sheet.getRow(rowValue).getCell(colunmNum).getStringCellValue();
	
		return data;
			
	}
	public static int getRowCount(String sheetName) throws IOException {
         fis = new FileInputStream(path);
             book = new XSSFWorkbook(fis);

             sheet = book.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");
            }

            return sheet.getLastRowNum();
        
    }
	public static int getColumnCount(String sheetName, int rowNumber) throws IOException {
	   fis = new FileInputStream(path);
	        book = new XSSFWorkbook(fis);

	      sheet = book.getSheet(sheetName);
	        if (sheet == null) {
	            throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");
	        }

	        row = sheet.getRow(rowNumber);
	        if (row == null) {
	            return 0; // Return 0 if the row does not exist
	        }

	        return row.getLastCellNum();
	    }
	public static String getCellData(String sheetName, int rowIndex, int columnIndex) throws IOException {
       fis = new FileInputStream(path);
           book = new XSSFWorkbook(fis);

        sheet = book.getSheet(sheetName);
            
             row = sheet.getRow(rowIndex);
            cell = row.getCell(columnIndex);
            

            // Use DataFormatter to get the formatted value of the cell
            DataFormatter dataFormatter = new DataFormatter();
            return dataFormatter.formatCellValue(cell);
        }
    
	}
	

