package com.smartims.insurancepractice.policycenter.scenario06;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;
import com.smartims.insurancepractice.policycenter.scenario05.SeleniumToExcel_TS05;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicyChange_TS06 {
	void policychange(ChromeDriver driver, Actions action) throws IOException, InterruptedException {
		PolicyChangeVO pco = new PolicyChangeVO();
		SeleniumToExcel_TS06 seleniumToExcel = new SeleniumToExcel_TS06();
		pco.setPolicyChangeEffectiveDate(ExcelUtils_TS06.getCellValueByLabel("policyChangeEffectiveDate"));
		pco.setPolicyChangeDescription(ExcelUtils_TS06.getCellValueByLabel("policyChangeDescription"));
		pco.setPolicyChangeDescription(ExcelUtils_TS06.getCellValueByLabel("policyChangeOOSDescription"));
		pco.setPolicyChangeOfferingsSelection(ExcelUtils_TS06.getCellValueByLabel("policyChangeOfferingsSelection"));
		pco.setPolicyChangePNIAddressLine1(ExcelUtils_TS06.getCellValueByLabel("policyChangePNIAddressLine1"));
		pco.setPolicyChangePNIDOB(ExcelUtils_TS06.getCellValueByLabel("policyChangePNIDOB"));
		pco.setPolicyChangeVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS06.getCellValueByLabel("policyChangeVehicle1AIExisingPersonIntrestType"));
		pco.setPolicyChangeExistingDriverdateOfBirth(
				ExcelUtils_TS06.getCellValueByLabel("policyChangeOOSExistingDriverdateOfBirth"));
		pco.setPolicyChangeVehicle1CostNew(ExcelUtils_TS06.getCellValueByLabel("policyChangeOOSVehicle1CostNew"));
		pco.setPolicyChangeVehicle1MedicalPaymentsLimit(
				ExcelUtils_TS06.getCellValueByLabel("policyChangeVehicle1MedicalPaymentsLimit"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.policychange)).click();
		driver.findElement(By.name(ConstantsClass03.policyChangeEffectiveDate))
				.sendKeys(pco.getPolicyChangeEffectiveDate(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.policyChangeDescription)).sendKeys(pco.getPolicyChangeDescription(),
				Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.startpolicychange1)).click();
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[3]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		driver.findElement(By.id(ConstantsClass03.checkboxvehicle)).click();
		driver.findElement(By.id(ConstantsClass03.changeadditionalinteresttab)).click();
		driver.findElement(By.id(ConstantsClass03.additionalChcekbox)).click();
		driver.findElement(By.id(ConstantsClass03.changeremove)).click();
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.id(ConstantsClass03.changecontactbutton));
		action.moveToElement(add).perform();
		add.click();
		WebElement existingdriver = driver.findElement(By.id(ConstantsClass03.changeexistingbutton));
		action.moveToElement(existingdriver).perform();
		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[4]/div[3]/div[2]/div/div[2]"))
				.click();
		driver.findElement(By.xpath(ConstantsClass03.changevehicleexistingPersonInteresttype))
				.sendKeys(pco.getPolicyChangeVehicle1AIExisingPersonIntrestType(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		driver.findElement(By.id(ConstantsClass03.quote1)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[7]/div/div[2]"))
				.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.policychange)).click();
		driver.findElement(By.name(ConstantsClass03.policyChangeDescription)).sendKeys(pco.getPolicyChangeDescription(),
				Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.newpolicychange)).click();
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		Thread.sleep(2000);
		driver.findElement(By.name(ConstantsClass03.changeDOB1))
				.sendKeys(pco.getPolicyChangeExistingDriverdateOfBirth(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		driver.findElement(By.name(ConstantsClass03.changecostnew)).clear();
		driver.findElement(By.name(ConstantsClass03.changecostnew)).sendKeys(pco.getPolicyChangeVehicle1CostNew(),
				Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClass03.PolicyChangeUnselectVehicle2)).click();
		driver.findElement(By.xpath(ConstantsClass03.removeVehicle2)).click();
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(ConstantsClass03.medicalLimit))
				.sendKeys(pco.getPolicyChangeVehicle1MedicalPaymentsLimit(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.validateclear)).click();
		driver.findElement(By.id(ConstantsClass03.policychangenext)).click();
		seleniumToExcel.premium(driver, "PolicyChange_TS06");
		driver.findElement(By.id(ConstantsClass03.changequote1)).click();
		driver.findElement(By.id(ConstantsClass03.bindpolicychange1)).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}
