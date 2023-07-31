package com.smartims.insurancepractice.policycenter.scenario09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.Constants;

public class PolicyIssuance_TS09 {
	void newSubmission(ChromeDriver driver, Actions action) throws Exception {

		PolicyIssuanceVO svo = new PolicyIssuanceVO();

		// New submission
		driver.findElement(By.xpath(Constants.clickOnNewSubbmission)).click();
		svo.setDefaultEffectiveDate(ExcelUtils_TS09.getCellValueByLabel("defaultEffectiveDate"));
//		driver.findElement(By.name("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate")).clear();
		driver.findElement(By.id("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate_dateIcon"))
				.click();

		driver.findElement(By.name("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate"))
				.sendKeys(svo.getDefaultEffectiveDate(), Keys.ENTER);

		// select the product
		driver.findElement(By.xpath(Constants.selectProduct)).click();

		svo.setOfferingsSelection(ExcelUtils_TS09.getCellValueByLabel("offeringsSelection"));
		svo.setIsApplicantCurrentlyInsured(ExcelUtils_TS09.getCellValueByLabel("isApplicantCurrentlyInsured"));

//		svo.setDateQuoteNeeded(ExcelUtils13. getCellValueByLabel("dateQuoteNeeded"));
		svo.setTermType(ExcelUtils_TS09.getCellValueByLabel("termType"));
		svo.setEffectiveDate(ExcelUtils_TS09.getCellValueByLabel("effectiveDate"));

		svo.setPNIFirstname(ExcelUtils_TS09.getCellValueByLabel("PNIFirstname"));
		svo.setPNILastname(ExcelUtils_TS09.getCellValueByLabel("PNILastname"));
		svo.setPNIDOB(ExcelUtils_TS09.getCellValueByLabel("PNIDOB"));
		svo.setPNIAddressLine1(ExcelUtils_TS09.getCellValueByLabel("PNIAddressLine1"));
		svo.setPNIState(ExcelUtils_TS09.getCellValueByLabel("PNIState"));
		svo.setPNIAddressType(ExcelUtils_TS09.getCellValueByLabel("PNIAddressType"));
		svo.setPNILicenseNumber(ExcelUtils_TS09.getCellValueByLabel("PNILicenseNumber"));
		svo.setPNILicenseState(ExcelUtils_TS09.getCellValueByLabel("PNILicenseState"));

		svo.setSNIRelationship(ExcelUtils_TS09.getCellValueByLabel("relationship"));
		svo.setSNIFirstname(ExcelUtils_TS09.getCellValueByLabel("SNIFirstname"));
		svo.setSNILastname(ExcelUtils_TS09.getCellValueByLabel("SNILastname"));
		svo.setSNIDOB(ExcelUtils_TS09.getCellValueByLabel("SNIDOB"));
		svo.setSNIAddressLine1(ExcelUtils_TS09.getCellValueByLabel("SNIAddressLine1"));
		svo.setSNIState(ExcelUtils_TS09.getCellValueByLabel("SNIState"));
		svo.setSNIAddressType(ExcelUtils_TS09.getCellValueByLabel("SNIAddressType"));
		svo.setSNILicenseNumber(ExcelUtils_TS09.getCellValueByLabel("SNILicenseNumber"));
		svo.setSNILicenseState(ExcelUtils_TS09.getCellValueByLabel("SNILicenseState"));

		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS09.getCellValueByLabel("existingDriverYearFirstLicensed"));
		svo.setExistingDriverLicenseNumber(ExcelUtils_TS09.getCellValueByLabel("existingDriverLicenseNumber"));
		svo.setExistingDriverLicenseState(ExcelUtils_TS09.getCellValueByLabel("existingDriverLicenseState"));
		svo.setExistingDriverdateOfBirth(ExcelUtils_TS09.getCellValueByLabel("existingDriverdateOfBirth"));

		svo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS09.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		svo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS09.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		svo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS09.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		svo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS09.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));

		svo.setVehicle1VIN(ExcelUtils_TS09.getCellValueByLabel("vehicle1VIN"));
		svo.setVehicle1LicenseState(ExcelUtils_TS09.getCellValueByLabel("vehicle1LicenseState"));
		svo.setVehicle1CostNew(ExcelUtils_TS09.getCellValueByLabel("vehicle1CostNew"));

