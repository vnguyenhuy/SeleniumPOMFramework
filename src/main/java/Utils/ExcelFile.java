package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
	//Create a object of File class to open xlsx file
	File file =	new File(filePath+"\\"+fileName);
	//Create an object of FileInputStream class to read excel file
	FileInputStream inputStream = new FileInputStream(file);
	Workbook workbook = null;
	//Find the file extension by spliting file name in substing and getting only extension name
	String fileExtensionName = fileName.substring(fileName.indexOf("."));
	//Check condition if the file is xlsx file
	if(fileExtensionName.equals(".xlsx")){
	//If it is xlsx file then create object of XSSFWorkbook class
		workbook = new XSSFWorkbook(inputStream);
	}
	//Check condition if the file is xls file
	else if(fileExtensionName.equals(".xls")){
		//If it is xls file then create object of XSSFWorkbook class
		workbook = new HSSFWorkbook(inputStream);
	}
	//Read sheet inside the workbook by its name
	Sheet  guru99Sheet = workbook.getSheet(sheetName);
	 return guru99Sheet;	
	}
	
	public Object[][] readSheet(Sheet sheetName, int colCount, int rowCount) {
		Object[][] object = new Object[rowCount][colCount];
	   	for (int i = 0; i < rowCount; i++) {
	  		//Loop over all the rows
	  		Row row = sheetName.getRow(i+1);
	  		//Create a loop to print cell values in a row
	  		for (int j = 0; j < row.getLastCellNum(); j++) {
	  			//Print excel data in console
	  			if(row.getCell(j) == null) continue;
	  			object[i][j] = row.getCell(j).toString();
	  		}         
	  	}
	   	System.out.println("");
	   	  return object;		
	}
}
