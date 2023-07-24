package com.smartims.insurancepractice.policycenter.scenario11;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS11 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = CommonClass.getchromedriver();

		Actions actions = new Actions(driver);

		// Creating New Account
		AccountCreation_TS11 Create = new AccountCreation_TS11();
		Create.performAccountCreation(driver, actions);
		System.out.println("Creating New Account");
		//
		// Policy Issuance Transaction
		//
		PolicyIssuance_TS11 Issuance = new PolicyIssuance_TS11();
		Issuance.performPolicyIssuanceTransaction(driver, actions);
		System.out.println("Performing Policy Issuance Transaction");

		// Policy Change Transaction

		PolicyChange_TS11 Change = new PolicyChange_TS11();
		Change.perfromPolicyChange(driver, actions);
		System.out.println("Performing Policy Change Transaction");

		PolicyCancellation_TS11 cl = new PolicyCancellation_TS11();
		cl.policyCancellation(driver, actions);
		System.out.println("cancellation");

		// Policy Rewrite Transaction
		PolicyRewriteNewTerm_TS11 Rewrite = new PolicyRewriteNewTerm_TS11();
		Rewrite.perfromPolicyRewriteTransaction(driver, actions);
		System.out.println("Performing Policy Rewrite Transaction");

		PolicyAutoRenewal_TS11 renew = new PolicyAutoRenewal_TS11();
		renew.policyRenewal(driver, actions);
		System.out.println(" PolicyAutoRenewal");
	}

}
