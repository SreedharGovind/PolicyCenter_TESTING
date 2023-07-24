package com.smartims.insurancepractice.policycenter.scenario04;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS04 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);
		Accountcreation_TS04 account = new Accountcreation_TS04();
		account.createAccount(driver, action);

		PolicyIssuance_TS04 policy = new PolicyIssuance_TS04();
		policy.policyIssue(driver, action);

		PolicyChange_TS04 policychange = new PolicyChange_TS04();
		policychange.policyChange(driver, action);

		PolicyCancellation_TS04 policycancel = new PolicyCancellation_TS04();
		policycancel.policyCancel(driver, action);

		PolicyRewriteMidTerm_TS04 rewrite = new PolicyRewriteMidTerm_TS04();
		rewrite.policyRewrite(driver, action);

		PolicyManualRenewal_TS04 policyrenew = new PolicyManualRenewal_TS04();
		policyrenew.policyrenew(driver, action);
	}
}
