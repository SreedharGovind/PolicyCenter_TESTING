package com.smartims.insurancepractice.policycenter.scenario23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumToExcel_TS23 {
	static int currentColumnIndex = 0;

	WebElement premiumValue(ChromeDriver driver, String transaction) {

		if (transaction == "PolicyIssuanceTS23") {
			return driver.findElement(By.xpath(
					"//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-Quote_SummaryDV-TotalCost\"]/div/div"));
		}

		if (transaction == "PolicyChangeTS23") {
			return driver.findElement(By.xpath(
					"//*[@id=\"PolicyChangeWizard-PolicyChangeWizard_QuoteScreen-Quote_SummaryDV-TotalPremium\"]/div/div"));
		}

		return null;
	}

	public void premium(ChromeDriver driver, String transaction) throws IOException {

		FileInputStream fis = new FileInputStream(new File("premium calculations.xlsx"));
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		WebElement data = this.premiumValue(driver, transaction);
		String capturedData = data.getText();
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell != null && cell.getCellType() == CellType.STRING
						&& cell.getStringCellValue().equals(transaction)) {
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