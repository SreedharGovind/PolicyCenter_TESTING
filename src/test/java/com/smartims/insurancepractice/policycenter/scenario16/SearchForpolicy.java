package com.smartims.insurancepractice.policycenter.scenario16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.Constants;

public class SearchForpolicy {
	void searchForPolicy(ChromeDriver driver, Actions action) {

		// search for the policy
		WebElement menuOption = driver.findElement(By.id(Constants.policyTab));
		action.moveToElement(menuOption).perform();
		driver.findElement(By.xpath(Constants.policySearchTab)).click();

		driver.findElement(By.name(Constants.enterPolicyNumber)).sendKeys("6547991820", Keys.ENTER);

	}

}
