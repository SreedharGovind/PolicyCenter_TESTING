package com.smartims.insurancepractice.policycenter.scenario13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.Constants;



public class SearchForAccount {
	void searchForAccount(ChromeDriver driver,Actions action) {
		// search for the account
		WebElement menuOption = driver.findElement(By.id(Constants.accountTabBar));
		action.moveToElement(menuOption).perform();
		driver.findElement(By.xpath(Constants.clickOnTabBar)).click();

		driver.findElement(By.name(Constants.accountTabSearch)).sendKeys("6059738049",
				Keys.ENTER);
	}

}
