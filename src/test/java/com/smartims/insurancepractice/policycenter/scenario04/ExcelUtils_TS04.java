package com.smartims.insurancepractice.policycenter.scenario04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils_TS04 {
	public static String getCellValueByLabel(String label) throws IOException {

		String filePath = "\\\\PolicyCenter_TESTING\\\\Dataexcel\\\\PolicyCenterDataNew.xlsx";
		String sheetName = "TS_04";
		FileInputStream file = new FileInputStream(new File(filePath));
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);

		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getStringCellValue().equals(label)) {
					Cell valueCell = row.getCell(cell.getColumnIndex() + 1);
					String value = valueCell.getStringCellValue();
					System.out.println("insideforloop");
					return value;
				}
			}
		}
		workbook.close();
		return null;
	}
}
