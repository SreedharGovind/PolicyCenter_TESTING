package com.smartims.insurancepractice.policycenter.scenario05;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyRewriteMidTermVO;

import PolicyCenterTransactions.ConstantsClass03;
import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyRewriteMidTerm_TS05 {
	void policyrewriteremainder(ChromeDriver driver, Actions action) throws IOException {
		PolicyRewriteMidTermVO rvo = new PolicyRewriteMidTermVO();
		rvo.setRewriteMidTermOfferingsSelection(
				ExcelUtils_TS05.getCellValueByLabel("rewriteMidTermOfferingsSelection"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.id(ConstantsClass03.rewriteremainderofterm)).click();
		driver.findElement(By.xpath(ConstantsClassPC.rewriteMidTermOfferingsSelection))
				.sendKeys(rvo.getRewriteMidTermOfferingsSelection(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.rewritequote)).click();
		driver.findElement(By.id(ConstantsClass03.rewritebindoption)).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
	}
}
