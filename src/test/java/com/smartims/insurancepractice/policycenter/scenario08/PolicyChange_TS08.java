package com.smartims.insurancepractice.policycenter.scenario08;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC_TS08;

public class PolicyChange_TS08 {

	public void perfromPolicyChange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		PolicyChangeVO pvo = new PolicyChangeVO();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.NewTransactionButton)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.PolicyChangeOption)).click();

		pvo.setPolicyChangeDescription(ExcelUtils_TS08.getCellValueByLabel("policyChangeDescription"));
		//
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDescription))
		.sendKeys(pvo.getPolicyChangeDescription());
		//
		driver.findElement(By.xpath(ConstantsClassPC_TS08.StartPolicyChangeNextButton)).click();

		WebElement Offering = driver.findElement(By.xpath(ConstantsClassPC_TS08.OfferingSelection));
		Select offering = new Select(Offering);
		offering.selectByValue("Basic Program");

		driver.findElement(By.xpath(ConstantsClassPC_TS08.next)).click();

		WebElement TermType = driver.findElement(By.xpath(ConstantsClassPC_TS08.TermTypeOption));
		Select termtype = new Select(TermType);
		termtype.selectByValue("Annual");

		driver.findElement(By.xpath(ConstantsClassPC_TS08.next1)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.addDriver)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08. NewDriverOption)).click();

		pvo.setPolicyChangeExistingDriverYearFirstLicensed(
				ExcelUtils_TS08.getCellValueByLabel("policyChangeExistingDriverYearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeExistingDriverYearFirstLicensed));

		pvo.setPolicyChangeDriver1Firstname(ExcelUtils_TS08.getCellValueByLabel("policyChangeDriver1Firstname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1Firstname))
		.sendKeys(pvo.getPolicyChangeDriver1Firstname());

		pvo.setPolicyChangeDriver1Lastname(ExcelUtils_TS08.getCellValueByLabel("policyChangeDriver1Lastname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1Lastname))
		.sendKeys(pvo.getPolicyChangeDriver1Lastname());

		pvo.setPolicyChangeDriver1dateOfBirth(
				ExcelUtils_TS08.getCellValueByLabel("policyChangeDriver1dateOfBirth"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1dateOfBirth)).sendKeys(pvo.getPolicyChangeDriver1dateOfBirth());

		pvo.setPolicyChangeDriver1Address1(ExcelUtils_TS08.getCellValueByLabel("policyChangeDriver1Address1"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1Address1))
		.sendKeys(pvo.getPolicyChangeDriver1Address1());

		pvo.setPolicyChangeDriver1City(ExcelUtils_TS08.getCellValueByLabel("policyChangeDriver1City"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1City))
		.sendKeys(pvo.getPolicyChangeDriver1City());

		WebElement DriverState = driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1State));
		Select state = new Select(DriverState);
		state.selectByValue("AZ");

		pvo.setPolicyChangeDriver1ZIPCode(ExcelUtils_TS08.getCellValueByLabel("policyChangeDriver1ZIPCode"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1ZIPCode))
		.sendKeys(pvo.getPolicyChangeDriver1ZIPCode());

		WebElement AddressType = driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1AdressType));
		Select addresstype = new Select(AddressType);
		addresstype.selectByValue("home");

		pvo.setPolicyChangeDriver1LicenseNumber(
				ExcelUtils_TS08.getCellValueByLabel("policyChangeDriver1LicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1LicenseNumber))
		.sendKeys(pvo.getPolicyChangeDriver1LicenseNumber());
		;

		WebElement LicenseState = driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1LicenseState));
		Select licensestate = new Select(LicenseState);
		licensestate.selectByValue("AZ");
		
		
		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNIOK)).click();
		
		driver.findElement(By.xpath(ConstantsClassPC_TS08.RolesTab)).click();
		
		pvo.setPolicyChangeDriver1YearFirstLicensed(ExcelUtils_TS08.getCellValueByLabel("policyChangeDriver1YearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.existingDriverYearFirstLicensed)).sendKeys(pvo.getPolicyChangeDriver1YearFirstLicensed());
		

		WebElement accidentaccount = driver
				.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1NumberOfAccidentsPolicyLevel));
		Select AccidentAccount = new Select(accidentaccount);
		AccidentAccount.selectByValue("0");

		WebElement accidentpolicy = driver
				.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1NumberOfAccidentsAccountLevel));
		Select AccidentPolicy = new Select(accidentpolicy);
		AccidentPolicy.selectByValue("0");

		WebElement Violationaccount = driver
				.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1NumberOfViolationsAccountLevel));
		Select violationaccount = new Select(Violationaccount);
		violationaccount.selectByValue("0");

		WebElement violationpolicy = driver
				.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeDriver1NumberOfViolationsPolicyLevel));
		Select Violationpolicy = new Select(violationpolicy);
		Violationpolicy.selectByValue("0");
		
		driver.findElement(By.xpath(ConstantsClassPC_TS08.VehiclesNextButton)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle1AddOrRemove)).click();

		pvo.setPolicyChangeVehicle1VIN(ExcelUtils_TS08.getCellValueByLabel("policyChangeVehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeVehicle1VIN))
		.sendKeys(pvo.getPolicyChangeVehicle1VIN());

		pvo.setPolicyChangeVehicle1LicenseState(
				ExcelUtils_TS08.getCellValueByLabel("policyChangeVehicle1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeVehicle1LicenseState))
		.sendKeys(pvo.getPolicyChangeVehicle1LicenseState());

		pvo.setPolicyChangeVehicle1CostNew(ExcelUtils_TS08.getCellValueByLabel("policyChangeVehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeVehicle1CostNew))
		.sendKeys(pvo.getPolicyChangeVehicle1CostNew());

		driver.findElement(By.xpath(ConstantsClassPC_TS08.Driver1Assignment)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.driver2policychange)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.next1)).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC_TS08.policyChangeQuoteButton)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC_TS08.rewriteMidTermPolicyIssue)).click();

		driver.switchTo().alert().accept();

	}

}
