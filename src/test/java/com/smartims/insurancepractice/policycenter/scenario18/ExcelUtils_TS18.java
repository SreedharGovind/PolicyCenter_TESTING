package com.smartims.insurancepractice.policycenter.scenario18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils_TS18 {

	public static String getCellValueByLabel(String label) throws IOException {
		String filePath = "\\\\PolicyCenter_TESTING\\\\Dataexcel\\\\PolicyCenterDataNew.xlsx";
		String sheetName = "TS_18";
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
