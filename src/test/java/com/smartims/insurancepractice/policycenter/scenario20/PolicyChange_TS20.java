package com.smartims.insurancepractice.policycenter.scenario20;

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

public class PolicyChange_TS20 {

	void policyChange20(ChromeDriver driver, Actions actions) throws IOException {

		PolicyChangeVO pcvo = new PolicyChangeVO();
		SeleniumToExcel_TS20 seleniumToExcel = new SeleniumToExcel_TS20();
		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS20.getCellValueByLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS20.getCellValueByLabel("policyChangeDescription"));
		pcvo.setPolicyChangeOfferingsSelection(ExcelUtils_TS20.getCellValueByLabel("policyChangeOfferingsSelection"));
		pcvo.setPolicyChangeExistingDriverFirstname(
				ExcelUtils_TS20.getCellValueByLabel("policyChangeExistingDriverFirstname"));
		pcvo.setPolicyChangeExistingDriverLastname(
				ExcelUtils_TS20.getCellValueByLabel("policyChangeExistingDriverFirstname"));
		pcvo.setPolicyChangeExistingDriverdateOfBirth(
				ExcelUtils_TS20.getCellValueByLabel("policyChangeExistingDriverdateOfBirth"));
		pcvo.setPolicyChangeVehicle1CostNew(ExcelUtils_TS20.getCellValueByLabel("policyChangeVehicle1CostNew"));
		pcvo.setPolicyChangeVehicle1AINewPersonIntrestType(
				ExcelUtils_TS20.getCellValueByLabel("policyChangeVehicle1AINewPersonIntrestType"));
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
		driver.findElement(By.xpath(ConstantsClass18.polchangeExistingDriverNewFirstname)).clear();
		driver.findElement(By.xpath(ConstantsClass18.polchangeExistingDriverNewFirstname))
				.sendKeys(pcvo.getPolicyChangeExistingDriverFirstname());
		driver.findElement(By.xpath(ConstantsClass18.polchangeExistingDriverNewLastname)).clear();
		driver.findElement(By.xpath(ConstantsClass18.polchangeExistingDriverNewLastname))
				.sendKeys(pcvo.getPolicyChangeExistingDriverLastname());
		driver.findElement(By.xpath(ConstantsClass18.polChangeExistingDriverDateOfBirth)).clear();
		driver.findElement(By.xpath(ConstantsClass18.polChangeExistingDriverDateOfBirth))
				.sendKeys(pcvo.getPolicyChangeExistingDriverdateOfBirth());
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicle1CostNew)).clear();
		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicle1CostNew))
				.sendKeys(pcvo.getPolicyChangeVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClass18.polChangeAdditionalInterestTab)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeAdditionalInterestTabAddButton)).click();
		WebElement existingContactButton = driver
				.findElement(By.xpath(ConstantsClass18.polChangeAdditionalInterestTabAddExistingContact));
		actions.moveToElement(existingContactButton).perform();
		WebElement existingContact = driver
				.findElement(By.xpath(ConstantsClass18.polChangeAdditionalInterestAddContact));
		actions.moveToElement(existingContact).perform();
		existingContact.click();
		Select additionalInterestType1 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.polChangeAdditionalInterestType)));
		System.out.println(pcvo.getPolicyChangeVehicle1AINewPersonIntrestType());
		additionalInterestType1.selectByIndex(1);
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeAdditionalCoverageTab)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeRiskAnalysisScreen)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyPreviewTab)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.polChangeQuoteButton)).click();
		seleniumToExcel.premium(driver, "PolicyChangeTS20");
		driver.findElement(By.xpath(ConstantsClass18.polChangeBindOption)).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.xpath(ConstantsClass18.viewPolicyChangeSummaryScreen)).click();
	}

}
