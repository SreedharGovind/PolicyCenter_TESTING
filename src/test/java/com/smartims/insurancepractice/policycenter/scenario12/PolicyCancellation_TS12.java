package com.smartims.insurancepractice.policycenter.scenario12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.Constants;

public class PolicyCancellation_TS12 {
	void cancelpolicy(ChromeDriver driver, Actions action) throws Exception {
		PolicyCancellationVO cvo = new PolicyCancellationVO();
		SeleniumToExcel_TS12 seleniumToExcel = new SeleniumToExcel_TS12();
		// new transaction

		WebElement Trans = driver.findElement(By.xpath(Constants.newTransaction));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(By.xpath(Constants.cancelPolicy)).click();

		cvo.setPolicyCancellationSource(ExcelUtils_TS12.getCellValueByLabel("policyCancellationSource"));
		cvo.setPolicyCancellationReasonDescription(
				ExcelUtils_TS12.getCellValueByLabel("policyCancellationReasonDescription"));
		cvo.setPolicyCancellationReason(ExcelUtils_TS12.getCellValueByLabel("policyCancellationReason"));
		cvo.setCancellationEffectiveDate(ExcelUtils_TS12.getCellValueByLabel("cancellationEffectiveDate"));

		// Selecting the Source
		driver.findElement(
				By.xpath("//*[@id=\"StartCancellation-StartCancellationScreen-CancelPolicyDV-Source\"]/div/div/select"))
				.sendKeys(cvo.getPolicyCancellationSource());

		// Description
		driver.findElement(By.name(Constants.reasonDescription)).sendKeys(cvo.getPolicyCancellationReasonDescription(),
				Keys.ENTER);

		// Selecting the Reason
		driver.findElement(
				By.xpath("//*[@id=\"StartCancellation-StartCancellationScreen-CancelPolicyDV-Reason\"]/div/div/select"))
				.sendKeys(cvo.getPolicyCancellationReason());

		// cancelling the policy
		WebElement cancel = driver.findElement(By.id("StartCancellation-StartCancellationScreen-NewCancellation"));
		action.moveToElement(cancel).perform();
//			cancel.click();
		driver.findElement(By.id("StartCancellation-StartCancellationScreen-NewCancellation")).click();
		seleniumToExcel.premium(driver, "PolicyCancellationTS12");
		// Bind options cancel Now

		WebElement bindoption = driver.findElement(By.id(Constants.cancellationWizardBindoptions));
		action.moveToElement(bindoption).perform();
		bindoption.click();
		driver.findElement(By.xpath(Constants.cancelNow)).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.findElement(By.xpath(Constants.viewPolicy)).click();

	}

}
