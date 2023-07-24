package com.smartims.insurancepractice.policycenter.scenario13;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS13 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);

		AccountCreation_TS13 account = new AccountCreation_TS13();
		account.createAccount(driver, action);

		PolicyIssuance_TS13 submission = new PolicyIssuance_TS13();
		submission.newSubmission(driver, action);

		PolicyChange_TS13 change = new PolicyChange_TS13();
		change.changePolicy(driver, action);
		
		
		PolicyCancellation_TS13 cancel = new PolicyCancellation_TS13();
		cancel.cancelpolicy(driver, action);

		PolicyAutoRenewal_TS13 renew = new PolicyAutoRenewal_TS13();
		renew.policyRenewal(driver, action);

	}

}
