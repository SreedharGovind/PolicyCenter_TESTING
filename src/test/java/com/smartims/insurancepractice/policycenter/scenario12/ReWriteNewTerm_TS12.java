package com.smartims.insurancepractice.policycenter.scenario12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.Constants;

public class ReWriteNewTerm_TS12 {
	// public static void main(String[] args) {
	void rewriteNewTerm(ChromeDriver driver, Actions action) {

		// new transaction

		WebElement Trans = driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[1]/div"));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(
				By.id("PolicyFile_Summary-PolicyOverviewDashboard-PolicyDetailsDetailViewTile-RewriteFullTerm"))
				.click();

		// select the basic program in offering screen
//		driver.findElement(By.xpath(
//				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[6]/div/div/div/div[2]/div/div/div/select/option[2]"))
//				.click();
		driver.findElement(By.name("RewriteWizard-OfferingScreen-OfferingSelection")).sendKeys("basic Program",
				Keys.ENTER);
		// next
//		driver.findElement(By.id("RewriteWizavrd-Next")).click();

		// policy info
		// term type
//		driver.findElement(By.name("RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-RewriteWizard_PolicyInfoDV-PolicyInfoInputSet-TermType")).sendKeys("Annual",Keys.ENTER);

		// effective Date
//		driver.findElement(By.name("RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-RewriteWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate")).clear();
//		driver.findElement(By.id("RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-RewriteWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate_dateIcon")).click();
//		driver.findElement(By.name("RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-RewriteWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate")).sendKeys("09/08/2023",Keys.ENTER);

		WebElement quote = driver.findElement(By.id(
				"RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"));
		action.moveToElement(quote).perform();
		quote.click();

//         driver.findElement(By.id("RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote")).click();
		// Issue policy
		driver.findElement(By.id("RewriteWizard-RewriteWizard_QuoteScreen-JobWizardToolbarButtonSet-BindRewrite"))
				.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();
	}
}
