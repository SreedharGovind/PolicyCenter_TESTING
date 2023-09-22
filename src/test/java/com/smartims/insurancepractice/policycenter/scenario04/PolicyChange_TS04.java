package com.smartims.insurancepractice.policycenter.scenario04;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;
import com.smartims.insurancepractice.policycenter.scenario02.SeleniumToExcel_TS02;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicyChange_TS04 {
	void policyChange(ChromeDriver driver, Actions action) throws IOException {
		PolicyChangeVO pco = new PolicyChangeVO();
		SeleniumToExcel_TS04 seleniumToExcel = new SeleniumToExcel_TS04();

		pco.setPolicyChangeEffectiveDate(ExcelUtils_TS04.getCellValueByLabel("policyChangeEffectiveDate"));
		pco.setPolicyChangeDescription(ExcelUtils_TS04.getCellValueByLabel("policyChangeDescription"));
		pco.setPolicyChangeDriver1LicenseNumber(
				ExcelUtils_TS04.getCellValueByLabel("policyChangeDriver1LicenseNumber"));
		pco.setPolicyChangeVehicle1CollisionLimit(
				ExcelUtils_TS04.getCellValueByLabel("policyChangeVehicle1CollisionLimit"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.policychange)).click();
		driver.findElement(By.name(ConstantsClass03.policyChangeEffectiveDate))
				.sendKeys(pco.getPolicyChangeEffectiveDate(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.policyChangeDescription)).sendKeys(pco.getPolicyChangeDescription(),
				Keys.TAB);
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div/div[2]"))
				.click();
		driver.findElement(By.id(ConstantsClass03.policychangedriverscreen)).click();
		driver.findElement(By.name(ConstantsClass03.policyChangeDriver1LicenseNumber)).clear();
		driver.findElement(By.name(ConstantsClass03.policyChangeDriver1LicenseNumber))
				.sendKeys(pco.getPolicyChangeDriver1LicenseNumber(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-PALine")).click();
		driver.findElement(By.name(ConstantsClass03.PolicyChangeVehicle1CollisionLimit))
				.sendKeys(pco.getPolicyChangeVehicle1CollisionLimit(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.policyChangeQuote)).click();
		seleniumToExcel.premium(driver, "PolicyChange_TS04");
		driver.findElement(By.id(ConstantsClass03.bindpolicychange)).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}
