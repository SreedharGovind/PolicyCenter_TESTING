package com.smartims.insurancepractice.policycenter.scenario01;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyCancellation_TS01 {
	PolicyCancellationVO cvo = new PolicyCancellationVO();

	public void policyCancellation(ChromeDriver driver, Actions actions) throws InterruptedException, IOException {
		// driver.findElement(By.id(ConstantsClassPC.policyTabBar)).click();
		driver.findElement(By.xpath(ConstantsClassPC.transactions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.cancelPolicy)).click();

		cvo.setPolicyCancellationSource(ExcelUtils_TS01.getCellValueByLabel("policyCancellationSource"));
		Select sourcecncl = new Select(driver.findElement(By.xpath(ConstantsClassPC.policyCancellationSource)));
		sourcecncl.selectByVisibleText(cvo.getPolicyCancellationSource());

		cvo.setPolicyCancellationReason(ExcelUtils_TS01.getCellValueByLabel("policyCancellationReason"));
		Select reasondrpdwn = new Select(driver.findElement(By.xpath(ConstantsClassPC.policyCancellationReason)));
		reasondrpdwn.selectByVisibleText(cvo.getPolicyCancellationReason());
		cvo.setCancellationEffectiveDate(ExcelUtils_TS01.getCellValueByLabel("cancellationEffectiveDate"));
		driver.findElement(By.id(ConstantsClassPC.cancelDateIcon)).click();
		WebElement date = driver.findElement(By.name(ConstantsClassPC.cancellationEffectiveDateID));
		date.sendKeys(cvo.getCancellationEffectiveDate());
		cvo.setPolicyCancellationReasonDescription(
				ExcelUtils_TS01.getCellValueByLabel("policyCancellationReasonDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyCancellationReasonDescription))
		.sendKeys(cvo.getPolicyCancellationReasonDescription());
		Thread.sleep(1000);
		driver.findElement(By.id(ConstantsClassPC.StartCancellationID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyCancellationBindOptions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyCancellationBindOptionsSchedule)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}

}
