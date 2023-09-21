package com.smartims.insurancepractice.policycenter.scenario20;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyCancellation_TS20 {

	void policyChange20(ChromeDriver driver, Actions actions) throws IOException {

		PolicyCancellationVO pc = new PolicyCancellationVO();
		pc.setPolicyCancellationSource(ExcelUtils_TS20.getCellValueByLabel("policyCancellationSource"));
		pc.setPolicyCancellationReason(ExcelUtils_TS20.getCellValueByLabel("policyCancellationReason"));
		pc.setPolicyCancellationReasonDescription(
				ExcelUtils_TS20.getCellValueByLabel("policyCancellationReasonDescription"));
		pc.setCancellationEffectiveDate(ExcelUtils_TS20.getCellValueByLabel("policyCancellationEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.cancelPolicyButton)).click();
		Select sourcecncl = new Select(driver.findElement(By.xpath(ConstantsClass18.sourceCancellation)));
		sourcecncl.selectByVisibleText(pc.getPolicyCancellationSource());
		WebElement ReasonDescription = driver.findElement(By.xpath(ConstantsClass18.cancellationReasonDescription));
		actions.moveToElement(ReasonDescription).perform();
		ReasonDescription.sendKeys(pc.getPolicyCancellationReasonDescription(), Keys.ENTER);
		Select reasondrpdwn = new Select(driver.findElement(By.xpath(ConstantsClass18.cancellationReasonSelection)));
		reasondrpdwn.selectByVisibleText(pc.getPolicyCancellationReason());
		WebElement cancelEffDateIcon = driver
				.findElement(By.id("StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate_dateIcon"));
		actions.moveToElement(cancelEffDateIcon).perform();
		cancelEffDateIcon.click();
		WebElement startCancellationButton = driver.findElement(By.xpath(ConstantsClass18.startCancellationButton));
		actions.moveToElement(startCancellationButton).perform();
		startCancellationButton.click();
		WebElement bindOptionsClick = driver.findElement(By.xpath(ConstantsClass18.bindOptions));
		actions.moveToElement(bindOptionsClick).perform();
		bindOptionsClick.click();
		WebElement scheduledCancellation = driver.findElement(By.xpath(ConstantsClass18.scheduledCancellationButton));
		actions.moveToElement(scheduledCancellation).perform();
		scheduledCancellation.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(
				By.xpath("//*[@id=\"JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy\"]/div/div/div[2]")).click();
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.rescindCancellationOption)).click();
		WebElement bindOptionsClick2 = driver.findElement(By.xpath(ConstantsClass18.bindOptions));
		actions.moveToElement(bindOptionsClick2).perform();
		bindOptionsClick2.click();
		WebElement cancelNow = driver.findElement(By.xpath(ConstantsClass18.cancelNowOption));
		actions.moveToElement(cancelNow).perform();
		cancelNow.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(
				By.xpath("//*[@id=\"JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy\"]/div/div/div[2]")).click();

	}
}
