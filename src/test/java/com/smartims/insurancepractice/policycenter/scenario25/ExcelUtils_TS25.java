package com.smartims.insurancepractice.policycenter.scenario25;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PolicyCenterTransactions.ConstantsClassPC;

public class ExcelUtils_TS25{
	public static String getCellValueByLabel(String label) throws IOException {

		String filePath = "\\\\PolicyCenter_TESTING\\\\Dataexcel\\\\PolicyCenterDataNew.xlsx";
		String sheetName = "TS_25";

		FileInputStream file = new FileInputStream(new File(filePath));
		Workbook workbook = WorkbookFactory.create(file);

		Sheet sheet = workbook.getSheet(sheetName);

		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getStringCellValue().equals(label)) {
					String value = row.getCell(cell.getColumnIndex() + 1).getStringCellValue();
					workbook.close();
					return value;
				}
			}
		}
		workbook.close();
		return null;
	}

	
}