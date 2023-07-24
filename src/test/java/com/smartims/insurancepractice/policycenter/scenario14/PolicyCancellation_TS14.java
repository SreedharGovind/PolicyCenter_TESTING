package com.smartims.insurancepractice.policycenter.scenario14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.Constants;
;

public class PolicyCancellation_TS14 {
	void cancelpolicy(ChromeDriver driver, Actions action) throws Exception {
		PolicyCancellationVO cvo = new PolicyCancellationVO();
		// new transaction

		WebElement Trans = driver.findElement(By.xpath(Constants.newTransaction));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(By.xpath(Constants.cancelPolicy)).click();
		cvo.setPolicyCancellationSource(ExcelUtils_TS14.getCellValueByLabel("policyCancellationSource"));
		cvo.setPolicyCancellationReasonDescription(
				ExcelUtils_TS14.getCellValueByLabel("policyCancellationReasonDescription"));
		cvo.setPolicyCancellationReason(ExcelUtils_TS14.getCellValueByLabel("policyCancellationReason"));
		cvo.setCancellationEffectiveDate(ExcelUtils_TS14.getCellValueByLabel("cancellationEffectiveDate"));

		// Selecting the Source

//		Select Source = new Select(driver.findElement(By.name(Constants.source)));
//		Source.selectByValue("insured");
		driver.findElement(
				By.xpath("//*[@id=\"StartCancellation-StartCancellationScreen-CancelPolicyDV-Source\"]/div/div/select"))
				.sendKeys(cvo.getPolicyCancellationSource(), Keys.TAB);

		// Description
		driver.findElement(By.name(Constants.reasonDescription)).sendKeys(cvo.getPolicyCancellationReasonDescription(),
				Keys.ENTER);

		// Selecting the Reason
//		Select Reason = new Select(driver.findElement(By.name(Constants.reason)));
//		Reason.selectByVisibleText("Insured request");
		driver.findElement(
				By.xpath("//*[@id=\"StartCancellation-StartCancellationScreen-CancelPolicyDV-Reason\"]/div/div/select"))
				.sendKeys(cvo.getPolicyCancellationReason());

//	driver.findElement(By.name("StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate")).clear();
		driver.findElement(By.id("StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate_dateIcon"))
				.click();

		driver.findElement(By.name("StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate"))
				.sendKeys(cvo.getCancellationEffectiveDate());

		// cancelling the policy

		WebElement cancel = driver.findElement(By.id("StartCancellation-StartCancellationScreen-NewCancellation"));
		cancel.click();
		driver.findElement(By.id(Constants.startCancellation)).click();

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
