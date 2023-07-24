package com.smartims.insurancepractice.policycenter.scenario08;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyIssuanceVO;

import PolicyCenterTransactions.ConstantsClassPC;
import PolicyCenterTransactions.ConstantsClassPC_TS07;
import PolicyCenterTransactions.ConstantsClassPC_TS08;

public class PolicyIssuance_TS08 {

	public void performPolicyIssuanceTransaction(ChromeDriver driver, Actions actions)
			throws IOException, InterruptedException {

		PolicyIssuanceVO pvo = new PolicyIssuanceVO();
		driver.findElement(By.xpath(ConstantsClassPC_TS08.NewSubsmissonButton)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS08.newSubmissionScreen)).click();
		WebElement Offering = driver.findElement(By.xpath(ConstantsClassPC_TS08.OfferingSelection));
		Select offering = new Select(Offering);
		offering.selectByValue("Standard Program");
		driver.findElement(By.xpath(ConstantsClassPC_TS08.next)).click();

		WebElement CurrentlyInsured = driver.findElement(By.xpath(ConstantsClassPC_TS08.qualificationsScreen));
		Select currentlyinsured = new Select(CurrentlyInsured);
		currentlyinsured.selectByValue("Yes");

		driver.findElement(By.xpath(ConstantsClassPC_TS08.next1)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.NewPNI)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.NewPersonOption)).click();

		pvo.setPNIFirstname(ExcelUtils_TS08.getCellValueByLabel("PNIFirstname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.PNIFirstname)).sendKeys(pvo.getPNIFirstname());
		pvo.setPNILastname(ExcelUtils_TS08.getCellValueByLabel("PNILastname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.PNILastname)).sendKeys(pvo.getPNILastname());

		pvo.setPNIDOB(ExcelUtils_TS08.getCellValueByLabel("PNIDOB"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.PNIDOB)).sendKeys(pvo.getPNIDOB());

		pvo.setPNIAddressLine1(ExcelUtils_TS08.getCellValueByLabel("PNIAddressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.PNIAddressLine1)).sendKeys(pvo.getPNIAddressLine1());

		WebElement PNIState = driver.findElement(By.xpath(ConstantsClassPC_TS08.PNIState));
		Select state = new Select(PNIState);
		state.selectByValue("AZ");

		pvo.setPNIZipcode(ExcelUtils_TS08.getCellValueByLabel("PNIZipcode"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.PNIZipcode)).sendKeys(pvo.getPNIZipcode());

		WebElement AddressType = driver.findElement(By.xpath(ConstantsClassPC_TS08.PNIAddressType));
		Select addressType = new Select(AddressType);
		addressType.selectByValue("home");

		pvo.setPNILicenseNumber(ExcelUtils_TS08.getCellValueByLabel("PNILicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.PNILicenseNumber)).sendKeys(pvo.getPNILicenseNumber());

		WebElement LicenseState = driver.findElement(By.xpath(ConstantsClassPC_TS08.PNILicenseState));
		Select licenseState = new Select(LicenseState);
		licenseState.selectByValue("AZ");

		driver.findElement(By.xpath(ConstantsClassPC_TS08.PNIOK)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.ANI)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.ANINewPerson)).click();

		pvo.setSNIFirstname(ExcelUtils_TS08.getCellValueByLabel("SNIFirstname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNIFirstname)).sendKeys(pvo.getSNIFirstname());

		pvo.setSNILastname(ExcelUtils_TS08.getCellValueByLabel("SNILastname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNILastname)).sendKeys(pvo.getSNILastname());
		;

		pvo.setSNIDOB(ExcelUtils_TS08.getCellValueByLabel("SNIDOB"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNIDOB)).sendKeys(pvo.getSNIDOB());

		pvo.setSNIAddressLine1(ExcelUtils_TS08.getCellValueByLabel("SNIAddressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNIAddressLine1)).sendKeys(pvo.getSNIAddressLine1());
		


		pvo.setSNICity(ExcelUtils_TS08.getCellValueByLabel("SNICity"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNICity)).sendKeys(pvo.getSNICity());
		
		
		pvo.setSNIState(ExcelUtils_TS08.getCellValueByLabel("SNIState"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.SNIState)).sendKeys(pvo.getSNIState());

		pvo.setSNIZipcode(ExcelUtils_TS08.getCellValueByLabel("SNIZipcode"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNIZipcode)).sendKeys(pvo.getSNIZipcode());

		WebElement SNIAddressType = driver.findElement(By.xpath(ConstantsClassPC_TS08.SNIAddressType));
		Select addresstype = new Select(SNIAddressType);
		addresstype.selectByValue("home");

		pvo.setSNILicenseNumber(ExcelUtils_TS08.getCellValueByLabel("SNILicenseNumber"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNILicenseNumber)).sendKeys(pvo.getSNILicenseNumber());

		WebElement SNILicenseState = driver.findElement(By.xpath(ConstantsClassPC_TS08.SNILicenseState));
		Select snilicensestate = new Select(SNILicenseState);
		snilicensestate.selectByValue("AZ");

		driver.findElement(By.xpath(ConstantsClassPC_TS08.SNIOK)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.toDriversScreen)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.AddDriverButton)).click();
         Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClassPC_TS08.existingDriverType)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.existingDrivername)).click();

//		driver.findElement(By.xpath(ConstantsClassPC.addDriver)).click(); 
//		WebElement ExistingDriver = driver.findElement(By.xpath(ConstantsClassPC.existingDriverType));
//		actions.moveToElement(ExistingDriver).perform();
//		WebElement ExistingDriver1 = driver.findElement(By.xpath(ConstantsClassPC.existingDriverName));
//		actions.moveToElement(ExistingDriver1).perform();
//		ExistingDriver1.click();
//		
		driver.findElement(By.xpath(ConstantsClassPC.toRoles)).click();
		pvo.setExistingDriverYearFirstLicensed(ExcelUtils_TS08.getCellValueByLabel("existingDriverYearFirstLicensed"));
		driver.findElement(By.xpath(ConstantsClassPC.existingDriverYearFirstLicensed1))
		.sendKeys(pvo.getExistingDriverYearFirstLicensed());
		pvo.setExistingDriverNumberOfAccidentsPolicyLevel(
				ExcelUtils_TS08.getCellValueByLabel("existingDriverNumberOfAccidentsPolicyLevel"));
		Select roles = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfAccidentsPolicyLevel1)));
		roles.selectByValue(pvo.getExistingDriverNumberOfAccidentsPolicyLevel());
		pvo.setExistingDriverNumberOfAccidentsAccountLevel(
				ExcelUtils_TS08.getCellValueByLabel("existingDriverNumberOfAccidentsAccountLevel"));
		Select roles2 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfAccidentsAccountLevel1)));
		roles2.selectByValue(pvo.getExistingDriverNumberOfAccidentsAccountLevel());
		pvo.setExistingDriverNumberOfViolationsPolicyLevel(
				ExcelUtils_TS08.getCellValueByLabel("existingDriverNumberOfViolationsPolicyLevel"));
		Select roles3 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfViolationsPolicyLevel1)));
		roles3.selectByValue(pvo.getExistingDriverNumberOfViolationsPolicyLevel());
		pvo.setExistingDriverNumberOfViolationsAccountLevel(
				ExcelUtils_TS08.getCellValueByLabel("existingDriverNumberOfViolationsAccountLevel"));
		Select roles4 = new Select(
				driver.findElement(By.xpath(ConstantsClassPC.existingDriverNumberOfViolationsAccountLevel1)));
		roles4.selectByValue(pvo.getExistingDriverNumberOfViolationsAccountLevel());
		
		
		driver.findElement(By.xpath(ConstantsClassPC_TS08.toVehiclesScreen )).click();


		driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle1AddOrRemove)).click();

		pvo.setVehicle1VIN(ExcelUtils_TS08.getCellValueByLabel("vehicle1VIN"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle1VIN)).sendKeys(pvo.getVehicle1VIN());

		WebElement vehicle1LicenseState = driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle1LicenseState));
		Select Vehicle1LicenseState = new Select(vehicle1LicenseState);
		Vehicle1LicenseState.selectByValue("AZ");

		pvo.setVehicle1CostNew(ExcelUtils_TS08.getCellValueByLabel("vehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle1CostNew)).sendKeys(pvo.getVehicle1CostNew());

		driver.findElement(By.xpath(ConstantsClassPC_TS08.Driver1Assignment)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS08.driver1name)).click();
//
//		driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle1AddOrRemove)).click();
//
//		pvo.setVehicle1VIN(ExcelUtils_TS08.getCellValueByLabel("vehicle1VIN"));
//		driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle1VIN)).sendKeys(pvo.getVehicle1VIN());
//
//		WebElement vehicle2LicenseState = driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle2LicenseState));
//		Select Vehicle2LicenseState = new Select(vehicle2LicenseState);
//		Vehicle2LicenseState.selectByValue("AZ");
//
//		pvo.setVehicle2CostNew(ExcelUtils_TS08.getCellValueByLabel("vehicle2CostNew"));
//		driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle2CostNew)).sendKeys(pvo.getVehicle1CostNew());
//
//		driver.findElement(By.xpath(ConstantsClassPC_TS08.vehicle2Driver2Assignment)).click();
//		driver.findElement(By.xpath(ConstantsClassPC_TS08.driver1name)).click();

		driver.findElement(By.xpath(ConstantsClassPC_TS08.CoveragesNext)).click();

		

		driver.findElement(By.xpath(ConstantsClassPC_TS07.vehicle1Collison)).click();

		driver.findElement(By.xpath(ConstantsClassPC.toRiskAnalysIsScreen)).click();

		driver.findElement(By.id(ConstantsClassPC_TS07.policyBindOptions)).click();

		driver.findElement(By.id("SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions"))

		.click();

		driver.findElement(By.xpath(ConstantsClassPC_TS07.issue)).click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		driver.findElement(By

				.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]"));

	}

}
