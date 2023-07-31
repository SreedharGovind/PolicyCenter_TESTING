package com.smartims.insurancepractice.policycenter.scenario02;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyRewriteMidTermVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyRewriteMidTerm_TS02 {

	PolicyRewriteMidTermVO midTermVO = new PolicyRewriteMidTermVO();

	public void rewriteMidTerm(ChromeDriver driver, Actions actions) throws IOException {
		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rewriteRemainderOfTerm)).click();
		midTermVO.setRewriteMidTermOfferingsSelection(
				ExcelUtils_TS02.getCellValueByLabel("rewriteMidTermOfferingsSelection"));
		driver.findElement(By.xpath(ConstantsClassPC.rewriteMidTermOfferingsSelection))
				.sendKeys(midTermVO.getRewriteMidTermOfferingsSelection());
		driver.findElement(By.xpath(ConstantsClassPC.rewriteMidTermToInfoScreen)).click();
		driver.findElement(By.id(ConstantsClassPC.rewriteMidTermQuoteID)).click();
		driver.findElement(By.id(ConstantsClassPC.rewriteMidTermPolicyIssueID)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}

}
