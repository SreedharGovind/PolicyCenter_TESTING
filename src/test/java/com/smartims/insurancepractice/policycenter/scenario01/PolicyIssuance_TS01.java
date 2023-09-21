package com.smartims.insurancepractice.policycenter.scenario01;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;
import com.smartims.insurancepractice.policycenter.scenario02.SeleniumToExcel_TS02;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyIssuance_TS01 {

	public void policyCreation(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		SeleniumToExcel_TS01 seleniumToExcel = new SeleniumToExcel_TS01();

		PolicyIssuanceVO pvo = new PolicyIssuanceVO();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.newSubmission)).click();
		driver.findElement(By.xpath(ConstantsClassPC.defaultEffectiveDate)).clear();
		pvo.setDefaultEffectiveDate(ExcelUtils_TS01.getCellValueByLabel("defaultEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.defaultEffectiveDate)).sendKeys(pvo.getDefaultEffectiveDate());
		driver.findElement(By.xpath(ConstantsClassPC.newSubmissionScreen)).click();
		pvo.setOfferingsSelection(ExcelUtils_TS01.getCellValueByLabel("offeringsSelection"));
		driver.findElement(By.xpath(ConstantsClassPC.OfferingsScreen)).sendKeys(pvo.getOfferingsSelection());
		driver.findElement(By.xpath(ConstantsClassPC.next)).click();
		pvo.setIsApplicantCurrentlyInsured(ExcelUtils_TS01.getCellValueByLabel("isApplicantCurrentlyInsured"));
		driver.findElement(By.xpath(ConstantsClassPC.qualificationsScreen))
				.sendKeys(pvo.getIsApplicantCurrentlyInsured());
		driver.findElement(By.xpath(ConstantsClassPC.next1)).click();
		driver.findElement(By.xpath(ConstantsClassPC.secondaryaNamedInsured)).click();
		pvo.setSecondaryNamedInsured(ExcelUtils_TS01.getCellValueByLabel("secondaryNamedInsured"));
		driver.findElement(By.xpath(ConstantsClassPC.secondaryaNamedInsuredNewPerson))
				.sendKeys(pvo.getSecondaryNamedInsured());
		pvo.setSNIFirstname(ExcelUtils_TS01.getCellValueByLabel("SNIFirstname"));
		driver.findElement(By.xpath(ConstantsClassPC.SNIFirstname)).sendKeys(pvo.getSNIFirstname());
		pvo.setSNILastname(ExcelUtils_TS01.getCellValueByLabel("SNILastname"));
		driver.findElement(By.xpath(ConstantsClassPC.SNILastname)).sendKeys(pvo.getSNILastname());
		pvo.setSNIDOB(ExcelUtils_TS01.getCellValueByLabel("SNIDOB"));
		driver.findElement(By.xpath(ConstantsClassPC.SNIDOB)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.SNIDOB)).sendKeys(pvo.getSNIDOB());
		pvo.setSNIAddressLine1(ExcelUtils_TS01.getCellValueByLabel("SNIAddressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC.SNIAddressLine1)).sendKeys(pvo.getSNIAddressLine1());
		pvo.setSNIZipcode(ExcelUtils_TS01.getCellValueByLabel("SNIZipcode"));
		driver.findElement(By.xpath(ConstantsClassPC.SNIZipcode)).sendKeys(pvo.getSNIZipcode());
		pvo.setSNIState(ExcelUtils_TS01.getCellValueByLabel("SNIState"));
		driver.findElement(By.xpath(ConstantsClassPC.SNIState)).sendKeys(pvo.getSNIState());
		pvo.setSNIAddressType(ExcelUtils_TS01.getCellValueByLabel("SNIAddressType"));
		driver.findElement(By.xpath(ConstantsClassPC.SNIAddressType)).sendKeys(pvo.getSNIAddressType());
		pvo.setSNILicenseNumber(ExcelUtils_TS01.getCellValueByLabel("SNILicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC.SNILicenseNumber)).sendKeys(pvo.getSNILicenseNumber());
		pvo.setSNILicenseState(ExcelUtils_TS01.getCellValueByLabel("SNILicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.SNILicenseState)).sendKeys(pvo.getSNILicenseState());
		driver.findElement(By.xpath(ConstantsClassPC.SNIOK)).click();
		pvo.setTermType(ExcelUtils_TS01.getCellValueByLabel("termType"));
		driver.findElement(By.xpath(ConstantsClassPC.termType)).sendKeys(pvo.getTermType());
		driver.findElement(By.xpath(ConstantsClassPC.toDriversScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.addDriver)).click();
		WebElement ExistingDriver = driver.findElement(By.xpath(ConstantsClassPC.existingDriverType));
		actions.moveToElement(ExistingDriver).perform();
//		WebElement ExistingDriver1 = driver.findElement(By.xpath(ConstantsClassPC.driver1));
//		actions.moveToElement(ExistingDriver1).perform();
//		ExistingDriver1.click();
		WebElement ExistingDriver2 = driver.findElement(By.xpath(ConstantsClassPC.existingDriverName));
		actions.moveToElement(ExistingDriver2).perform();
		ExistingDriver2.click();
		driver.findElement(By.xpath(ConstantsClassPC.toRoles)).click();
		pvo.setExistingDriverYearFirstLicensed(ExcelUtils_TS01.getCellValueByLabel("existingDriverYearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC.existingDriverYearFirstLicensed1)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.existingDriverYearFirstLicensed1))
				.sendKeys(pvo.getExistingDriverYearFirstLicensed());
		pvo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS01.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		Select roles = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfAccidentsPolicyLevel1)));
		roles.selectByValue(pvo.getExistingDriverNumberOfAccidentsPolicyLevel());
		pvo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS01.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		Select roles2 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfAccidentsAccountLevel1)));
		roles2.selectByValue(pvo.getExistingDriverNumberOfAccidentsAccountLevel());
		pvo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS01.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		Select roles3 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfViolationsPolicyLevel1)));
		roles3.selectByValue(pvo.getExistingDriverNumberOfViolationsPolicyLevel());
		pvo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS01.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));
		Select roles4 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfViolationsAccountLevel1)));
		roles4.selectByValue(pvo.getExistingDriverNumberOfViolationsAccountLevel());
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.toVehiclesScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAdd)).click();
		pvo.setVehicle1Type(ExcelUtils_TS01.getCellValueByLabel("vehicle1Type"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleType)).sendKeys(pvo.getVehicle1Type());
		pvo.setVehicle1VIN(ExcelUtils_TS01.getCellValueByLabel("vehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleVIN)).sendKeys(pvo.getVehicle1VIN());
		pvo.setVehicle1LicenseState(ExcelUtils_TS01.getCellValueByLabel("vehicle1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleLicenseState)).sendKeys(pvo.getVehicle1LicenseState());
		pvo.setVehicle1GaragedAt(ExcelUtils_TS01.getCellValueByLabel("vehicle1GaragedAt"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleGaragedAt)).sendKeys(pvo.getVehicle1GaragedAt());
		driver.findElement(By.id(ConstantsClassPC.assignDriver)).click();
		pvo.setVehicle1Driver1Assignment(ExcelUtils_TS01.getCellValueByLabel("vehicle1Driver1Assignment"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverAssignment))
				.sendKeys(pvo.getVehicle1Driver1Assignment());
		pvo.setVehicle1Driver1Percentage(ExcelUtils_TS01.getCellValueByLabel("vehicle1Driver1Percentage"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverPercentage)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleDriverPercentage))
				.sendKeys(pvo.getVehicle1Driver1Percentage());
		pvo.setVehicle1CostNew(ExcelUtils_TS01.getCellValueByLabel("vehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleCostNew)).sendKeys(pvo.getVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.addVehicleAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.existingAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.existingAIselect)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPerson)).click();
		pvo.setVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS01.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPersonIntrestType))
				.sendKeys(pvo.getVehicle1AIExisingPersonIntrestType());
		driver.findElement(By.xpath(ConstantsClassPC.toPACoverages)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleCollison)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toRiskAnalysIsScreen)).click();
		driver.findElement(By.id(ConstantsClassPC.policyQuote)).click();
		seleniumToExcel.premium(driver, "PolicyIssuanceTS01");
		driver.findElement(By.id(ConstantsClassPC.policyBindOptions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}
}