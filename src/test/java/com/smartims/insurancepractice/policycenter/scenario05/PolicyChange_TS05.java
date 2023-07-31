package com.smartims.insurancepractice.policycenter.scenario05;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicyChange_TS05 {
	void policychange(ChromeDriver driver, Actions action) throws IOException, InterruptedException {
		PolicyChangeVO pco = new PolicyChangeVO();
		pco.setPolicyChangeEffectiveDate(ExcelUtils_TS05.getCellValueByLabel("policyChangeEffectiveDate"));
		pco.setPolicyChangeDescription(ExcelUtils_TS05.getCellValueByLabel("policyChangeDescription"));
		pco.setPolicyChangeOfferingsSelection(ExcelUtils_TS05.getCellValueByLabel("policyChangeOfferingsSelection"));
		pco.setPolicyChangePNIAddressLine1(ExcelUtils_TS05.getCellValueByLabel("policyChangePNIAddressLine1"));
		pco.setPolicyChangePNIDOB(ExcelUtils_TS05.getCellValueByLabel("policyChangePNIDOB"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.policychange)).click();
		driver.findElement(By.name(ConstantsClass03.policyChangeEffectiveDate))
				.sendKeys(pco.getPolicyChangeEffectiveDate(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.policyChangeDescription)).sendKeys(pco.getPolicyChangeDescription(),
				Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.startpolicychange)).click();
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		driver.findElement(By.id(ConstantsClass03.policychangeaddressmenubutton)).click();
		driver.findElement(By.id(ConstantsClass03.policychangeEditMenubutton)).click();
		driver.findElement(By.name(ConstantsClass03.policychangepniaddressline1)).clear();
		driver.findElement(By.name(ConstantsClass03.policychangepniaddressline1))
				.sendKeys(pco.getPolicyChangePNIAddressLine1(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.policychangeEdit)).click();
		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-PolicyChangeWizard_PolicyInfoScreen-PolicyChangeWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV-0-_Checkbox"))
				.click();
		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-PolicyChangeWizard_PolicyInfoScreen-PolicyChangeWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-Remove"))
				.click();
		driver.findElement(By.id(ConstantsClass03.changenext)).click();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[2]/div[2]/div/div/div/div[9]/div[2]/div/div/input"))
				.clear();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[2]/div[2]/div/div/div/div[9]/div[2]/div/div/input"))
				.sendKeys(pco.getPolicyChangePNIDOB(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.changequote)).click();
		driver.findElement(By.id(ConstantsClass03.bindpolicychange)).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}