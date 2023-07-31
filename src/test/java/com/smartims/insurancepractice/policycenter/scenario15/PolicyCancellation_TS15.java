
package com.smartims.insurancepractice.policycenter.scenario15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.Constants;

public class PolicyCancellation_TS15 {
	void cancelpolicy(ChromeDriver driver, Actions action) throws Exception {
		PolicyCancellationVO cvo = new PolicyCancellationVO();
		// new transaction

		WebElement Trans = driver.findElement(By.xpath(Constants.newTransaction));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(By.xpath(Constants.cancelPolicy)).click();
		cvo.setPolicyCancellationSource(ExcelUtils_TS15.getCellValueByLabel("policyCancellationSource"));
		cvo.setPolicyCancellationReasonDescription(
				ExcelUtils_TS15.getCellValueByLabel("policyCancellationReasonDescription"));
		cvo.setPolicyCancellationReason(ExcelUtils_TS15.getCellValueByLabel("policyCancellationReason"));
		cvo.setCancellationEffectiveDate(ExcelUtils_TS15.getCellValueByLabel("cancellationEffectiveDate"));

		// Selecting the Source

		driver.findElement(
				By.xpath("//*[@id=\"StartCancellation-StartCancellationScreen-CancelPolicyDV-Source\"]/div/div/select"))
				.sendKeys(cvo.getPolicyCancellationSource(), Keys.TAB);

		// Description
		driver.findElement(By.name(Constants.reasonDescription)).sendKeys(cvo.getPolicyCancellationReasonDescription(),
				Keys.ENTER);

		// Selecting the Reason
		driver.findElement(
				By.xpath("//*[@id=\"StartCancellation-StartCancellationScreen-CancelPolicyDV-Reason\"]/div/div/select"))
				.sendKeys(cvo.getPolicyCancellationReason());

//	driver.findElement(By.name("StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate")).clear();
		driver.findElement(By.id("StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate_dateIcon"))
				.click();

		driver.findElement(By.name("StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate"))
				.sendKeys(cvo.getCancellationEffectiveDate());

		// cancelling the policy

//			driver.findElement(By.id(Constants.startCancellation)).click();

		WebElement start = driver
				.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div"));
		action.moveToElement(start).perform();
		start.click();
		driver.findElement(By.id("StartCancellation-StartCancellationScreen-0")).click();
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
