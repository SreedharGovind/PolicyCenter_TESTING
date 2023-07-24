package com.smartims.insurancepractice.policycenter.scenario11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PolicyCenterTransactions.ConstantsClassPC;
import PolicyCenterTransactions.ConstantsClassPC_TS11;

public class PolicyRewriteNewTerm_TS11 {

	void perfromPolicyRewriteTransaction(ChromeDriver driver, Actions actions)
			throws IOException, InterruptedException {

		driver.findElement(By.xpath(ConstantsClassPC_TS11.NewTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS11.rewriteNewTerm)).click();

		WebElement Offering = driver.findElement(By.xpath(ConstantsClassPC_TS11.rewriteNewTermOfferingsSelection));
		Select offering = new Select(Offering);
		offering.selectByValue("Standard Program");

		driver.findElement(By.xpath(ConstantsClassPC_TS11.rewriteNewTermToInfoScreen)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.rewriteNewTermQuoteAtInfoScreen)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC_TS11.rewriteNewTermPolicyIssue)).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.toRiskAnalysisScreenRewriteNewTerm)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.rewriteNewTermUWApprove)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.rewriteNewTermUWApproveOK)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rewriteNewTermPolicyIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}
}