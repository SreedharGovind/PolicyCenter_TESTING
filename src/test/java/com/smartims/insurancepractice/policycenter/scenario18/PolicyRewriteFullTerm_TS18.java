package com.smartims.insurancepractice.policycenter.scenario18;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyRewriteFullTermVO;

import PolicyCenterTransactions.ConstantsClass18;

public class PolicyRewriteFullTerm_TS18 {

	void policyRewriteFullTerm18(ChromeDriver driver, Actions actions) throws IOException, InterruptedException {

		PolicyRewriteFullTermVO prft = new PolicyRewriteFullTermVO();

		prft.setRewriteFullTermOfferingsSelection(
				ExcelUtils_TS18.getCellValueByLabel("rewriteFullTermOfferingsSelection"));
		prft.setRewriteFullTermTermType(ExcelUtils_TS18.getCellValueByLabel("rewriteFullTermTermType"));
		prft.setRewriteFullTermEffectiveDate(ExcelUtils_TS18.getCellValueByLabel("rewriteFulltermEffectiveDate"));

		Thread.sleep(1000);
		driver.findElement(By.xpath(ConstantsClass18.newTransactionButton)).click();
		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermButton)).click();

		Select select10 = new Select(driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermOfferings)));
		select10.selectByVisibleText(prft.getRewriteFullTermOfferingsSelection());

		WebElement nextButton = driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermNextButton));
		actions.moveToElement(nextButton).perform();
		nextButton.click();

		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermNextButton));
		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermPolicyTermType))
				.sendKeys(prft.getRewriteFullTermTermType());
		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermEffectiveDate))
				.sendKeys(prft.getRewriteFullTermEffectiveDate());
		driver.findElement(By.xpath(ConstantsClass18.rewriteFullTermAssignNewPolicyNumber)).click();

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
