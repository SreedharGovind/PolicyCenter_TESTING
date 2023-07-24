package com.smartims.insurancepractice.policycenter.scenario03;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyCancellationVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyRewriteFullTermVO;

import PolicyCenterTransactions.ConstantsClass03;
         public class PolicyCancellationFlateRate_TS03 {
         void policyCancellation2(ChromeDriver driver, Actions action) throws IOException {
		 PolicyCancellationVO cvo = new PolicyCancellationVO();
		 PolicyRewriteFullTermVO rfo = new PolicyRewriteFullTermVO();
		 cvo.setPolicyCancellationSource(ExcelUtils_TS03.getCellValueByLabel("policyCancellationFlatRateSource"));
		 cvo.setPolicyCancellationReason(ExcelUtils_TS03.getCellValueByLabel("policyCancellationFlatRateReason"));
		 cvo.setPolicyCancellationReasonDescription(ExcelUtils_TS03.getCellValueByLabel("policyCancellationFlatRateReasonDescription"));
		 cvo.setCancellationEffectiveDate(ExcelUtils_TS03.getCellValueByLabel("cancellationEffectiveDateFlatRate"));
         cvo.setPolicyCancellationBindOptions(ExcelUtils_TS03.getCellValueByLabel("policyCancellationFlatRateBindOptions"));
         rfo.setRewriteFullTermOfferingsSelection(ExcelUtils_TS03.getCellValueByLabel("rewriteFullTermOfferingsSelection"));	 
	     driver.findElement(By.id(ConstantsClass03.transaction)).click();
         driver.findElement(By.id(ConstantsClass03.cancelpolicy)).click();
         driver.findElement(By.name(ConstantsClass03.policycancellationsource)).sendKeys(cvo.getPolicyCancellationSource(), Keys.TAB);
		 driver.findElement(By.name(ConstantsClass03.policycancellationreasondescription)).sendKeys(cvo.getPolicyCancellationReasonDescription(), Keys.TAB);
		 driver.findElement(By.name(ConstantsClass03.policycancellationreason)).sendKeys(cvo.getPolicyCancellationReason(), Keys.TAB);
	   	 driver.findElement(By.id(ConstantsClass03.startcancellation)).click();
		 driver.findElement(By.id(ConstantsClass03.cancellationbindoptions)).click();
		 driver.findElement(By.id(ConstantsClass03.cancellationBindOptionsScheduleCancellation)).click();
		 Alert alert1 = driver.switchTo().alert();
		 alert1.accept();
		 driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
		 driver.findElement(By.id(ConstantsClass03.transaction)).click();
		 driver.findElement(By.id(ConstantsClass03.rewritefullterm)).click();
		 driver.findElement(By.name(ConstantsClass03.rewriteofferingselection)).sendKeys(rfo.getRewriteFullTermOfferingsSelection(), Keys.TAB);
		 driver.findElement(By.id(ConstantsClass03.rewritequote)).click();
		 driver.findElement(By.id(ConstantsClass03.rewritebindoption)).click();
		 Alert alert11 = driver.switchTo().alert();
		 alert11.accept();
		 driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
}}
