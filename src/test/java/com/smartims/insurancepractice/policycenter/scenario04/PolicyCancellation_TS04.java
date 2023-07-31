package com.smartims.insurancepractice.policycenter.scenario04;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicyCancellation_TS04 {
	void policyCancel(ChromeDriver driver, Actions action) throws IOException {
		PolicyCancellationVO cvo = new PolicyCancellationVO();
		cvo.setPolicyCancellationReasonDescription(
				ExcelUtils_TS04.getCellValueByLabel("policyCancellationReasonDescription"));
		cvo.setPolicyCancellationSource(ExcelUtils_TS04.getCellValueByLabel("policyCancellationSource"));
		cvo.setPolicyCancellationReason(ExcelUtils_TS04.getCellValueByLabel("policyCancellationReason"));
		cvo.setCancellationEffectiveDate(ExcelUtils_TS04.getCellValueByLabel("cancellationEffectiveDate"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.cancelpolicy)).click();
		driver.findElement(By.name(ConstantsClass03.policycancellationsource))
				.sendKeys(cvo.getPolicyCancellationSource(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.policycancellationreasondescription))
				.sendKeys(cvo.getPolicyCancellationReasonDescription(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.policycancellationreason))
				.sendKeys(cvo.getPolicyCancellationReason(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.startcancellation)).click();
		driver.findElement(By.id(ConstantsClass03.cancellationbindoptions)).click();
		driver.findElement(By.id(ConstantsClass03.cancellationBindOptionsScheduleCancellation)).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}
