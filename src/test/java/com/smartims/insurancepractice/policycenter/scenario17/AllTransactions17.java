
package com.smartims.insurancepractice.policycenter.scenario17;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions17 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);

		AccountCreation_TS17 account = new AccountCreation_TS17();
		account.createAccount(driver, action);

		PolicyIssuance_TS17 submission = new PolicyIssuance_TS17();
		submission.newSubmission(driver, action);

		PolicyChange_TS17 change = new PolicyChange_TS17();
		change.changePolicy(driver, action);

		PolicyCancellation_TS17 cancel = new PolicyCancellation_TS17();
		cancel.cancelpolicy(driver, action);

		Reinstatepolicy_TS17 reinstatePolicy = new Reinstatepolicy_TS17();
		reinstatePolicy.reinstatePolicy(driver, action);

		PolicyAutoRenewal_TS17 renew = new PolicyAutoRenewal_TS17();
		renew.policyRenewal(driver, action);
	}

}
