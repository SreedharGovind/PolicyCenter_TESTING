package com.smartims.insurancepractice.policycenter.scenario06;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicyCancellation_TS06 {
	void policycancel(ChromeDriver driver, Actions action) throws IOException {
		PolicyCancellationVO cvo = new PolicyCancellationVO();
		cvo.setPolicyCancellationReasonDescription(
				ExcelUtils_TS06.getCellValueByLabel("policyCancellationReasonDescription"));
		cvo.setPolicyCancellationSource(ExcelUtils_TS06.getCellValueByLabel("policyCancellationSource"));
		cvo.setPolicyCancellationReason(ExcelUtils_TS06.getCellValueByLabel("policyCancellationReason"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.cancelpolicy)).click();
		driver.findElement(By.name(ConstantsClass03.policycancellationsource))
				.sendKeys(cvo.getPolicyCancellationSource(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.policycancellationreasondescription))
				.sendKeys(cvo.getPolicyCancellationReasonDescription(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.policycancellationreason))
				.sendKeys(cvo.getPolicyCancellationReason(), Keys.TAB);
		driver.findElement(By.id("StartCancellation-StartCancellationScreen-0")).click();
		driver.findElement(By.id(ConstantsClass03.cancellationbindoptions)).click();
		driver.findElement(By.id(ConstantsClass03.cancellationBindOptionsScheduleCancellation)).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}
