package com.smartims.insurancepractice.policycenter.scenario12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.Constants;
import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyIssuance_TS12 {
	void newSubmission(ChromeDriver driver, Actions action) throws Exception {

		PolicyIssuanceVO svo = new PolicyIssuanceVO();

		// New submission
		driver.findElement(By.xpath(Constants.clickOnNewSubbmission)).click();
		svo.setDefaultEffectiveDate(ExcelUtils_TS12.getCellValueByLabel("defaultEffectiveDate"));
//		driver.findElement(By.name("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate")).clear();
		driver.findElement(By.id("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate_dateIcon"))
				.click();

		driver.findElement(By.name("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate"))
				.sendKeys(svo.getDefaultEffectiveDate(), Keys.ENTER);

		// select the product
		driver.findElement(By.xpath(Constants.selectProduct)).click();

		svo.setOfferingsSelection(ExcelUtils_TS12.getCellValueByLabel("offeringsSelection"));
		svo.setIsApplicantCurrentlyInsured(ExcelUtils_TS12.getCellValueByLabel("isApplicantCurrentlyInsured"));

//		svo.setDateQuoteNeeded(ExcelUtils13.getCellValueByLabel("dateQuoteNeeded"));
		svo.setTermType(ExcelUtils_TS12.getCellValueByLabel("termType"));
		svo.setEffectiveDate(ExcelUtils_TS12.getCellValueByLabel("effectiveDate"));

		svo.setPNIFirstname(ExcelUtils_TS12.getCellValueByLabel("PNIFirstname"));
		svo.setPNILastname(ExcelUtils_TS12.getCellValueByLabel("PNILastname"));
		svo.setPNIDOB(ExcelUtils_TS12.getCellValueByLabel("PNIDOB"));
		svo.setPNIAddressLine1(ExcelUtils_TS12.getCellValueByLabel("PNIAddressLine1"));
		svo.setPNIState(ExcelUtils_TS12.getCellValueByLabel("PNIState"));
		svo.setPNIAddressType(ExcelUtils_TS12.getCellValueByLabel("PNIAddressType"));
		svo.setPNILicenseNumber(ExcelUtils_TS12.getCellValueByLabel("PNILicenseNumber"));
		svo.setPNILicenseState(ExcelUtils_TS12.getCellValueByLabel("PNILicenseState"));

		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS12.getCellValueByLabel("existingDriverYearFirstLicensed"));
		svo.setExistingDriverLicenseNumber(ExcelUtils_TS12.getCellValueByLabel("existingDriverLicenseNumber"));
		svo.setExistingDriverLicenseState(ExcelUtils_TS12.getCellValueByLabel("existingDriverLicenseState"));
		svo.setExistingDriverdateOfBirth(ExcelUtils_TS12.getCellValueByLabel("existingDriverdateOfBirth"));

		svo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS12.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		svo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS12.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		svo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS12.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		svo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS12.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));

		svo.setDriver1Firstname(ExcelUtils_TS12.getCellValueByLabel("driver1Firstname"));
		svo.setDriver1Lastname(ExcelUtils_TS12.getCellValueByLabel("driver1Lastname"));
		svo.setDriver1dateOfBirth(ExcelUtils_TS12.getCellValueByLabel("driver1dateOfBirth"));
		svo.setDriver1Address1(ExcelUtils_TS12.getCellValueByLabel("driver1Address1"));
		svo.setDriver1AdressType(ExcelUtils_TS12.getCellValueByLabel("driver1AdressType"));
		svo.setDriver1ZIPCode(ExcelUtils_TS12.getCellValueByLabel("driver1ZIPCode"));
		svo.setDriver1LicenseNumber(ExcelUtils_TS12.getCellValueByLabel("driver1LicenseNumber"));
		svo.setDriver1LicenseState(ExcelUtils_TS12.getCellValueByLabel("driver1LicenseState"));
		svo.setDriver1YearFirstLicensed(ExcelUtils_TS12.getCellValueByLabel("driver1YearFirstLicensed"));

		svo.setVehicle1VIN(ExcelUtils_TS12.getCellValueByLabel("vehicle1VIN"));
		svo.setVehicle1LicenseState(ExcelUtils_TS12.getCellValueByLabel("vehicle1LicenseState"));
		svo.setVehicle1CostNew(ExcelUtils_TS12.getCellValueByLabel("vehicle1CostNew"));
		svo.setVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS12.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));

		svo.setVehicle2Type(ExcelUtils_TS12.getCellValueByLabel("vehicle2Type"));
		svo.setVehicle2VIN(ExcelUtils_TS12.getCellValueByLabel("vehicle2VIN"));
		System.out.println(svo.getVehicle2VIN());
		svo.setVehicle2LicenseState(ExcelUtils_TS12.getCellValueByLabel("vehicle2LicenseState"));
		svo.setVehicle2CostNew(ExcelUtils_TS12.getCellValueByLabel("vehicle2CostNew"));
		svo.setVehicle2AIExisingPersonIntrestType(
				ExcelUtils_TS12.getCellValueByLabel("vehicle2AIExisingPersonIntrestType"));

//		svo.setVehicle1comprehensive(ExcelUtils13.getCellValueByLabel("vehicle1comprehensive"));

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

