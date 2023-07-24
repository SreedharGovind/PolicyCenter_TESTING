package com.smartims.insurancepractice.policycenter.scenario04;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

import PolicyCenterTransactions.ConstantsClass03;
public class Accountcreation_TS04 {
        void createAccount(ChromeDriver driver ,Actions action) throws IOException, InterruptedException {
		AccountCreationVO avo = new AccountCreationVO();
		avo.setFirstName(ExcelUtils_TS04.getCellValueByLabel("firstname"));
		avo.setLastName(ExcelUtils_TS04.getCellValueByLabel("lastname"));
		avo.setZIPcode(ExcelUtils_TS04.getCellValueByLabel("zipcode"));      
		avo.setState(ExcelUtils_TS04.getCellValueByLabel("state"));
		avo.setCity(ExcelUtils_TS04.getCellValueByLabel("city"));
		avo.setAddressLine1(ExcelUtils_TS04.getCellValueByLabel("addressLine1"));
		avo.setOrganizationName(ExcelUtils_TS04.getCellValueByLabel("organizationName"));
        avo.setAddressType(ExcelUtils_TS04.getCellValueByLabel("addressType"));
        driver.findElement(By.xpath(ConstantsClass03.accountdropdown)).click();
        driver.findElement(By.id(ConstantsClass03.newaccount)).click();
        Thread.sleep(2000);
        driver.findElement(By.name(ConstantsClass03.enteraccountfirstname)).sendKeys(avo.getFirstName(), Keys.TAB);
	    driver.findElement(By.name(ConstantsClass03.enteraccountlastname)).sendKeys(avo.getLastName(), Keys.TAB);
	    driver.findElement(By.id(ConstantsClass03.search)).click();
        driver.findElement(By.id(ConstantsClass03.createnewaccount)).click();
        driver.findElement(By.id(ConstantsClass03.person)).click();
        driver.findElement(By.name(ConstantsClass03.zipcode)).sendKeys(avo.getZIPcode(), Keys.TAB);
        driver.findElement(By.name(ConstantsClass03.state)).sendKeys(avo.getState(), Keys.TAB);
        driver.findElement(By.name(ConstantsClass03.city)).sendKeys(avo.getCity(), Keys.TAB);
        driver.findElement(By.name(ConstantsClass03.addressline)).sendKeys(avo.getAddressLine1(), Keys.TAB);
        driver.findElement(By.id(ConstantsClass03.organisationsearch)).click();
	    driver.findElement(By.name(ConstantsClass03.organisationname)).sendKeys(avo.getOrganizationName(), Keys.TAB);
	    driver.findElement(By.id(ConstantsClass03.searchbutton)).click();
	    driver.findElement(By.id(ConstantsClass03.select)).click();
	    driver.findElement(By.name(ConstantsClass03.addresstype)).sendKeys(avo.getAddressType(), Keys.TAB);
	    driver.findElement(By.id(ConstantsClass03.update)).click();	
        }}

