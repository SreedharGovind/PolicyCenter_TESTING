package com.smartims.insurancepractice.policycenter.scenario17;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Reinstatepolicy_TS17 {

	// public static void main(String[] args) throws InterruptedException {

	void reinstatePolicy(ChromeDriver driver, Actions action) throws Exception {

		// new transaction reinstate

		WebElement Trans = driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[1]/div"));
		action.moveToElement(Trans).perform();
		Trans.click();

		driver.findElement(By.xpath(
				"/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[3]/div[3]/div/div[2]"))
				.click();

		// Giving the Reasom and Description
		Select Reason = new Select(driver.findElement(
				By.name("ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-ReasonCode")));
		Reason.selectByValue("other");

		driver.findElement(By.name(
				"ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-ReasonDescription"))
				.sendKeys("othe", Keys.ENTER);

		// driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[2]"))
		// .click();

		// quote
		driver.findElement(By.id(
				"ReinstatementWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"))
				.click();

		// reinstate the policy
		driver.findElement(
				By.id("ReinstatementWizard-ReinstatementWizard_QuoteScreen-JobWizardToolbarButtonSet-Reinstate"))
				.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		// view policy
		driver.findElement(By
				.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]"))
				.click();
	}
}
