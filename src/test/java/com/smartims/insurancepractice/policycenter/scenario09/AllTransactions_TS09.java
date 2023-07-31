package com.smartims.insurancepractice.policycenter.scenario09;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS09 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);

		AccountCreation_TS09 account = new AccountCreation_TS09();
		account.createAccount(driver, action);

		PolicyIssuance_TS09 submission = new PolicyIssuance_TS09();
		submission.newSubmission(driver, action);

		PolicyChange1_TS09 change = new PolicyChange1_TS09();
		change.changePolicy(driver, action);
//		
		PolicyCancellation_TS09 cancel = new PolicyCancellation_TS09();
		cancel.policyCancellation(driver, action);
//		
		Reinstatepolicy_TS09 reinstate = new Reinstatepolicy_TS09();
		reinstate.reinstatePolicy(driver, action);

		PolicyAutoRenewal_TS09 renew = new PolicyAutoRenewal_TS09();
		renew.policyRenewal(driver, action);

//		
	}

}
