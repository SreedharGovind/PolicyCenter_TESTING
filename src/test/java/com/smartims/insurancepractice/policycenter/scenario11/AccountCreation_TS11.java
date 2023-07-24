package com.smartims.insurancepractice.policycenter.scenario11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

import PolicyCenterTransactions.ConstantsClassPC_TS11;

public class AccountCreation_TS11 {

	public void performAccountCreation(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		AccountCreationVO pvo = new AccountCreationVO();

		WebElement menuOption = driver.findElement(By.id(ConstantsClassPC_TS11.desktopMenuOPtions));
		actions.moveToElement(menuOption).perform();
		driver.findElement(By.xpath(ConstantsClassPC_TS11.actionsMenu)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS11.clickOnAccount)).click();
		pvo.setFirstName(ExcelUtils_TS11.getCellValueByLabel("firstname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.firstName)).sendKeys(pvo.getFirstName());
		pvo.setLastName(ExcelUtils_TS11.getCellValueByLabel("lastname"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.lastName)).sendKeys(pvo.getLastName());
		driver.findElement(By.id(ConstantsClassPC_TS11.searchForAccount)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS11.clickOnCreateAccount)).click();
		driver.findElement(By.xpath(ConstantsClassPC_TS11.selectCompany)).click();
		pvo.setAddressLine1(ExcelUtils_TS11.getCellValueByLabel("addressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.address)).sendKeys(pvo.getAddressLine1());
		pvo.setCity(ExcelUtils_TS11.getCellValueByLabel("city"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.selectcity)).sendKeys(pvo.getCity());
		pvo.setState(ExcelUtils_TS11.getCellValueByLabel("state"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.state)).sendKeys(pvo.getState());
		pvo.setZIPcode(ExcelUtils_TS11.getCellValueByLabel("zipcode"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.ZIP_code)).sendKeys(String.valueOf(pvo.getZIPcode()));
		pvo.setAddressType(ExcelUtils_TS11.getCellValueByLabel("addressType"));
		driver.findElement(By.xpath(ConstantsClassPC_TS11.addressType)).sendKeys(pvo.getAddressType());
		driver.findElement(By.id(ConstantsClassPC_TS11.searchOrganization)).click();
		pvo.setOrganizationName(ExcelUtils_TS11.getCellValueByLabel("organizationName"));
		driver.findElement(By.name(ConstantsClassPC_TS11.searchOrganizationName)).sendKeys(pvo.getOrganizationName(),
				Keys.ENTER);
		WebElement Select = driver.findElement(By.xpath(ConstantsClassPC_TS11.search));
		actions.moveToElement(Select).perform();
		Select.click();

		Thread.sleep(3000);

		WebElement ProducerCode = driver.findElement(By.xpath(ConstantsClassPC_TS11.ProducerCode));
		Select code = new Select(ProducerCode);
		code.selectByValue("ProducerCode:6");

		WebElement Update = driver.findElement(By.xpath(ConstantsClassPC_TS11.updateButton));
		actions.moveToElement(Update).perform();
		Update.click();

	}
}
