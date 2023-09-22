package com.smartims.insurancepractice.policycenter.scenario05;

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

public class SeleniumToExcel_TS05 {
	WebElement premiumValue(ChromeDriver driver, String transaction) {
	if (transaction == "PolicyIssuance_TS05") {
		return driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-Quote_SummaryDV-TotalCost\"]/div/div"));		
	}
	if (transaction == "PolicyChange_TS05") {
		return driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-PolicyChangeWizard_QuoteScreen-Quote_SummaryDV-TotalCost\"]/div/div"));
	}
	if (transaction == "PolicyCancellation_TS05") {
		return driver.findElement(By.xpath(
				"//*[@id=\"CancellationWizard-CancellationWizard_QuoteScreen-Quote_SummaryDV-TotalCost\"]/div/div"));
	}
	if (transaction == "PolicyRewriteMidTerm_TS05") {
		return driver.findElement(By.xpath(
				"//*[@id=\"RewriteWizard-RewriteWizard_QuoteScreen-Quote_SummaryDV-TotalCost\"]/div/div"));
	}
	return null;

	}public void premium(ChromeDriver driver, String transaction) throws IOException {

		FileInputStream fis = new FileInputStream(new File("premium calculations.xlsx"));
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		WebElement data = this.premiumValue(driver, transaction);
		System.out.println(transaction);
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
	}}
