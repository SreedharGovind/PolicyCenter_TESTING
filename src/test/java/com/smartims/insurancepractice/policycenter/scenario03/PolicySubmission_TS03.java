package com.smartims.insurancepractice.policycenter.scenario03;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicySubmission_TS03 {
	void policyIssue(ChromeDriver driver, Actions action) throws IOException {
		PolicyIssuanceVO pio = new PolicyIssuanceVO();
		pio.setOfferingsSelection(ExcelUtils_TS03.getCellValueByLabel("offeringsSelection"));
		pio.setIsApplicantCurrentlyInsured(ExcelUtils_TS03.getCellValueByLabel("isApplicantCurrentlyInsured"));
		pio.setEffectiveDate(ExcelUtils_TS03.getCellValueByLabel("effectiveDate"));
		pio.setPNIFirstname(ExcelUtils_TS03.getCellValueByLabel("PNIFirstname"));
		pio.setPNILastname(ExcelUtils_TS03.getCellValueByLabel("PNILastname"));
		pio.setPNIZipcode(ExcelUtils_TS03.getCellValueByLabel("PNIZipcode"));
		pio.setPNIState(ExcelUtils_TS03.getCellValueByLabel("PNIState"));
		pio.setPNIAddressLine1(ExcelUtils_TS03.getCellValueByLabel("PNIAddressLine1"));
		pio.setPNIAddressType(ExcelUtils_TS03.getCellValueByLabel("PNIAddressType"));
		pio.setExistingDriverType(ExcelUtils_TS03.getCellValueByLabel("existingDriverType"));
		pio.setDriver1LicenseState(ExcelUtils_TS03.getCellValueByLabel("driver1LicenseState"));
		pio.setPNIDOB(ExcelUtils_TS03.getCellValueByLabel("PNIDOB"));
		pio.setExistingDriverdateOfBirth(ExcelUtils_TS03.getCellValueByLabel("existingDriverdateOfBirth"));
		pio.setExistingDriverAddress1(ExcelUtils_TS03.getCellValueByLabel("existingDriverAddress1"));
		pio.setExistingDriverLicenseNumber(ExcelUtils_TS03.getCellValueByLabel("existingDriverLicenseNumber"));
		pio.setExistingDriverLicenseState(ExcelUtils_TS03.getCellValueByLabel("existingDriverLicenseState"));
		pio.setExistingDriverYearFirstLicensed(ExcelUtils_TS03.getCellValueByLabel("existingDriverYearFirstLicensed"));
		pio.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS03.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		pio.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS03.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		pio.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS03.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		pio.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS03.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));
		pio.setVehicle1VIN(ExcelUtils_TS03.getCellValueByLabel("vehicle1VIN"));
		pio.setVehicle1LicenseState(ExcelUtils_TS03.getCellValueByLabel("vehicle1LicenseState"));
		pio.setVehicle1CostNew(ExcelUtils_TS03.getCellValueByLabel("vehicle1CostNew"));
		pio.setExistingDriverType(ExcelUtils_TS03.getCellValueByLabel("existingDriverType"));
		pio.setDateQuoteNeeded(ExcelUtils_TS03.getCellValueByLabel("dateQuoteNeeded"));
		pio.setEffectiveDate(ExcelUtils_TS03.getCellValueByLabel("effectiveDate"));
		driver.findElement(By.id(ConstantsClass03.newsubmission)).click();
		driver.findElement(By.id(ConstantsClass03.personalauto)).click();
		driver.findElement(By.name(ConstantsClass03.offeringselection)).sendKeys(pio.getOfferingsSelection());
		driver.findElement(By.id(ConstantsClass03.next)).click();
		driver.findElement(By.name(ConstantsClass03.isapplicantcurentlyinsured))
				.sendKeys(pio.getIsApplicantCurrentlyInsured(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.next)).click();
