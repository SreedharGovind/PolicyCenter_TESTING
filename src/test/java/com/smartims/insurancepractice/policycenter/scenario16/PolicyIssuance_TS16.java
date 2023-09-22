package com.smartims.insurancepractice.policycenter.scenario16;

import com.smartims.insurancepractice.policycenter.scenario13.SeleniumToExcel_TS13;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.Constants;

public class PolicyIssuance_TS16 {
	void newSubmission(ChromeDriver driver, Actions action) throws Exception {

		PolicyIssuanceVO svo = new PolicyIssuanceVO();
		SeleniumToExcel_TS16 seleniumToExcel = new SeleniumToExcel_TS16();

		// New submission
		driver.findElement(By.xpath(Constants.clickOnNewSubbmission)).click();

		// select the product
		driver.findElement(By.xpath(Constants.selectProduct)).click();

		svo.setOfferingsSelection(ExcelUtils_TS16.getDataFromLabel("offeringsSelection"));
		svo.setIsApplicantCurrentlyInsured(ExcelUtils_TS16.getDataFromLabel("isApplicantCurrentlyInsured"));

		svo.setTermType(ExcelUtils_TS16.getDataFromLabel("termType"));
		svo.setEffectiveDate(ExcelUtils_TS16.getDataFromLabel("effectiveDate"));
		svo.setWrittenDate(ExcelUtils_TS16.getDataFromLabel("writtenDate"));

		svo.setExistingDriverdateOfBirth(ExcelUtils_TS16.getDataFromLabel("existingDriverdateOfBirth"));
		svo.setExistingDriverLicenseNumber(ExcelUtils_TS16.getDataFromLabel("existingDriverLicenseNumber"));
		svo.setExistingDriverLicenseState(ExcelUtils_TS16.getDataFromLabel("existingDriverLicenseState"));
		svo.setExistingDriverYearFirstLicensed(ExcelUtils_TS16.getDataFromLabel("existingDriverYearFirstLicensed"));

		svo.setVehicle1VIN(ExcelUtils_TS16.getDataFromLabel("vehicle1VIN"));
		svo.setVehicle1LicenseState(ExcelUtils_TS16.getDataFromLabel("vehicle1LicenseState"));
		svo.setVehicle1CostNew(ExcelUtils_TS16.getDataFromLabel("vehicle1CostNew"));

		svo.setVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS16.getDataFromLabel("vehicle1AIExisingPersonIntrestType"));

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

////				 Writtendate
//				driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate")).clear();
//				
//				
//				driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate_dateIcon")).click();
//				
//				driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate")).sendKeys(svo.getWrittenDate(),Keys.ENTER);

//				driver.findElement(By.id("SubmissionWizard-Next")).click();
		WebElement click = driver
				.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[3]/div/div[2]"));
		action.moveToElement(click).perform();
		click.click();

		driver.findElement(By.id("SubmissionWizard-Next")).click();

		// >>>>>>>>> Address Same as Existing Driver <<<<<<<<<< 
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
		seleniumToExcel.premium(driver, "PolicyIssuanceTS16");
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
