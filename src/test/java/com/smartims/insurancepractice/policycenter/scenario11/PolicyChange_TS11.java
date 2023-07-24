package com.smartims.insurancepractice.policycenter.scenario11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC;
import PolicyCenterTransactions.ConstantsClassPC_TS11;

public class PolicyChange_TS11 {

	public void perfromPolicyChange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyChangeVO pvo = new PolicyChangeVO();
		
		driver.findElement(By.xpath(ConstantsClassPC_TS11.NewTransactionButton)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.PolicyChangeOption)).click();

		pvo.setPolicyChangeDescription(ExcelUtils_TS11.getCellValueByLabel("policyChangeDescription"));

		driver.findElement(By.xpath(ConstantsClassPC_TS11.policyChangeDescription))
		.sendKeys(pvo.getPolicyChangeDescription());

		driver.findElement(By.xpath(ConstantsClassPC_TS11.StartPolicyChangeNextButton)).click();

		WebElement Offering = driver.findElement(By.xpath(ConstantsClassPC_TS11.OfferingSelection));
		Select offering = new Select(Offering);
		offering.selectByValue("Basic Program");

		driver.findElement(By.xpath(ConstantsClassPC_TS11.next)).click();

		WebElement TermType = driver.findElement(By.xpath(ConstantsClassPC_TS11.TermTypeOption));
		Select termtype = new Select(TermType);
		termtype.selectByValue("Annual");

		driver.findElement(By.xpath(ConstantsClassPC_TS11.next1)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.address2)).sendKeys("Main Street");

		driver.findElement(By.xpath(ConstantsClassPC_TS11.policyChangeQuoteButton)).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC_TS11.rewriteNewTermPolicyIssue)).click();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
		driver.switchTo().alert().accept();

	}
}
