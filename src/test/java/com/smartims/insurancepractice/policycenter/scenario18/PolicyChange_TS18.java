package com.smartims.insurancepractice.policycenter.scenario18;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyChange_TS18 {
	void policyChange18(ChromeDriver driver, Actions actions) throws IOException {

		PolicyChangeVO pcvo = new PolicyChangeVO();
		SeleniumToExcel_TS18 seleniumToExcel = new SeleniumToExcel_TS18();

		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS18.getCellValueByLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS18.getCellValueByLabel("policyChangeDescription"));
		pcvo.setPolicyChangeOfferingsSelection(ExcelUtils_TS18.getCellValueByLabel("policyChangeOfferingsSelection"));
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton2)).click();
		driver.findElement(By.xpath(ConstantsClass18.changePolicyOption)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"StartPolicyChange-StartPolicyChangeScreen-StartPolicyChangeDV-EffectiveDate\"]/div/input"))
				.sendKeys(pcvo.getPolicyChangeEffectiveDate());
		driver.findElement(By.xpath(ConstantsClass18.policyChangeDescription))
				.sendKeys(pcvo.getPolicyChangeDescription(), Keys.ENTER);
		WebElement policyChangeNext = driver.findElement(By.xpath(ConstantsClass18.policyChangeScreenNextButton));
		actions.moveToElement(policyChangeNext).perform();
		policyChangeNext.click();
		Select offerings = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringsTypeSelection)));
		offerings.selectByVisibleText(pcvo.getPolicyChangeOfferingsSelection());
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeTermType)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeAdditionalCoverageTab)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeRiskAnalysisScreen)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyPreviewTab)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.polChangeQuoteButton)).click();
		seleniumToExcel.premium(driver, "PolicyChangeTS18");
		driver.findElement(By.xpath(ConstantsClass18.polChangeBindOption)).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.xpath(ConstantsClass18.viewPolicyChangeSummaryScreen)).click();

	}
}
