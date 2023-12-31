package com.smartims.insurancepractice.policycenter.scenario04;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.ConstantsClass03;
import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyIssuance_TS04 {
	void policyIssue(ChromeDriver driver, Actions action) throws IOException, InterruptedException {
		PolicyIssuanceVO pvo = new PolicyIssuanceVO();
		pvo.setOfferingsSelection(ExcelUtils_TS04.getCellValueByLabel("offeringsSelection"));
		pvo.setIsApplicantCurrentlyInsured(ExcelUtils_TS04.getCellValueByLabel("isApplicantCurrentlyInsured"));
		pvo.setDateQuoteNeeded(ExcelUtils_TS04.getCellValueByLabel("dateQuoteNeeded"));
		pvo.setPNIFirstname(ExcelUtils_TS04.getCellValueByLabel("PNIFirstname"));
		pvo.setPNILastname(ExcelUtils_TS04.getCellValueByLabel("PNILastname"));
		pvo.setPNIDOB(ExcelUtils_TS04.getCellValueByLabel("PNIDOB"));
		pvo.setPNIAddressLine1(ExcelUtils_TS04.getCellValueByLabel("PNIAddressLine1"));
		pvo.setPNIZipcode(ExcelUtils_TS04.getCellValueByLabel("PNIZipcode"));
		pvo.setPNIState(ExcelUtils_TS04.getCellValueByLabel("PNIState"));
		pvo.setPNIAddressType(ExcelUtils_TS04.getCellValueByLabel("PNIAddressType"));
		pvo.setPNILicenseNumber(ExcelUtils_TS04.getCellValueByLabel("PNILicenseNumber"));
		pvo.setPNILicenseState(ExcelUtils_TS04.getCellValueByLabel("PNILicenseState"));
		pvo.setDriver1YearFirstLicensed(ExcelUtils_TS04.getCellValueByLabel("driver1YearFirstLicensed"));
		pvo.setVehicle1VIN(ExcelUtils_TS04.getCellValueByLabel("vehicle1VIN"));
		pvo.setVehicle1LicenseState(ExcelUtils_TS04.getCellValueByLabel("vehicle1LicenseState"));
		pvo.setVehicle1CostNew(ExcelUtils_TS04.getCellValueByLabel("vehicle1CostNew"));
		pvo.setVehicle1AIExisingPerson(ExcelUtils_TS04.getCellValueByLabel("vehicle1AIExisingPerson"));
		pvo.setVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS04.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));
		pvo.setVehicle2VIN(ExcelUtils_TS04.getCellValueByLabel("vehicle2VIN"));
		pvo.setVehicle1Collision(ExcelUtils_TS04.getCellValueByLabel("vehicle1Collision"));
		pvo.setDriver1NumberOfAccidentsPolicyLevel(
				ExcelUtils_TS04.getCellValueByLabel("driver1NumberOfAccidentsPolicyLevel"));
		pvo.setDriver1NumberOfAccidentsAccountLevel(
				ExcelUtils_TS04.getCellValueByLabel("driver1NumberOfAccidentsAccountLevel"));
		pvo.setDriver1NumberOfViolationsPolicyLevel(
				ExcelUtils_TS04.getCellValueByLabel("driver1NumberOfViolationsPolicyLevel"));
		pvo.setDriver1NumberOfViolationsAccountLevel(
				ExcelUtils_TS04.getCellValueByLabel("driver1numberOfViolationsAccountLevel"));
		pvo.setVehicle2Type(ExcelUtils_TS04.getCellValueByLabel("vehicle2Type"));
		pvo.setVehicle2LicenseState(ExcelUtils_TS04.getCellValueByLabel("vehicle2LicenseState"));
		pvo.setVehicle2CostNew(ExcelUtils_TS04.getCellValueByLabel("vehicle2CostNew"));
		pvo.setVehicle2Driver1Assignment(ExcelUtils_TS04.getCellValueByLabel("vehicle2Driver1Assignment"));
		pvo.setVehicle2AIExisingPerson(ExcelUtils_TS04.getCellValueByLabel("vehicle2AIExisingPerson"));
		pvo.setVehicle2AIExisingPersonIntrestType(
				ExcelUtils_TS04.getCellValueByLabel("vehicle2AIExisingPersonIntrestType"));
		pvo.setEffectiveDate(ExcelUtils_TS04.getCellValueByLabel("effectiveDate"));
		pvo.setTermType(ExcelUtils_TS04.getCellValueByLabel("termType"));
		driver.findElement(By.id(ConstantsClass03.newsubmission)).click();
		driver.findElement(By.id(ConstantsClass03.personalauto)).click();
		driver.findElement(By.name(ConstantsClass03.offeringselection)).sendKeys(pvo.getOfferingsSelection(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.next)).click();
		driver.findElement(By.name(ConstantsClass03.getIsApplicantCurrentlyInsured))
				.sendKeys(pvo.getIsApplicantCurrentlyInsured(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.next)).click();
