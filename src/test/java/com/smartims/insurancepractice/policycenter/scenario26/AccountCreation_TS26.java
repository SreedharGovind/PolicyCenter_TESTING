package com.smartims.insurancepractice.policycenter.scenario26;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class AccountCreation_TS26 {

	public static void main(String[] args) throws IOException {
	}

	public void AccountCreation(ChromeDriver driver, Actions actions) throws IOException {
		AccountCreationVO pvo = new AccountCreationVO();

		WebElement menuOption = driver.findElement(By.id(ConstantsClassPC.desktopMenuOPtions));
		actions.moveToElement(menuOption).perform();
		driver.findElement(By.xpath(ConstantsClassPC.actionsMenu)).click();
		driver.findElement(By.xpath(ConstantsClassPC.clickOnAccount)).click();
		pvo.setFirstName(ExcelUtils_TS26.getCellValueByLabel("firstname"));
		driver.findElement(By.xpath(ConstantsClassPC.firstName)).sendKeys(pvo.getFirstName());
		pvo.setLastName(ExcelUtils_TS26.getCellValueByLabel("lastname"));
		driver.findElement(By.xpath(ConstantsClassPC.lastName)).sendKeys(pvo.getLastName());
		driver.findElement(By.id(ConstantsClassPC.searchForAccount)).click();
		driver.findElement(By.xpath(ConstantsClassPC.clickOnCreateAccount)).click();
		driver.findElement(By.xpath(ConstantsClassPC.selectCompany)).click();
		pvo.setAddressLine1(ExcelUtils_TS26.getCellValueByLabel("addressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC.address)).sendKeys(pvo.getAddressLine1());
		pvo.setCity(ExcelUtils_TS26.getCellValueByLabel("city"));
		driver.findElement(By.xpath(ConstantsClassPC.selectcity)).sendKeys(pvo.getCity());
		pvo.setState(ExcelUtils_TS26.getCellValueByLabel("state"));
		driver.findElement(By.xpath(ConstantsClassPC.state)).sendKeys(pvo.getState());
		pvo.setZIPcode(ExcelUtils_TS26.getCellValueByLabel("zipcode"));
		driver.findElement(By.xpath(ConstantsClassPC.ZIP_code)).sendKeys(String.valueOf(pvo.getZIPcode()));
		pvo.setAddressType(ExcelUtils_TS26.getCellValueByLabel("addressType"));
		driver.findElement(By.xpath(ConstantsClassPC.addressType)).sendKeys(pvo.getAddressType());
		driver.findElement(By.id(ConstantsClassPC.searchOrganization)).click();
		pvo.setOrganizationName(ExcelUtils_TS26.getCellValueByLabel("organizationName"));
		driver.findElement(By.name(ConstantsClassPC.searchOrganizationName)).sendKeys(pvo.getOrganizationName(),
				Keys.ENTER);
		WebElement Select = driver.findElement(By.xpath(ConstantsClassPC.search));
		actions.moveToElement(Select).perform();
		Select.click();
		WebElement Update = driver.findElement(By.xpath(ConstantsClassPC.updateButton));
		actions.moveToElement(Update).perform();
		Update.click();

	}
}
