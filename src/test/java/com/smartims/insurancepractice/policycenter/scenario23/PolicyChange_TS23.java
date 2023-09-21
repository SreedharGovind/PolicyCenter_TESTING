package com.smartims.insurancepractice.policycenter.scenario23;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;
import com.smartims.insurancepractice.policycenter.scenario24.SeleniumToExcel_TS24;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange_TS23 {
	void policychange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyChangeVO cvo = new PolicyChangeVO();
		SeleniumToExcel_TS23 seleniumToExcel = new SeleniumToExcel_TS23();

		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.changePolicy)).click();
		cvo.setPolicyChangeEffectiveDate(ExcelUtils_TS23.getCellValueByLabel("policyChangeEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeEffectiveDate))
				.sendKeys(cvo.getPolicyChangeEffectiveDate());
		cvo.setPolicyChangeDescription(ExcelUtils_TS23.getCellValueByLabel("policyChangeDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDescription))
				.sendKeys(cvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyOfferings)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyChangeDriver)).click();
		cvo.setPolicyChangeDriverFirstname(ExcelUtils_TS23.getCellValueByLabel("policyChangeExistingDriverFirstname"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriverFirstname)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriverFirstname))
				.sendKeys(cvo.getPolicyChangeDriverFirstname());

		cvo.setPolicyChangeExistingDriverLastname(
				ExcelUtils_TS23.getCellValueByLabel("policyChangeExistingDriverLastname"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeExistingDriverLastname)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeExistingDriverLastname))
				.sendKeys(cvo.getPolicyChangeExistingDriverLastname());

		cvo.setPolicyChangeExistingDriverdateOfBirth(
				ExcelUtils_TS23.getCellValueByLabel("policyChangeExistingDriverdateOfBirth"));
		driver.findElement(By.xpath(ConstantsClassPC.ExistingDriverdateOfBirth)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.ExistingDriverdateOfBirth))
				.sendKeys(cvo.getPolicyChangeExistingDriverdateOfBirth());

		cvo.setPolicyChangeExistingDriverAddress1(
				ExcelUtils_TS23.getCellValueByLabel("policyChangeExistingDriverAddress1"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeExistingDriverAddress1)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeExistingDriverAddress1))
				.sendKeys(cvo.getPolicyChangeExistingDriverAddress1());

		driver.findElement(By.xpath(ConstantsClassPC.toRoles)).click();

		driver.findElement(By.xpath(ConstantsClassPC.driver1GoodStudentDiscountRemove)).click();
		driver.findElement(By.xpath(ConstantsClassPC.driver1QualifiesGoodDriverDiscountRemove)).click();
		driver.findElement(By.xpath(ConstantsClassPC.driver1ApplyGoodDriverDiscountRemove)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();
		seleniumToExcel.premium(driver, "PolicyChangeTS23");


		driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
