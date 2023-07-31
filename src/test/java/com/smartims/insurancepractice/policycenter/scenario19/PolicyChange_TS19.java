package com.smartims.insurancepractice.policycenter.scenario19;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyChange_TS19 {

	void policyChange19(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		AccountCreationVO pvo = new AccountCreationVO();
		PolicyChangeVO pcvo = new PolicyChangeVO();
		ExcelUtils_TS19 eu19 = new ExcelUtils_TS19();

		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS19.getCellValueByLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS19.getCellValueByLabel("policyChangeDescription"));
		pcvo.setPolicyChangeOfferingsSelection(ExcelUtils_TS19.getCellValueByLabel("policyChangeOfferingsSelection"));

		pcvo.setPolicyChangeExistingDriverdateOfBirth(
				ExcelUtils_TS19.getCellValueByLabel("policyChangeExistingDriverdateOfBirth"));

		pcvo.setPolicyChangeVehicle1VIN(ExcelUtils_TS19.getCellValueByLabel("policyChangeVehicle1VIN"));
		pcvo.setPolicyChangeVehicle1LicenseState(
				ExcelUtils_TS19.getCellValueByLabel("policyChangeVehicle1LicenseState"));
		pcvo.setPolicyChangeVehicle1Driver1Percentage(
				ExcelUtils_TS19.getCellValueByLabel("policyChangeVehicle1Driver1Percentage"));
		pcvo.setPolicyChangeVehicle1CostNew(ExcelUtils_TS19.getCellValueByLabel("policyChangeVehicle1CostNew"));

		pcvo.setPolicyChangeOOSEffectiveDate(ExcelUtils_TS19.getCellValueByLabel("policyChangeOOSEffectiveDate"));
		pcvo.setPolicyChangeOOSDescription(ExcelUtils_TS19.getCellValueByLabel("policyChangeOOSDescription"));

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

		// offerings Screen
		Select offerings = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringsTypeSelection)));
		offerings.selectByVisibleText(pcvo.getPolicyChangeOfferingsSelection());

		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeTermType)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.polChangeExistingDriverDateOfBirth)).clear();
		driver.findElement(By.xpath(ConstantsClass18.polChangeExistingDriverDateOfBirth))
				.sendKeys(pcvo.getPolicyChangeExistingDriverdateOfBirth());
		driver.findElement(By.id(ConstantsClass18.polChangeDriverScreenNextButton)).click();

		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnCreateVehicle)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleVIN)).sendKeys(pcvo.getPolicyChangeVehicle1VIN());

		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnLicenseState))
				.sendKeys(pcvo.getPolicyChangeVehicle1LicenseState());

		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnAssignDriver)).click();

		WebElement addDriver = driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver-0-Driver\"]/div"));

		actions.moveToElement(addDriver).perform();
		addDriver.click();

		WebElement vehicleCost = driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnCostNew));
		actions.moveToElement(vehicleCost).perform();
		vehicleCost.sendKeys(pcvo.getPolicyChangeVehicle1CostNew());

		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();

		driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PersonalAuto_AllVehicleCoveragesDV-PALiabCategoryIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input"))
				.click();
		driver.findElement(By.id(ConstantsClass18.polChangeDriverScreenNextButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeRiskAnalysisScreen)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyPreviewTab)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.polChangeQuoteButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeBindOption)).click();

		Alert alert21 = driver.switchTo().alert();
		alert21.accept();

		driver.findElement(By.xpath(ConstantsClass18.viewPolicyChangeSummaryScreen)).click();
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton2)).click();
		driver.findElement(By.xpath(ConstantsClass18.changePolicyOption)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"StartPolicyChange-StartPolicyChangeScreen-StartPolicyChangeDV-EffectiveDate\"]/div/input"))
				.sendKeys(pcvo.getPolicyChangeOOSEffectiveDate());

		driver.findElement(By.xpath(ConstantsClass18.policyChangeDescription))
				.sendKeys(pcvo.getPolicyChangeOOSDescription());

		Thread.sleep(1000);
		WebElement oosPolicyChangeNext = driver
				.findElement(By.xpath("//*[@id=\"StartPolicyChange-StartPolicyChangeScreen-NewPolicyChange\"]/div"));
		actions.moveToElement(oosPolicyChangeNext).perform();
		oosPolicyChangeNext.click();

		Alert oosAlert = driver.switchTo().alert();
		oosAlert.accept();

		Select oosOfferings = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringsTypeSelection)));
		oosOfferings.selectByIndex(1);

		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeTermType)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();

		Thread.sleep(1000);
		WebElement withdrawTransactionButton = driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-WithdrawJob\"]/div"));
		actions.moveToElement(withdrawTransactionButton).perform();
		withdrawTransactionButton.click();

		driver.switchTo().alert().accept();

	}
}