//		svo.setVehicle1comprehensive(ExcelUtils13. getCellValueByLabel("vehicle1comprehensive"));

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

//		// Changing the primary name insured details

		WebElement primary = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-ChangePrimaryNamedInsuredButtonMenuIcon"));
		action.moveToElement(primary).perform();
		primary.click();
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-AdditionalNamedPersonAdder"))
				.click();

		// filling deatils
		driver.findElement(By.name(
				"NewPrimaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName"))
				.sendKeys(svo.getPNIFirstname(), Keys.TAB);
		driver.findElement(By.name(
				"NewPrimaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName"))
				.sendKeys(svo.getPNILastname(), Keys.ENTER);
		driver.findElement(By.name(
				"NewPrimaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1"))
				.sendKeys(svo.getPNIAddressLine1(), Keys.ENTER);

		driver.findElement(By.name(
				"NewPrimaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode"))
				.sendKeys("85001", Keys.ENTER);

		driver.findElement(By.xpath(
				"//*[@id=\"NewPrimaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State\"]/div/div/select"))
				.sendKeys(svo.getPNIState(), Keys.ENTER);
		driver.findElement(By.xpath(
				"//*[@id=\"NewPrimaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType\"]/div/div/select"))
				.sendKeys(svo.getPNIAddressType(), Keys.ENTER);
		driver.findElement(By.name(
				"NewPrimaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber"))
				.sendKeys(svo.getPNILicenseNumber(), Keys.TAB);
		driver.findElement(By.xpath(
				"//*[@id=\"NewPrimaryNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState\"]/div/div/select"))
				.sendKeys(svo.getPNILicenseState(), Keys.ENTER);
		driver.findElement(By.id("NewPrimaryNamedInsuredPopup-ContactDetailScreen-Update")).click();

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

		// Effective Date
//		driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate")).clear();

		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate_dateIcon"))
				.click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate"))
				.sendKeys(svo.getEffectiveDate(), Keys.ENTER);

////		 Writtendate
//		driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate")).clear();
//		
//		
//		driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate_dateIcon")).click();
//		
//		driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate")).sendKeys("05/11/2023",Keys.ENTER);
//		
		WebElement next = driver.findElement(By.id("SubmissionWizard-Next"));
		action.moveToElement(next).perform();
		next.click();

		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// >>>>>>>>> Adding Existing Driver <<<<<<<<<< 
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

//		driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed")).clear();

		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td/div[2]/div/div/div[4]/div[2]/div/div/input"))
				.sendKeys(svo.getExistingDriverYearFirstLicensed());

		// Accidents or Violation Summary 
		Select select3 = new Select(driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents\"]/div/div/select")));
		select3.selectByValue(svo.getExistingDriverNumberOfAccidentsPolicyLevel());
		Select select4 = new Select(driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-DriverNumberOfAccidents\"]/div/div/select")));
		select4.selectByValue(svo.getExistingDriverNumberOfAccidentsAccountLevel());
		Select select5 = new Select(driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverNumberOfViolations\"]/div/div/select")));
		select5.selectByValue(svo.getExistingDriverNumberOfViolationsPolicyLevel());
		Select select6 = new Select(driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-DriverNumberOfViolations\"]/div/div/select")));
		select6.selectByValue(svo.getExistingDriverNumberOfViolationsAccountLevel());

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

		// Giving the cost of vechile
		WebElement cost = driver.findElement(By.name(Constants.coStOFVechile));
		cost.sendKeys(svo.getVehicle1CostNew());

		WebElement milage = driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-annualmiles_DV"));
		milage.sendKeys("30000");

		driver.findElement(By.id("SubmissionWizard-Next")).click();

//		driver.findElement(By.id(Constants.submissionWizardNext)).click();

		// -------------------PA Coverage Screen------------------- 
//		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/table/tbody/tr[2]/td/div/div[2]/div[3]/table/tbody/tr/td/div[3]/div[2]/div[1]/div/div/div[2]")).click();

		String coverage = "Collision";

		if (coverage != null && coverage.equalsIgnoreCase("Comprehensive")) {
			driver.findElement(By.name(
					"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox"))
					.click();
		} else if (coverage != null && coverage.equalsIgnoreCase("Collision")) {
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
		driver.findElement(By
				.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]"))
				.click();

	}

}
