package com.smartims.insurancepractice.policycenter.scenario06;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

import PolicyCenterTransactions.ConstantsClass03;
public class Accountcreation_TS06 {
	    void policyCreateAccount(ChromeDriver driver, Actions action) throws IOException {
		AccountCreationVO aco = new AccountCreationVO();
		aco.setFirstName(ExcelUtils_TS06.getCellValueByLabel("firstname"));
		aco.setLastName(ExcelUtils_TS06.getCellValueByLabel("lastname"));
		aco.setZIPcode(ExcelUtils_TS06.getCellValueByLabel("zipcode"));
		aco.setState(ExcelUtils_TS06.getCellValueByLabel("state"));
		aco.setAddressType(ExcelUtils_TS06.getCellValueByLabel("addressType"));
		aco.setAddressLine1(ExcelUtils_TS06.getCellValueByLabel("addressLine1"));
		aco.setOrganizationName(ExcelUtils_TS06.getCellValueByLabel("organizationName"));
		driver.findElement(By.xpath(ConstantsClass03.accountdropdown)).click();
		driver.findElement(By.id(ConstantsClass03.newaccount)).click();
		driver.findElement(By.name(ConstantsClass03.accountcreationinputname)).sendKeys("SmartIMS", Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.search)).click();
		WebElement Newaccount = driver.findElement(By.id(ConstantsClass03.createnewaccount));
		action.moveToElement(Newaccount).perform();
		Newaccount.click();
		driver.findElement(By.id(ConstantsClass03.person)).click();
		driver.findElement(By.name(ConstantsClass03.createaccountFirstName)).sendKeys(aco.getFirstName(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.createaccountLastName)).sendKeys(aco.getLastName(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.zipcode)).sendKeys(aco.getZIPcode(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.state)).sendKeys(aco.getState(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.addresstype)).sendKeys(aco.getAddressType(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.addressline)).sendKeys(aco.getAddressLine1(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.organisationsearch)).click();
		driver.findElement(By.name(	ConstantsClass03.organisationname)).sendKeys(aco.getOrganizationName(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.searchbutton)).click();
		driver.findElement(By.id(ConstantsClass03.select)).click();
		driver.findElement(By.id(ConstantsClass03.update)).click();
	}
}