//
		// Selecting the Term

		// driver.findElement(By.xpath(Constants.ClickOnAnnual)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType\"]/div/div/select"))
				.sendKeys(svo.getTermType(), Keys.TAB);

		// Effective Date
//		driver.findElement(By.name(
//				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate"))
//				.clear();

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
//				.sendKeys("05/11/2023", Keys.ENTER);
//Thread.sleep(2000);
		WebElement click = driver
				.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[3]/div/div[2]"));
		action.moveToElement(click).perform();
		click.click();

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
		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS12.getCellValueByLabel("existingDriverYearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC.existingDriverYearFirstLicensed))
				.sendKeys(svo.getExistingDriverYearFirstLicensed());
		svo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS12.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		Select roles = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfAccidentsPolicyLevel)));
		roles.selectByValue(svo.getExistingDriverNumberOfAccidentsPolicyLevel());
		svo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS12.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		Select roles2 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfAccidentsAccountLevel)));
		roles2.selectByValue(svo.getExistingDriverNumberOfAccidentsAccountLevel());
		svo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS12.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		Select roles3 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfViolationsPolicyLevel)));
		roles3.selectByValue(svo.getExistingDriverNumberOfViolationsPolicyLevel());
		svo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS12.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));
		Select roles4 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfViolationsAccountLevel)));
		roles4.selectByValue(svo.getExistingDriverNumberOfViolationsAccountLevel());

////		driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed")).clear();
//
//		driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed\"]/div/input")).sendKeys(svo.getExistingDriverYearFirstLicensed());
//
//		// Accidents or Violation Summary 
//		Select select3 = new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents\"]/div/div/select")));
//		select3.selectByValue(svo.getExistingDriverNumberOfAccidentsPolicyLevel());
//		Select select4 = new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-DriverNumberOfAccidents\"]/div/div/select")));
//		select4.selectByValue(svo.getExistingDriverNumberOfAccidentsAccountLevel());
//		Select select5 = new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverNumberOfViolations\"]/div/div/select")));
//		select5.selectByValue(svo.getExistingDriverNumberOfViolationsPolicyLevel());
//		Select select6 = new Select(driver.findElement(By.xpath("//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-DriverNumberOfViolations\"]/div/div/select")));
//		select6.selectByValue(svo.getExistingDriverNumberOfViolationsAccountLevel());

		// Adding one more Driver

		// Driver screen

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
//						driver.findElement(By.name("NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State")).sendKeys("Illinois",Keys.ENTER);
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
		cost.sendKeys(svo.getVehicle2CostNew());

		WebElement milage = driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-annualmiles_DV"));
		milage.sendKeys("30000");

		// -------------------Vehicles Screen, Adding a Vehicle2------------------- 
		driver.findElement(By.id(Constants.addVechile)).click();
//		driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-VehicleDetailCardTab")).click();

		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-Type_DV"))
				.sendKeys(svo.getVehicle2Type(), Keys.TAB);
		// VIN 
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-Vin_DV"))
				.sendKeys(svo.getVehicle2VIN(), Keys.ENTER, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
						Keys.TAB);
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-LicenseState_DV"))
				.sendKeys(svo.getVehicle2LicenseState(), Keys.ENTER);

		// Assing driver to vechile
		WebElement assinging = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver"));
		action.moveToElement(assinging).perform();
		assinging.click();
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
		WebElement cost2 = driver.findElement(By.name(Constants.coStOFVechile));
		cost2.sendKeys(svo.getVehicle1CostNew());

		WebElement milage2 = driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-annualmiles_DV"));
		milage2.sendKeys("30000");

		// Adding addtional interst
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[1]/div[2]/div/div[2]"))
				.click();

//				
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton"))
				.click();
		WebElement addinterset2 = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact"));
		action.moveToElement(addinterset2).perform();
		driver.findElement(By.xpath(
				"//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact-0-acctContact\"]/div"))
				.click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-AdditionalInterestDetailsDV-AdditionalInterestLV-0-Type"))
				.sendKeys(svo.getVehicle1AIExisingPersonIntrestType(), Keys.ENTER);

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

		// -------------------PA Coverage Screen of vehicle2------------------- 
		WebElement vehicle2coverage = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoveragesLV-1-VehicleNumber"));
		action.moveToElement(vehicle2coverage).perform();
		vehicle2coverage.click();
		String v2coverage = "Collision";

		if (v2coverage != null && v2coverage.equalsIgnoreCase("Comprehensive")) {
			driver.findElement(By.name(
					"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox"))
					.click();
		} else if (v2coverage != null && v2coverage.equalsIgnoreCase("Collision")) {
			driver.findElement(By.name(
					"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox"))
					.click();
		} else if (v2coverage != null && v2coverage.equalsIgnoreCase("Towing and Labor")) {
			driver.findElement(By.name(
					"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-2-CoverageInputSet-CovPatternInputGroup-_checkbox"))
					.click();

		} else if (v2coverage != null && v2coverage.equalsIgnoreCase("Rental Reimbursement")) {
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
		driver.findElement(By.xpath(Constants.viewPolicy)).click();

	}

}
