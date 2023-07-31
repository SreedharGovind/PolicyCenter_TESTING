package com.smartims.insurancepractice.policycenter.scenario01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyRescindCancellation_TS01 {
	public void rescindCancellation(ChromeDriver driver, Actions actions) {
		driver.findElement(By.xpath(ConstantsClassPC.transactions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rescindCancellation)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rescindcancellationBindOptions)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rescindCancelNow)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();

	}

}
