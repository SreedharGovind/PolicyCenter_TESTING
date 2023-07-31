package com.smartims.insurancepractice.policycenter.scenario14;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions14 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);

		AccountCreation_TS14 account = new AccountCreation_TS14();
		account.createAccount(driver, action);

		PolicyIssuance_TS14 sub = new PolicyIssuance_TS14();
		sub.newSubmission(driver, action);

		PolicyChange_TS14 change = new PolicyChange_TS14();
		change.changePolicy(driver, action);

		PolicyManualRenewal_TS14 renew = new PolicyManualRenewal_TS14();
		renew.policyRenew(driver, action);

		PolicyCancellation_TS14 cancel = new PolicyCancellation_TS14();
		cancel.cancelpolicy(driver, action);

	}
}
