package com.smartims.insurancepractice.policycenter.scenario15;

import com.smartims.insurancepractice.policycenter.scenario14.SeleniumToExcel_TS14;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.Constants;

public class PolicyChange_TS15 {
	void changePolicy(ChromeDriver driver, Actions action) throws Exception {

		// new transaction
		PolicyChangeVO pcvo = new PolicyChangeVO();
		SeleniumToExcel_TS15 seleniumToExcel = new SeleniumToExcel_TS15();

		WebElement Trans = driver.findElement(By.xpath(Constants.newTransaction));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(By.xpath(Constants.changePolicy)).click();
		driver.manage().window().maximize();
		// changing the effective date

		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS15.getCellValueByLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS15.getCellValueByLabel("policyChangeDescription"));

		pcvo.setPolicyChangeSNIRelationship(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNIRelationship"));
		pcvo.setPolicyChangeSNIFirstname(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNIFirstname"));
		pcvo.setPolicyChangeSNILastname(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNILastname"));
		pcvo.setPolicyChangeSNIDOB(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNIDOB"));
		pcvo.setPolicyChangeSNIAddressLine1(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNIAddressLine1"));
		pcvo.setPolicyChangeSNIAddressType(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNIAddressType"));
		pcvo.setPolicyChangeSNIZipcode(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNIZipcode"));
		pcvo.setPolicyChangeSNILicenseNumber(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNILicenseNumber"));
		pcvo.setPolicyChangeSNILicenseState(ExcelUtils_TS15.getCellValueByLabel("policyChangeSNILicenseState"));

		pcvo.setPolicyChangeDriver1MaritalStatus(
				ExcelUtils_TS15.getCellValueByLabel("policyChangeDriver1MaritalStatus"));

		driver.findElement(
				By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/div/div/div[1]/div[2]/div/div/input"))
				.sendKeys(pcvo.getPolicyChangeEffectiveDate(), Keys.TAB);

		driver.findElement(By.name(Constants.policyChangeDescription)).sendKeys(pcvo.getPolicyChangeDescription(),
				Keys.ENTER);
		driver.findElement(By.id("StartPolicyChange-StartPolicyChangeScreen-NewPolicyChange")).click();

		WebElement next = driver.findElement(By.xpath("//*[@id=\"PolicyChangeWizard-Next\"]/div/div[2]"));
		action.moveToElement(next).perform();
		next.click();

		// Adding Seconadry insured
		WebElement Secondary = driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-PolicyChangeWizard_PolicyInfoScreen-PolicyChangeWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton"));
		action.moveToElement(Secondary).perform();
		Secondary.click();
		driver.findElement(By.xpath(
				"//*[@id=\"PolicyChangeWizard-LOBWizardStepGroup-PolicyChangeWizard_PolicyInfoScreen-PolicyChangeWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-1-ContactType\"]/div/div[2]"))
				.click();

		// Relation With Insured
		driver.findElement(
				By.name("NewAdditionalNamedInsuredPopup-ContactDetailScreen-AdditionalNamedInsuredInfoDV-Relationship"))
				.sendKeys(pcvo.getPolicyChangeSNIRelationship(), Keys.ENTER);

		// Addtional insured Details
		driver.findElement(By.name(
				"NewAdditionalNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName"))
				.sendKeys(pcvo.getPolicyChangeSNIFirstname(), Keys.ENTER);
		driver.findElement(By.name(
				"NewAdditionalNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName"))
				.sendKeys(pcvo.getPolicyChangeSNILastname(), Keys.ENTER);
		driver.findElement(By.name(
				"NewAdditionalNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1"))
				.sendKeys(pcvo.getPolicyChangeSNIAddressLine1(), Keys.ENTER);
		driver.findElement(By.name(
				"NewAdditionalNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode"))
				.sendKeys(pcvo.getPolicyChangeSNIZipcode(), Keys.ENTER);
		driver.findElement(By.name(
				"NewAdditionalNamedInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType"))
				.sendKeys(pcvo.getPolicyChangeSNIAddressType(), Keys.ENTER);
		driver.findElement(By.id("NewAdditionalNamedInsuredPopup-ContactDetailScreen-Update")).click();

		// driver screen martial status
//		driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-PADrivers")).click();
		WebElement martial = driver.findElement(By.id("PolicyChangeWizard-Next"));
		action.moveToElement(martial).perform();
		martial.click();
//		driver.findElement(By.id("PolicyChangeWizard-Next")).click();
		driver.findElement(By.name(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus"))
				.sendKeys(pcvo.getPolicyChangeDriver1MaritalStatus(), Keys.ENTER);

		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"))
				.click();
		seleniumToExcel.premium(driver, "PolicyChangeTS15");

		driver.findElement(
				By.id("PolicyChangeWizard-PolicyChangeWizard_QuoteScreen-JobWizardToolbarButtonSet-BindPolicyChange"))
				.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();

	}

}
