package com.smartims.insurancepractice.policycenter.scenario12;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils_TS12{
	public static String getCellValueByLabel(String label) throws Exception {
		String filePath = "C:\\\\Users\\\\GovindaSreedhar.Kopp.SMARTIMS\\\\eclipse-workspace\\\\PolicyCenter\\\\Dataexcel\\\\PolicyCenterDataNew.xlsx";
		String sheetname = "TS_12";
		FileInputStream file = new FileInputStream(new File(filePath));
		Workbook workbook = WorkbookFactory.create(file);

		Sheet sheet = workbook.getSheet(sheetname);
		for (Row row : sheet) {

			for (Cell cell : row) {

				if (cell.getStringCellValue().equals(label)) {

					Cell valueCell = row.getCell(cell.getColumnIndex() + 1);

					String value = valueCell.getStringCellValue();

					return value;
				}

			}

		}
//		workbook.close();
		return null;

	}
}
