package com.smartims.insurancepractice.policycenter.scenario15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.Constants;

public class PolicyIssuance_TS15 {
	void newSubmission(ChromeDriver driver, Actions action) throws Exception {

		PolicyIssuanceVO svo = new PolicyIssuanceVO();

		// New submission
		driver.findElement(By.xpath(Constants.clickOnNewSubbmission)).click();

		// select the product
		driver.findElement(By.xpath(Constants.selectProduct)).click();

//		svo.setDefaultEffectiveDate(ExcelUtils15. getCellValueByLabel("defaultEffectiveDate"));
		svo.setOfferingsSelection(ExcelUtils_TS15.getCellValueByLabel("offeringsSelection"));
		svo.setIsApplicantCurrentlyInsured(ExcelUtils_TS15.getCellValueByLabel("isApplicantCurrentlyInsured"));

//		svo.setDateQuoteNeeded(ExcelUtils15. getCellValueByLabel("dateQuoteNeeded"));
		svo.setTermType(ExcelUtils_TS15.getCellValueByLabel("termType"));
		svo.setEffectiveDate(ExcelUtils_TS15.getCellValueByLabel("effectiveDate"));
		svo.setWrittenDate(ExcelUtils_TS15.getCellValueByLabel("writtenDate"));

		svo.setSNIRelationship(ExcelUtils_TS15.getCellValueByLabel("relationship"));
		svo.setSNIFirstname(ExcelUtils_TS15.getCellValueByLabel("SNIFirstname"));
		svo.setSNILastname(ExcelUtils_TS15.getCellValueByLabel("SNILastname"));
		svo.setSNIDOB(ExcelUtils_TS15.getCellValueByLabel("SNIDOB"));
		svo.setSNIAddressLine1(ExcelUtils_TS15.getCellValueByLabel("SNIAddressLine1"));
		svo.setSNIState(ExcelUtils_TS15.getCellValueByLabel("SNIState"));
		svo.setSNIAddressType(ExcelUtils_TS15.getCellValueByLabel("SNIAddressType"));
		svo.setSNILicenseNumber(ExcelUtils_TS15.getCellValueByLabel("SNILicenseNumber"));
		svo.setSNILicenseState(ExcelUtils_TS15.getCellValueByLabel("SNILicenseState"));

		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS15.getCellValueByLabel("existingDriverYearFirstLicensed"));
		svo.setExistingDriverLicenseNumber(ExcelUtils_TS15.getCellValueByLabel("existingDriverLicenseNumber"));
		svo.setExistingDriverLicenseState(ExcelUtils_TS15.getCellValueByLabel("existingDriverLicenseState"));
		svo.setExistingDriverdateOfBirth(ExcelUtils_TS15.getCellValueByLabel("existingDriverdateOfBirth"));

		svo.setVehicle1VIN(ExcelUtils_TS15.getCellValueByLabel("vehicle1VIN"));
		svo.setVehicle1LicenseState(ExcelUtils_TS15.getCellValueByLabel("vehicle1LicenseState"));
		svo.setVehicle1CostNew(ExcelUtils_TS15.getCellValueByLabel("vehicle1CostNew"));

//		svo.setVehicle1comprehensive(ExcelUtils13. getCellValueByLabel("vehicle1comprehensive"));

//		driver.findElement(By.name("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate")).clear();
//		driver.findElement(By.id("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate_dateIcon"))
//				.click();
//
//		driver.findElement(By.name("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate"))
//				.sendKeys(svo.getDefaultEffectiveDate(), Keys.ENTER);

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

		// Policy info screen
		// Date need to quted
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded"))
				.clear();

		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded_dateIcon"))
				.click();

//		driver.findElement(By.name(
//				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded"))
//				.sendKeys(svo.getDateQuoteNeeded(), Keys.TAB);

//		Adding seconadry Insured
		WebElement seconadry = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-ChangeSecondaryNamedInsuredButtonMenuIcon"));
		action.moveToElement(seconadry).perform();
		seconadry.click();
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-AdditionalNamedPersonAdder"))
				.click();

		// Filling the Details

