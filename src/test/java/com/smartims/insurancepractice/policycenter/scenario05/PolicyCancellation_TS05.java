package com.smartims.insurancepractice.policycenter.scenario05;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.ConstantsClass03;

public class PolicyCancellation_TS05 {
	void policycancel(ChromeDriver driver, Actions action) throws IOException, InterruptedException {

		PolicyCancellationVO cvo = new PolicyCancellationVO();

		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.cancelpolicy)).click();
		cvo.setPolicyCancellationSource(ExcelUtils_TS05.getCellValueByLabel("policyCancellationSource"));
		Select sourcecancel = new Select(driver.findElement(By.name(ConstantsClass03.policycancellationsource)));
		sourcecancel.selectByVisibleText(cvo.getPolicyCancellationSource());
		cvo.setPolicyCancellationReason(ExcelUtils_TS05.getCellValueByLabel("policyCancellationReason"));
		Select reasondrpdwn = new Select(driver.findElement(By.name(ConstantsClass03.policycancellationreason)));
		reasondrpdwn.selectByVisibleText(cvo.getPolicyCancellationReason());
		cvo.setCancellationEffectiveDate(ExcelUtils_TS05.getCellValueByLabel("cancellationEffectiveDate"));
		driver.findElement(By.id(ConstantsClass03.policycancelDateicon)).click();
		WebElement date = driver.findElement(By.name(ConstantsClass03.policycancelDate));
		date.sendKeys(cvo.getCancellationEffectiveDate());
		cvo.setPolicyCancellationReasonDescription(
				ExcelUtils_TS05.getCellValueByLabel("policyCancellationReasonDescription"));
		driver.findElement(By.name(ConstantsClass03.policycancellationreasondescription))
				.sendKeys(cvo.getPolicyCancellationReasonDescription());
		Thread.sleep(1000);
		driver.findElement(By.id(ConstantsClass03.startcancellation)).click();
		driver.findElement(By.id(ConstantsClass03.cancellationbindoptions)).click();
		driver.findElement(By.id(ConstantsClass03.cancellationBindOptionsScheduleCancellation)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.policyDetailsView)).click();
		driver.findElement(By.id(ConstantsClass03.cancellationbindoptions)).click();
		driver.findElement(By.id(ConstantsClass03.cancellationBindOptionCancelNow)).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}
