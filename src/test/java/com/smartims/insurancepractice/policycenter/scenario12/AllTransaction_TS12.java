package com.smartims.insurancepractice.policycenter.scenario12;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransaction_TS12 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);

		AccountCreation_TS12 account = new AccountCreation_TS12();
		account.createAccount(driver, action);

		PolicyIssuance_TS12 submission = new PolicyIssuance_TS12();
		submission.newSubmission(driver, action);

		PolicyChange_TS12 change = new PolicyChange_TS12();
		change.changePolicy(driver, action);

		PolicyCancellation_TS12 cancel = new PolicyCancellation_TS12();
		cancel.cancelpolicy(driver, action);

		ReWriteNewTerm_TS12 rewrite = new ReWriteNewTerm_TS12();
		rewrite.rewriteNewTerm(driver, action);

		PolicyManualRenewal_TS12 renew = new PolicyManualRenewal_TS12();
		renew.renewalpolicy(driver, action);
	}

}
