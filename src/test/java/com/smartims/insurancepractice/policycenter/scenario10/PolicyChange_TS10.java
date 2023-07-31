package com.smartims.insurancepractice.policycenter.scenario10;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.Constants;
import PolicyCenterTransactions.ConstantsClass18;
import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange_TS10 {

	void policyChange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		PolicyChangeVO pcvo = new PolicyChangeVO();

		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS10.getCellValueByLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS10.getCellValueByLabel("policyChangeDescription"));
		pcvo.setPolicyChangeOfferingsSelection(ExcelUtils_TS10.getCellValueByLabel("policyChangeOfferingsSelection"));

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
		Select offerings = new Select(driver.findElement(By.xpath(ConstantsClass18.offeringsTypeSelection)));
		offerings.selectByVisibleText(pcvo.getPolicyChangeOfferingsSelection());

		driver.findElement(By.xpath(ConstantsClass18.policyChangeWizardNext)).click();

		driver.findElement(By.xpath(ConstantsClass18.polChangeTermType)).sendKeys(Keys.ENTER);

//		------------------------------------
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Add)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Type)).click();
		pcvo.setPolicyChangeDriver1Firstname(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1Firstname"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Firstname))
				.sendKeys(pcvo.getPolicyChangeDriver1Firstname());
		pcvo.setPolicyChangeDriver1Lastname(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1Lastname"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Lastname))
				.sendKeys(pcvo.getPolicyChangeDriver1Lastname());
		pcvo.setPolicyChangeDriver1dateOfBirth(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1dateOfBirth"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1dateOfBirth))
				.sendKeys(pcvo.getPolicyChangeDriver1dateOfBirth());
		pcvo.setPolicyChangeDriver1Address1(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1Address1"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Address1))
				.sendKeys(pcvo.getPolicyChangeDriver1Address1());
		pcvo.setPolicyChangeDriver1City(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1City"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1City))
				.sendKeys(pcvo.getPolicyChangeDriver1City());
		pcvo.setPolicyChangeDriver1State(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1State"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1State))
				.sendKeys(pcvo.getPolicyChangeDriver1State());
		pcvo.setPolicyChangeDriver1ZIPCode(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1ZIPCode"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1ZIPCode))
				.sendKeys(pcvo.getPolicyChangeDriver1ZIPCode());
		pcvo.setPolicyChangeDriver1AdressType(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1AdressType"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1AdressType))
				.sendKeys(pcvo.getPolicyChangeDriver1AdressType());
		pcvo.setPolicyChangeDriver1LicenseNumber(
				ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1LicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1LicenseNumber))
				.sendKeys(pcvo.getPolicyChangeDriver1LicenseNumber());
		pcvo.setPolicyChangeDriver1LicenseState(ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1LicenseState))
				.sendKeys(pcvo.getPolicyChangeDriver1LicenseState());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Ok)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1Roles)).click();
		pcvo.setPolicyChangeDriver1YearFirstLicensed(
				ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1YearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1YearFirstLicensed))
				.sendKeys(pcvo.getPolicyChangeDriver1YearFirstLicensed());
		pcvo.setPolicyChangeDriver1NumberOfAccidentsPolicyLevel(
				ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1NumberOfAccidentsPolicyLevel"));
		Select roles = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1NumberOfAccidentsPolicyLevel)));
		roles.selectByValue(pcvo.getPolicyChangeDriver1NumberOfAccidentsPolicyLevel());
		pcvo.setPolicyChangeDriver1NumberOfAccidentsAccountLevel(
				ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1NumberOfAccidentsAccountLevel"));
		Select roles2 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1NumberOfAccidentsAccountLevel)));
		roles2.selectByValue(pcvo.getPolicyChangeDriver1NumberOfAccidentsAccountLevel());
		pcvo.setPolicyChangeDriver1NumberOfViolationsPolicyLevel(
				ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1NumberOfViolationsPolicyLevel"));
		Select roles3 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1NumberOfViolationsPolicyLevel)));
		roles3.selectByValue(pcvo.getPolicyChangeDriver1NumberOfViolationsPolicyLevel());
		pcvo.setPolicyChangeDriver1NumberOfViolationsAccountLevel(
				ExcelUtils_TS10.getCellValueByLabel("policyChangeDriver1NumberOfViolationsAccountLevel"));
		Select roles4 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriver1NumberOfViolationsAccountLevel)));
		roles4.selectByValue(pcvo.getPolicyChangeDriver1NumberOfViolationsAccountLevel());
		driver.findElement(By.xpath(ConstantsClassPC.toVehiclesScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Add)).click();
		pcvo.setPolicyChangeVehicle1Type(ExcelUtils_TS10.getCellValueByLabel("policyChangeVehicle1Type"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Type))
				.sendKeys(pcvo.getPolicyChangeVehicle1Type());
		pcvo.setPolicyChangeVehicle1VIN(ExcelUtils_TS10.getCellValueByLabel("policyChangeVehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1VIN))
				.sendKeys(pcvo.getPolicyChangeVehicle1VIN());
		pcvo.setPolicyChangeVehicle1LicenseState(
				ExcelUtils_TS10.getCellValueByLabel("policyChangeVehicle1LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1LicenseState))
				.sendKeys(pcvo.getPolicyChangeVehicle1LicenseState());
		pcvo.setPolicyChangeVehicle1GaragedAt(ExcelUtils_TS10.getCellValueByLabel("policyChangeVehicle1GaragedAt"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1GaragedAt))
				.sendKeys(pcvo.getPolicyChangeVehicle1GaragedAt());
		pcvo.setPolicyChangeVehicle1CostNew(ExcelUtils_TS10.getCellValueByLabel("policyChangeVehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1CostNew))
				.sendKeys(pcvo.getPolicyChangeVehicle1CostNew());
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeAssignVehicle1Driver1)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Driver2Assignment)).click();
		pcvo.setPolicyChangeVehicle1Driver1Percentage(
				ExcelUtils_TS10.getCellValueByLabel("policyChangeVehicle1Driver1Percentage"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangevehicle1Driver1Percentage)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangevehicle1Driver1Percentage))
				.sendKeys(pcvo.getPolicyChangeVehicle1Driver1Percentage());
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();
		driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();
	}
}
