
package com.smartims.insurancepractice.policycenter.scenario12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.Constants;

public class PolicyManualRenewal_TS12 {
	void renewalpolicy(ChromeDriver driver, Actions action) {
		// public static void main(String[] args) {

		// new transaction

		WebElement Trans = driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[1]/div"));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(By.id("PolicyFile_Summary-PolicyOverviewDashboard-PolicyDetailsDetailViewTile-RenewPolicy"))
				.click();
		driver.findElement(By.id("RenewalWizard-Next")).click();
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[3]/div/div[2]"))
				.click();
		driver.findElement(By.id("RenewalWizard-LOBWizardStepGroup-RiskAnalysis")).click();
		WebElement click = driver.findElement(By.id("RenewalWizard-Next"));
		action.moveToElement(click).perform();
//		click.click();
		driver.findElement(By.id("RenewalWizard-Next")).click();

		// Edit Policy Transaction
		driver.findElement(By.id(
				"RenewalWizard-LOBWizardStepGroup-RenewalWizard_DifferencesScreen-JobWizardToolbarButtonSet-EditPolicyWorkflow"))
				.click();

		// Quote in Offering screen
		driver.findElement(
				By.id("RenewalWizard-OfferingScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"))
				.click();

		// Bind and Renew Policy
		WebElement bind = driver.findElement(By.id(
				"RenewalWizard-PostQuoteWizardStepSet-RenewalWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions"));
		action.moveToElement(bind).perform();
		bind.click();

		driver.findElement(By.id(
				"RenewalWizard-PostQuoteWizardStepSet-RenewalWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-IssueNow"))
				.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		// driver.findElement(By.id("JobComplete-JobCompleteScreen-JobCompleteDV-ViewJob")).click();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();

	}

}
