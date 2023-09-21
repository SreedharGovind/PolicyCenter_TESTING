package com.smartims.insurancepractice.policycenter.scenario14;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.ConstantsClassPC;

import java.io.IOException;

public class PolicyManualRenewal_TS14 {

	public void policyRenew(ChromeDriver driver, Actions actions) throws InterruptedException, IOException {
		SeleniumToExcel_TS14 seleniumToExcel = new SeleniumToExcel_TS14();
		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.PolicyRenewOption)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.policyRenewInfoScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyRenewEditPolicy)).click();

		driver.findElement(By.xpath(ConstantsClassPC.policyRenewQuote)).click();
		seleniumToExcel.premium(driver, "PolicyManualRenewalTS14");

		driver.findElement(By.xpath(ConstantsClassPC.policyRenewBindingOptions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.PolicyRenewIssueNow)).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}

}
