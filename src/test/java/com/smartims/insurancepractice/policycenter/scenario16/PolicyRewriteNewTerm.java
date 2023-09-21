package com.smartims.insurancepractice.policycenter.scenario16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.Constants;

import java.io.IOException;

public class PolicyRewriteNewTerm {
	// public static void main(String[] args) {
	void rewriteNewTerm(ChromeDriver driver, Actions action) throws IOException {
		SeleniumToExcel_TS16 seleniumToExcel = new SeleniumToExcel_TS16();

		// new transaction

		WebElement Trans = driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[1]/div"));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(
				By.id("PolicyFile_Summary-PolicyOverviewDashboard-PolicyDetailsDetailViewTile-RewriteNewTerm")).click();
		driver.findElement(By.name("RewriteWizard-OfferingScreen-OfferingSelection")).sendKeys("basic Program",
				Keys.ENTER);

		driver.findElement(By.name(
				"RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-RewriteWizard_PolicyInfoDV-PolicyInfoInputSet-TermType"))
				.sendKeys("Annual", Keys.ENTER);
		driver.findElement(By.id(
				"RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-RewriteWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate_dateIcon"))
				.click();
		driver.findElement(By.name(
				"RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-RewriteWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate"))
				.sendKeys("09/08/2023", Keys.ENTER);

		WebElement quote = driver.findElement(By.id(
				"RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"));
		action.moveToElement(quote).perform();
		quote.click();

		driver.findElement(By.id(
				"RewriteWizard-LOBWizardStepGroup-RewriteWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"))
				.click();
		seleniumToExcel.premium(driver, "PolicyIssuanceTS16");
		// Issue policy
		driver.findElement(By.id("RewriteWizard-RewriteWizard_QuoteScreen-JobWizardToolbarButtonSet-BindRewrite"))
				.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();
	}
}
