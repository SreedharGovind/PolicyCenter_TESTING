package com.smartims.insurancepractice.policycenter.scenario03;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;
import PolicyCenterTransactions.ConstantsClass03;

public class PolicyChange_TS03 {
	void policyChange(ChromeDriver driver, Actions action) throws IOException, InterruptedException {
		PolicyChangeVO pco = new PolicyChangeVO();
		SeleniumToExcel_TS03 seleniumToExcel = new SeleniumToExcel_TS03();

		pco.setPolicyChangeEffectiveDate(ExcelUtils_TS03.getCellValueByLabel("policyChangeEffectiveDate"));
		pco.setPolicyChangeDescription(ExcelUtils_TS03.getCellValueByLabel("policyChangeDescription"));
		pco.setPolicyChangeExistingDriverdateOfBirth(
				ExcelUtils_TS03.getCellValueByLabel("policyChangeExistingDriverdateOfBirth"));
		pco.setPolicyChangeExistingDriverLicenseNumber(
				ExcelUtils_TS03.getCellValueByLabel("policyChangeExistingDriverLicenseNumber"));
		pco.setPolicyChangeExistingDriverLicenseState(
				ExcelUtils_TS03.getCellValueByLabel("policyChangeExistingDriverLicenseState"));
		pco.setPolicyChangeExistingDriverYearFirstLicensed("policyChangeExistingDriverYearFirstLicensed");
		pco.setPolicyChangeExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS03.getCellValueByLabel("policyChangeExistingDriverNumberOfAccidentsPolicyLevel"));
		pco.setPolicyChangeExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS03.getCellValueByLabel("policyChangeExistingDriverNumberOfAccidentsAccountLevel"));
		pco.setPolicyChangeExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS03.getCellValueByLabel("policyChangeExistingDriverNumberOfViolationsPolicyLevel"));
		pco.setPolicyChangeExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS03.getCellValueByLabel("policyChangeExistingDriverNumberOfViolationsAccountLevel"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.policychange)).click();
		driver.findElement(By.name(ConstantsClass03.policyChangeEffectiveDate))
				.sendKeys(pco.getPolicyChangeEffectiveDate(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.policyChangeDescription)).sendKeys(pco.getPolicyChangeDescription(),
				Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.startpolicychange)).click();
		driver.findElement(By.id(ConstantsClass03.policychangedriverscreen)).click();
		driver.findElement(By.id(ConstantsClass03.policychangeadddriver)).click();
		WebElement existingdriver = driver.findElement(By.id(ConstantsClass03.policyChangeexistingdriver));
		action.moveToElement(existingdriver).perform();
		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-AddExistingContact-0-UnassignedDriver"))
				.click();
		driver.findElement(By.id(ConstantsClass03.policyChangecheckbox)).click();
		driver.findElement(By.id(ConstantsClass03.policychangeremove)).click();
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		driver.findElement(By.id(ConstantsClass03.policychangequote)).click();
		seleniumToExcel.premium(driver, "PolicyChange_TS03");
		driver.findElement(By.id(ConstantsClass03.bindpolicychange)).click();
		Thread.sleep(20000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}
