package com.smartims.insurancepractice.policycenter.scenario14;

import com.smartims.insurancepractice.policycenter.scenario13.SeleniumToExcel_TS13;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;
import com.smartims.insurancepractice.policycenter.scenario13.ExcelUtils_TS13;

import PolicyCenterTransactions.Constants;

public class PolicyIssuance_TS14 {
	void newSubmission(ChromeDriver driver, Actions action) throws Exception {

		PolicyIssuanceVO svo = new PolicyIssuanceVO();
		SeleniumToExcel_TS14 seleniumToExcel = new SeleniumToExcel_TS14();

		// New submission
		driver.findElement(By.xpath(Constants.clickOnNewSubbmission)).click();

		// select the product
		driver.findElement(By.xpath(Constants.selectProduct)).click();

		svo.setOfferingsSelection(ExcelUtils_TS13.getCellValueByLabel("offeringsSelection"));
		svo.setIsApplicantCurrentlyInsured(ExcelUtils_TS13.getCellValueByLabel("isApplicantCurrentlyInsured"));

		svo.setTermType(ExcelUtils_TS14.getCellValueByLabel("termType"));
		svo.setEffectiveDate(ExcelUtils_TS14.getCellValueByLabel("effectiveDate"));
		svo.setWrittenDate(ExcelUtils_TS14.getCellValueByLabel("writtenDate"));

		svo.setExistingDriverdateOfBirth(ExcelUtils_TS14.getCellValueByLabel("existingDriverdateOfBirth"));
		svo.setExistingDriverLicenseNumber(ExcelUtils_TS14.getCellValueByLabel("existingDriverLicenseNumber"));
		svo.setExistingDriverLicenseState(ExcelUtils_TS14.getCellValueByLabel("existingDriverLicenseState"));
		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS14.getCellValueByLabel("existingDriverYearFirstLicensed"));

		svo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS14.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		svo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS14.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		svo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS14.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		svo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS14.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));

		svo.setDriver1Firstname(ExcelUtils_TS14.getCellValueByLabel("driver1Firstname"));
		svo.setDriver1Lastname(ExcelUtils_TS14.getCellValueByLabel("driver1Lastname"));
		svo.setDriver1dateOfBirth(ExcelUtils_TS14.getCellValueByLabel("driver1dateOfBirth"));
		svo.setDriver1Address1(ExcelUtils_TS14.getCellValueByLabel("driver1Address1"));
		svo.setDriver1AdressType(ExcelUtils_TS14.getCellValueByLabel("driver1AdressType"));
		svo.setDriver1ZIPCode(ExcelUtils_TS14.getCellValueByLabel("driver1ZIPCode"));
		svo.setDriver1LicenseNumber(ExcelUtils_TS14.getCellValueByLabel("driver1LicenseNumber"));
		svo.setDriver1LicenseState(ExcelUtils_TS14.getCellValueByLabel("driver1LicenseState"));
		svo.setDriver1YearFirstLicensed(ExcelUtils_TS14.getCellValueByLabel("driver1YearFirstLicensed"));

