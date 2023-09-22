package com.smartims.insurancepractice.policycenter.scenario03;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyReinstatementVO;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicyReinstatement_TS03 {
	void policyReinstate(ChromeDriver driver, Actions action) throws IOException, InterruptedException {
		PolicyReinstatementVO pro = new PolicyReinstatementVO();
		SeleniumToExcel_TS03 seleniumToExcel = new SeleniumToExcel_TS03();
		pro.setReinstatementReason(ExcelUtils_TS03.getCellValueByLabel("reason"));
		pro.setReinstatementReasonDescription(ExcelUtils_TS03.getCellValueByLabel("reasonDescription"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.reinstatepolicy)).click();
		driver.findElement(By.name(ConstantsClass03.reinstatereason)).sendKeys(pro.getReinstatementReason(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.reinstatereasondescription))
				.sendKeys(pro.getReinstatementReasonDescription(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.reinstatequote)).click();
		seleniumToExcel.premium(driver, "PolicyReinstatement_TS03");
		driver.findElement(By.id(ConstantsClass03.reinstatebutton)).click();
		Thread.sleep(20000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}
