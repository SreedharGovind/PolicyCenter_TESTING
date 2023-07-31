package com.smartims.insurancepractice.policycenter.scenario01;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyReinstatementVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyReinstatement_TS01 {
	public void policyReinstatement(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyReinstatementVO reinstateVO = new PolicyReinstatementVO();
		driver.findElement(By.xpath(ConstantsClassPC.transactions)).click();
		driver.findElement(By.id(ConstantsClassPC.reinstatePolicyID)).click();
		reinstateVO.setReinstatementReason(ExcelUtils_TS01.getCellValueByLabel("reinstatementReason"));
		driver.findElement(By.xpath(ConstantsClassPC.reinstatementReason))
				.sendKeys(reinstateVO.getReinstatementReason());
		reinstateVO.setReinstatementReasonDescription(
				ExcelUtils_TS01.getCellValueByLabel("reinstatementReasonDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.reinstatementReasonDescription))
				.sendKeys(reinstateVO.getReinstatementReasonDescription());
		driver.findElement(By.xpath(ConstantsClassPC.reinstatementQuote)).click();
		driver.findElement(By.xpath(ConstantsClassPC.reinstateButton)).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath(ConstantsClassPC.alert)).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