//		svo.setDriver1numberOfAccidentsPolicyLevel(ExcelUtils14.getCellValueByLabel("driver1numberOfAccidentsPolicyLevel"));
//		svo.setDriver1numberOfAccidentsAccountLevel(ExcelUtils14.getCellValueByLabel("driver1numberOfAccidentsAccountLevel"));
//		svo.setDriver1numberOfViolationsPolicyLevel(ExcelUtils14.getCellValueByLabel("driver1numberOfViolationsPolicyLevel"));
//				svo.setDriver1numberOfAccidentsAccountLevel(ExcelUtils14.getCellValueByLabel("driver1numberOfAccidentsAccountLevel"));svo.setDriver1numberOfViolationsAccountLevel(ExcelUtils14.getCellValueByLabel("driver1numberOfViolationsAccountLevel"));

		svo.setVehicle1VIN(ExcelUtils_TS14.getCellValueByLabel("vehicle1VIN"));
		svo.setVehicle1LicenseState(ExcelUtils_TS14.getCellValueByLabel("vehicle1LicenseState"));
		svo.setVehicle1CostNew(ExcelUtils_TS14.getCellValueByLabel("vehicle1CostNew"));

		svo.setVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS14.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));

		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-OfferingScreen-OfferingSelection\"]/div/div/select"))
				.sendKeys(svo.getOfferingsSelection(), Keys.TAB);

		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// Qualification screen to Yes
		WebElement qulifi = driver.findElement(By.xpath(Constants.qualification));
		qulifi.click();
		// driver.findElement(By.xpath(Constants.QoalificationToYes)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-ChoiceSelectInput_NoPost\"]/div/div/select"))
				.sendKeys(svo.getIsApplicantCurrentlyInsured(), Keys.ENTER);
		// Selecting the Term

		// driver.findElement(By.xpath(Constants.ClickOnAnnual)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType\"]/div/div/select"))
				.sendKeys(svo.getTermType(), Keys.TAB);
//		driver.findElement(By.id("SubmissionWizard-Next")).click();
		// Effective Date
//				driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate")).clear();

		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate_dateIcon"))
				.click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate"))
				.sendKeys(svo.getEffectiveDate(), Keys.ENTER);

//				 Writtendate
		WebElement next = driver.findElement(By.id("SubmissionWizard-Next"));
		action.moveToElement(next).perform();
		next.click();

		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// >>>>>>>>> Add Existing Driver <<<<<<<<<< 
		driver.findElement(By.id(Constants.addDriver)).click();
		WebElement existdriver = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-AddExistingContact"));
		action.moveToElement(existdriver).perform();

//				existdriver.click();		

		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[3]/div[1]/div"))
				.click();
		// existinh driver DOB
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth"))
				.sendKeys(svo.getExistingDriverdateOfBirth(), Keys.ENTER);
		// Exist Driver license
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber"))
				.clear();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber"))
				.sendKeys(svo.getExistingDriverLicenseNumber(), Keys.TAB);
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState\"]/div/div/select"))
				.sendKeys(svo.getExistingDriverLicenseState());

		// Click on Roles Tab 
		driver.findElement(By.xpath(Constants.clickOnRolesTab)).click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed"))
				.clear();

		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed"))
				.sendKeys(svo.getExistingDriverYearFirstLicensed(), Keys.TAB);

		// Accidents or Violation Summary 
		Select select3 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents")));
		select3.selectByValue(svo.getExistingDriverNumberOfAccidentsPolicyLevel());
		Select select4 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-DriverNumberOfAccidents")));
		select4.selectByValue(svo.getExistingDriverNumberOfAccidentsAccountLevel());
		Select select5 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverNumberOfViolations")));
		select5.selectByValue(svo.getExistingDriverNumberOfViolationsPolicyLevel());
		Select select6 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-DriverNumberOfViolations")));
		select6.selectByValue(svo.getExistingDriverNumberOfViolationsAccountLevel());

		// Adding one more Driver

		// Driver screen

//		driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver"))
//				.click();
		WebElement newDriver = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver"));
		action.moveToElement(newDriver).perform();
		newDriver.click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div/div[2]"))
				.click();
		// ----- New Driver Screen----- // Enter the first name 
		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName"))
				.sendKeys(svo.getDriver1Firstname(), Keys.ENTER);

		// Enter the Last name 
		driver.findElement(By.name(Constants.driverLastName)).sendKeys(svo.getDriver1Lastname(), Keys.ENTER);
		// Date of Birth
		driver.findElement(By.xpath(Constants.driverDateOfBirth)).sendKeys(svo.getDriver1dateOfBirth(), Keys.TAB);
		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1"))
				.sendKeys(svo.getDriver1Address1(), Keys.ENTER);
