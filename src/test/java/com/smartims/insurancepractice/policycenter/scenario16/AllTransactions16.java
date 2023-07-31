package com.smartims.insurancepractice.policycenter.scenario16;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions16 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);

		AccountCreation_TS16 account = new AccountCreation_TS16();
		account.createAccount(driver, action);

		PolicyIssuance_TS16 submission = new PolicyIssuance_TS16();
		submission.newSubmission(driver, action);

		PolicyChange1_TS16 change = new PolicyChange1_TS16();
		change.changePolicy(driver, action);

		PolicyChange2_TS16 change2 = new PolicyChange2_TS16();
		change2.changePolicy(driver, action);

		PolicyManualRenewal_TS16 renew = new PolicyManualRenewal_TS16();
		renew.policyRenew(driver, action);
	}

}
