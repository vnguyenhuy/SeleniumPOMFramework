package dataProviders;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.*;

import Utils.ExcelFile;
import common.GlobalConstant;

public class InputFormsDataProvider {
	/*public static final String LOCAL_PATH = System.getProperty("user.dir");
	public static By inputForms = By.xpath("//*[text()='Input Forms']");
	
	public static void clickInputForms(WebDriver webDriver) {
		webDriver.findElement(inputForms).click();
	}*/	
	
	@DataProvider(name="inputForms")
	public Object[][] getDataFromDataprovider(Method method) throws IOException{
  	Object[][] object = null; 
  	ExcelFile file = new ExcelFile();
  	Sheet testCaseSheet;
  	int colCount = 0;
       //Read keyword sheet
  	switch (method.getName()) {
  	case "testSingleForm":
  		testCaseSheet = file.readExcel(GlobalConstant.RESOURCE +"\\","TestCase.xlsx" , "TC1");
  		colCount = 3;
  		break;
  	case "testCheckBox":
  		testCaseSheet = file.readExcel(GlobalConstant.RESOURCE +"\\","TestCase.xlsx" , "TC2");
  		colCount = 2;
  		break;
  	case "testRadioButtons":
  		testCaseSheet = file.readExcel(GlobalConstant.RESOURCE +"\\","TestCase.xlsx" , "TC3");
  		break;
  	case "testSelectDropdownListDemo":
  		testCaseSheet = file.readExcel(GlobalConstant.RESOURCE +"\\","TestCase.xlsx" , "TC4");
  		colCount = 2;
  		break;
  	case "testInputFormSubmitDemo":
  		testCaseSheet = file.readExcel(GlobalConstant.RESOURCE +"\\","TestCase.xlsx" , "TC5");
  		colCount = 10;
  		break;
  	default:
  		return object;
  	}
       
     //Find number of rows in excel file
   	int rowCount = testCaseSheet.getLastRowNum()-testCaseSheet.getFirstRowNum();
   	return file.readSheet(testCaseSheet, colCount, rowCount);   	
	}
}
