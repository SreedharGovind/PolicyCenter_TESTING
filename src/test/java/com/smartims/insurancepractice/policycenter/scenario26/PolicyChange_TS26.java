package com.smartims.insurancepractice.policycenter.scenario26;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange_TS26 {
	void policychange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyChangeVO cvo = new PolicyChangeVO();
		PolicyChangeVO pvo = new PolicyChangeVO();

		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.changePolicy)).click();
		cvo.setPolicyChangeEffectiveDate(ExcelUtils_TS26.getCellValueByLabel("policyChangeEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeEffectiveDate))
				.sendKeys(cvo.getPolicyChangeEffectiveDate());
		cvo.setPolicyChangeDescription(ExcelUtils_TS26.getCellValueByLabel("policyChangeDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDescription))
				.sendKeys(cvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyOfferings)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyChangeDriver)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicleToPACoverages)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeUncheckMedicalPayments)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();
		driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
