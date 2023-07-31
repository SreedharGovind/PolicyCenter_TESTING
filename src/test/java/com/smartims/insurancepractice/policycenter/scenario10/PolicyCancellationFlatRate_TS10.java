package com.smartims.insurancepractice.policycenter.scenario10;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.ConstantsClass18;
import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyCancellationFlatRate_TS10 {
	PolicyCancellationVO cvo = new PolicyCancellationVO();

	public void policyCancellation(ChromeDriver driver, Actions actions) throws InterruptedException, IOException {
		driver.findElement(By.xpath(ConstantsClassPC.transactions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.cancelPolicy)).click();

		cvo.setPolicyCancellationSource(ExcelUtils_TS10.getCellValueByLabel("policyCancellationFlatRateSource"));
		Select sourcecncl = new Select(driver.findElement(By.xpath(ConstantsClassPC.policyCancellationSource)));
		sourcecncl.selectByVisibleText(cvo.getPolicyCancellationSource());

		cvo.setPolicyCancellationReason(ExcelUtils_TS10.getCellValueByLabel("policyCancellationFlatRateReason"));
		Select reasondrpdwn = new Select(driver.findElement(By.xpath(ConstantsClassPC.policyCancellationReason)));
		reasondrpdwn.selectByVisibleText(cvo.getPolicyCancellationReason());

		cvo.setPolicyCancellationReasonDescription(
				ExcelUtils_TS10.getCellValueByLabel("policyCancellationFlatRateReasonDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyCancellationReasonDescription))
				.sendKeys(cvo.getPolicyCancellationReasonDescription());
		Thread.sleep(1000);
		driver.findElement(By.id(ConstantsClassPC.StartCancellationID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyCancellationBindOptions)).click();
		driver.findElement(By.xpath(ConstantsClass18.cancelNowOption)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}

}
