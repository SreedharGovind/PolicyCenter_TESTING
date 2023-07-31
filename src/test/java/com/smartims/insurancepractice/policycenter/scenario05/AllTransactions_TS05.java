
package com.smartims.insurancepractice.policycenter.scenario05;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS05 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);

		Accountcreation_TS05 acc = new Accountcreation_TS05();
		acc.policyCreateAccount(driver, action);

		PolicyIssuance_TS05 submission = new PolicyIssuance_TS05();
		submission.policyIssuance(driver, action);

		PolicyChange_TS05 policychange = new PolicyChange_TS05();
		policychange.policychange(driver, action);

		PolicyCancellation_TS05 policycancel = new PolicyCancellation_TS05();
		policycancel.policycancel(driver, action);

		PolicyRewriteMidTerm_TS05 rewriteremainder = new PolicyRewriteMidTerm_TS05();
		rewriteremainder.policyrewriteremainder(driver, action);

		PolicyAutoRenewal_TS05 policyrenewal = new PolicyAutoRenewal_TS05();
		policyrenewal.policyRenewal(driver, action);
	}
}
