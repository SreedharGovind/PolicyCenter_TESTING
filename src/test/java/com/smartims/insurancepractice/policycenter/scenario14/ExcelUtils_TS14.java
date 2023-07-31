package com.smartims.insurancepractice.policycenter.scenario14;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import PolicyCenterTransactions.CommonClass;

public class ExcelUtils_TS14 {
	public static String getCellValueByLabel(String label) throws Exception {

		FileInputStream file = new FileInputStream(new File(CommonClass.excelFilePath));
		String sheetName = "TS_14";
		Workbook workbook = WorkbookFactory.create(file);

		Sheet sheet = workbook.getSheet(sheetName);
		for (Row row : sheet) {

			for (Cell cell : row) {

				if (cell.getStringCellValue().equals(label)) {

					Cell valueCell = row.getCell(cell.getColumnIndex() + 1);

					String value = valueCell.getStringCellValue();

					return value;
				}

			}

		}
		workbook.close();
		return null;

	}

}
