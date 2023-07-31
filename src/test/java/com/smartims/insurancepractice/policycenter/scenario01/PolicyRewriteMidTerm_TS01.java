package com.smartims.insurancepractice.policycenter.scenario01;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyRewriteMidTermVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyRewriteMidTerm_TS01 {

	PolicyRewriteMidTermVO midTermVO = new PolicyRewriteMidTermVO();

	public void rewriteMidTerm(ChromeDriver driver, Actions actions) throws IOException {
		driver.findElement(By.xpath(ConstantsClassPC.transactions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rewriteRemainderOfTerm)).click();
		midTermVO.setRewriteMidTermOfferingsSelection(
				ExcelUtils_TS01.getCellValueByLabel("rewriteMidTermOfferingsSelection"));
		driver.findElement(By.xpath(ConstantsClassPC.rewriteMidTermOfferingsSelection))
				.sendKeys(midTermVO.getRewriteMidTermOfferingsSelection());
		driver.findElement(By.xpath(ConstantsClassPC.rewriteMidTermToInfoScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rewriteMidTermQuote)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rewriteMidTermPolicyIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
