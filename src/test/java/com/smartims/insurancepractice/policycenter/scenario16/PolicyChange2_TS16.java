package com.smartims.insurancepractice.policycenter.scenario16;

import com.smartims.insurancepractice.policycenter.scenario14.SeleniumToExcel_TS14;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.Constants;

public class PolicyChange2_TS16 {
	void changePolicy(ChromeDriver driver, Actions action) throws Exception {

		// new transaction
		PolicyChangeVO pcvo = new PolicyChangeVO();
		SeleniumToExcel_TS16 seleniumToExcel = new SeleniumToExcel_TS16();

		WebElement Trans = driver.findElement(By.xpath(Constants.newTransaction));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(By.xpath(Constants.changePolicy)).click();
		driver.manage().window().maximize();
		// changing the effective date
		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS16.getDataFromLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS16.getDataFromLabel("policyChangeDescription"));

		driver.findElement(
				By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/div/div/div[1]/div[2]/div/div/input"))
				.sendKeys(pcvo.getPolicyChangeEffectiveDate(), Keys.TAB);

		driver.findElement(By.name(Constants.policyChangeDescription)).sendKeys(pcvo.getPolicyChangeDescription(),
				Keys.ENTER);
		driver.findElement(By.id("StartPolicyChange-StartPolicyChangeScreen-NewPolicyChange")).click();

		driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-PADrivers")).click();

		// Adding Driver
//		//  new person

		WebElement newDriver = driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver"));
		action.moveToElement(newDriver).perform();
		newDriver.click();
		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-0-ContactType"))
				.click();

//	driver.findElement(By.id("NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-datecompletedtrainingclass")).sendKeys("01/02/1999",Keys.ENTER);

		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName"))
				.sendKeys("bunny", Keys.TAB);
		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName"))
				.sendKeys("Reddy", Keys.ENTER);

		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth"))
				.clear();
		driver.findElement(By.id(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth_dateIcon"))
				.click();

		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth"))
				.sendKeys("02/04/1990", Keys.ENTER);
		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1"))
				.sendKeys("1-34", Keys.ENTER);

		driver.findElement(By.xpath(
				"//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State\"]/div/div/select"))
				.sendKeys("Illinois", Keys.ENTER);

		driver.findElement(By.xpath(
				"//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType\"]/div/div/select"))
				.sendKeys("Home", Keys.ENTER);

		driver.findElement(By.name(
				"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber"))
				.sendKeys("2345", Keys.TAB);

		driver.findElement(By.xpath(
				"//*[@id=\"NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState\"]/div/div/select"))
				.sendKeys("Arizona", Keys.ENTER);

		driver.findElement(By.id("NewPolicyDriverPopup-ContactDetailScreen-Update")).click();
		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-RolesCardTab"))
				.click();
		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverInfoDV-student_0"))
				.click();

		driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed"))
				.sendKeys("2001");

		// validation level to zero
		Select accidentPolicy = new Select(driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents")));
		accidentPolicy.selectByValue("0");

		Select accidentAccount = new Select(driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-DriverNumberOfAccidents")));
		accidentAccount.selectByValue("0");

		Select violationPolicy = new Select(driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverNumberOfViolations")));
		violationPolicy.selectByValue("0");

		Select violationaccount = new Select(driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-DriverNumberOfViolations")));
		violationaccount.selectByValue("0");

		driver.findElement(By.id("PolicyChangeWizard-Next")).click();

//
		System.out.println("done");

		// Adding new Vechile

		WebElement vehicle = driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel_tb-Add\"]/div/div[2]"));
		action.moveToElement(vehicle).perform();
		vehicle.click();

		// vechile Type
		WebElement type = driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-Type_DV"));
		action.moveToElement(type).perform();
		type.click();
		driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-Type_DV\"]/div/div/select/option[1]"))
				.click();

//	driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-VehicleDetailCardTab")).click();

		WebElement vin = driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-Vin_DV\"]/div/input"));
		action.moveToElement(vin).perform();
		vin.sendKeys("1HGCG5659WA086602", Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB);

		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[11]/div[2]/div/div/div/select"))
				.sendKeys("Arizona");
		driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-CostNew_DV"))
				.sendKeys("4900", Keys.ENTER);

		// assing driver to vechile
		WebElement assingdriver = driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver"));
		action.moveToElement(assingdriver).perform();
		assingdriver.click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[17]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]"))
				.click();

//	

		driver.findElement(By.id("PolicyChangeWizard-Next")).click();

		// Chaning the coverages to second Vechile
//	driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-0")).click();

		driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoveragesLV-1-0\"]"))
				.click();

		WebElement checkBox = driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox"));
//		checkBox.sendKeys("Comprehensive");
		action.moveToElement(checkBox).perform();
		System.out.println(checkBox.isSelected());
		driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox"))
				.click();
//		checkBox.click();
		driver.findElement(By.id("PolicyChangeWizard-Next")).click();

		driver.findElement(By.id(
				"PolicyChangeWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"))
				.click();

		driver.findElement(
				By.id("PolicyChangeWizard-PolicyChangeWizard_QuoteScreen-JobWizardToolbarButtonSet-BindPolicyChange"))
				.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id("JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy")).click();

	}

}