//	        driver.findElement(By.name(ConstantsClass03.dateQuoteNeeded)).sendKeys(pvo.getDateQuoteNeeded(), Keys.TAB);
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType"))
				.sendKeys(pvo.getTermType(), Keys.TAB);
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate"))
				.sendKeys(pvo.getEffectiveDate(), Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClass03.submissionnextXpath)).click();
		driver.findElement(By.xpath(ConstantsClass03.submissionnextXpath)).click();
		WebElement add = driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver"));
		action.moveToElement(add).perform();
		add.click();
		driver.findElement(By.id(ConstantsClass03.contacttype)).click();
		driver.findElement(By.name(ConstantsClass03.newDriverPniFirstName)).sendKeys(pvo.getPNIFirstname(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPniLastName)).sendKeys(pvo.getPNILastname(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPnidob)).clear();
		driver.findElement(By.name(ConstantsClass03.newDriverPnidob)).sendKeys(pvo.getPNIDOB(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPniAddressline1)).sendKeys(pvo.getPNIAddressLine1(),
				Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPniZipcode)).sendKeys(pvo.getPNIZipcode(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPniState)).sendKeys(pvo.getPNIState(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.newDriverPniAddressType)).sendKeys(pvo.getPNIAddressType(),
				Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.newDriverPniLicenseNumber)).sendKeys(pvo.getPNILicenseNumber(),
				Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.newDriverPniLicenseState)).sendKeys(pvo.getPNILicenseState(),
				Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.newDriverUpdate)).click();
		// driver.findElement(By.name("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate")).sendKeys(pvo.getEffectiveDate(),
		// Keys.TAB);
		// driver.findElement(By.id(ConstantsClass03.newDriverUpdate)).click();
		driver.findElement(By.id(ConstantsClass03.submissionDriversrolestab)).click();
		driver.findElement(By.name(ConstantsClass03.Driveryearlicensed)).sendKeys(pvo.getDriver1YearFirstLicensed(),
				Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.driver4NumberOfAccidentsPolicyLevel))
				.sendKeys(pvo.getDriver1NumberOfAccidentsPolicyLevel(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.driver4NumberOfAccidentsAccountLevel))
				.sendKeys(pvo.getDriver1NumberOfAccidentsAccountLevel(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.driver4NumberOfViolationsPolicyLevel))
				.sendKeys(pvo.getDriver1NumberOfViolationsPolicyLevel(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.driver4NumberOfViolationsAccountLevel))
				.sendKeys(pvo.getDriver1NumberOfViolationsAccountLevel(), Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id(ConstantsClass03.next)).click();
		driver.findElement(By.id(ConstantsClass03.createvehicle)).click();
		driver.findElement(By.name(ConstantsClass03.vehicle1vin)).sendKeys(pvo.getVehicle1VIN(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.vehicle1LicenseState)).sendKeys(pvo.getVehicle1LicenseState(),
				Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.vehicle1CostNew)).sendKeys(pvo.getVehicle1CostNew(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionAdditionalInterestTab)).click();
		driver.findElement(By.id(ConstantsClass03.addContactButton)).click();
		WebElement add1 = driver.findElement(By.id(ConstantsClass03.addotherContact));
		action.moveToElement(add1).perform();
		driver.findElement(By.id(ConstantsClass03.accountContact)).click();
		driver.findElement(By.name(ConstantsClass03.vehicle2additionalInterestType))
				.sendKeys(pvo.getVehicle1AIExisingPersonIntrestType(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.vehicleDetailsCardTab)).click();
		WebElement add2 = driver.findElement(By.id(ConstantsClass03.submissionadddriver));
		action.moveToElement(add2).perform();
		add2.click();
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver-0-Driver"))
				.click();
		WebElement createvehicle = driver.findElement(By.id(ConstantsClass03.createvehicle));
		action.moveToElement(createvehicle).perform();
		createvehicle.click();
		driver.findElement(By.name(ConstantsClass03.vehicleDVType)).sendKeys(pvo.getVehicle2Type(), Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.name(ConstantsClass03.vehicle1vin)).sendKeys(pvo.getVehicle2VIN(), Keys.TAB);

		driver.findElement(By.name(ConstantsClass03.vehicle1LicenseState)).sendKeys(pvo.getVehicle2LicenseState(),
				Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.vehicle1CostNew)).sendKeys(pvo.getVehicle2CostNew(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionAdditionalInterestTab)).click();
		WebElement add3 = driver.findElement(By.id(ConstantsClass03.addContactButton));
		action.moveToElement(add3).perform();
		WebElement add4 = driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"));
		action.moveToElement(add4).perform();
		add4.click();
		WebElement existingcontact = driver.findElement(By.id(ConstantsClass03.addExistingContact));
		action.moveToElement(existingcontact).perform();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[4]/div[3]/div/div/div[2]"))
				.click();
		driver.findElement(By.name(ConstantsClass03.vehicle2additionalInterestType))
				.sendKeys(pvo.getVehicle2AIExisingPersonIntrestType(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.vehicleDetailsCardTab)).click();
		WebElement adddriver = driver.findElement(By.id(ConstantsClass03.submissionadddriver));
		action.moveToElement(adddriver).perform();
		adddriver.click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[17]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]"))
				.click();
		driver.findElement(By.id(ConstantsClass03.next)).click();
		WebElement collision = driver.findElement(By.id(ConstantsClass03.vehicle2checkbox));
		action.moveToElement(collision).perform();
		collision.click();
		driver.findElement(By.id(ConstantsClass03.next)).click();
		driver.findElement(By.id(ConstantsClass03.quote)).click();
		WebElement bindoptions = driver.findElement(By.id(ConstantsClass03.submissionbindoptions));
		action.moveToElement(bindoptions).perform();
		bindoptions.click();
		driver.findElement(By.id(ConstantsClass03.submissionBindPolicy)).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
//			driver.findElement(By.id("UWBlockProgressIssuesPopup-IssuesScreen-DetailsButton")).click();
//			driver.findElement(By.id("SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-RiskEvaluationPanelSet-1-UWIssueRowSet-Approve")).click();
//			driver.findElement(By.id("RiskApprovalDetailsPopup-Update")).click();
//			WebElement bindoptions1 = driver.findElement(By.id("SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-BindOptions"));
//	        action.moveToElement(bindoptions1).perform();
//	        bindoptions1.click();
//	        driver.findElement(By.id("SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue")).click();
//	        Alert alert1 = driver.switchTo().alert();
//			alert1.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}
}
