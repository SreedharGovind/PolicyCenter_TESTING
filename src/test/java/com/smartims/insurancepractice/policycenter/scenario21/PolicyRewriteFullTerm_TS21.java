package com.smartims.insurancepractice.policycenter.scenario21;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyRewriteFullTermVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyRewriteFullTerm_TS21 {

	void policyRewriteFullTerm21(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		AccountCreationVO pvo = new AccountCreationVO();

		ExcelUtils_TS21 eu21 = new ExcelUtils_TS21();

		PolicyRewriteFullTermVO prft = new PolicyRewriteFullTermVO();

		prft.setRewriteFullTermOfferingsSelection(
				ExcelUtils_TS21.getCellValueByLabel("rewriteFullTermOfferingsSelection"));

		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermButton)).click();

		Select select10 = new Select(driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermOfferings)));
		System.out.println(prft.getRewriteFullTermOfferingsSelection());
		select10.selectByVisibleText(prft.getRewriteFullTermOfferingsSelection());

		Thread.sleep(1000);
		WebElement nextButton = driver.findElement(By.id(ConstantsClass18.rewriteFullTermNextButtonId));
		actions.moveToElement(nextButton).perform();
		nextButton.click();

		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermOrganizationSearchButton)).click();

		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermOrganizationName)).sendKeys("A", Keys.TAB,
				Keys.ENTER);

		// selection of organization name

		WebElement AllRiskInsurance = driver
				.findElement(By.xpath(ConstantsClass18.rewriteFullTermOrganizationNameSelection));
		actions.moveToElement(AllRiskInsurance).perform();
		AllRiskInsurance.click();

		Select select1 = new Select(
				driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermProducerCodeSelection)));
		select1.selectByIndex(1);

		WebElement Quote = driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermQuoteButton));
		actions.moveToElement(Quote).perform();
		Quote.click();

		// Issue Policy
		driver.findElement(By.xpath(
				"//*[@id=\"RewriteWizard-RewriteWizard_QuoteScreen-JobWizardToolbarButtonSet-BindRewrite\"]/div"))
				.click();

		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		driver.findElement(By.xpath(ConstantsClass18.jobCompleteScreenViewPolicyLink)).click();
	}

}
