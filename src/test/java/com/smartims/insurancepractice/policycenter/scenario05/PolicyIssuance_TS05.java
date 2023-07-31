package com.smartims.insurancepractice.policycenter.scenario05;

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

public class PolicyIssuance_TS05 {
	void policyIssuance(ChromeDriver driver, Actions action) throws IOException {
		PolicyIssuanceVO pio = new PolicyIssuanceVO();
		pio.setOfferingsSelection(ExcelUtils_TS05.getCellValueByLabel("offeringsSelection"));
		pio.setIsApplicantCurrentlyInsured(ExcelUtils_TS05.getCellValueByLabel("isApplicantCurrentlyInsured"));
		pio.setDateQuoteNeeded(ExcelUtils_TS05.getCellValueByLabel("dateQuoteNeeded"));
		pio.setTermType(ExcelUtils_TS05.getCellValueByLabel("termType"));
		pio.setPrimaryNamedInsured(ExcelUtils_TS05.getCellValueByLabel("primaryNamedInsured"));
		pio.setPNIFirstname(ExcelUtils_TS05.getCellValueByLabel("PNIFirstname"));
		pio.setPNILastname(ExcelUtils_TS05.getCellValueByLabel("PNILastname"));
		pio.setPNIDOB(ExcelUtils_TS05.getCellValueByLabel("PNIDOB"));
		pio.setPNIAddressLine1(ExcelUtils_TS05.getCellValueByLabel("PNIAddressLine1"));
		pio.setPNIZipcode(ExcelUtils_TS05.getCellValueByLabel("PNIZipcode"));
		pio.setPNIState(ExcelUtils_TS05.getCellValueByLabel("PNIState"));
		pio.setPNIAddressType(ExcelUtils_TS05.getCellValueByLabel("PNIAddressType"));
		pio.setExistingDriverType(ExcelUtils_TS05.getCellValueByLabel("existingDriverType"));
		pio.setExistingDriverdateOfBirth(ExcelUtils_TS05.getCellValueByLabel("existingDriverdateOfBirth"));
		pio.setExistingDriverLicenseNumber(ExcelUtils_TS05.getCellValueByLabel("existingDriverLicenseNumber"));
		pio.setExistingDriverLicenseState(ExcelUtils_TS05.getCellValueByLabel("existingDriverLicenseState"));
		pio.setExistingDriverYearFirstLicensed(ExcelUtils_TS05.getCellValueByLabel("existingDriverYearFirstLicensed"));
		pio.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS05.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		pio.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS05.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		pio.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS05.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		pio.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS05.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));
		pio.setVehicle1VIN(ExcelUtils_TS05.getCellValueByLabel("vehicle1VIN"));
		pio.setVehicle1LicenseState(ExcelUtils_TS05.getCellValueByLabel("vehicle1LicenseState"));
		pio.setVehicle1CostNew(ExcelUtils_TS05.getCellValueByLabel("vehicle1CostNew"));
		pio.setEffectiveDate(ExcelUtils_TS05.getCellValueByLabel(""));
		driver.findElement(By.id(ConstantsClass03.newsubmission)).click();
		driver.findElement(By.id(ConstantsClass03.personalauto)).click();
		driver.findElement(By.name(ConstantsClass03.offeringselection)).sendKeys(pio.getOfferingsSelection(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		driver.findElement(By.name(ConstantsClass03.submissionIsApplicantCurrentlyInsured))
				.sendKeys(pio.getIsApplicantCurrentlyInsured(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate"))
				.sendKeys(pio.getEffectiveDate(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.submissiontermtype)).sendKeys(pio.getTermType(), Keys.TAB);
		WebElement add = driver.findElement(By.id(ConstantsClass03.submissionAddContactButton));
		action.moveToElement(add).perform();
		add.click();
		driver.findElement(By.id(ConstantsClass03.newpersonsecondarynamed)).click();
		driver.findElement(By.name(ConstantsClass03.pnifirstname)).sendKeys(pio.getPNIFirstname(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnilastname)).sendKeys(pio.getPNILastname(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnidob)).sendKeys(pio.getPNIDOB(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pniaddressline1)).sendKeys(pio.getPNIAddressLine1(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnizipcode)).sendKeys(pio.getPNIZipcode(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnistate)).sendKeys(pio.getPNIState(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pniaddresstype)).sendKeys(pio.getPNIAddressType(), Keys.TAB);
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div/div[2]"))
				.click();
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		driver.findElement(By.id(ConstantsClass03.adddriver)).click();
		WebElement existingdriver = driver.findElement(By.id(ConstantsClass03.submissionexistingdriver));
		action.moveToElement(existingdriver).perform();
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-AddExistingContact-0-UnassignedDriver"))
				.click();
		driver.findElement(By.name(ConstantsClass03.existingdriverdateofbirth))
				.sendKeys(pio.getExistingDriverdateOfBirth(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.existingdriverlicensenumber))
				.sendKeys(pio.getExistingDriverLicenseNumber(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.existingdriverlicensestate))
				.sendKeys(pio.getExistingDriverLicenseState(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionDriversrolestab)).click();
		driver.findElement(By.name(ConstantsClass03.existingdriverfirstlicensed)).clear();
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
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		driver.findElement(By.id(ConstantsClass03.createvehicle)).click();
		driver.findElement(By.name(ConstantsClass03.vehicle1vin)).sendKeys(pio.getVehicle1VIN(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.vehicle1LicenseState)).sendKeys(pio.getVehicle1LicenseState(),
				Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.vehicle1CostNew)).sendKeys(pio.getVehicle1CostNew(), Keys.TAB);
		WebElement add2 = driver.findElement(By.id(ConstantsClass03.submissionadddriver));
		action.moveToElement(add2).perform();
		add2.click();
		driver.findElement(By.id(
				"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver-0-Driver"))
				.click();
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		WebElement comprehensive = driver.findElement(By.name(ConstantsClass03.submissioncheckbox));
		action.moveToElement(comprehensive).perform();
		comprehensive.click();
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		driver.findElement(By.id(ConstantsClass03.quote)).click();
		WebElement bindoptions = driver.findElement(By.id(ConstantsClass03.submissionbindoptions));
		action.moveToElement(bindoptions).perform();
		bindoptions.click();
		driver.findElement(By.id(ConstantsClass03.submissionBindPolicy)).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}
}
