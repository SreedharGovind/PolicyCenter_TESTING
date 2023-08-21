package com.smartims.insurancepractice.policycenter.scenario02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumToExcel_TS02 {
	List<WebElement> premiumValue(ChromeDriver driver) {
		List<WebElement> dataElements = driver.findElements(
				By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/div/div[3]/div[5]/div[2]/div/div/div"));
		return dataElements;
	}
	void premium(ChromeDriver driver) throws IOException {

		String specifiedValue = "Issuance";
		FileInputStream fis = new FileInputStream(new File("premium calculations.xlsx"));
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);

		List<WebElement> data = this.premiumValue(driver);

		for (WebElement dataElement : data) {
			String capturedData = dataElement.getText();
			for (Row row : sheet) {
				for (Cell cell : row) {
					if (cell != null && cell.getCellType() == CellType.STRING
							&& cell.getStringCellValue().equals(specifiedValue)) {
						int columnIndex = cell.getColumnIndex();
						Cell dataCell = row.createCell(columnIndex + 1);
						dataCell.setCellValue(capturedData);
						System.out.println(capturedData);
						break;
					}
				}
			}

			FileOutputStream fos = new FileOutputStream(new File("premium calculations.xlsx"));
			workbook.write(fos);
			fos.close();

		}

	}
}
