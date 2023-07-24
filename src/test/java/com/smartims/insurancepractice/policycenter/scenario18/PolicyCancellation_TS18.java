package com.smartims.insurancepractice.policycenter.scenario18;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyCancellation_TS18 {
	void policyCancellation18(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		PolicyCancellationVO pc = new PolicyCancellationVO();

		pc.setPolicyCancellationSource(ExcelUtils_TS18.getCellValueByLabel("policyCancellationSource"));
		pc.setPolicyCancellationReason(ExcelUtils_TS18.getCellValueByLabel("policyCancellationReason"));
		pc.setPolicyCancellationReasonDescription(
				ExcelUtils_TS18.getCellValueByLabel("policyCancellationReasonDescription"));
		pc.setCancellationEffectiveDate(ExcelUtils_TS18.getCellValueByLabel("policyCancellationEffectiveDate"));

		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.cancelPolicyButton)).click();
		Select sourcecncl = new Select(driver.findElement(By.xpath(ConstantsClass18.sourceCancellation)));
		sourcecncl.selectByVisibleText(pc.getPolicyCancellationSource());

		WebElement ReasonDescription = driver.findElement(By.xpath(ConstantsClass18.cancellationReasonDescription));
		actions.moveToElement(ReasonDescription).perform();
		ReasonDescription.sendKeys(pc.getPolicyCancellationReasonDescription());

		Select reasondrpdwn = new Select(driver.findElement(By.xpath(ConstantsClass18.cancellationReasonSelection)));
		reasondrpdwn.selectByVisibleText(pc.getPolicyCancellationReason());

		WebElement ReasonDescription1 = driver.findElement(By.xpath(ConstantsClass18.cancellationReasonDescription));
		actions.moveToElement(ReasonDescription1).perform();

		Thread.sleep(1000);
		WebElement startCancellationButton = driver.findElement(By.xpath(ConstantsClass18.startCancellationButton));
		actions.moveToElement(startCancellationButton).perform();
		startCancellationButton.click();

		WebElement bindOptionsClick = driver.findElement(By.xpath(ConstantsClass18.bindOptions));
		actions.moveToElement(bindOptionsClick).perform();
		bindOptionsClick.click();

		WebElement cancelnow = driver.findElement(By.xpath(ConstantsClass18.cancelNowOption));
		actions.moveToElement(cancelnow).perform();
		cancelnow.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.findElement(
				By.xpath("//*[@id=\"JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy\"]/div/div/div[2]")).click();

	}

}