//			driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded")).sendKeys(pio.getDateQuoteNeeded(), Keys.TAB);
//			driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate")).sendKeys(pio.getEffectiveDate(), Keys.TAB);
		WebElement add = driver.findElement(By.id(ConstantsClass03.Addsecondarynamed));
		action.moveToElement(add).perform();
		add.click();
		driver.findElement(By.id(ConstantsClass03.newpersonsecondarynamed)).click();
//			driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded")).sendKeys(pio.getDateQuoteNeeded(), Keys.TAB);
//			driver.findElement(By.id("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate")).sendKeys(pio.getEffectiveDate(), Keys.TAB);
		// driver.findElement(By.id(ConstantsClass03.newpersonsecondarynamed)).click();
		driver.findElement(By.name(ConstantsClass03.pnifirstname)).sendKeys(pio.getPNIFirstname(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnilastname)).sendKeys(pio.getPNILastname(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnizipcode)).sendKeys(pio.getPNIZipcode(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnistate)).sendKeys(pio.getPNIState(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pniaddressline)).sendKeys(pio.getPNIAddressLine1(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pniaddresstype)).sendKeys(pio.getPNIAddressType(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pNIDOB)).sendKeys(pio.getPNIDOB(), Keys.TAB);
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div")).click();
		driver.findElement(By.id(ConstantsClass03.next)).click();
		driver.findElement(By.id(ConstantsClass03.adddriver)).click();
		WebElement existingdriver = driver.findElement(By.id(ConstantsClass03.submissionexistingdriver));
		action.moveToElement(existingdriver).perform();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[3]/div/div/div[2]"))
				.click();
		driver.findElement(By.name(ConstantsClass03.existingdriverdob)).sendKeys(pio.getExistingDriverdateOfBirth(),
				Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.existingdriveraddress1)).sendKeys(pio.getExistingDriverAddress1(),
				Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.existingdriverlicensestate))
				.sendKeys(pio.getExistingDriverLicenseState(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.existingdriverlicensenumber))
				.sendKeys(pio.getExistingDriverLicenseNumber(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionDriversrolestab)).click();
		driver.findElement(By.name(ConstantsClass03.existingdriverfirstlicensed))
				.sendKeys(pio.getExistingDriverYearFirstLicensed(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.submissionexistingDriverNumberOfAccidentsPolicyLevel))
				.sendKeys(pio.getExistingDriverNumberOfAccidentsPolicyLevel(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.submissionexistingDriverNumberOfAccidentsAccountLevel))
				.sendKeys(pio.getExistingDriverNumberOfAccidentsAccountLevel(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.submissionexistingDriverNumberOfViolationsPolicyLevel))
				.sendKeys(pio.getExistingDriverNumberOfViolationsPolicyLevel(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.submissionexistingDriverNumberOfViolationsAccountLevel))
				.sendKeys(pio.getExistingDriverNumberOfViolationsAccountLevel(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.next)).click();
		driver.findElement(By.id(ConstantsClass03.createvehicle)).click();
		driver.findElement(By.name(ConstantsClass03.vehicle1VIN)).sendKeys(pio.getVehicle1VIN(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.vehicle1LicenseState)).sendKeys(pio.getVehicle1LicenseState(),
				Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.vehicle1CostNew)).sendKeys(pio.getVehicle1CostNew(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionadddriver)).click();
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver-0-Driver"))
				.click();
		driver.findElement(By.id(ConstantsClass03.next)).click();
		WebElement checkbox = driver.findElement(By.name(ConstantsClass03.submissioncheckbox));
		action.moveToElement(checkbox).perform();
		checkbox.click();
		driver.findElement(By.id(ConstantsClass03.next)).click();
		driver.findElement(By.id(ConstantsClass03.quote)).click();
		WebElement bindoptions = driver.findElement(By.id(ConstantsClass03.submissionbindoptions));
		action.moveToElement(bindoptions).perform();
		bindoptions.click();
		driver.findElement(By.id(ConstantsClass03.submissionBindPolicy)).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}