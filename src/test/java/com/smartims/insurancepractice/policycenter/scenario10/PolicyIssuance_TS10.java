package com.smartims.insurancepractice.policycenter.scenario10;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.Constants;
import PolicyCenterTransactions.ConstantsClass18;
import PolicyCenterTransactions.ConstantsClassPC;
import PolicyCenterTransactions.ConstantsClassPC_TS10;

public class PolicyIssuance_TS10 {

	void submission22(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		PolicyIssuanceVO svo = new PolicyIssuanceVO();

		svo.setExistingAccountNumber(ExcelUtils_TS10.getCellValueByLabel("accountNumber"));
		svo.setQuoteType(ExcelUtils_TS10.getCellValueByLabel("quoteType"));
		svo.setDefaultBaseState(ExcelUtils_TS10.getCellValueByLabel("defaultBaseState"));
		svo.setDefaultEffectiveDate(ExcelUtils_TS10.getCellValueByLabel("defaultEffectiveDate"));

		svo.setOfferingsSelection(ExcelUtils_TS10.getCellValueByLabel("offeringsSelection"));
		svo.setIsApplicantCurrentlyInsured(ExcelUtils_TS10.getCellValueByLabel("isApplicantCurrentlyInsured"));

		svo.setEffectiveDate(ExcelUtils_TS10.getCellValueByLabel("effectiveDate"));

		svo.setSNIFirstname(ExcelUtils_TS10.getCellValueByLabel("SNIFirstname"));
		svo.setSNILastname(ExcelUtils_TS10.getCellValueByLabel("SNILastname"));
		svo.setSNIAddressLine1(ExcelUtils_TS10.getCellValueByLabel("SNIAddressLine1"));
		svo.setSNIState(ExcelUtils_TS10.getCellValueByLabel("SNIState"));
		svo.setSNIZipcode(ExcelUtils_TS10.getCellValueByLabel("SNIZipcode"));
		svo.setSNIAddressType(ExcelUtils_TS10.getCellValueByLabel("SNIAddressType"));

		svo.setANIFirstname(ExcelUtils_TS10.getCellValueByLabel("ANIFirstname"));

		svo.setExistingDriverdateOfBirth(ExcelUtils_TS10.getCellValueByLabel("existingDriverdateOfBirth"));
		svo.setExistingDriverLicenseState(ExcelUtils_TS10.getCellValueByLabel("existingDriverLicenseState"));
		svo.setExistingDriverLicenseNumber(ExcelUtils_TS10.getCellValueByLabel("existingDriverLicenseNumber"));
		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS10.getCellValueByLabel("existingDriverYearFirstLicensed"));
		svo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS10.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		svo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS10.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		svo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS10.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		svo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS10.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));

		svo.setDriver1Firstname(ExcelUtils_TS10.getCellValueByLabel("driver1Firstname"));
		svo.setDriver1Lastname(ExcelUtils_TS10.getCellValueByLabel("driver1Lastname"));
		svo.setDriver1dateOfBirth(ExcelUtils_TS10.getCellValueByLabel("driver1dateOfBirth"));
		svo.setDriver1Address1(ExcelUtils_TS10.getCellValueByLabel("driver1Address1"));
		svo.setDriver1ZIPCode(ExcelUtils_TS10.getCellValueByLabel("driver1ZIPCode"));
		svo.setDriver1AdressType(ExcelUtils_TS10.getCellValueByLabel("driver1AdressType"));
		svo.setDriver1LicenseNumber(ExcelUtils_TS10.getCellValueByLabel("driver1LicenseNumber"));
		svo.setDriver1LicenseState(ExcelUtils_TS10.getCellValueByLabel("driver1LicenseState"));
		svo.setDriver1YearFirstLicensed(ExcelUtils_TS10.getCellValueByLabel("driver1YearFirstLicensed"));

		svo.setVehicle1VIN(ExcelUtils_TS10.getCellValueByLabel("vehicle1VIN"));
		svo.setVehicle1LicenseState(ExcelUtils_TS10.getCellValueByLabel("vehicle1LicenseState"));
		svo.setVehicle1Driver1Percentage(ExcelUtils_TS10.getCellValueByLabel("vehicle1Driver1Percentage"));
		svo.setVehicle1CostNew(ExcelUtils_TS10.getCellValueByLabel("vehicle1CostNew"));

		svo.setVehicle2VIN(ExcelUtils_TS10.getCellValueByLabel("vehicle2VIN"));
		svo.setVehicle2LicenseState(ExcelUtils_TS10.getCellValueByLabel("vehicle2LicenseState"));
		svo.setVehicle2Driver1Percentage(ExcelUtils_TS10.getCellValueByLabel("vehicle2Driver1Percentage"));
		svo.setVehicle2CostNew(ExcelUtils_TS10.getCellValueByLabel("vehicle2CostNew"));

		svo.setVehicle1AINewPersonIntrestType(
				ExcelUtils_TS10.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));

		Thread.sleep(1000);

		driver.findElement(By.xpath(ConstantsClass18.newSubmissionButton)).click();

		driver.findElement(By.xpath(ConstantsClass18.selectionOfLOB)).click();
		driver.findElement(By.xpath(ConstantsClass18.offeringsSelecion)).click();
		Select select1 = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringTypeSelection)));
		select1.selectByVisibleText(svo.getOfferingsSelection());
		driver.findElement(By.id(ConstantsClass18.offeringsScreenNextButton)).click();
		Select select = new Select(driver.findElement(By.name(ConstantsClass18.Istheapplicantcurrentlyinsured)));
		select.selectByVisibleText(svo.getIsApplicantCurrentlyInsured());
		driver.findElement(By.id(ConstantsClass18.QualificationScreenNextButton)).click();

		boolean value1 = svo.getSNIFirstname().isBlank();
		if (value1) {

		} else {
			System.out.println(svo.getSNIFirstname());
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
			driver.findElement(By.xpath(ConstantsClass18.sniScreenUpdateButton)).click();

		}

		// Additional named insured

		boolean firstNameValue = svo.getANIFirstname().isBlank();
		if (firstNameValue) {

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

		Select select2 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType")));
		select2.selectByIndex(1);
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate_dateIcon"))
				.click();
		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// ----------------------Adding a Existing Driver--------------------

		WebElement addExistingDriver = driver.findElement(By.xpath(ConstantsClass18.addDriver));
		actions.moveToElement(addExistingDriver).perform();
		addExistingDriver.click();

		WebElement existingDriver = driver.findElement(By.xpath(ConstantsClass18.existingDriverLabelSelection));
		actions.moveToElement(existingDriver).perform();

		WebElement existingDriver1 = driver.findElement(By.xpath(ConstantsClass18.existingDriver1Selection1));
		actions.moveToElement(existingDriver1).perform();
		existingDriver1.click();
		driver.findElement(By.xpath(ConstantsClass18.existingDriverDateOfBirth))
				.sendKeys(svo.getExistingDriverdateOfBirth());
		driver.findElement(By.xpath(ConstantsClass18.existingDriverLicenseNumber))
				.sendKeys(svo.getExistingDriverLicenseNumber(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass18.existingDriverLicenseState))
				.sendKeys(svo.getExistingDriverLicenseState());

		driver.findElement(By.xpath(ConstantsClass18.existingDriverRolesTab)).click();
		driver.findElement(By.xpath(ConstantsClass18.existingDriverYearFirstLicensed)).clear();
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
		WebElement addNewDriver = driver.findElement(By.xpath(ConstantsClassPC_TS10.addDriver));
		actions.moveToElement(addNewDriver).perform();
		addNewDriver.click();
		driver.findElement(By.xpath(ConstantsClassPC_TS10.NewDriverOption)).click();

		// ----- New Driver Screen-----
		driver.findElement(By.name(ConstantsClass18.newdriverFirstName)).sendKeys(svo.getDriver1Firstname(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass18.newdriverLastName)).sendKeys(svo.getDriver1Lastname(), Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.newDriverdob)).sendKeys(svo.getDriver1dateOfBirth());
		driver.findElement(By.xpath(ConstantsClass18.newDriveraddressLine1)).sendKeys(svo.getDriver1Address1());
		driver.findElement(By.xpath(ConstantsClass18.newDriverzipcode)).sendKeys(svo.getDriver1ZIPCode(), Keys.TAB,
				Keys.ENTER, Keys.TAB);

		Select addTypeNewDriver = new Select(driver.findElement(By.xpath(ConstantsClass18.newDriveraddressType)));
		addTypeNewDriver.selectByVisibleText(svo.getDriver1AdressType());

		driver.findElement(By.xpath(ConstantsClass18.newDriverlicenseNumber)).sendKeys(svo.getDriver1LicenseNumber(),
				Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass18.newDriverliscenceState)).sendKeys(svo.getDriver1LicenseState());
		driver.findElement(By.xpath(ConstantsClass18.newDriverupdateButton)).click();

		// Click on Roles Tab
		WebElement roles = driver.findElement(By.xpath(ConstantsClass18.newDriverRolesTab));
		actions.moveToElement(roles).perform();
		roles.click();
		driver.findElement(By.name(ConstantsClass18.newDriverlicensedYear)).sendKeys(svo.getDriver1YearFirstLicensed(),
				Keys.TAB);
		// Accidents or Violation Summary
		Select select7 = new Select(driver.findElement(By.xpath(ConstantsClass18.newDriverNumOfAccidentsPolicyLevel)));
		select7.selectByValue("0");
		Select select8 = new Select(driver.findElement(By.xpath(ConstantsClass18.newDriverNumOfAccidentsAccountLevel)));
		select8.selectByValue("0");
		Select select9 = new Select(driver.findElement(By.xpath(ConstantsClass18.newDriverNumOfViolationsPolicyLevel)));
		select9.selectByValue("0");
		Select select10 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.newDriverNumOfViolationsAccountLevel)));
		select10.selectByValue("0");
		driver.findElement(By.id("SubmissionWizard-Next")).click();

