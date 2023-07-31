package com.smartims.insurancepractice.policycenter.scenario06;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyAutoRenewalVO;

import PolicyCenterTransactions.ConstantsClass03;
import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyManualRenewal_TS06 {

	public void policyRenew(ChromeDriver driver, Actions actions) throws InterruptedException {
		PolicyAutoRenewalVO pvo = new PolicyAutoRenewalVO();
		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.PolicyRenewOption)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.policyRenewInfoScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyRenewEditPolicy)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.policyRenewQuote)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyRenewBindingOptions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.PolicyRenewIssueNow)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}

}
