package com.smartims.insurancepractice.policycenter.scenario13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.Constants;

public class PolicyChange_TS13 {
	void changePolicy(ChromeDriver driver, Actions action) throws Exception {

		// new transaction
		PolicyChangeVO pcvo = new PolicyChangeVO();
		SeleniumToExcel_TS13 seleniumToExcel = new SeleniumToExcel_TS13();

		WebElement Trans = driver.findElement(By.xpath(Constants.newTransaction));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(By.xpath(Constants.changePolicy)).click();
		driver.manage().window().maximize();
		// changing the effective date
		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS13.getCellValueByLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS13.getCellValueByLabel("policyChangeDescription"));
		pcvo.setPolicyChangeDriver1MaritalStatus(
				ExcelUtils_TS13.getCellValueByLabel("policyChangeDriver1MaritalStatus"));

		driver.findElement(
				By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/div/div/div[1]/div[2]/div/div/input"))
				.sendKeys(pcvo.getPolicyChangeEffectiveDate(), Keys.TAB);

		driver.findElement(By.name(Constants.policyChangeDescription)).sendKeys(pcvo.getPolicyChangeDescription(),
				Keys.ENTER);
		driver.findElement(By.id("StartPolicyChange-StartPolicyChangeScreen-NewPolicyChange")).click();

		// driver screen martial status
		driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-PADrivers")).click();

		driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus"))
				.sendKeys(pcvo.getPolicyChangeDriver1MaritalStatus(), Keys.ENTER);

		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"))
				.click();
		seleniumToExcel.premium(driver, "PolicyChangeTS13");
		driver.findElement(
				By.id("PolicyChangeWizard-PolicyChangeWizard_QuoteScreen-JobWizardToolbarButtonSet-BindPolicyChange"))
				.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();

	}

}
