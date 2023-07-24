package com.smartims.insurancepractice.policycenter.scenario07;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC;
import PolicyCenterTransactions.ConstantsClassPC_TS07;

public class PolicyChange_TS07 {

	void policychange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		PolicyChangeVO pvo = new PolicyChangeVO();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.NewTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.PolicyChangeOption)).click();

		pvo.setPolicyChangeDescription(ExcelUtils_TS07.getCellValueByLabel("policyChangeDescription"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDescription))
		.sendKeys(pvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC_TS07.StartPolicyChangeNextButton)).click();

		WebElement OfferingsDropdown = driver.findElement(By.xpath(ConstantsClassPC_TS07.OfferingSelection));

		OfferingsDropdown.click();
		Select sel = new Select(OfferingsDropdown);
		sel.selectByValue("Premium Program");

		driver.findElement(By.xpath(ConstantsClassPC_TS07.OfferingsScreenNextButton)).click();

		WebElement OffferingType = driver.findElement(By.xpath(ConstantsClassPC_TS07.TermTypeOption));
		Select sel2 = new Select(OffferingType);
		sel2.selectByValue("HalfYear");

		driver.findElement(By.xpath(ConstantsClassPC_TS07.PolicyInfoNextButton)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.NewDriverAdd)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.NewPersonOption)).click();

		pvo.setPolicyChangeExistingDriverYearFirstLicensed(
				ExcelUtils_TS07.getCellValueByLabel("policyChangeExistingDriverYearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeExistingDriverYearFirstLicensed))
		.sendKeys(pvo.getPolicyChangeExistingDriverYearFirstLicensed());
		;

		pvo.setPolicyChangeDriver1Firstname(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1Firstname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1Firstname))
		.sendKeys(pvo.getPolicyChangeDriver1Firstname());

		pvo.setPolicyChangeDriver1Lastname(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1Lastname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1Lastname))
		.sendKeys(pvo.getPolicyChangeDriver1Lastname());

		pvo.setPolicyChangeDriver1dateOfBirth(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1dateOfBirth"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1dateOfBirth))
		.sendKeys(pvo.getPolicyChangeDriver1dateOfBirth());

		pvo.setPolicyChangeDriver1Address1(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1Address1"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1Address1))
		.sendKeys(pvo.getPolicyChangeDriver1Address1());

		pvo.setPolicyChangeDriver1City(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1City"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1City))
		.sendKeys(pvo.getPolicyChangeDriver1City());

		pvo.setPolicyChangeDriver1ZIPCode(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1ZIPCode"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1ZIPCode))
		.sendKeys(pvo.getPolicyChangeDriver1ZIPCode(), Keys.TAB, Keys.TAB);

		pvo.setPolicyChangeDriver1State(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1LicenseState"));
		WebElement State = driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1State));

		Select sel3 = new Select(State);
		sel3.selectByValue("AZ");

		pvo.setPolicyChangeDriver1AdressType(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1AdressType"));
		WebElement AddressType = driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1AdressType));

		Select sel4 = new Select(AddressType);
		sel4.selectByValue("home");

		pvo.setPolicyChangeDriver1LicenseNumber(
				ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1LicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1LicenseNumber))
		.sendKeys(pvo.getPolicyChangeDriver1LicenseNumber());

		pvo.setPolicyChangeDriver1LicenseState(ExcelUtils_TS07.getCellValueByLabel("policyChangeDriver1LicenseState"));
		WebElement LicenseState = driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1LicenseState));

		Select sel5 = new Select(LicenseState);
		sel5.selectByValue("AZ");

		driver.findElement(By.xpath(ConstantsClassPC_TS07.NewDriverOkButton)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.RolesTab)).click();

		WebElement AccidentsPolicyLevel = driver
				.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1NumberOfAccidentsPolicyLevel));
		Select accidentsel = new Select(AccidentsPolicyLevel);
		accidentsel.selectByValue("0");

		WebElement AccidentsAccountLevel = driver
				.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1NumberOfAccidentsAccountLevel));
		Select accidentacc = new Select(AccidentsAccountLevel);
		accidentacc.selectByValue("0");

		WebElement ViolationPolicyLevel = driver
				.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1NumberOfViolationsPolicyLevel));
		Select violationpol = new Select(ViolationPolicyLevel);
		violationpol.selectByValue("0");

		WebElement ViolationAccountLevel = driver
				.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeDriver1NumberOfViolationsAccountLevel));
		Select violationacc = new Select(ViolationAccountLevel);
		violationacc.selectByValue("0");

		driver.findElement(By.xpath(ConstantsClassPC_TS07.DriversNextButton)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.CreateVehicleButton)).click();
		;

		pvo.setPolicyChangeVehicle1VIN(ExcelUtils_TS07.getCellValueByLabel("policyChangeVehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeVehicle1VIN))
		.sendKeys(pvo.getPolicyChangeVehicle1VIN());

		pvo.setPolicyChangeVehicle1CostNew(ExcelUtils_TS07.getCellValueByLabel("policyChangeVehicle1CostNew"));

		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeVehicle1CostNew))

		.sendKeys(pvo.getPolicyChangeVehicle1CostNew());

		pvo.setPolicyChangeDriver1LicenseState(ExcelUtils_TS07.getCellValueByLabel("policyChangeVehicle1LicenseState"));
		WebElement PolicyChangeVehicleLicenseState = driver
				.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeVehicle1LicenseState));
		Select PolicyChangeLicenseState = new Select(PolicyChangeVehicleLicenseState);
		PolicyChangeLicenseState.selectByValue("AZ");

		driver.findElement(By.xpath(ConstantsClassPC_TS07.Driver1Assignment)).click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[17]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div/div[2]"))
		.click();
		WebElement DriverAssignemnt = driver
				.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeVehicle1Driver1Assignment));
		DriverAssignemnt.clear();
		DriverAssignemnt.sendKeys("100");

		driver.findElement(By.xpath(ConstantsClassPC_TS07.VehiclesNextButton)).click();

	driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeVehicle1Comprehensive)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyChangeQuoteButton)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(ConstantsClassPC.policyChangeIssueAtRiskAnalysis)).click();

		driver.switchTo().alert().accept();

	}
}
