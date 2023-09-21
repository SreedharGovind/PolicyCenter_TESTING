package com.smartims.insurancepractice.policycenter.scenario14;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SeleniumToExcel_TS14 {

	WebElement premiumValue(ChromeDriver driver, String transaction) {

		if (transaction == "PolicyIssuanceTS14") {
			return driver.findElement(By.xpath(
					"//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-Quote_SummaryDV-TotalCost\"]/div/div"));
		}

		if (transaction == "PolicyChangeTS14") {
			return driver.findElement(By.xpath(
					"//*[@id=\"PolicyChangeWizard-PolicyChangeWizard_QuoteScreen-Quote_SummaryDV-TotalCost\"]/div/div"));
		}
		
		
		if (transaction == "PolicyCancellationTS14") {
			return driver.findElement(By.xpath(
					"//*[@id=\"CancellationWizard-CancellationWizard_QuoteScreen-Quote_SummaryDV-ChangeInCost\"]/div/div"));

		}
		if (transaction == "PolicyManualRenewalTS14") {
			return driver.findElement(By.xpath(
					"//*[@id=\"RenewalWizard-PostQuoteWizardStepSet-RenewalWizard_QuoteScreen-Quote_SummaryDV-TotalCost\"]/div/div"));
		}
		
		
		

		return null;
	}

	public void premium(ChromeDriver driver, String transaction) throws IOException {

		FileInputStream fis = new FileInputStream(new File("premium calculations.xlsx"));
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(1);
		WebElement data = this.premiumValue(driver, transaction);
		System.out.println(transaction);
		String capturedData = data.getText();
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell != null && cell.getCellType() == CellType.STRING
						&& cell.getStringCellValue().equals(transaction)) {
					int columnIndex = cell.getColumnIndex();
					Cell dataCell = row.createCell(columnIndex + 2);
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
