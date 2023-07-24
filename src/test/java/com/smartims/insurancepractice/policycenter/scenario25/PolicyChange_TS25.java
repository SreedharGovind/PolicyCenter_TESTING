package com.smartims.insurancepractice.policycenter.scenario25;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange_TS25 {
	void policychange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyChangeVO cvo = new PolicyChangeVO();
		PolicyChangeVO pvo = new PolicyChangeVO();
		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();	
		driver.findElement(By.xpath(ConstantsClassPC.changePolicy)).click();
		cvo.setPolicyChangeEffectiveDate(ExcelUtils_TS25.getCellValueByLabel("policyChangeEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeEffectiveDate))
				.sendKeys(cvo.getPolicyChangeEffectiveDate());
		cvo.setPolicyChangeDescription(ExcelUtils_TS25.getCellValueByLabel("policyChangeDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDescription))
				.sendKeys(cvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyOfferings)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyChangeDriver)).click();
		cvo.setPolicyChangeDriver1LicenseNumber(
				ExcelUtils_TS25.getCellValueByLabel("policyChangeExistingDriverLicenseNumber"));
		System.out.println(cvo.getPolicyChangeDriver1LicenseNumber());
		driver.findElement(By.xpath(ConstantsClassPC.ExistingDriverLicenseNumber)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.ExistingDriverLicenseNumber))
				.sendKeys(cvo.getPolicyChangeDriver1LicenseNumber());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDrivertovehicle)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Add)).click();
		cvo.setPolicyChangeVehicle1Type(ExcelUtils_TS25.getCellValueByLabel("policyChangeVehicle2Type"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Type))
				.sendKeys(cvo.getPolicyChangeVehicle1Type());
		cvo.setPolicyChangeVehicle1VIN(ExcelUtils_TS25.getCellValueByLabel("policyChangeVehicle2VIN"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1VIN))
				.sendKeys(cvo.getPolicyChangeVehicle1VIN());
		cvo.setPolicyChangeVehicle1LicenseState(
				ExcelUtils_TS25.getCellValueByLabel("policyChangeVehicle2LicenseState"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1LicenseState))
				.sendKeys(cvo.getPolicyChangeVehicle1LicenseState());
		cvo.setPolicyChangeVehicle1GaragedAt(ExcelUtils_TS25.getCellValueByLabel("policyChangeVehicle2GaragedAt"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1GaragedAt))
				.sendKeys(cvo.getPolicyChangeVehicle1GaragedAt());
		cvo.setPolicyChangeVehicle1CostNew(ExcelUtils_TS25.getCellValueByLabel("policyChangeVehicle2CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1CostNew))
				.sendKeys(cvo.getPolicyChangeVehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeAssignVehicle1Driver1)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Driver1Assignment)).click();
		cvo.setPolicyChangeVehicle1Driver1Percentage(
				ExcelUtils_TS25.getCellValueByLabel("policyChangeVehicle2Driver1Percentage"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangevehicle1Driver1Percentage)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangevehicle1Driver1Percentage))
				.sendKeys(cvo.getPolicyChangeVehicle1Driver1Percentage());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();
		driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}

}
