package com.smartims.insurancepractice.policycenter.scenario20;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllTransactions_TS20 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		ChromeDriver drivers = PolicyCenterTransactions.CommonClass.getchromedriver();
		Actions actions = new Actions(drivers);

		// Create new Account
		AccountCreation_TS20 ac = new AccountCreation_TS20();
		ac.accountCreation(drivers, actions);

		// create Submission
		PolicyIssuance_TS20 sub = new PolicyIssuance_TS20();
		sub.submission20(drivers, actions);

		// Policy Change
		PolicyChange_TS20 pc = new PolicyChange_TS20();
		pc.policyChange20(drivers, actions);

		// PolicyCancellation
		PolicyCancellation_TS20 pcan = new PolicyCancellation_TS20();
		pcan.policyChange20(drivers, actions);

		// PolicyReinstatement
		PolicyReinstatement_TS20 prft = new PolicyReinstatement_TS20();
		prft.policyReinstatement20(drivers, actions);

		// policy Renewal
		PolicyManualRenewal_TS20 ar = new PolicyManualRenewal_TS20();
		ar.policyRenew(drivers, actions);
	}

}