		driver.findElement(
				By.name("NewSecondaryNamedInsuredPopup-ContactDetailScreen-SecondaryNamedInsuredInfoDV-Relationship"))
				.sendKeys(svo.getSNIRelationship(), Keys.ENTER);
		driver.findElement(By.name(
				"NewSecondaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName"))
				.sendKeys(svo.getSNIFirstname(), Keys.TAB);
		driver.findElement(By.name(
				"NewSecondaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName"))
				.sendKeys(svo.getSNILastname(), Keys.ENTER);
		driver.findElement(By.name(
				"NewSecondaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1"))
				.sendKeys(svo.getSNIAddressLine1(), Keys.ENTER);
		driver.findElement(By.name(
				"NewSecondaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State"))
				.sendKeys(svo.getSNIState(), Keys.ENTER);
		driver.findElement(By.name(
				"NewSecondaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType"))
				.sendKeys(svo.getSNIAddressType(), Keys.ENTER);
		driver.findElement(By.name(
				"NewSecondaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber"))
				.sendKeys(svo.getSNILicenseNumber(), Keys.TAB);
		driver.findElement(By.name(
				"NewSecondaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState"))
				.sendKeys(svo.getSNILicenseState(), Keys.ENTER);
		driver.findElement(By.id("NewSecondaryNamedInsuredPopup-ContactDetailScreen-Update")).click();

		// Selecting the Term

		// driver.findElement(By.xpath(Constants.ClickOnAnnual)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType\"]/div/div/select"))
				.sendKeys(svo.getTermType(), Keys.TAB);

//		//Effective Date
//		driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate")).clear();
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate_dateIcon"))
				.click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate"))
				.sendKeys(svo.getEffectiveDate(), Keys.ENTER);

//		 Writtendate
//		driver.findElement(By.name(
//				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate"))
//				.clear();
//
//		driver.findElement(By.id(
//				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate_dateIcon"))
//				.click();
//
//		driver.findElement(By.name(
//				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate"))
//				.sendKeys(svo.getWrittenDate(), Keys.ENTER);
		WebElement click = driver
				.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[3]/div/div[2]"));
		action.moveToElement(click).perform();
		click.click();

		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// >>>>>>>>> Add Existing Driver <<<<<<<<<< 
		driver.findElement(By.id(Constants.addDriver)).click();
		WebElement existdriver = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-AddExistingContact"));
		action.moveToElement(existdriver).perform();

//		existdriver.click();		

		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[3]/div[1]/div"))
				.click();
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

		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth"))
				.clear();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth"))
				.sendKeys(svo.getExistingDriverdateOfBirth(), Keys.ENTER);

		// Click on Roles Tab 

		driver.findElement(By.xpath(Constants.clickOnRolesTab)).click();
//		driver.findElement(By.id(
//				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverInfoDV-student_0"))
//				.click();

//		driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverInfoDV-ApplicableGoodDriverDiscount_0")).click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed"))
				.clear();

		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed"))
				.sendKeys("1990", Keys.TAB);

		// Accidents or Violation Summary 
		Select select3 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents")));
		select3.selectByValue("0");
		Select select4 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-DriverNumberOfAccidents")));
		select4.selectByValue("0");
		Select select5 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverNumberOfViolations")));
		select5.selectByValue("0");
		Select select6 = new Select(driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-DriverNumberOfViolations")));
		select6.selectByValue("0");

//		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// Click on Next for the Vehicles Screen 
		driver.findElement(By.id(Constants.submissionWizardNext)).click();

		// -------------------Vehicles Screen, Adding a Vehicle------------------- 
		driver.findElement(By.id(Constants.addVechile)).click();
		// VIN 
		driver.findElement(By.name(Constants.addVechileVIN)).sendKeys(svo.getVehicle1VIN(), Keys.ENTER, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB);
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-LicenseState_DV"))
				.sendKeys(svo.getVehicle1LicenseState(), Keys.ENTER);
		// Giving the cost of vechile
		WebElement cost = driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-CostNew_DV"));
		cost.sendKeys(svo.getVehicle1CostNew(), Keys.ENTER);

		// Assing driver to vechile
		WebElement assing = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver"));
		action.moveToElement(assing).perform();
		assing.click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[17]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]"))
				.click();
//		driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV-0-_Checkbox")).click();
		driver.findElement(By.id("SubmissionWizard-Next")).click();

//		driver.findElement(By.id(Constants.submissionWizardNext)).click();

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
		// -------------------issue Options------------------- 
		driver.findElement(By.id(Constants.bindOptions)).click();
		WebElement issueOptions = driver.findElement(By.xpath(Constants.issueOption));
		action.moveToElement(issueOptions).perform();
		issueOptions.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id("JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy")).click();

	}

}
