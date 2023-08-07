package com.smartims.insurancepractice.policycenter.scenario07;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyAutoRenewalVO;
import com.smartims.insurancepractice.policycenter.scenario01.ExcelUtils_TS01;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyAutoRenewal_TS07 {
	void policyRenewal(ChromeDriver driver, Actions actions) throws Exception {

		PolicyAutoRenewalVO pr = new PolicyAutoRenewalVO();

		pr.setTestingSystemClockDate(ExcelUtils_TS07.getCellValueByLabel("TestingSystemClockDate"));
		pr.setTestingSystemClockTime(ExcelUtils_TS07.getCellValueByLabel("TestingSystemClockTime"));

		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_ALT);

		WebElement internalToolsButton = driver.findElement(By.xpath(ConstantsClassPC.internalTools));
		actions.moveToElement(internalToolsButton).perform();
		internalToolsButton.click();

		WebElement testingSystemClock = driver.findElement(By.xpath(ConstantsClassPC.testingSystemClock));
		actions.moveToElement(testingSystemClock).perform();
		testingSystemClock.click();

		driver.findElement(By.xpath(ConstantsClassPC.testingSystemClockDate)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.testingSystemClockDate)).sendKeys(pr.getTestingSystemClockDate());

		driver.findElement(By.xpath(ConstantsClassPC.testingSystemClockTime)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.testingSystemClockTime)).sendKeys(pr.getTestingSystemClockTime());
		driver.findElement(By.xpath(ConstantsClassPC.policyRenewalChangeDateButton)).click();
		Thread.sleep(1000);
		WebElement serverToolsButton = driver.findElement(By.xpath(ConstantsClassPC.serverTools));
		actions.moveToElement(serverToolsButton).perform();
		serverToolsButton.click();

		WebElement batchProcessButton = driver.findElement(By.xpath(ConstantsClassPC.batchProcessInfo));
		actions.moveToElement(batchProcessButton).perform();
		batchProcessButton.click();

		WebElement policyRenewalStartRunButton = driver
				.findElement(By.xpath(ConstantsClassPC.policyRenewalStartRunButton));
		actions.moveToElement(policyRenewalStartRunButton).perform();
		policyRenewalStartRunButton.click();

		pr.setTestingSystemClockCurrentDate(ExcelUtils_TS01.getCellValueByLabel("TestingSystemClockCurrentDate"));
		pr.setTestingSystemClockCurrentTime(ExcelUtils_TS01.getCellValueByLabel("TestingSystemClockCurrentTime"));

		WebElement internalToolsButton1 = driver.findElement(By.xpath(ConstantsClassPC.internalTools));
		actions.moveToElement(internalToolsButton1).perform();
		internalToolsButton1.click();

		WebElement testingSystemClock1 = driver.findElement(By.xpath(ConstantsClassPC.testingSystemClock));
		actions.moveToElement(testingSystemClock1).perform();
		testingSystemClock1.click();

		driver.findElement(By.xpath(ConstantsClassPC.testingSystemClockDate)).clear();

		driver.findElement(By.xpath(ConstantsClassPC.testingSystemClockDate))
				.sendKeys(pr.getTestingSystemClockCurrentDate());
		driver.findElement(By.xpath(ConstantsClassPC.testingSystemClockTime)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.testingSystemClockTime))
				.sendKeys(pr.getTestingSystemClockCurrentTime());
		driver.findElement(By.xpath(ConstantsClassPC.policyRenewalChangeDateButton)).click();
		WebElement policyRenewalStartRunButton1 = driver.findElement(By.id(ConstantsClassPC.autoRenewalsettings));
		actions.moveToElement(policyRenewalStartRunButton1).perform();
		policyRenewalStartRunButton1.click();
		driver.findElement(By.id(ConstantsClassPC.returnToPolicyCenterOption2)).click();

	}

}
