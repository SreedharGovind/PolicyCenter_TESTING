package com.smartims.insurancepractice.policycenter.scenario11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.ConstantsClassPC;
import PolicyCenterTransactions.ConstantsClassPC_TS07;
import PolicyCenterTransactions.ConstantsClassPC_TS08;
import PolicyCenterTransactions.ConstantsClassPC_TS11;

public class PolicyIssuance_TS11 {

	PolicyIssuanceVO pvo = new PolicyIssuanceVO();

	public void performPolicyIssuanceTransaction(ChromeDriver driver, Actions actions)
			throws IOException, InterruptedException {

		driver.findElement(By.xpath(ConstantsClassPC_TS11.NewSubsmissonButton)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.newSubmissionScreen)).click();

		WebElement Offering = driver.findElement(By.xpath(ConstantsClassPC_TS11.OfferingSelection));
		Select offering = new Select(Offering);
		offering.selectByValue("Standard Program");

		driver.findElement(By.xpath(ConstantsClassPC_TS11.next)).click();

		WebElement CurrentlyInsured = driver.findElement(By.xpath(ConstantsClassPC_TS11.qualificationsScreen));
		Select currentlyinsured = new Select(CurrentlyInsured);
		currentlyinsured.selectByValue("Yes");

		driver.findElement(By.xpath(ConstantsClassPC_TS11.next1)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.NewPNI)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.NewPersonOption)).click();

		pvo.setPNIFirstname(ExcelUtils_TS11.getCellValueByLabel("PNIFirstname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.PNIFirstname)).sendKeys(pvo.getPNIFirstname());
		pvo.setPNILastname(ExcelUtils_TS11.getCellValueByLabel("PNILastname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.PNILastname)).sendKeys(pvo.getPNILastname());

		pvo.setPNIDOB(ExcelUtils_TS11.getCellValueByLabel("PNIDOB"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.PNIDOB)).sendKeys(pvo.getPNIDOB());

		pvo.setPNIAddressLine1(ExcelUtils_TS11.getCellValueByLabel("PNIAddressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.PNIAddressLine1)).sendKeys(pvo.getPNIAddressLine1());

		WebElement PNIState = driver.findElement(By.xpath(ConstantsClassPC_TS11.PNIState));
		Select state = new Select(PNIState);
		state.selectByValue("AZ");

		pvo.setPNIZipcode(ExcelUtils_TS11.getCellValueByLabel("PNIZipcode"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.PNIZipcode)).sendKeys(pvo.getPNIZipcode());

		WebElement AddressType = driver.findElement(By.xpath(ConstantsClassPC_TS11.PNIAddressType));
		Select addressType = new Select(AddressType);
		addressType.selectByValue("home");

		pvo.setPNILicenseNumber(ExcelUtils_TS11.getCellValueByLabel("PNILicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.PNILicenseNumber)).sendKeys(pvo.getPNILicenseNumber());

		WebElement LicenseState = driver.findElement(By.xpath(ConstantsClassPC_TS11.PNILicenseState));
		Select licenseState = new Select(LicenseState);
		licenseState.selectByValue("AZ");

		driver.findElement(By.xpath(ConstantsClassPC_TS11.PNIOK)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.toDriversScreen)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.AddDriverButton)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC_TS11.existingDriverType)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.newDriver)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.toRoles)).click();

		pvo.setExistingDriverYearFirstLicensed(ExcelUtils_TS11.getCellValueByLabel("existingDriverYearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.existingDriver1YearFirstLicensed))
				.sendKeys(pvo.getExistingDriverYearFirstLicensed());

		WebElement driver1NumberOfAccidentsPolicyLevel = driver
				.findElement(By.xpath(ConstantsClassPC_TS08.driver1NumberOfAccidentsPolicyLevel));
		Select accidentspolicylevel = new Select(driver1NumberOfAccidentsPolicyLevel);
		accidentspolicylevel.selectByValue("0");

		WebElement driver1NumberOfAccidentsAccountLevel = driver
				.findElement(By.xpath(ConstantsClassPC_TS08.driver1NumberOfAccidentsAccountLevel));
		Select accidentaccountlevel = new Select(driver1NumberOfAccidentsAccountLevel);
		accidentaccountlevel.selectByValue("0");

		WebElement driver1NumberOfViolationsPolicyLevel = driver
				.findElement(By.xpath(ConstantsClassPC_TS08.driver1NumberOfViolationsPolicyLevel));
		Select violationpolicy = new Select(driver1NumberOfViolationsPolicyLevel);
		violationpolicy.selectByValue("0");

		WebElement driver1numberOfViolationsAccountLevel = driver
				.findElement(By.xpath(ConstantsClassPC_TS08.driver1numberOfViolationsAccountLevel));
		Select violationaccount = new Select(driver1numberOfViolationsAccountLevel);
		violationaccount.selectByValue("0");

		driver.findElement(By.xpath(ConstantsClassPC_TS07.toVehiclesScreen)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS11.vehicle1AddOrRemove)).click();

		pvo.setVehicle1VIN(ExcelUtils_TS11.getCellValueByLabel("vehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.vehicle1VIN)).sendKeys(pvo.getVehicle1VIN());

		WebElement vehicle1LicenseState = driver.findElement(By.xpath(ConstantsClassPC_TS11.vehicle1LicenseState));
		Select Vehicle1LicenseState = new Select(vehicle1LicenseState);
		Vehicle1LicenseState.selectByValue("AZ");

		pvo.setVehicle1CostNew(ExcelUtils_TS11.getCellValueByLabel("vehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.vehicle1CostNew)).sendKeys(pvo.getVehicle1CostNew());

		driver.findElement(By.xpath(ConstantsClassPC_TS11.Driver1Assignment)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS11.vehicle1Driver1Assignment)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.toPACoverages)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.vehicle1Collison)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS11.toRiskAnalysIsScreen)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC_TS07.policyCreationQuote)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC_TS11.PolicyBindingOptions)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC_TS07.issue)).click();

		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}

}
