package com.smartims.insurancepractice.policycenter.scenario22;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllTransactions_TS22 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		ChromeDriver drivers = PolicyCenterTransactions.CommonClass.getchromedriver();
		Actions actions = new Actions(drivers);

		// Create new Account
		AccountCreation_TS22 ac = new AccountCreation_TS22();
		ac.accountCreation(drivers, actions);


		// create Submission
		PolicyIssuance_TS22 sub = new PolicyIssuance_TS22();
		sub.submission22(drivers, actions);

	
		// Policy Change
		PolicyChange_TS22 pc = new PolicyChange_TS22();
		pc.policyChange22(drivers, actions);

		// PolicyCancellation
		PolicyCancellation_TS22 pcan = new PolicyCancellation_TS22();
		pcan.policyCancellation22(drivers, actions);

		// PolicyReinstatement22
		PolicyReinstatement_TS22 pr = new PolicyReinstatement_TS22();
		pr.policyReinstatement22(drivers, actions);
	
		// policy Renewal
		PolicyManualRenewal_TS22 ar = new PolicyManualRenewal_TS22();
		ar.policyRenew(drivers, actions);

	}
}
