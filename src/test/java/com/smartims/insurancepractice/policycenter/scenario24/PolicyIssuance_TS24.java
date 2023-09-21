package com.smartims.insurancepractice.policycenter.scenario24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;
import com.smartims.insurancepractice.policycenter.scenario25.SeleniumToExcel_TS25;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyIssuance_TS24 {
	AccountCreationVO avo = new AccountCreationVO();
	PolicyIssuanceVO pvo = new PolicyIssuanceVO();
	SeleniumToExcel_TS24 seleniumToExcel = new SeleniumToExcel_TS24();

	public void policyCreation(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		driver.findElement(By.xpath(ConstantsClassPC.accountsTab)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.newSubmission)).click();
		driver.findElement(By.xpath(ConstantsClassPC.defaultEffectiveDate)).clear();
		pvo.setDefaultEffectiveDate(ExcelUtils_TS24.getCellValueByLabel("defaultEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.defaultEffectiveDate)).sendKeys(pvo.getDefaultEffectiveDate());
		driver.findElement(By.xpath(ConstantsClassPC.newSubmissionScreen)).click();
		pvo.setOfferingsSelection(ExcelUtils_TS24.getCellValueByLabel("offeringsSelection"));
		driver.findElement(By.xpath(ConstantsClassPC.OfferingsScreen)).sendKeys(pvo.getOfferingsSelection());
		driver.findElement(By.xpath(ConstantsClassPC.next)).click();
		pvo.setIsApplicantCurrentlyInsured(ExcelUtils_TS24.getCellValueByLabel("isApplicantCurrentlyInsured"));
		driver.findElement(By.xpath(ConstantsClassPC.qualificationsScreen))
				.sendKeys(pvo.getIsApplicantCurrentlyInsured());
		driver.findElement(By.xpath(ConstantsClassPC.next1)).click();
		pvo.setTermType(ExcelUtils_TS24.getCellValueByLabel("termType"));
		driver.findElement(By.xpath(ConstantsClassPC.termType)).sendKeys(pvo.getTermType());
		driver.findElement(By.xpath(ConstantsClassPC.toDriversScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.addDriver)).click();
		driver.findElement(By.xpath(ConstantsClassPC.newDriverOption)).click();
		pvo.setDriver1Firstname(ExcelUtils_TS24.getCellValueByLabel("driver1Firstname"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1Firstname)).sendKeys(pvo.getDriver1Firstname());
		pvo.setDriver1Lastname(ExcelUtils_TS24.getCellValueByLabel("driver1Lastname"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1Lastname)).sendKeys(pvo.getDriver1Lastname());
		pvo.setDriver1dateOfBirth(ExcelUtils_TS24.getCellValueByLabel("driver1dateOfBirth"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1dateOfBirth)).sendKeys(pvo.getDriver1dateOfBirth());
		pvo.setDriver1Address1(ExcelUtils_TS24.getCellValueByLabel("driver1Address1"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1Address1)).sendKeys(pvo.getDriver1Address1());
		pvo.setDriver1City(ExcelUtils_TS24.getCellValueByLabel("driver1City"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1City)).sendKeys(pvo.getDriver1City());
		pvo.setDriver1State(ExcelUtils_TS24.getCellValueByLabel("driver1State"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1State)).sendKeys(pvo.getDriver1State());

		pvo.setDriver1ZIPCode(ExcelUtils_TS24.getCellValueByLabel("driver1ZIPCode"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1ZIPCode)).sendKeys(pvo.getDriver1ZIPCode());

		pvo.setDriver1AdressType(ExcelUtils_TS24.getCellValueByLabel("driver1AdressType"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1AdressType)).sendKeys(pvo.getDriver1AdressType());

		pvo.setDriver1LicenseNumber(ExcelUtils_TS24.getCellValueByLabel("driver1LicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1LicenseNumber)).sendKeys(pvo.getDriver1LicenseNumber());
		pvo.setDriver1LicenseState(ExcelUtils_TS24.getCellValueByLabel("driver1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1LicenseState)).sendKeys(pvo.getDriver1LicenseState());
		driver.findElement(By.xpath(ConstantsClassPC.newDriver1Ok)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toRoles)).click();
		pvo.setDriver1YearFirstLicensed(ExcelUtils_TS24.getCellValueByLabel("driver1YearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC.driver1YearFirstLicensed))
				.sendKeys(pvo.getDriver1YearFirstLicensed());
		pvo.setDriver1NumberOfAccidentsPolicyLevel(
				ExcelUtils_TS24.getCellValueByLabel("driver1NumberOfAccidentsPolicyLevel"));
		Select roles = new Select(driver.findElement(By.xpath(ConstantsClassPC.driver1NumberOfAccidentsPolicyLevel)));
		roles.selectByValue(pvo.getDriver1NumberOfAccidentsPolicyLevel());
		pvo.setDriver1NumberOfAccidentsAccountLevel(
				ExcelUtils_TS24.getCellValueByLabel("driver1NumberOfAccidentsAccountLevel"));
		Select roles2 = new Select(driver.findElement(By.xpath(ConstantsClassPC.driver1NumberOfAccidentsAccountLevel)));
		roles2.selectByValue(pvo.getDriver1NumberOfAccidentsAccountLevel());
		pvo.setDriver1NumberOfViolationsPolicyLevel(
				ExcelUtils_TS24.getCellValueByLabel("driver1NumberOfViolationsPolicyLevel"));
		Select roles3 = new Select(driver.findElement(By.xpath(ConstantsClassPC.driver1NumberOfViolationsPolicyLevel)));
		roles3.selectByValue(pvo.getDriver1NumberOfViolationsPolicyLevel());

		pvo.setDriver1NumberOfViolationsAccountLevel(
				ExcelUtils_TS24.getCellValueByLabel("driver1NumberOfViolationsAccountLevel"));
		Select roles4 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.driver1numberOfViolationsAccountLevel)));
		roles4.selectByValue(pvo.getDriver1NumberOfViolationsAccountLevel());
		Thread.sleep(100);
		driver.findElement(By.xpath(ConstantsClassPC.toVehiclesScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAdd)).click();
		pvo.setVehicle1Type(ExcelUtils_TS24.getCellValueByLabel("vehicle1Type"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleType)).sendKeys(pvo.getVehicle1Type());
		pvo.setVehicle1VIN(ExcelUtils_TS24.getCellValueByLabel("vehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleVIN)).sendKeys(pvo.getVehicle1VIN());
		pvo.setVehicle1LicenseState(ExcelUtils_TS24.getCellValueByLabel("vehicle1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleLicenseState)).sendKeys(pvo.getVehicle1LicenseState());
		pvo.setVehicle1GaragedAt(ExcelUtils_TS24.getCellValueByLabel("vehicle1GaragedAt"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleGaragedAt)).sendKeys(pvo.getVehicle1GaragedAt());
		driver.findElement(By.id(ConstantsClassPC.assignDriver)).click();
		pvo.setVehicle1Driver1Assignment(ExcelUtils_TS24.getCellValueByLabel("vehicle1Driver1Assignment"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverAssignment))
				.sendKeys(pvo.getVehicle1Driver1Assignment());
		pvo.setVehicle1Driver1Percentage(ExcelUtils_TS24.getCellValueByLabel("vehicle1Driver1Percentage"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverPercentage)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverPercentage))
				.sendKeys(pvo.getVehicle1Driver1Percentage());
		pvo.setVehicle1CostNew(ExcelUtils_TS24.getCellValueByLabel("vehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleCostNew)).sendKeys(pvo.getVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.addVehicleAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.existingAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.existingAIselect)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPerson)).click();
		pvo.setVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS24.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPersonIntrestType))
				.sendKeys(pvo.getVehicle1AIExisingPersonIntrestType());

		driver.findElement(By.xpath(ConstantsClassPC.vehiclesDetails)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAdd)).click();
		pvo.setVehicle1Type(ExcelUtils_TS24.getCellValueByLabel("vehicle2Type"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleType)).sendKeys(pvo.getVehicle1Type());
		pvo.setVehicle1VIN(ExcelUtils_TS24.getCellValueByLabel("vehicle2VIN"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleVIN)).sendKeys(pvo.getVehicle1VIN());
		pvo.setVehicle1LicenseState(ExcelUtils_TS24.getCellValueByLabel("vehicle2LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleLicenseState)).sendKeys(pvo.getVehicle1LicenseState());
		pvo.setVehicle1GaragedAt(ExcelUtils_TS24.getCellValueByLabel("vehicle2GaragedAt"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleGaragedAt)).sendKeys(pvo.getVehicle1GaragedAt());
		driver.findElement(By.id(ConstantsClassPC.assignDriver)).click();
		pvo.setVehicle1Driver1Assignment(ExcelUtils_TS24.getCellValueByLabel("vehicle2Driver1Assignment"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverAssignment))
				.sendKeys(pvo.getVehicle1Driver1Assignment());
		pvo.setVehicle1Driver1Percentage(ExcelUtils_TS24.getCellValueByLabel("vehicle1Driver1Percentage"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverPercentage)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverPercentage))
				.sendKeys(pvo.getVehicle1Driver1Percentage());
		pvo.setVehicle1CostNew(ExcelUtils_TS24.getCellValueByLabel("vehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleCostNew)).sendKeys(pvo.getVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.addVehicleAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.existingAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.existingAIselect)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPerson)).click();
		pvo.setVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS24.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPersonIntrestType))
				.sendKeys(pvo.getVehicle1AIExisingPersonIntrestType());

		driver.findElement(By.xpath(ConstantsClassPC.addVehicleAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.existingAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.existingAIselect)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPerson)).click();
		pvo.setVehicle2AIExisingPersonIntrestType2(
				ExcelUtils_TS24.getCellValueByLabel("vehicle2AIExisingPersonIntrestType2"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPersonIntrestType2))
				.sendKeys(pvo.getVehicle2AIExisingPersonIntrestType2());
		driver.findElement(By.xpath(ConstantsClassPC.quoteAtVehicleScreen)).click();
		seleniumToExcel.premium(driver, "PolicyIssuanceTS24");

		driver.findElement(By.id(ConstantsClassPC.policyBindOptions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
