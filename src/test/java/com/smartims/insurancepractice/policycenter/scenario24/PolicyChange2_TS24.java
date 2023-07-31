package com.smartims.insurancepractice.policycenter.scenario24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange2_TS24 {
	void policychange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyChangeVO cvo = new PolicyChangeVO();
		PolicyChangeVO pvo = new PolicyChangeVO();
		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.changePolicy)).click();
		cvo.setPolicyChangeEffectiveDate(ExcelUtils_TS24.getCellValueByLabel("policyChangeOOSEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeEffectiveDate))
				.sendKeys(cvo.getPolicyChangeEffectiveDate());
		cvo.setPolicyChangeDescription(ExcelUtils_TS24.getCellValueByLabel("policyChangeOOSDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDescription))
				.sendKeys(cvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyOfferings)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyChangeDriver)).click();
		cvo.setPolicyChangeExistingDriverdateOfBirth(
				ExcelUtils_TS24.getCellValueByLabel("policyChangeOOSExistingDriverdateOfBirth"));
		driver.findElement(By.xpath(ConstantsClassPC.ExistingDriverdateOfBirth)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.ExistingDriverdateOfBirth))
				.sendKeys(cvo.getPolicyChangeExistingDriverdateOfBirth());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDrivertovehicle)).click();
		pvo.setPolicyChange2Vehicle1CostNew(ExcelUtils_TS24.getCellValueByLabel("policyChangeOOSVehicle1CostNew"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1CostNew)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1CostNew))
				.sendKeys(pvo.getPolicyChange2Vehicle1CostNew());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeSelectVehicle2)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeRemoveVehicle2)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicleToCovergesScreen)).click();
		cvo.setPolicyChange2VehicleMedicalLimts(
				ExcelUtils_TS24.getCellValueByLabel("policyChangeOOSVehicleMedicalLimts"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChange2VehicleMedicalLimts))
				.sendKeys(cvo.getPolicyChange2VehicleMedicalLimts());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();
		driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
