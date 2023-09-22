package com.smartims.insurancepractice.policycenter.scenario07;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;
import com.smartims.insurancepractice.policycenter.scenario06.SeleniumToExcel_TS06;

import PolicyCenterTransactions.ConstantsClassPC;
import PolicyCenterTransactions.ConstantsClassPC_TS07;

public class PolicyIssuance_TS07 {

	public void policyCreation(ChromeDriver driver, Actions actions) throws IOException {

		PolicyIssuanceVO pvo = new PolicyIssuanceVO();
		SeleniumToExcel_TS07 seleniumToExcel = new SeleniumToExcel_TS07();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.newSubmission)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.newSubmissionScreen)).click();
		pvo.setOfferingsSelection(ExcelUtils_TS07.getCellValueByLabel("offeringsSelection"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.OfferingsScreen)).sendKeys(pvo.getOfferingsSelection());
		driver.findElement(By.xpath(ConstantsClassPC_TS07.next)).click();
		pvo.setIsApplicantCurrentlyInsured(ExcelUtils_TS07.getCellValueByLabel("isApplicantCurrentlyInsured"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.next1)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.secondaryaNamedInsured)).click();

		pvo.setSecondaryNamedInsured(ExcelUtils_TS07.getCellValueByLabel("secondaryNamedInsured"));
		System.out.println(pvo.getSecondaryNamedInsured());
		driver.findElement(By.xpath(ConstantsClassPC_TS07.secondaryaNamedInsuredNewPerson))
				.sendKeys(pvo.getSecondaryNamedInsured());
		pvo.setSNIFirstname(ExcelUtils_TS07.getCellValueByLabel("SNIFirstname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNIFirstname)).sendKeys(pvo.getSNIFirstname());
		pvo.setSNILastname(ExcelUtils_TS07.getCellValueByLabel("SNILastname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNILastname)).sendKeys(pvo.getSNILastname());
		pvo.setSNIDOB(ExcelUtils_TS07.getCellValueByLabel("SNIDOB"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNIDOB)).clear();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNIDOB)).sendKeys(pvo.getSNIDOB());
		pvo.setSNIAddressLine1(ExcelUtils_TS07.getCellValueByLabel("SNIAddressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNIAddressLine1)).sendKeys(pvo.getSNIAddressLine1());
		pvo.setSNIZipcode(ExcelUtils_TS07.getCellValueByLabel("SNIZipcode"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNIZipcode)).sendKeys(pvo.getSNIZipcode());
		pvo.setSNIAddressType(ExcelUtils_TS07.getCellValueByLabel("SNIAddressType"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNIAddressType)).sendKeys(pvo.getSNIAddressType());
		pvo.setSNILicenseNumber(ExcelUtils_TS07.getCellValueByLabel("SNILicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNILicenseNumber)).sendKeys(pvo.getSNILicenseNumber());
		pvo.setSNILicenseState(ExcelUtils_TS07.getCellValueByLabel("SNILicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNILicenseState)).sendKeys(pvo.getSNILicenseState());
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNIOK)).click();

		pvo.setTermType(ExcelUtils_TS07.getCellValueByLabel("termType"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.termType)).sendKeys(pvo.getTermType());
		driver.findElement(By.xpath(ConstantsClassPC_TS07.toDriversScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.addDriver)).click();
		WebElement ExistingDriver = driver.findElement(By.xpath(ConstantsClassPC_TS07.existingDriverType));
		actions.moveToElement(ExistingDriver).perform();
		WebElement ExistingDriver1 = driver.findElement(By.xpath(ConstantsClassPC.driver1));
		actions.moveToElement(ExistingDriver1).perform();
		ExistingDriver1.click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.toRoles)).click();

		pvo.setExistingDriverYearFirstLicensed(ExcelUtils_TS07.getCellValueByLabel("existingDriverYearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC.existingDriverYearFirstLicensed1)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.existingDriverYearFirstLicensed1))
				.sendKeys(pvo.getExistingDriverYearFirstLicensed());
		pvo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS07.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		Select roles = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfAccidentsPolicyLevel1)));
		roles.selectByValue(pvo.getExistingDriverNumberOfAccidentsPolicyLevel());
		pvo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS07.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		Select roles2 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfAccidentsAccountLevel1)));
		roles2.selectByValue(pvo.getExistingDriverNumberOfAccidentsAccountLevel());
		pvo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS07.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		Select roles3 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfViolationsPolicyLevel1)));
		roles3.selectByValue(pvo.getExistingDriverNumberOfViolationsPolicyLevel());
		pvo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS07.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));
		Select roles4 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfViolationsAccountLevel1)));
		roles4.selectByValue(pvo.getExistingDriverNumberOfViolationsAccountLevel());

		driver.findElement(By.xpath(ConstantsClassPC_TS07.toVehiclesScreen)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1AddOrRemove)).click();
		pvo.setVehicle1VIN(ExcelUtils_TS07.getCellValueByLabel("vehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1VIN)).sendKeys(pvo.getVehicle1VIN());

		pvo.setVehicle1LicenseState(ExcelUtils_TS07.getCellValueByLabel("vehicle1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1LicenseState))
				.sendKeys(pvo.getVehicle1LicenseState());

		pvo.setVehicle1LicenseState(ExcelUtils_TS07.getCellValueByLabel("vehicle1LicenseState"));

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1LicenseState))
				.sendKeys(pvo.getVehicle1LicenseState());

		pvo.setVehicle1GaragedAt(ExcelUtils_TS07.getCellValueByLabel("vehicle1GaragedAt"));

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1GaragedAt)).sendKeys(pvo.getVehicle1GaragedAt());

		driver.findElement(By.id(ConstantsClassPC_TS07.AssignDriver)).click();

		pvo.setVehicle1Driver1Assignment(ExcelUtils_TS07.getCellValueByLabel("vehicle1Driver1Assignment"));

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1Driver1Assignment))
				.sendKeys(pvo.getVehicle1Driver1Assignment());

		pvo.setVehicle1Driver1Percentage(ExcelUtils_TS07.getCellValueByLabel("vehicle1Driver1Percentage"));

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1Driver1Percentage)).clear();
		System.out.println(pvo.getVehicle1Driver1Percentage());

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1Driver1Percentage))
				.sendKeys(pvo.getVehicle1Driver1Percentage());

		pvo.setVehicle1CostNew(ExcelUtils_TS07.getCellValueByLabel("vehicle1CostNew"));

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1CostNew)).sendKeys(pvo.getVehicle1CostNew());

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1AI)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.addVehicle1AI)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.existingAI)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.existingAIselect)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.toPACoverages)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1Collison)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.toRiskAnalysIsScreen)).click();
		seleniumToExcel.premium(driver, "PolicyIssuance_TS07");

		driver.findElement(By.id(ConstantsClassPC_TS07.policyBindOptions)).click();

		driver.findElement(By.id("SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions"))

				.click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.issue)).click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		driver.findElement(By

				.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]"))

				.click();

	}
}