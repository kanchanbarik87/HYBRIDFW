package com.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	
	public String readDataFromExcel(String sheetName,int rowNum,int cellNum) throws IOException {
		
		FileInputStream fise= new FileInputStream(IConstantUtility.excelFilepath);
		Workbook wb=WorkbookFactory.create(fise);
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	

}
