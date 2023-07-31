package com.smartims.insurancepractice.policycenter.scenario05;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

import PolicyCenterTransactions.ConstantsClass03;

public class Accountcreation_TS05 {
	void policyCreateAccount(ChromeDriver driver, Actions action) throws IOException {
		AccountCreationVO aco = new AccountCreationVO();
		aco.setFirstName(ExcelUtils_TS05.getCellValueByLabel("firstname"));
		aco.setLastName(ExcelUtils_TS05.getCellValueByLabel("lastname"));
		aco.setZIPcode(ExcelUtils_TS05.getCellValueByLabel("zipcode"));
		aco.setState(ExcelUtils_TS05.getCellValueByLabel("state"));
		aco.setAddressType(ExcelUtils_TS05.getCellValueByLabel("addressType"));
		aco.setAddressLine1(ExcelUtils_TS05.getCellValueByLabel("addressLine1"));
		aco.setOrganizationName(ExcelUtils_TS05.getCellValueByLabel("organizationName"));
		driver.findElement(By.xpath(ConstantsClass03.accountdropdown)).click();
		driver.findElement(By.id(ConstantsClass03.newaccount)).click();
		driver.findElement(By.name(ConstantsClass03.accountcreationinputname)).sendKeys("SmartIMS", Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.search)).click();
		WebElement Newaccount = driver.findElement(By.id(ConstantsClass03.createnewaccount));
		action.moveToElement(Newaccount).perform();
		Newaccount.click();
		System.out.println(aco.getFirstName());
		driver.findElement(By.id(ConstantsClass03.person)).click();
		driver.findElement(By.xpath(ConstantsClass03.createaccountfirstname)).sendKeys(aco.getFirstName(), Keys.TAB);
		driver.findElement(By.xpath(ConstantsClass03.createaccountlastname)).sendKeys(aco.getLastName(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.zipcode)).sendKeys(aco.getZIPcode(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.state)).sendKeys(aco.getState(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.addresstype)).sendKeys(aco.getAddressType(), Keys.TAB);
		driver.findElement(By.name(ConstantsClass03.addressline)).sendKeys(aco.getAddressLine1(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.organisationsearch)).click();
		driver.findElement(By.name(ConstantsClass03.organisationname)).sendKeys(aco.getOrganizationName(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.searchbutton)).click();
		driver.findElement(By.id(ConstantsClass03.select)).click();
		driver.findElement(By.id(ConstantsClass03.update)).click();
	}
}
