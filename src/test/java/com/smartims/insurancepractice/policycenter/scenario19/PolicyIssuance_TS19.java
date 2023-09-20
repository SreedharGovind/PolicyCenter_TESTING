package com.smartims.insurancepractice.policycenter.scenario19;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyIssuance_TS19 {

	void submission19(ChromeDriver driver, Actions actions) throws IOException {

		PolicyIssuanceVO svo = new PolicyIssuanceVO();
		SeleniumToExcel_TS19 seleniumToExcel = new SeleniumToExcel_TS19();

		svo.setQuoteType(ExcelUtils_TS19.getCellValueByLabel("QuoteType"));
		svo.setDefaultBaseState(ExcelUtils_TS19.getCellValueByLabel("DefaultBaseState"));
		svo.setDefaultEffectiveDate(ExcelUtils_TS19.getCellValueByLabel("DefaultEffectiveDate"));

		svo.setOfferingsSelection(ExcelUtils_TS19.getCellValueByLabel("offeringsSelection"));
		svo.setIsApplicantCurrentlyInsured(ExcelUtils_TS19.getCellValueByLabel("isApplicantCurrentlyInsured"));

		svo.setSNIFirstname(ExcelUtils_TS19.getCellValueByLabel("SNIFirstname"));
		svo.setSNILastname(ExcelUtils_TS19.getCellValueByLabel("SNILastname"));
		svo.setSNIAddressLine1(ExcelUtils_TS19.getCellValueByLabel("SNIAddressLine1"));
		svo.setSNIState(ExcelUtils_TS19.getCellValueByLabel("SNIState"));
		svo.setSNIZipcode(ExcelUtils_TS19.getCellValueByLabel("SNIZipcode"));
		svo.setSNIAddressType(ExcelUtils_TS19.getCellValueByLabel("SNIAddressType"));
		svo.setSNILicenseNumber(ExcelUtils_TS19.getCellValueByLabel("SNILicenseNumber"));
		svo.setSNILicenseState(ExcelUtils_TS19.getCellValueByLabel("SNILicenseState"));

		svo.setANIFirstname(ExcelUtils_TS19.getCellValueByLabel("ANIFirstname"));
		svo.setANILastname(ExcelUtils_TS19.getCellValueByLabel("ANILastname"));
		svo.setANIAddressLine1(ExcelUtils_TS19.getCellValueByLabel("ANIAddressLine1"));
		svo.setANIState(ExcelUtils_TS19.getCellValueByLabel("ANIState"));
		svo.setANIZIPcode(ExcelUtils_TS19.getCellValueByLabel("ANIZIPcode"));
		svo.setANIAddressType(ExcelUtils_TS19.getCellValueByLabel("ANIAddressType"));
		svo.setANILicenseNumber(ExcelUtils_TS19.getCellValueByLabel("ANILicenseNumber"));
		svo.setANILicenseState(ExcelUtils_TS19.getCellValueByLabel("ANILicenseState"));

		svo.setDriver1Firstname(ExcelUtils_TS19.getCellValueByLabel("driver1Firstname"));
		svo.setDriver1Lastname(ExcelUtils_TS19.getCellValueByLabel("driver1Lastname"));
		svo.setDriver1dateOfBirth(ExcelUtils_TS19.getCellValueByLabel("driver1dateOfBirth"));
		svo.setDriver1Address1(ExcelUtils_TS19.getCellValueByLabel("driver1Address1"));
		svo.setDriver1ZIPCode(ExcelUtils_TS19.getCellValueByLabel("driver1ZIPCode"));
		svo.setDriver1LicenseNumber(ExcelUtils_TS19.getCellValueByLabel("driver1LicenseNumber"));
		svo.setDriver1LicenseState(ExcelUtils_TS19.getCellValueByLabel("driver1LicenseState"));
		svo.setDriver1YearFirstLicensed(ExcelUtils_TS19.getCellValueByLabel("driver1YearFirstLicensed"));

		svo.setExistingDriverFirstname(ExcelUtils_TS19.getCellValueByLabel("existingDriverFirstname"));
		svo.setExistingDriverdateOfBirth(ExcelUtils_TS19.getCellValueByLabel("existingDriverdateOfBirth"));
		svo.setExistingDriverLicenseNumber(ExcelUtils_TS19.getCellValueByLabel("existingDriverLicenseNumber"));
		svo.setExistingDriverLicenseState(ExcelUtils_TS19.getCellValueByLabel("existingDriverLicenseState"));
		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS19.getCellValueByLabel("existingDriverYearFirstLicensed"));

		svo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS19.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		svo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS19.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		svo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS19.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		svo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS19.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));

		svo.setVehicle1VIN(ExcelUtils_TS19.getCellValueByLabel("vehicle1VIN"));
		svo.setVehicle1LicenseState(ExcelUtils_TS19.getCellValueByLabel("vehicle1LicenseState"));
		svo.setVehicle1Driver1Percentage(ExcelUtils_TS19.getCellValueByLabel("vehicle1Driver1Percentage"));
		svo.setVehicle1CostNew(ExcelUtils_TS19.getCellValueByLabel("vehicle1CostNew"));
		svo.setVehicle1AINewPersonIntrestType(ExcelUtils_TS19.getCellValueByLabel("vehicle1AINewPersonIntrestType"));

		svo.setVehicle1Collision(ExcelUtils_TS19.getCellValueByLabel("vehicle1Collision"));
		svo.setVehicle1Comprehensive(ExcelUtils_TS19.getCellValueByLabel("vehicle1Comprehensive"));

		driver.findElement(By.xpath(ConstantsClass18.newSubmissionButton)).click();

		driver.findElement(By.xpath(ConstantsClass18.selectionOfLOB)).click();
		driver.findElement(By.xpath(ConstantsClass18.offeringsSelecion)).click();
		Select select1 = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringTypeSelection)));
		select1.selectByVisibleText(svo.getOfferingsSelection());
		driver.findElement(By.id(ConstantsClass18.offeringsScreenNextButton)).click();
		Select select = new Select(driver.findElement(By.name(ConstantsClass18.Istheapplicantcurrentlyinsured)));
		select.selectByVisibleText(svo.getIsApplicantCurrentlyInsured());
		driver.findElement(By.id(ConstantsClass18.QualificationScreenNextButton)).click();

		boolean value = svo.getSNIFirstname().isBlank();
		if (value) {

		} else {
			driver.findElement(By.xpath(ConstantsClass18.sniMenuButton)).click();
			WebElement newPerson = driver.findElement(By.xpath(ConstantsClass18.selectSNIPerson));
			actions.moveToElement(newPerson).perform();
			newPerson.click();
			driver.findElement(By.xpath(ConstantsClass18.sniFirstname)).sendKeys(svo.getSNIFirstname());
			driver.findElement(By.xpath(ConstantsClass18.sniLastname)).sendKeys(svo.getSNILastname());
			driver.findElement(By.xpath(ConstantsClass18.sniAddressline1)).sendKeys(svo.getSNIAddressLine1());

			driver.findElement(By.xpath(ConstantsClass18.sniZipcode)).sendKeys(svo.getSNIZipcode(), Keys.TAB,
					Keys.ENTER, Keys.TAB);
			Select addTypeSecIns = new Select(driver.findElement(By.xpath(ConstantsClass18.sniAddressType)));
			addTypeSecIns.selectByIndex(3);
			driver.findElement(By.xpath(ConstantsClass18.snilicenseNumber)).sendKeys(svo.getSNILicenseNumber());
			driver.findElement(By.xpath(ConstantsClass18.snilicenseState)).sendKeys(svo.getSNILicenseState());
			driver.findElement(By.xpath(ConstantsClass18.sniScreenUpdateButton)).click();

		}

		// Additional named insured

		boolean value1 = svo.getANIFirstname().isBlank();

		if (value1) {

		} else {
			driver.findElement(By.xpath(ConstantsClass18.aniMenuButton)).click();
			WebElement newPerson1 = driver.findElement(By.xpath(ConstantsClass18.selectANIPerson));
			actions.moveToElement(newPerson1).perform();
			newPerson1.click();
			driver.findElement(By.xpath(ConstantsClass18.aniFirstname)).sendKeys(svo.getANIFirstname());
			driver.findElement(By.xpath(ConstantsClass18.aniLastname)).sendKeys(svo.getANILastname());
			driver.findElement(By.xpath(ConstantsClass18.aniAddressline1)).sendKeys(svo.getANIAddressLine1());
			driver.findElement(By.xpath(ConstantsClass18.aniZipcode)).sendKeys(svo.getANIZIPcode(), Keys.TAB,
					Keys.ENTER, Keys.TAB);
			Select addressTypeAddIns = new Select(driver.findElement(By.xpath(ConstantsClass18.aniAddressType)));
			addressTypeAddIns.selectByIndex(3);
			WebElement updateButton = driver.findElement(By.xpath(ConstantsClass18.aniScreenUpdateButton));
			actions.moveToElement(updateButton).perform();
			updateButton.click();
		}

		// Selection of Term Type
		Select select2 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType")));
		select2.selectByIndex(1);
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate_dateIcon"))
				.click();
		driver.findElement(By.id(ConstantsClass18.submissionWizardNext)).click();

		// ----------------------Adding a Existing Driver--------------------
		WebElement addExistingDriver = driver.findElement(By.xpath(ConstantsClass18.addDriver));
		actions.moveToElement(addExistingDriver).perform();
		addExistingDriver.click();
		WebElement existingDriver = driver.findElement(By.xpath(ConstantsClass18.existingDriverLabelSelection));
		actions.moveToElement(existingDriver).perform();
		WebElement existingDriver1 = driver.findElement(By.xpath(ConstantsClass18.existingDriver1Selection));
		actions.moveToElement(existingDriver1).perform();
		existingDriver1.click();
		driver.findElement(By.xpath(ConstantsClass18.existingDriverDateOfBirth))
				.sendKeys(svo.getExistingDriverdateOfBirth());
		driver.findElement(By.xpath(ConstantsClass18.existingDriverLicenseNumber))
				.sendKeys(svo.getExistingDriverLicenseNumber(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass18.existingDriverLicenseState))
				.sendKeys(svo.getExistingDriverLicenseState());
		driver.findElement(By.xpath(ConstantsClass18.existingDriverRolesTab)).click();
		driver.findElement(By.xpath(ConstantsClass18.existingDriverYearFirstLicensed))
				.sendKeys(svo.getExistingDriverYearFirstLicensed(), Keys.TAB);
		// Accidents or Violation Summary
		Select select3 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriverNumOfAccidentsPolicyLevel)));
		select3.selectByVisibleText(svo.getExistingDriverNumberOfAccidentsPolicyLevel());
		Select select4 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriverNumOfAccidentsAccountLevel)));
		select4.selectByVisibleText(svo.getExistingDriverNumberOfAccidentsAccountLevel());
		Select select5 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriverNumOfViolationsPolicyLevel)));
		select5.selectByVisibleText(svo.getExistingDriverNumberOfViolationsPolicyLevel());
		Select select6 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriverNumOfViolationsAccountLevel)));
		select6.selectByVisibleText(svo.getExistingDriverNumberOfViolationsAccountLevel());
		driver.findElement(By.id(ConstantsClass18.submissionWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.addVehicle)).click();
		driver.findElement(By.xpath(ConstantsClass18.vinNumber)).sendKeys(svo.getVehicle1VIN());
		driver.findElement(By.xpath(ConstantsClass18.licenseStateVehicleScreen))
				.sendKeys(svo.getVehicle1LicenseState());
		driver.findElement(By.xpath(ConstantsClass18.assignVehicleDriver)).click();
		WebElement addDriver = driver.findElement(By.xpath(ConstantsClass18.selectDriverToVehicle));
		actions.moveToElement(addDriver).perform();
		addDriver.click();
		WebElement vehicleCost = driver.findElement(By.xpath(ConstantsClass18.vehicleCostNew));
		actions.moveToElement(vehicleCost).perform();
		vehicleCost.sendKeys(svo.getVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClass18.additionalInterestCardTab)).click();
		driver.findElement(By.xpath(ConstantsClass18.additionalInterestTabAddContactButton)).click();
		WebElement otherContactButton = driver
				.findElement(By.xpath(ConstantsClass18.additionalInterestTabAddOtherContact));
		actions.moveToElement(otherContactButton).perform();
		WebElement otherContact = driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact-1-acctContact\"]/div"));
		actions.moveToElement(otherContact).perform();
		otherContact.click();
		Select additionalInterestType = new Select(
				driver.findElement(By.xpath(ConstantsClass18.additionalInterestType)));
		additionalInterestType.selectByValue("LESSOR");
		driver.findElement(By.id(ConstantsClass18.submissionWizardNext)).click();
		WebElement checkBox = driver.findElement(By.name(ConstantsClass18.comprehensiveCovCheckBox));
		actions.moveToElement(checkBox).perform();
		checkBox.click();
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-AdditionalCoveragesTab\"]/div"))
				.click();
		driver.findElement(By.id(ConstantsClass18.submissionWizardNext5)).click();
		driver.findElement(By.xpath(ConstantsClass18.riskAnalysisScreen)).click();
		driver.findElement(By.id(ConstantsClass18.submissionWizardNext6)).click();
		driver.findElement(By.id(ConstantsClass18.quoteButton)).click();
		driver.findElement(By.id(ConstantsClass18.bindButton)).click();
		WebElement bindOptions = driver.findElement(By.xpath(ConstantsClass18.bindOnlyOption));
		actions.moveToElement(bindOptions).perform();
		bindOptions.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath(ConstantsClass18.viewBindPolicySubmission)).click();

		// Click on New Transaction for Policy Issuance
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.issuePolicyOption)).click();
		driver.findElement(By.id(ConstantsClass18.quoteButtonOfferingsScreen)).click();
		seleniumToExcel.premium(driver, "PolicyIssuanceTS19");
		driver.findElement(By.id(ConstantsClass18.issueButton)).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.xpath(ConstantsClass18.viewPolicySubmission)).click();

	}

}
