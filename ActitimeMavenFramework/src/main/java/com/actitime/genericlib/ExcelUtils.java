package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public String getDataFromExcel(String sheetname , int rownum , int cellnum) throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/DataStorage/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		Row row = sh.getRow(rownum);
		Cell cel = row.getCell(cellnum);
		return cel.getStringCellValue();
	}
}
