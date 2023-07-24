package com.smartims.insurancepractice.policycenter.scenario20;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyReinstatementVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyReinstatement_TS20 {

	void policyReinstatement20(ChromeDriver driver, Actions actions) throws IOException {

		AccountCreationVO pvo = new AccountCreationVO();
		PolicyCancellationVO pc = new PolicyCancellationVO();
		ExcelUtils_TS20 eu = new ExcelUtils_TS20();
		PolicyReinstatementVO prvo = new PolicyReinstatementVO();

		prvo.setReinstatementReason(ExcelUtils_TS20.getCellValueByLabel("reinstatementReason"));
		prvo.setReinstatementReasonDescription(ExcelUtils_TS20.getCellValueByLabel("reinstatementReasonDescription"));

		WebElement accountdrpdownclk = driver.findElement(By.xpath(ConstantsClass18.accountDropdownButton));
		actions.moveToElement(accountdrpdownclk).perform();
		accountdrpdownclk.click();

		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();

		driver.findElement(By.xpath(ConstantsClass18.reinstatementButton)).click();

		// Reason Selection for Reinstate
		WebElement reinstate = driver.findElement(By.xpath(ConstantsClass18.reinstatementReason));
		Select reason = new Select(reinstate);
		reason.selectByVisibleText(prvo.getReinstatementReason());

		driver.findElement(By.xpath(ConstantsClass18.reinstatementReasonDescription))
				.sendKeys(prvo.getReinstatementReasonDescription());

		// Quote Button
		driver.findElement(By.xpath(ConstantsClass18.reinstateScreenQuoteButton)).click();

		// Click on Reinstate Button
		driver.findElement(By.xpath(ConstantsClass18.quoteScreenReinstateButton)).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.findElement(
				By.xpath("//*[@id=\"JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy\"]/div/div/div[2]")).click();

	}

}
