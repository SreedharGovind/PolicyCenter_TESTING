package com.smartims.insurancepractice.policycenter.scenario19;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyReinstatementVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyReinstatement_TS19 {

	void policyReinstatement19(ChromeDriver driver, Actions actions) throws IOException {

		PolicyReinstatementVO pc = new PolicyReinstatementVO();
		pc.setReinstatementReason(ExcelUtils_TS19.getCellValueByLabel("reinstatementReason"));
		pc.setReinstatementReasonDescription(ExcelUtils_TS19.getCellValueByLabel("reinstatementReasonDescription"));
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.reinstatementButton)).click();
		WebElement reinstate = driver.findElement(By.xpath(ConstantsClass18.reinstatementReason));
		Select reason = new Select(reinstate);
		reason.selectByVisibleText(pc.getReinstatementReason());
		driver.findElement(By.xpath(ConstantsClass18.reinstatementReasonDescription))
				.sendKeys(pc.getReinstatementReasonDescription());
		driver.findElement(By.xpath(ConstantsClass18.reinstateScreenQuoteButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.quoteScreenReinstateButton)).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(
				By.xpath("//*[@id=\"JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy\"]/div/div/div[2]")).click();

	}

}
