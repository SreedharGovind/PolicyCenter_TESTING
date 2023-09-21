 package com.smartims.insurancepractice.policycenter.scenario01;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange_TS01 {
	void policychange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyChangeVO cvo = new PolicyChangeVO();
		SeleniumToExcel_TS01 seleniumToExcel = new SeleniumToExcel_TS01();

		driver.findElement(By.xpath(ConstantsClassPC.transactions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.changePolicy)).click();
		cvo.setPolicyChangeEffectiveDate(ExcelUtils_TS01.getCellValueByLabel("policyChangeEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeEffectiveDate))
				.sendKeys(cvo.getPolicyChangeEffectiveDate());
		cvo.setPolicyChangeDescription(ExcelUtils_TS01.getCellValueByLabel("policyChangeDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDescription))
				.sendKeys(cvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyOfferings)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyChangeDriver)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Add)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Type)).click();
		cvo.setPolicyChangeDriver1Firstname(ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1Firstname"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Firstname))
				.sendKeys(cvo.getPolicyChangeDriver1Firstname());
		cvo.setPolicyChangeDriver1Lastname(ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1Lastname"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Lastname))
				.sendKeys(cvo.getPolicyChangeDriver1Lastname());
		cvo.setPolicyChangeDriver1dateOfBirth(ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1dateOfBirth"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1dateOfBirth))
				.sendKeys(cvo.getPolicyChangeDriver1dateOfBirth());
		cvo.setPolicyChangeDriver1Address1(ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1Address1"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Address1))
				.sendKeys(cvo.getPolicyChangeDriver1Address1());
		cvo.setPolicyChangeDriver1State(ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1State"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1State))
				.sendKeys(cvo.getPolicyChangeDriver1State());
		cvo.setPolicyChangeDriver1ZIPCode(ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1ZIPCode"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1ZIPCode))
				.sendKeys(cvo.getPolicyChangeDriver1ZIPCode());
		cvo.setPolicyChangeDriver1AdressType(ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1AdressType"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1AdressType))
				.sendKeys(cvo.getPolicyChangeDriver1AdressType());
		cvo.setPolicyChangeDriver1LicenseNumber(
				ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1LicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1LicenseNumber))
				.sendKeys(cvo.getPolicyChangeDriver1LicenseNumber());
		cvo.setPolicyChangeDriver1LicenseState(ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1LicenseState))
				.sendKeys(cvo.getPolicyChangeDriver1LicenseState());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Ok)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Roles)).click();
		cvo.setPolicyChangeDriver1YearFirstLicensed(
				ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1YearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1YearFirstLicensed))
				.sendKeys(cvo.getPolicyChangeDriver1YearFirstLicensed());
		cvo.setPolicyChangeDriver1NumberOfAccidentsPolicyLevel(
				ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1NumberOfAccidentsPolicyLevel"));
		Select roles = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1NumberOfAccidentsPolicyLevel)));
		roles.selectByValue(cvo.getPolicyChangeDriver1NumberOfAccidentsPolicyLevel());
		cvo.setPolicyChangeDriver1NumberOfAccidentsAccountLevel(
				ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1NumberOfAccidentsAccountLevel"));
		Select roles2 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1NumberOfAccidentsAccountLevel)));
		roles2.selectByValue(cvo.getPolicyChangeDriver1NumberOfAccidentsAccountLevel());
		cvo.setPolicyChangeDriver1NumberOfViolationsPolicyLevel(
				ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1NumberOfViolationsPolicyLevel"));
		Select roles3 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1NumberOfViolationsPolicyLevel)));
		roles3.selectByValue(cvo.getPolicyChangeDriver1NumberOfViolationsPolicyLevel());
		cvo.setPolicyChangeDriver1NumberOfViolationsAccountLevel(
				ExcelUtils_TS01.getCellValueByLabel("policyChangeDriver1NumberOfViolationsAccountLevel"));
		Select roles4 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1NumberOfViolationsAccountLevel)));
		roles4.selectByValue(cvo.getPolicyChangeDriver1NumberOfViolationsAccountLevel());
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDrivertovehicleScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Add)).click();
		cvo.setPolicyChangeVehicle1Type(ExcelUtils_TS01.getCellValueByLabel("policyChangeVehicle1Type"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Type))
				.sendKeys(cvo.getPolicyChangeVehicle1Type());
		cvo.setPolicyChangeVehicle1VIN(ExcelUtils_TS01.getCellValueByLabel("policyChangeVehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1VIN))
				.sendKeys(cvo.getPolicyChangeVehicle1VIN());
		cvo.setPolicyChangeVehicle1LicenseState(
				ExcelUtils_TS01.getCellValueByLabel("policyChangeVehicle1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1LicenseState))
				.sendKeys(cvo.getPolicyChangeVehicle1LicenseState());
		cvo.setPolicyChangeVehicle1GaragedAt(ExcelUtils_TS01.getCellValueByLabel("policyChangeVehicle1GaragedAt"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1GaragedAt))
				.sendKeys(cvo.getPolicyChangeVehicle1GaragedAt());
		cvo.setPolicyChangeVehicle1CostNew(ExcelUtils_TS01.getCellValueByLabel("policyChangeVehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1CostNew))
				.sendKeys(cvo.getPolicyChangeVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeAssignVehicle1Driver1)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Driver2Assignment)).click();
		cvo.setPolicyChangeVehicle1Driver1Percentage(
				ExcelUtils_TS01.getCellValueByLabel("policyChangeVehicle1Driver1Percentage"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangevehicle1Driver1Percentage)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangevehicle1Driver1Percentage))
				.sendKeys(cvo.getPolicyChangeVehicle1Driver1Percentage());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();
		seleniumToExcel.premium(driver, "PolicyChangeTS01");
	driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
