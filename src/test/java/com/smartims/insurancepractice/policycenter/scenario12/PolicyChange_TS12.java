package com.smartims.insurancepractice.policycenter.scenario12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.Constants;



public class PolicyChange_TS12 {
	void changePolicy(ChromeDriver driver, Actions action) throws Exception {

		// new transaction
		PolicyChangeVO pcvo = new PolicyChangeVO();

		WebElement Trans = driver.findElement(By.xpath(Constants.newTransaction));
		action.moveToElement(Trans).perform();
		Trans.click();
		driver.findElement(By.xpath(Constants.changePolicy)).click();
		driver.manage().window().maximize();
		// changing the effective date
		pcvo.setPolicyChangeEffectiveDate(ExcelUtils_TS12.getCellValueByLabel("policyChangeEffectiveDate"));
		pcvo.setPolicyChangeDescription(ExcelUtils_TS12.getCellValueByLabel("policyChangeDescription"));
		pcvo.setPolicyChangeDriver1MaritalStatus(ExcelUtils_TS12.getCellValueByLabel("policyChangeDriver1MaritalStatus"));

		driver.findElement(
				By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/div/div/div[1]/div[2]/div/div/input"))
				.sendKeys(pcvo.getPolicyChangeEffectiveDate(), Keys.TAB);

		driver.findElement(By.name(Constants.policyChangeDescription)).sendKeys(pcvo.getPolicyChangeDescription(),
				Keys.ENTER);
		driver.findElement(By.id("StartPolicyChange-StartPolicyChangeScreen-NewPolicyChange")).click();

		driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-PersonalVehicles")).click();

		// Removeing the vehicle
		WebElement removevehicle = driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesLV-0-_Checkbox"));
		action.moveToElement(removevehicle).perform();
		removevehicle.click();

		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel_tb-Remove"))
				.click();

		// Removing driver
		driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-PADrivers")).click();
		WebElement removedriver = driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV-1-_Checkbox"));
		action.moveToElement(removedriver).perform();
		removedriver.click();
		driver.findElement(By.id("PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-Remove")).click();
		driver.findElement(By.id(
				"PolicyChangeWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"))
				.click();

		driver.findElement(
				By.id("PolicyChangeWizard-PolicyChangeWizard_QuoteScreen-JobWizardToolbarButtonSet-BindPolicyChange"))
				.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath(Constants.viewPolicy)).click();

	}

}
