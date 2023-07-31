package com.smartims.insurancepractice.policycenter.scenario17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

import PolicyCenterTransactions.Constants;

public class AccountCreation_TS17 {
	void createAccount(ChromeDriver driver, Actions action) throws Exception {
		AccountCreationVO avo = new AccountCreationVO();

		WebElement menuOption = driver.findElement(By.id(Constants.actionsMenu));
		action.moveToElement(menuOption).perform();
		driver.findElement(By.xpath(Constants.clickonActions)).click();
		driver.findElement(By.xpath(Constants.clickOnNewAccount)).click();

		avo.setFirstName(ExcelUtils_TS17.getCellValueByLabel("firstname"));
		avo.setLastName(ExcelUtils_TS17.getCellValueByLabel("lastname"));
		avo.setAddressLine1(ExcelUtils_TS17.getCellValueByLabel("addressLine1"));
		avo.setState(ExcelUtils_TS17.getCellValueByLabel("state"));
		avo.setAddressType(ExcelUtils_TS17.getCellValueByLabel("addressType"));
		avo.setOrganizationName(ExcelUtils_TS17.getCellValueByLabel("organizationName"));

		driver.findElement(By.name(Constants.fristName)).sendKeys(avo.getFirstName(), Keys.TAB);
		driver.findElement(By.name(Constants.lastName)).sendKeys(avo.getLastName(), Keys.TAB);
		driver.findElement(By.id(Constants.searchForaccount)).click();

		// Tap Create a new account
		WebElement Createaccount = driver.findElement(By.className(Constants.createNewAccount));
		action.moveToElement(Createaccount).perform();
		driver.findElement(By.xpath(Constants.clickonNewAccounts)).click();

		WebElement personaccount = driver.findElement(By.className(Constants.createPersonAccount));
		action.moveToElement(personaccount).perform();
		driver.findElement(By.xpath(Constants.clickonPerson)).click();

		// Entering the Address

		driver.findElement(By.name(Constants.addressLine)).sendKeys(avo.getAddressLine1(), Keys.TAB.TAB.TAB.TAB);
		// Enter the state
		WebElement State = driver.findElement(By.name(Constants.state));
		action.moveToElement(State).perform();
		driver.findElement(By.xpath(Constants.clickonState)).click();
		action.moveToElement(State).perform();
//		driver.findElement(By.xpath(Constants.ArizonaState)).click();
		driver.findElement(By.xpath(
				"//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State\"]/div/div/select"))
				.sendKeys(avo.getState(), Keys.ENTER);

		// Thread.sleep(100);

		// Enter the address type
		WebElement address = driver.findElement(By.name(Constants.addressType));
		action.moveToElement(address).perform();
		driver.findElement(By.xpath(Constants.clickOnaddressType)).click();
		action.moveToElement(address).perform();
//		driver.findElement(By.xpath(Constants.HomeAdressType)).click();
		driver.findElement(
				By.xpath("//*[@id=\"CreateAccount-CreateAccountScreen-CreateAccountDV-AddressType\"]/div/div/select"))
				.sendKeys(avo.getAddressType(), Keys.ENTER);

		driver.findElement(By.name(Constants.producerCode)).click();
		driver.findElement(By.xpath(Constants.searchOragnization)).click();

		// Selection of producer
		driver.findElement(By.xpath(Constants.searchWithA)).sendKeys(avo.getOrganizationName(), Keys.TAB, Keys.ENTER);

		// selection of organization name
		WebElement ACVriskButton = driver.findElement(By.xpath(Constants.clickOnAcvriskButton));
		action.moveToElement(ACVriskButton).perform();
		ACVriskButton.click();

		// update 
		WebElement UpdateButton = driver.findElement(By.xpath(Constants.update));
		action.moveToElement(UpdateButton).perform();
		UpdateButton.click();
		// Thread.sleep(1000);

	}

}
