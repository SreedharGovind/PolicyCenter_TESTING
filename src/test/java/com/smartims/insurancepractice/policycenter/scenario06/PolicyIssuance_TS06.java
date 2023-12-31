package com.smartims.insurancepractice.policycenter.scenario06;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicyIssuance_TS06 {
	void policyIssuance(ChromeDriver driver, Actions action) throws IOException, InterruptedException {
		PolicyIssuanceVO pio = new PolicyIssuanceVO();
		pio.setOfferingsSelection(ExcelUtils_TS06.getCellValueByLabel("offeringsSelection"));
		pio.setIsApplicantCurrentlyInsured(ExcelUtils_TS06.getCellValueByLabel("isApplicantCurrentlyInsured"));
		pio.setDateQuoteNeeded(ExcelUtils_TS06.getCellValueByLabel("dateQuoteNeeded"));
		pio.setExistingDriverType(ExcelUtils_TS06.getCellValueByLabel("existingDriverType"));
		pio.setExistingDriverdateOfBirth(ExcelUtils_TS06.getCellValueByLabel("existingDriverdateOfBirth"));
		pio.setExistingDriverLicenseNumber(ExcelUtils_TS06.getCellValueByLabel("existingDriverLicenseNumber"));
		pio.setExistingDriverAdressType(ExcelUtils_TS06.getCellValueByLabel("existingDriverAdressType"));
		pio.setExistingDriverYearFirstLicensed(ExcelUtils_TS06.getCellValueByLabel("existingDriverYearFirstLicensed"));
		pio.setExistingDriverLicenseState(ExcelUtils_TS06.getCellValueByLabel("existingDriverLicenseState"));
		pio.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS06.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		pio.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS06.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		pio.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS06.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		pio.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS06.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));
		pio.setDriver1Firstname(ExcelUtils_TS06.getCellValueByLabel("driver1Firstname"));
		pio.setDriver1Lastname(ExcelUtils_TS06.getCellValueByLabel("driver1Lastname"));
		pio.setDriver1dateOfBirth(ExcelUtils_TS06.getCellValueByLabel("driver1dateOfBirth"));
		pio.setDriver1Address1(ExcelUtils_TS06.getCellValueByLabel("driver1Address1"));
		pio.setDriver1LicenseNumber(ExcelUtils_TS06.getCellValueByLabel("driver1LicenseNumber"));
		pio.setDriver1YearFirstLicensed(ExcelUtils_TS06.getCellValueByLabel("driver1YearFirstLicensed"));
		pio.setDriver1NumberOfAccidentsPolicyLevel(
				ExcelUtils_TS06.getCellValueByLabel("driver1NumberOfAccidentsPolicyLevel"));
		pio.setDriver1NumberOfAccidentsAccountLevel(
				ExcelUtils_TS06.getCellValueByLabel("driver1NumberOfAccidentsAccountLevel"));
		pio.setDriver1NumberOfViolationsPolicyLevel(
				ExcelUtils_TS06.getCellValueByLabel("driver1NumberOfViolationsPolicyLevel"));
		pio.setDriver1NumberOfViolationsAccountLevel(
				ExcelUtils_TS06.getCellValueByLabel("driver1numberOfViolationsAccountLevel"));
		pio.setDriver1ZIPCode(ExcelUtils_TS06.getCellValueByLabel("driver1ZIPCode"));
		pio.setDriver1State(ExcelUtils_TS06.getCellValueByLabel("driver1State"));
		pio.setDriver1AdressType(ExcelUtils_TS06.getCellValueByLabel("driver1AdressType"));
		pio.setDriver1LicenseState(ExcelUtils_TS06.getCellValueByLabel("driver1LicenseNumber"));
		pio.setDriver1LicenseState(ExcelUtils_TS06.getCellValueByLabel("driver1LicenseState"));
		pio.setVehicle1VIN(ExcelUtils_TS06.getCellValueByLabel("vehicle1VIN"));
		pio.setVehicle1LicenseState(ExcelUtils_TS06.getCellValueByLabel("vehicle1LicenseState"));
		pio.setVehicle1CostNew(ExcelUtils_TS06.getCellValueByLabel("vehicle1CostNew"));
		pio.setVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS06.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));
		pio.setVehicle2VIN(ExcelUtils_TS06.getCellValueByLabel("vehicle2VIN"));
		pio.setVehicle2LicenseState(ExcelUtils_TS06.getCellValueByLabel("vehicle2LicenseState"));
		pio.setVehicle2CostNew(ExcelUtils_TS06.getCellValueByLabel("vehicle2CostNew"));
		pio.setVehicle2AIExisingPersonIntrestType(
				ExcelUtils_TS06.getCellValueByLabel("vehicle2AIExisingPersonIntrestType"));
		pio.setVehicle2CollisionLimit(ExcelUtils_TS06.getCellValueByLabel("vehicle2CollisionLimit"));
		pio.setVehicle2Type(ExcelUtils_TS06.getCellValueByLabel("vehicle2Type"));
		pio.setTermType(ExcelUtils_TS06.getCellValueByLabel("termType"));
		pio.setEffectiveDate(ExcelUtils_TS06.getCellValueByLabel("effectiveDate"));
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
		driver.findElement(By.name(
				"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType"))
				.sendKeys(pio.getTermType(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		driver.findElement(By.id(ConstantsClass03.adddriver)).click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		WebElement existingdriver = driver.findElement(By.id(ConstantsClass03.submissionexistingdriver));
		action.moveToElement(existingdriver).perform();
		existingdriver.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[3]/div/div/div[2]"))
				.click();
		driver.findElement(By.name(ConstantsClass03.existingdriverdateofbirth))
				.sendKeys(pio.getExistingDriverdateOfBirth(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.existingdriverlicensenumber)).clear();
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
		WebElement add = driver.findElement(By.id(ConstantsClass03.adddriver));
		action.moveToElement(add).perform();
		add.click();
		driver.findElement(By.id(ConstantsClass03.contacttype)).click();
		driver.findElement(By.name(ConstantsClass03.newDriverPniFirstName)).sendKeys(pio.getDriver1Firstname(),
				Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPniLastName)).sendKeys(pio.getDriver1Lastname(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPnidob)).sendKeys(pio.getDriver1dateOfBirth(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPniAddressline1)).sendKeys(pio.getDriver1Address1(),
				Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPniZipcode)).sendKeys(pio.getDriver1ZIPCode(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newDriverPniState)).sendKeys(pio.getDriver1State(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnilicensenumber)).sendKeys(pio.getDriver1LicenseNumber(),
				Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.pnilicensestate)).sendKeys(pio.getDriver1LicenseState(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.newpolicyaddresstype)).sendKeys(pio.getDriver1AdressType(),
				Keys.TAB);
		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState"))
				.sendKeys(pio.getDriver1LicenseNumber(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.newDriverUpdate)).click();
		driver.findElement(By.name(ConstantsClass03.Driveryearlicensed)).sendKeys(pio.getDriver1YearFirstLicensed(),
				Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.driver1NumberOfAccidentsPolicyLevel))
				.sendKeys(pio.getDriver1NumberOfAccidentsPolicyLevel(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.driver1NumberOfAccidentsAccountLevel))
				.sendKeys(pio.getDriver1NumberOfAccidentsAccountLevel(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.driver1NumberOfViolationsPolicyLevel))
				.sendKeys(pio.getDriver1NumberOfViolationsPolicyLevel(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.driver1NumberOfViolationsAccountLevel))
				.sendKeys(pio.getDriver1NumberOfViolationsAccountLevel(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		driver.findElement(By.id(ConstantsClass03.createvehicle)).click();
		driver.findElement(By.name(ConstantsClass03.vehicle1vin)).sendKeys(pio.getVehicle1VIN(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.vehicle1LicenseState)).sendKeys(pio.getVehicle1LicenseState(),
				Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClass03.vehicle1CostNew)).sendKeys(pio.getVehicle1CostNew(), Keys.TAB);
		WebElement adddriver1 = driver.findElement(By.id(ConstantsClass03.assignDriver));
		action.moveToElement(adddriver1).perform();
		adddriver1.click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[17]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div/div[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.id(ConstantsClass03.submissionAdditionalInterestTab)).click();
		driver.findElement(By.id(ConstantsClass03.addContactButton)).click();
		WebElement add1 = driver.findElement(By.id(ConstantsClass03.addContactButton));
		action.moveToElement(add1).perform();
		WebElement existingcontact = driver.findElement(By.id(ConstantsClass03.addotherContact));
		action.moveToElement(existingcontact).perform();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[4]/div[3]/div[2]/div/div[2]"))
				.click();
		driver.findElement(By.name(ConstantsClass03.vehicle2additionalInterestType))
				.sendKeys(pio.getVehicle1AIExisingPersonIntrestType(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.vehicleDetailsCardTab)).click();
		driver.findElement(By.id(ConstantsClass03.createvehicle)).click();
		driver.findElement(By.name(ConstantsClass03.vehicleDVType)).sendKeys(pio.getVehicle2Type(), Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClass03.vehicleVin)).sendKeys(pio.getVehicle2VIN(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.vehicleState)).sendKeys(pio.getVehicle2LicenseState(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.vehicle1CostNew)).sendKeys(pio.getVehicle2CostNew(), Keys.TAB);
		Thread.sleep(2000);
		WebElement adddriver2 = driver.findElement(By.id(ConstantsClass03.submissionadddriver));
		action.moveToElement(adddriver2).perform();
		adddriver2.click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[17]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div/div[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.id(ConstantsClass03.submissionAdditionalInterestTab)).click();
		driver.findElement(By.id(ConstantsClass03.addContactButton)).click();
		WebElement add2 = driver.findElement(By.id(ConstantsClass03.addotherContact));
		action.moveToElement(add2).perform();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[5]/div[3]/div/div/div[2]"))
				.click();
		driver.findElement(By.name(ConstantsClass03.vehicle2additionalInterestType))
				.sendKeys(pio.getVehicle2AIExisingPersonIntrestType(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		WebElement collision = driver.findElement(By.id(ConstantsClass03.vehicle2checkbox));
		action.moveToElement(collision).perform();
		collision.click();
		driver.findElement(By.name(ConstantsClass03.vehicle2collisionlimit)).sendKeys(pio.getVehicle2CollisionLimit(),
				Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.submissionnext)).click();
		driver.findElement(By.id(ConstantsClass03.quote)).click();
		Thread.sleep(2000);
		driver.findElement(By.id("SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions"))
				.click();
		driver.findElement(
				By.id("SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly"))
				.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By
				.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]"))
				.click();
		driver.findElement(By.id("PolicyFile-PolicyFileMenuActions")).click();
		driver.findElement(By.id(ConstantsClass03.issuesubmsiion)).click();
		driver.findElement(By.id(ConstantsClass03.issuequote)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(ConstantsClass03.issuepolicy1)).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By
				.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]"))
				.click();

	}
}
