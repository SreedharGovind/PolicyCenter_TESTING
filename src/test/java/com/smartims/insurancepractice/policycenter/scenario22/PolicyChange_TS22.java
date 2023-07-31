package com.smartims.insurancepractice.policycenter.scenario22;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyChange_TS22 {

	void policyChange22(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
//	public static void main(String[] args) throws IOException, InterruptedException {

		AccountCreationVO pvo = new AccountCreationVO();

		PolicyChangeVO pcvo = new PolicyChangeVO();
		ExcelUtils_TS22 eu22 = new ExcelUtils_TS22();

		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS22.getCellValueByLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS22.getCellValueByLabel("policyChangeDescription"));

		pcvo.setPolicyChangeVehicle1GaragedAtAddress1NewLocation(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeVehicle1GaragedAtAddress1"));
		pcvo.setPolicyChangeVehicle1GaragedAtCityNewLocation(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeVehicle1GaragedAtCity"));
		pcvo.setPolicyChangeVehicle1GaragedAtZipcodeNewLocation(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeVehicle1GaragedAtZipcode"));
		pcvo.setPolicyChangeVehicle1GaragedAtTerritoryCodeNewLocation(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeVehicle1GaragedAtTerritoryCode"));

		pcvo.setPolicyChangeOOSEffectiveDate(ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSEffectiveDate"));
		pcvo.setPolicyChangeOOSDescription(ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSDescription"));

		pcvo.setPolicyChangeOOSNewDriver1Firstname(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1Firstname"));
		pcvo.setPolicyChangeOOSNewDriver1Lastname(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1Lastname"));
		pcvo.setPolicyChangeOOSNewdriver1dateOfBirth(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewdriver1dateOfBirth"));
		pcvo.setPolicyChangeOOSNewDriver1Addressline1(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1Addressline1"));
		pcvo.setPolicyChangeOOSNewDriver1City(ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1City"));
		pcvo.setPolicyChangeOOSNewDriver1State(ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1State"));
		pcvo.setPolicyChangeOOSNewDriver1Zipcode(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1Zipcode"));
		pcvo.setPolicyChangeOOSNewDriver1AddressType(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1AddressType"));
		pcvo.setPolicyChangeOOSNewDriver1LicenseNumber(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1LicenseNumber"));
		pcvo.setPolicyChangeOOSNewDriver1LicenseState(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1LicenseState"));
		pcvo.setPolicyChangeOOSNewDriver1YearFirstLicensed(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSNewDriver1YearFirstLicensed"));

		pcvo.setPolicyChangeOOSVehicle1VIN(ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSVehicle1VIN"));
		pcvo.setPolicyChangeOOSVehicle1LicenseState(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSVehicle1LicenseState"));
		pcvo.setPolicyChangeOOSVehicle1DriversPercentage(
				ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSVehicle1DriversPercentage"));
		pcvo.setPolicyChangeOOSVehicle1CostNew(ExcelUtils_TS22.getCellValueByLabel("policyChangeOOSVehicle1CostNew"));

		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton2)).click();
		driver.findElement(By.xpath(ConstantsClass18.changePolicyOption)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"StartPolicyChange-StartPolicyChangeScreen-StartPolicyChangeDV-EffectiveDate\"]/div/input"))
				.sendKeys(pcvo.getPolicyChangeEffectiveDate());

		driver.findElement(By.xpath(ConstantsClass18.policyChangeDescription))
				.sendKeys(pcvo.getPolicyChangeDescription(), Keys.ENTER);

		WebElement policyChangeNext = driver.findElement(By.xpath(ConstantsClass18.policyChangeScreenNextButton));
		actions.moveToElement(policyChangeNext).perform();
		policyChangeNext.click();

		// offerings Screen
		Select Offerings = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringsTypeSelection)));
		Offerings.selectByIndex(1);

		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeTermType)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.polchangeExistingDriverNewFirstname)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-LicensePlate_DV\"]/div/input"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnGarageLocationInputMenuIcon)).click();

		WebElement newGarageLocation = driver
				.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnNewGarageLocation));
		actions.moveToElement(newGarageLocation).perform();
		newGarageLocation.click();

		driver.findElement(By.xpath(ConstantsClass18.polChangeNewGarageLocationAddress1))
				.sendKeys(pcvo.getPolicyChangeVehicle1GaragedAtAddress1NewLocation());
		driver.findElement(By.xpath(ConstantsClass18.polChangeNewGaragedLocationZipcode))
				.sendKeys(pcvo.getPolicyChangeVehicle1GaragedAtZipcodeNewLocation());
		driver.findElement(By.xpath(ConstantsClass18.polChangeNewGaragedTerrotoryCodeAutofillButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeNewGarageLocationScrnUpdate)).click();

		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeAdditionalCoverageTab)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();

		driver.findElement(By.xpath(ConstantsClass18.polChangeRiskAnalysisScreen)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyPreviewTab)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.polChangeQuoteButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeBindOption)).click();

		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		driver.findElement(By.xpath(ConstantsClass18.viewPolicyChangeSummaryScreen)).click();

//	---------------Out-Of-Sequence----------------	
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton2)).click();
		driver.findElement(By.xpath(ConstantsClass18.changePolicyOption)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"StartPolicyChange-StartPolicyChangeScreen-StartPolicyChangeDV-EffectiveDate\"]/div/input"))
				.sendKeys(pcvo.getPolicyChangeOOSEffectiveDate());

		driver.findElement(By.xpath(ConstantsClass18.policyChangeDescription))
				.sendKeys(pcvo.getPolicyChangeOOSDescription());

		Thread.sleep(1000);
		WebElement pcvoPolicyChangeNext = driver
				.findElement(By.xpath("//*[@id=\"StartPolicyChange-StartPolicyChangeScreen-NewPolicyChange\"]/div"));
		actions.moveToElement(pcvoPolicyChangeNext).perform();
		pcvoPolicyChangeNext.click();

//		driver.findElement(By.xpath("//*[@id=\"StartPolicyChange-StartPolicyChangeScreen-NewPolicyChange\"]/div"))
//				.click();
		Alert pcvoAlert = driver.switchTo().alert();
		pcvoAlert.accept();

		// offerings Screen
		Select pcvoOfferings = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringsTypeSelection)));
		pcvoOfferings.selectByIndex(1);

		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeTermType)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();

		Thread.sleep(1000);
		WebElement addNewDriverButton = driver.findElement(By.id(ConstantsClass18.polChangeDriverScreenAddDriver));
		actions.moveToElement(addNewDriverButton).perform();
		addNewDriverButton.click();

		WebElement addNewDriver = driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverOPtion));
		actions.moveToElement(addNewDriver).perform();
		addNewDriver.click();

		driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverFirstname))
				.sendKeys(pcvo.getPolicyChangeOOSNewDriver1Firstname());
		driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverLastname))
				.sendKeys(pcvo.getPolicyChangeOOSNewDriver1Lastname());
		driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverDOB))
				.sendKeys(pcvo.getPolicyChangeOOSNewdriver1dateOfBirth());

		driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverAddressLine1))
				.sendKeys(pcvo.getPolicyChangeOOSNewDriver1Addressline1());

		driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverZipcode))
				.sendKeys(pcvo.getPolicyChangeOOSNewDriver1Zipcode(), Keys.TAB, Keys.ENTER, Keys.TAB);

		Select addTypeNewDriver = new Select(
				driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverAddressType)));
		addTypeNewDriver.selectByVisibleText(pcvo.getPolicyChangeOOSNewDriver1AddressType());

		driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverLicenseNumber))
				.sendKeys(pcvo.getPolicyChangeOOSNewDriver1LicenseNumber(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverLicenseState))
				.sendKeys(pcvo.getPolicyChangeOOSNewDriver1LicenseState());
		driver.findElement(By.xpath(ConstantsClass18.polChangeNewDriverUpdate)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeRolesTab)).click();
		driver.findElement(By.name(ConstantsClass18.polChangeRolesTabYearLicense))
				.sendKeys(pcvo.getPolicyChangeOOSNewDriver1YearFirstLicensed(), Keys.TAB);
		Select select3 = new Select(driver.findElement(By.xpath(ConstantsClass18.polChangeNumOfAccidentsPolLvl)));
		select3.selectByValue("0");
		Select select4 = new Select(driver.findElement(By.xpath(ConstantsClass18.polChangeNumOfAccidentsAcntLvl)));
		select4.selectByValue("0");
		Select select5 = new Select(driver.findElement(By.xpath(ConstantsClass18.polChangeNumOfViolationsPolLvl)));
		select5.selectByValue("0");
		Select select6 = new Select(driver.findElement(By.xpath(ConstantsClass18.polChangeNumOfViolationsAcntLvl)));
		select6.selectByValue("0");

		driver.findElement(By.id(ConstantsClass18.polChangeDriverScreenNextButton)).click();

		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnCreateVehicle)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleVIN))
				.sendKeys(pcvo.getPolicyChangeOOSVehicle1VIN());

		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnLicenseState))
				.sendKeys(pcvo.getPolicyChangeOOSVehicle1LicenseState());

		driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnAssignDriver)).click();

		WebElement addDriver = driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnSelectDriverToVehicle));
		actions.moveToElement(addDriver).perform();
		addDriver.click();

		WebElement vehicleCost = driver.findElement(By.xpath(ConstantsClass18.polChangeVehicleScrnCostNew));
		actions.moveToElement(vehicleCost).perform();
		vehicleCost.sendKeys(pcvo.getPolicyChangeOOSVehicle1CostNew());
		driver.findElement(By.id(ConstantsClass18.polChangeDriverScreenNextButton)).click();

		driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PersonalAuto_AllVehicleCoveragesDV-PALiabCategoryIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input"))
				.click();
		driver.findElement(By.id(ConstantsClass18.polChangeDriverScreenNextButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeRiskAnalysisScreen)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();
		driver.findElement(By.xpath(ConstantsClass18.policyPreviewTab)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(ConstantsClass18.polChangeQuoteButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.polChangeBindOption)).click();

		Alert alert21 = driver.switchTo().alert();
		alert21.accept();

		driver.findElement(By.xpath(ConstantsClass18.viewPolicyChangeSummaryScreen)).click();
	}
}
