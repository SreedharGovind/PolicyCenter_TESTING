package com.smartims.insurancepractice.policycenter.scenario24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange_TS24 {
	void policychange(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {
		PolicyChangeVO cvo = new PolicyChangeVO();
		PolicyChangeVO pvo = new PolicyChangeVO();
		Thread.sleep(1000);
		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.changePolicy)).click();
		cvo.setPolicyChangeEffectiveDate(ExcelUtils_TS24.getCellValueByLabel("policyChangeEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeEffectiveDate))
				.sendKeys(cvo.getPolicyChangeEffectiveDate());
		cvo.setPolicyChangeDescription(ExcelUtils_TS24.getCellValueByLabel("policyChangeDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDescription))
				.sendKeys(cvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyOfferings)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyChangeDriver)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDrivertovehicle)).click();
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAI)).click();
		driver.findElement(By.xpath(ConstantsClassPC.VehicleAISelect)).click();
		driver.findElement(By.xpath(ConstantsClassPC.removeVehicleAI)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.addVehicleAI)).click();
		Thread.sleep(1000);
		WebElement move = driver.findElement(By.xpath(ConstantsClassPC.policyChangeAIOtherContacts));
		actions.moveToElement(move).perform();
//		driver.findElement(By.xpath(ConstantsClassPC.policyChangeAIOtherContacts)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeClickOnAI)).click();
		pvo.setPolicyChangeVehicle1AIExisingPersonIntrestType(
				ExcelUtils_TS24.getCellValueByLabel("vehicle1AIExisingPersonIntrestType"));
		driver.findElement(By.xpath(ConstantsClassPC.vehicleAIExisingPersonIntrestType))
				.sendKeys(pvo.getPolicyChangeVehicle1AIExisingPersonIntrestType());

		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();

		driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
