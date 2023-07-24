
package com.smartims.insurancepractice.policycenter.scenario15;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;



public class AllTransactions15 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);
		
		
		AccountCreation_TS15 acc = new AccountCreation_TS15();
		acc.createAccount(driver, action);
		
		PolicyIssuance_TS15 submission= new PolicyIssuance_TS15();
		submission.newSubmission(driver, action);
		
		PolicyChange_TS15 change = new PolicyChange_TS15();
		change.changePolicy(driver, action);
		
		
		
		PolicyCancellation_TS15 cancel = new PolicyCancellation_TS15();
		cancel.cancelpolicy(driver, action);
		
		Reinstatepolicy_TS15 reinstate = new  Reinstatepolicy_TS15();
		reinstate.reinstatePolicy(driver, action);
		
		PolicyAutoRenewal_TS15 renewal= new PolicyAutoRenewal_TS15();
		renewal.policyRenewal(driver, action);

	}
}
