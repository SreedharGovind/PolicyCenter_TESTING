package com.smartims.insurancepractice.policycenter.scenario21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllTransactions_TS21 {

	public static void main(String[] args) throws Exception {

		ChromeDriver drivers = PolicyCenterTransactions.CommonClass.getchromedriver();
		Actions actions = new Actions(drivers);

		// Create new Account
		AccountCreation_TS21 ac = new AccountCreation_TS21();
		ac.accountCreation(drivers, actions);

		
		// create Submission
		PolicyIssuance_TS21 sub = new PolicyIssuance_TS21();
		sub.submission21(drivers, actions);

	

		// Policy Change
		PolicyChange_TS21 pc = new PolicyChange_TS21();
		pc.policyChange21(drivers, actions);

		// PolicyCancellation
		PolicyCancellation_TS21 pcan = new PolicyCancellation_TS21();
		pcan.policyChange21(drivers, actions);

		// PolicyRewriteFullTerm
		PolicyRewriteFullTerm_TS21 prft = new PolicyRewriteFullTerm_TS21();
		prft.policyRewriteFullTerm21(drivers, actions);

		// policy Renewal
		PolicyAutoRenewal_TS21 ar = new PolicyAutoRenewal_TS21();
		ar.policyRenewal(drivers, actions);

	}
}
