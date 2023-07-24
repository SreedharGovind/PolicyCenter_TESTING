package com.smartims.insurancepractice.policycenter.scenario19;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllTransactions_TS19 {

	public static void main(String[] args) throws Exception {

		ChromeDriver drivers = PolicyCenterTransactions.CommonClass.getchromedriver();
		Actions actions = new Actions(drivers);

		// Create new Account
		AccountCreation_TS19 ac = new AccountCreation_TS19();
		ac.accountCreation(drivers, actions);

		// create Submission
		PolicyIssuance_TS19 sub = new PolicyIssuance_TS19();
		sub.submission19(drivers, actions);

		// Policy Change
		PolicyChange_TS19 pc = new PolicyChange_TS19();
		pc.policyChange19(drivers, actions);

		// PolicyCancellation
		PolicyCancellation_TS19 pcan = new PolicyCancellation_TS19();
		pcan.policyCancellation19(drivers, actions);

		// PolicyReinstatement
		PolicyReinstatement_TS19 prft = new PolicyReinstatement_TS19();
		prft.policyReinstatement19(drivers, actions);

		// policy Renewal
		PolicyAutoRenewal_TS19 ar = new PolicyAutoRenewal_TS19();
		ar.policyRenewal(drivers, actions);

	}

}
