package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelPath, String sheetName) {
		
		try {
			// projectPath = System.getProperty("user.dir");
			System.out.println(excelPath);
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
		} catch(Exception e) {
			e.printStackTrace();		
		}
		
	}
	
	
//	public static void main(String[] args) {
//		
//		getCellDataString(1,1);
//		getCellDataString(2,2);
//		
//	}
	
	
	public static int getRowCount() {
		
		int rowCount = 0;
		
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: " + rowCount);
			
		} catch(Exception exp) {
			
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();

		}
		
		return rowCount;
	}
	
	
	public static int getColumnCount() {
		
		int colCount = 0;
		
		try {

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of columns: " + colCount);
			
		} catch(Exception exp) {
			
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
			
		}
		
		return colCount;
	}
		
		
	public static String getCellDataString(int rowNum, int colNum) {
		
		String cellData=null;
		
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
						
		} catch(Exception exp) {
			
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
			
		}
		return cellData;
	}
	
	
	public static void getNumericCellData(int rowNum, int colNum) {
		
		try {

			sheet = workbook.getSheet("Sheet1");
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
						
		} catch(Exception exp) {
			
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
			
		}
	}
	
}
