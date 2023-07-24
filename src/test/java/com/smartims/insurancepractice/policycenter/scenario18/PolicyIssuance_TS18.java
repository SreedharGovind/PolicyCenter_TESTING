package com.smartims.insurancepractice.policycenter.scenario18;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;
import com.smartims.insurancepractice.policycenter.scenario22.ExcelUtils_TS22;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyIssuance_TS18 {

	void submission18(ChromeDriver driver, Actions actions) throws IOException {

		PolicyIssuanceVO svo = new PolicyIssuanceVO();

		svo.setQuoteType(ExcelUtils_TS18.getCellValueByLabel("quoteType"));
		svo.setDefaultBaseState(ExcelUtils_TS18.getCellValueByLabel("defaultBaseState"));
		svo.setDefaultEffectiveDate(ExcelUtils_TS18.getCellValueByLabel("defaultEffectiveDate"));

		svo.setOfferingsSelection(ExcelUtils_TS18.getCellValueByLabel("offeringsSelection"));
		svo.setIsApplicantCurrentlyInsured(ExcelUtils_TS22.getCellValueByLabel("isApplicantCurrentlyInsured"));

		svo.setSNIFirstname(ExcelUtils_TS18.getCellValueByLabel("SNIFirstname"));
		svo.setSNILastname(ExcelUtils_TS18.getCellValueByLabel("SNILastname"));
		svo.setSNIAddressLine1(ExcelUtils_TS18.getCellValueByLabel("SNIAddressLine1"));
		svo.setSNIState(ExcelUtils_TS18.getCellValueByLabel("SNIState"));
		svo.setSNIZipcode(ExcelUtils_TS18.getCellValueByLabel("SNIZipcode"));
		svo.setSNIAddressType(ExcelUtils_TS18.getCellValueByLabel("SNIAddressType"));

		svo.setANIFirstname(ExcelUtils_TS18.getCellValueByLabel("ANIFirstname"));
		svo.setANILastname(ExcelUtils_TS18.getCellValueByLabel("ANILastname"));
		svo.setANIAddressLine1(ExcelUtils_TS18.getCellValueByLabel("ANIAddressLine1"));
		svo.setANIState(ExcelUtils_TS18.getCellValueByLabel("ANIState"));
		svo.setANIZIPcode(ExcelUtils_TS18.getCellValueByLabel("ANIZipcode"));
		svo.setANIAddressType(ExcelUtils_TS18.getCellValueByLabel("ANIAddressType"));

		svo.setDriver1Firstname(ExcelUtils_TS18.getCellValueByLabel("driver1Firstname"));
		svo.setDriver1Lastname(ExcelUtils_TS18.getCellValueByLabel("driver1Lastname"));
		svo.setDriver1dateOfBirth(ExcelUtils_TS18.getCellValueByLabel("driver1dateOfBirth"));
		svo.setDriver1Address1(ExcelUtils_TS18.getCellValueByLabel("driver1Address1"));
		svo.setDriver1ZIPCode(ExcelUtils_TS18.getCellValueByLabel("driver1ZIPCode"));
		svo.setDriver1LicenseNumber(ExcelUtils_TS18.getCellValueByLabel("driver1LicenseNumber"));
		svo.setDriver1LicenseState(ExcelUtils_TS18.getCellValueByLabel("driver1LicenseState"));
		svo.setDriver1YearFirstLicensed(ExcelUtils_TS18.getCellValueByLabel("driver1YearFirstLicensed"));

		svo.setExistingDriverFirstname(ExcelUtils_TS18.getCellValueByLabel("existingDriverFirstname"));
		svo.setExistingDriverdateOfBirth(ExcelUtils_TS18.getCellValueByLabel("existingDriverdateOfBirth"));
		svo.setExistingDriverLicenseNumber(ExcelUtils_TS18.getCellValueByLabel("existingDriverLicenseNumber"));
		svo.setExistingDriverLicenseState(ExcelUtils_TS18.getCellValueByLabel("existingDriverLicenseState"));
		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS18.getCellValueByLabel("existingDriverYearFirstLicensed"));

		svo.setExistingDriver2Firstname(ExcelUtils_TS18.getCellValueByLabel("existingDriver2Firstname"));
		svo.setExistingDriver2dateOfBirth(ExcelUtils_TS18.getCellValueByLabel("existingDriver2DateOfBirth"));
		svo.setExistingDriver2LicenseNumber(ExcelUtils_TS18.getCellValueByLabel("existingDriver2LicenseNumber"));
		svo.setExistingDriver2LicenseState(ExcelUtils_TS18.getCellValueByLabel("existingDriver2LicenseState"));
		svo.setExistingDriver2YearFirstLicensed(
				ExcelUtils_TS18.getCellValueByLabel("existingDriver2YearFirstLicensed"));

		svo.setVehicle1VIN(ExcelUtils_TS18.getCellValueByLabel("vehicle1VIN"));
		svo.setVehicle1LicenseState(ExcelUtils_TS18.getCellValueByLabel("vehicle1LicenseState"));
		svo.setVehicle1Driver1Percentage(ExcelUtils_TS18.getCellValueByLabel("vehicle1Driver1Percentage"));
		svo.setVehicle1CostNew(ExcelUtils_TS18.getCellValueByLabel("vehicle1CostNew"));
		svo.setVehicle1Comprehensive(ExcelUtils_TS18.getCellValueByLabel("vehicle1Comprehensive"));

		driver.findElement(By.xpath(ConstantsClass18.newSubmissionButton)).click();

		driver.findElement(By.xpath(ConstantsClass18.selectionOfLOB)).click();
		driver.findElement(By.xpath(ConstantsClass18.offeringsSelecion)).click();
		Select select1 = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringTypeSelection)));
		select1.selectByVisibleText(svo.getOfferingsSelection());
		System.out.println(svo.getOfferingsSelection());
		//		select1.selectByIndex(2);
		driver.findElement(By.id(ConstantsClass18.offeringsScreenNextButton)).click();
		Select select = new Select(driver.findElement(By.name(ConstantsClass18.Istheapplicantcurrentlyinsured)));
		select.selectByVisibleText(svo.getIsApplicantCurrentlyInsured());
		driver.findElement(By.id(ConstantsClass18.QualificationScreenNextButton)).click();

		boolean value = svo.getSNIFirstname().isBlank();
		if (value) {

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

		boolean value1 = svo.getANIFirstname().isBlank();
		System.out.println("firstname");
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

		driver.findElement(By.id("SubmissionWizard-Next")).click();

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

		// Click on Roles Tab
		driver.findElement(By.xpath(ConstantsClass18.existingDriverRolesTab)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-student_0\"]"))
		.click();
		WebElement yearlicensed = driver.findElement(By.xpath(ConstantsClass18.existingDriverYearFirstLicensed));
		actions.moveToElement(yearlicensed).perform();
		yearlicensed.sendKeys(svo.getExistingDriverYearFirstLicensed(), Keys.TAB);
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-gooddriverdiscount_0\"]"))
		.click();

		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-ApplicableGoodDriverDiscount_0\"]"))
		.click();
		// Accidents or Violation Summary
		Select select3 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriverNumOfAccidentsPolicyLevel)));
		select3.selectByValue("0");
		Select select4 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriverNumOfAccidentsAccountLevel)));
		select4.selectByValue("0");
		Select select5 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriverNumOfViolationsPolicyLevel)));
		select5.selectByValue("0");
		Select select6 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriverNumOfViolationsAccountLevel)));
		select6.selectByValue("0");
		////	driver.findElement(By.id("SubmissionWizard-Next")).click();

		//	-------------------	Existing Driver 2 ----------------

		driver.findElement(By.xpath(ConstantsClass18.existingDriverContactDetailsButton)).click();

		WebElement addExistingDriver2 = driver.findElement(By.xpath(ConstantsClass18.addDriver));
		actions.moveToElement(addExistingDriver2).perform();
		addExistingDriver2.click();

		WebElement existingDriver2 = driver.findElement(By.xpath(ConstantsClass18.existingDriverLabelSelection));
		actions.moveToElement(existingDriver2).perform();

		WebElement existingDriver12 = driver.findElement(By.xpath(ConstantsClass18.existingDriver2Selection));
		actions.moveToElement(existingDriver12).perform();
		existingDriver12.click();
		driver.findElement(By.xpath(ConstantsClass18.existingDriver2DateOfBirth))
		.sendKeys("01/02/1990");
		driver.findElement(By.xpath(ConstantsClass18.existingDriver2LicenseNumber))
		.sendKeys(svo.getExistingDriver2LicenseNumber(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass18.existingDriver2LicenseState))
		.sendKeys(svo.getExistingDriver2LicenseState());
		// Click on Roles Tab
		driver.findElement(By.xpath(ConstantsClass18.existingDriver2RolesTab)).click();
		driver.findElement(By.xpath(ConstantsClass18.existingDriver2YearFirstLicensed))
		.sendKeys(svo.getExistingDriver2YearFirstLicensed(), Keys.TAB);
		// Accidents or Violation Summary
		Select select01 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriver2NumOfAccidentsPolicyLevel)));
		select01.selectByValue("0");
		Select select02 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriver2NumOfAccidentsAccountLevel)));
		select02.selectByValue("0");
		Select select03 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriver2NumOfViolationsPolicyLevel)));
		select03.selectByValue("0");
		Select select04 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.existingDriver2NumOfViolationsAccountLevel)));
		select04.selectByValue("0");

		driver.findElement(By.id("SubmissionWizard-Next")).click();
		//		}

		// ----------------------Adding a New Driver----------------------

		boolean newDriverValue = svo.getDriver1Firstname().isBlank();

		if (newDriverValue) {

		} else {

			driver.findElement(By.xpath(ConstantsClass18.addDriver)).click();

			WebElement addNewDriver = driver.findElement(By.xpath(ConstantsClass18.addNewDriver));
			actions.moveToElement(addNewDriver).perform();
			addNewDriver.click();

			// ----- New Driver Screen-----
			driver.findElement(By.name(ConstantsClass18.newdriverFirstName)).sendKeys(svo.getDriver1Firstname(),
					Keys.TAB);
			driver.findElement(By.xpath(ConstantsClass18.newdriverLastName)).sendKeys(svo.getDriver1Lastname(),
					Keys.ENTER);
			driver.findElement(By.xpath(ConstantsClass18.newDriverdob)).sendKeys(svo.getDriver1dateOfBirth());
			driver.findElement(By.xpath(ConstantsClass18.newDriveraddressLine1)).sendKeys(svo.getDriver1Address1());
			driver.findElement(By.xpath(ConstantsClass18.newDriverzipcode)).sendKeys(svo.getDriver1ZIPCode(), Keys.TAB,
					Keys.ENTER, Keys.TAB);
			Select addTypeNewDriver = new Select(driver.findElement(By.xpath(ConstantsClass18.newDriveraddressType)));
			addTypeNewDriver.selectByIndex(3);
			driver.findElement(By.xpath(ConstantsClass18.newDriverlicenseNumber))
			.sendKeys(svo.getDriver1LicenseNumber(), Keys.TAB);
			driver.findElement(By.xpath(ConstantsClass18.newDriverliscenceState))
			.sendKeys(svo.getDriver1LicenseState());
			driver.findElement(By.xpath(ConstantsClass18.newDriverupdateButton)).click();

			// Click on Roles Tab
			WebElement roles = driver.findElement(By.xpath(ConstantsClass18.newDriverRolesTab));
			actions.moveToElement(roles).perform();
			roles.click();
			driver.findElement(By.name(ConstantsClass18.newDriverlicensedYear))
			.sendKeys(svo.getDriver1YearFirstLicensed(), Keys.TAB);
			// Accidents or Violation Summary
			Select select7 = new Select(
					driver.findElement(By.xpath(ConstantsClass18.newDriverNumOfAccidentsPolicyLevel)));
			select7.selectByValue("0");
			Select select8 = new Select(
					driver.findElement(By.xpath(ConstantsClass18.newDriverNumOfAccidentsAccountLevel)));
			select8.selectByValue("0");
			Select select9 = new Select(
					driver.findElement(By.xpath(ConstantsClass18.newDriverNumOfViolationsPolicyLevel)));
			select9.selectByValue("0");
			Select select10 = new Select(
					driver.findElement(By.xpath(ConstantsClass18.newDriverNumOfViolationsAccountLevel)));
			select10.selectByValue("0");
			driver.findElement(By.id("SubmissionWizard-Next")).click();

		}

		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// -------------------Vehicles Screen, Adding a Vehicle-------------------

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
		driver.findElement(By.id("SubmissionWizard-Next")).click();
		driver.findElement(By.id("SubmissionWizard-Next")).click();
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[7]/div[1]/div[1]/div")).click();
		driver.findElement(By.id("SubmissionWizard-Next")).click();
		driver.findElement(By.id(
				"SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"))
		.click();
		driver.findElement(By.id("SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions"))
		.click();
		WebElement bindOptions = driver.findElement(
				By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[8]/div[3]/div[1]/div"));
		actions.moveToElement(bindOptions).perform();
		bindOptions.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.findElement(By
				.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]"))
		.click();

		// Click on New Transaction for Policy Issuance

		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.issuePolicyOption)).click();
		driver.findElement(By.id(ConstantsClass18.quoteButtonOfferingsScreen)).click();
		driver.findElement(By.id(ConstantsClass18.issueButton)).click();

		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		driver.findElement(By.xpath(ConstantsClass18.viewPolicySubmission)).click();

	}

}
