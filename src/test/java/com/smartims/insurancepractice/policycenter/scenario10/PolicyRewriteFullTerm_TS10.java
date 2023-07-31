package com.smartims.insurancepractice.policycenter.scenario10;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyRewriteFullTermVO;

import PolicyCenterTransactions.ConstantsClass18;
import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyRewriteFullTerm_TS10 {

	void policyRewriteFullTerm(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		PolicyRewriteFullTermVO prft = new PolicyRewriteFullTermVO();
		PolicyCancellationVO pc = new PolicyCancellationVO();
		prft.setRewriteFullTermOfferingsSelection(
				ExcelUtils_TS10.getCellValueByLabel("rewriteFullTermOfferingsSelection"));
		prft.setRewriteFullTermTermType(ExcelUtils_TS10.getCellValueByLabel("rewriteFullTermTermType"));
		prft.setRewriteFullTermEffectiveDate(ExcelUtils_TS10.getCellValueByLabel("rewriteFullTermEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermButton)).click();

		Select select10 = new Select(driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermOfferings)));
		select10.selectByVisibleText(prft.getRewriteFullTermOfferingsSelection());

		WebElement nextButton = driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermNextButton));
		actions.moveToElement(nextButton).perform();
		nextButton.click();

		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermNextButton));
		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermPolicyTermType))
				.sendKeys(prft.getRewriteFullTermTermType());
		WebElement Quote = driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermQuoteButton));
		actions.moveToElement(Quote).perform();
		Quote.click();

		// Issue Policy
		driver.findElement(By.xpath(
				"//*[@id=\"RewriteWizard-RewriteWizard_QuoteScreen-JobWizardToolbarButtonSet-BindRewrite\"]/div"))
				.click();

		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.toRiskAnalysisScreenRewriteNewTerm)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rewriteNewTermUWApprove)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rewriteNewTermUWApproveOK)).click();

		driver.findElement(By.xpath(ConstantsClassPC.rewriteNewTermPolicyIssue)).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath(ConstantsClass18.jobCompleteScreenViewPolicyLink)).click();

	}

}
