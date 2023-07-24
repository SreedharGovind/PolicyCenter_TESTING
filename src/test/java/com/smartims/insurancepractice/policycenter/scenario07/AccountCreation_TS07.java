package com.smartims.insurancepractice.policycenter.scenario07;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

import PolicyCenterTransactions.ConstantsClassPC_TS07;

public class AccountCreation_TS07 {

	public static void main(String[] args) throws IOException {
	}

	public void AccountCreation(ChromeDriver driver, Actions actions) throws IOException {
		AccountCreationVO pvo = new AccountCreationVO();

		WebElement menuOption = driver.findElement(By.id(ConstantsClassPC_TS07.desktopMenuOPtions));
		actions.moveToElement(menuOption).perform();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.actionsMenu)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.clickOnAccount)).click();
		pvo.setFirstName(ExcelUtils_TS07.getCellValueByLabel("firstname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.firstName)).sendKeys(pvo.getFirstName());
		pvo.setLastName(ExcelUtils_TS07.getCellValueByLabel("lastname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.lastName)).sendKeys(pvo.getLastName());
		driver.findElement(By.id(ConstantsClassPC_TS07.searchForAccount)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.clickOnCreateAccount)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS07.selectCompany)).click();
		pvo.setAddressLine1(ExcelUtils_TS07.getCellValueByLabel("addressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.address)).sendKeys(pvo.getAddressLine1());
		pvo.setCity(ExcelUtils_TS07.getCellValueByLabel("city"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.selectcity)).sendKeys(pvo.getCity());
		pvo.setState(ExcelUtils_TS07.getCellValueByLabel("state"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.state)).sendKeys(pvo.getState());
		pvo.setZIPcode(ExcelUtils_TS07.getCellValueByLabel("zipcode"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.ZIP_code)).sendKeys(String.valueOf(pvo.getZIPcode()));
		pvo.setAddressType(ExcelUtils_TS07.getCellValueByLabel("addressType"));
		driver.findElement(By.xpath(ConstantsClassPC_TS07.addressType)).sendKeys(pvo.getAddressType());
		driver.findElement(By.id(ConstantsClassPC_TS07.searchOrganization)).click();
		pvo.setOrganizationName(ExcelUtils_TS07.getCellValueByLabel("organizationName"));
		driver.findElement(By.name(ConstantsClassPC_TS07.searchOrganizationName)).sendKeys(pvo.getOrganizationName(),
				Keys.ENTER);
		WebElement Select = driver.findElement(By.xpath(ConstantsClassPC_TS07.search));
		actions.moveToElement(Select).perform();
		Select.click();
		WebElement Update = driver.findElement(By.xpath(ConstantsClassPC_TS07.updateButton));
		actions.moveToElement(Update).perform();
		Update.click();

	}
}
