package com.smartims.insurancepractice.policycenter.scenario26;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange2_TS26 {
	void policychange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyChangeVO cvo = new PolicyChangeVO();
		PolicyIssuanceVO pvo = new PolicyIssuanceVO();
		SeleniumToExcel_TS26 seleniumToExcel = new SeleniumToExcel_TS26();

		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.changePolicy)).click();
		cvo.setPolicyChangeEffectiveDate(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeEffectiveDate))
				.sendKeys(cvo.getPolicyChangeEffectiveDate());
		cvo.setPolicyChangeDescription(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDescription))
				.sendKeys(cvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyOfferings)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyChangeDriver)).click();
		cvo.setPolicyChangeDriverFirstname(
				ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSExistingDriver1FirstName"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriverFirstname)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriverFirstname))
				.sendKeys(cvo.getPolicyChangeDriverFirstname());
		cvo.setPolicyChangeExistingDriverLastname(
				ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSExistingDriver1LastName"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeExistingDriverLastname)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeExistingDriverLastname))
				.sendKeys(cvo.getPolicyChangeExistingDriverLastname());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Add)).click();
		driver.findElement(By.xpath(ConstantsClassPC.newDriverOption)).click();
		pvo.setDriver1Firstname(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3Firstname"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1Firstname)).sendKeys(pvo.getDriver1Firstname());
		pvo.setDriver1Lastname(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3Lastname"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1Lastname)).sendKeys(pvo.getDriver1Lastname());
		pvo.setDriver1dateOfBirth(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3dateOfBirth"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1dateOfBirth)).sendKeys(pvo.getDriver1dateOfBirth());
		pvo.setDriver1Address1(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3Address1"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1Address1)).sendKeys(pvo.getDriver1Address1());
		pvo.setDriver1City(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3City"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1City)).sendKeys(pvo.getDriver1City());
		pvo.setDriver1State(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3State"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1State)).sendKeys(pvo.getDriver1State());
		pvo.setDriver1ZIPCode(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3ZIPCode"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1ZIPCode)).sendKeys(pvo.getDriver1ZIPCode());
		pvo.setDriver1AdressType(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3AdressType"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1AdressType)).sendKeys(pvo.getDriver1AdressType());
		pvo.setDriver1LicenseNumber(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3LicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1LicenseNumber)).sendKeys(pvo.getDriver1LicenseNumber());
		pvo.setDriver1LicenseState(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1LicenseState)).sendKeys(pvo.getDriver1LicenseState());
		driver.findElement(By.xpath(ConstantsClassPC.newDriver1Ok)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toRoles)).click();
		pvo.setDriver1YearFirstLicensed(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3YearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1YearFirstLicensed))
				.sendKeys(pvo.getDriver1YearFirstLicensed());
		pvo.setDriver1NumberOfAccidentsPolicyLevel(
				ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3NumberOfAccidentsPolicyLevel"));
		Select roles = new Select(driver.findElement(By.xpath(ConstantsClassPC.driver1NumberOfAccidentsPolicyLevel)));
		roles.selectByValue(pvo.getDriver1NumberOfAccidentsPolicyLevel());
		pvo.setDriver1NumberOfAccidentsAccountLevel(
				ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3NumberOfAccidentsAccountLevel"));
		Select roles2 = new Select(driver.findElement(By.xpath(ConstantsClassPC.driver1NumberOfAccidentsAccountLevel)));
		roles2.selectByValue(pvo.getDriver1NumberOfAccidentsAccountLevel());
		pvo.setDriver1NumberOfViolationsPolicyLevel(
				ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3NumberOfViolationsPolicyLevel"));
		Select roles3 = new Select(driver.findElement(By.xpath(ConstantsClassPC.driver1NumberOfViolationsPolicyLevel)));
		roles3.selectByValue(pvo.getDriver1NumberOfViolationsPolicyLevel());
		pvo.setDriver1NumberOfViolationsAccountLevel(
				ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSDriver3NumberOfViolationsAccountLevel"));
		Select roles4 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.driver1numberOfViolationsAccountLevel)));
		roles4.selectByValue(pvo.getDriver1NumberOfViolationsAccountLevel());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDrivertovehicle)).click();
		pvo.setVehicle1CostNew(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSExistingVehicleCostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleCostNew)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleCostNew)).sendKeys(pvo.getVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAdd)).click();
		pvo.setVehicle1VIN(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSVehicle3VIN"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleVIN)).sendKeys(pvo.getVehicle1VIN());
		pvo.setVehicle1LicenseState(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSVehicle3LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleLicenseState)).sendKeys(pvo.getVehicle1LicenseState());
		pvo.setVehicle1GaragedAt(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSVehicle3GaragedAt"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleGaragedAt)).sendKeys(pvo.getVehicle1GaragedAt());
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeAssignDriver)).click();
		pvo.setVehicle1Driver1Assignment(
				ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSVehicle3Driver1Assignment"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Driver1Assignment)).click();
		pvo.setVehicle1Driver1Percentage(
				ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSVehicle3Driver1Percentage"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverPercentage)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverPercentage))
				.sendKeys(pvo.getVehicle1Driver1Percentage());
		pvo.setVehicle1CostNew(ExcelUtils_TS26.getCellValueByLabel("policyChangeOOSVehicle3CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleCostNew)).sendKeys(pvo.getVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicleToPACoverages)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();
		seleniumToExcel.premium(driver, "PolicyChange2TS26");
		driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