//				driver.findElement(By.name("NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State")).sendKeys("Illinois",Keys.ENTER);
		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode"))
				.sendKeys(svo.getDriver1ZIPCode(), Keys.ENTER);
		driver.findElement(By.xpath(
				"//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType\"]/div/div/select"))
				.sendKeys(svo.getDriver1AdressType(), Keys.TAB, Keys.TAB);
		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber"))
				.sendKeys(svo.getDriver1LicenseNumber(), Keys.ENTER);
		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState"))
				.sendKeys(svo.getDriver1LicenseState(), Keys.ENTER);
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div")).click();

		// click on Roles Tab
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-RolesCardTab\"]/div/div[2]"))
				.click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed"))
				.sendKeys(svo.getDriver1YearFirstLicensed());

		// Accidents or Violation Summary 
		Select select7 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents")));
		select7.selectByValue("0");
		Select select8 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-DriverNumberOfAccidents")));
		select8.selectByValue("0");
		Select select9 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverNumberOfViolations")));
		select9.selectByValue("0");
		Select select10 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-DriverNumberOfViolations")));
		select10.selectByValue("0");

		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// -------------------Vehicles Screen, Adding a Vehicle------------------- 
		driver.findElement(By.id(Constants.addVechile)).click();
		// VIN 
		driver.findElement(By.name(Constants.addVechileVIN)).sendKeys(svo.getVehicle1VIN(), Keys.ENTER, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB);
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-LicenseState_DV"))
				.sendKeys(svo.getVehicle1LicenseState(), Keys.ENTER);

		// Assing driver to vechile
		WebElement assing = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver"));
		action.moveToElement(assing).perform();
		assing.click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[17]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]"))
				.click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV-0-Percentage"))
				.clear();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV-0-Percentage"))
				.sendKeys("100", Keys.TAB);
//				driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV-0-_Checkbox")).click();
		// Giving the cost of vechile
		driver.findElement(By.name(Constants.coStOFVechile)).sendKeys(svo.getVehicle1CostNew());

		// Adding addtional interst
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestCardTab"))
				.click();
//				
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton"))
				.click();
		WebElement addinterset = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact"));
		action.moveToElement(addinterset).perform();
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact-0-acctContact\"]/div"))
				.click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV-0-Type"))
				.sendKeys(svo.getVehicle1AIExisingPersonIntrestType(), Keys.ENTER);

//				driver.findElement(By.id(Constants.submissionWizardNext)).click();

		// -------------------PA Coverage Screen------------------- 

		String coverage = "collision";

		if (coverage != null && coverage.equalsIgnoreCase("Comprehensive")) {
			driver.findElement(By.name(
					"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox"))
					.click();
		} else if (coverage != null && coverage.equalsIgnoreCase("collision")) {
			driver.findElement(By.name(
					"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-1-CoverageInputSet-CovPatternInputGroup-_checkbox"))
					.click();
		} else if (coverage != null && coverage.equalsIgnoreCase("Towing and Labor")) {
			driver.findElement(By.name(
					"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-2-CoverageInputSet-CovPatternInputGroup-_checkbox"))
					.click();

		} else if (coverage != null && coverage.equalsIgnoreCase("Rental Reimbursement")) {
			driver.findElement(By.name(
					"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-3-CoverageInputSet-CovPatternInputGroup-_checkbox"))
					.click();

		}

		driver.findElement(By.id(Constants.submissionWizardNext)).click();

		// ------------------- Risk Analysis Screen------------------- 
		driver.findElement(By.xpath(Constants.rislAnalysis)).click();
		driver.findElement(By.id(Constants.submissionWizardNext)).click();

		// -------------------Quote Screen------------------- 
		driver.findElement(By.id(Constants.quoteScreen)).click();
		seleniumToExcel.premium(driver, "PolicyIssuanceTS14");
		// -------------------issue Options------------------- 
		driver.findElement(By.id(Constants.bindOptions)).click();
		WebElement issueOptions = driver.findElement(By.xpath(Constants.issueOption));
		action.moveToElement(issueOptions).perform();
		issueOptions.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();

	}
}