//		--------------- Vehicle 1 ---------------

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

//		--------------- Vehicle 2 ---------------

		driver.findElement(By.xpath(ConstantsClass18.addVehicle)).click();

		Select vehicleType = new Select(driver.findElement(By.xpath(ConstantsClass18.vehicleType)));
		vehicleType.selectByValue("auto");

		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClass18.vinNumber)).sendKeys(svo.getVehicle2VIN());
		driver.findElement(By.xpath(ConstantsClass18.licenseStateVehicleScreen2))
				.sendKeys(svo.getVehicle2LicenseState());

		driver.findElement(By.xpath(ConstantsClass18.assignVehicleDriver2)).click();

		WebElement addDriver2 = driver.findElement(By.xpath(ConstantsClass18.selectDriverToVehicle2));
		actions.moveToElement(addDriver2).perform();
		addDriver2.click();

		WebElement vehicleCost2 = driver.findElement(By.xpath(ConstantsClass18.vehicle2CostNew));
		actions.moveToElement(vehicleCost2).perform();
		vehicleCost2.sendKeys(svo.getVehicle2CostNew());

		driver.findElement(By.xpath(ConstantsClass18.additionalInterestCardTab)).click();
		driver.findElement(By.xpath(ConstantsClass18.additionalInterestTabAddContactButton)).click();

		WebElement otherContactButton = driver
				.findElement(By.xpath(ConstantsClass18.additionalInterestTabAddOtherContact));
		actions.moveToElement(otherContactButton).perform();

		WebElement otherContact = driver.findElement(By.xpath(ConstantsClass18.additionalInterestAddContact));
		actions.moveToElement(otherContact).perform();
		otherContact.click();
		Thread.sleep(1000);
		svo.setVehicle2AIExisingPersonIntrestType(
				ExcelUtils_TS10.getCellValueByLabel("vehicle2AIExisingPersonIntrestType"));
		System.out.println(svo.getVehicle2AIExisingPersonIntrestType());
		driver.findElement(By.xpath(ConstantsClassPC.vehicle2AIExisingPersonIntrestType))
				.sendKeys(svo.getVehicle2AIExisingPersonIntrestType());
		driver.findElement(By.id(ConstantsClass18.submissionWizardNext)).click();

		WebElement checkBox = driver.findElement(By.name(ConstantsClass18.collisonCovCheckBox));
		actions.moveToElement(checkBox).perform();
		checkBox.click();

		driver.findElement(By.id(ConstantsClass18.submissionWizardNext5)).click();
		driver.findElement(By.xpath(ConstantsClass18.riskAnalysisScreen)).click();
		driver.findElement(By.id(ConstantsClass18.submissionWizardNext6)).click();
		driver.findElement(By.id(ConstantsClass18.quoteButton)).click();
		Thread.sleep(1000);
		driver.findElement(By.id(ConstantsClass18.bindButton)).click();
		WebElement bindOptions = driver.findElement(By.xpath(ConstantsClass18.bindOnlyOption));
		actions.moveToElement(bindOptions).perform();
		bindOptions.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();

		// Click on New Transaction for Policy Issuance
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.issuePolicyOption)).click();
		driver.findElement(By.id(ConstantsClass18.quoteButtonOfferingsScreen)).click();
		driver.findElement(By.id(ConstantsClass18.issueButton)).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath(ConstantsClass18.viewPolicySubmission)).click();

	}
}
