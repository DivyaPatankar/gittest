package com.newtours.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {
	
	public static ArrayList<String> getRowData(String string, int rowNumber) throws Exception{
		ArrayList<String> data = new ArrayList<>();
		
		File file = new File("C:\\Users\\Divya Pandagre\\Desktop\\LoginData.xls");
		FileInputStream input = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(input);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		HSSFRow row = sheet.getRow(rowNumber);
		int maxCells = row.getLastCellNum();
		for(int i = 0; i< maxCells; i++) {
			HSSFCell cell = row.getCell(i);
			data.add(cell.getStringCellValue());
		}
		return data;
	}

}
