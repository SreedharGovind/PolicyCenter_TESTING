package com.smartims.insurancepractice.policycenter.scenario18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.scenario20.PolicyManualRenewal_TS20;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS18 {
	public static void main(String[] args) throws Exception {

		ChromeDriver drivers = CommonClass.getchromedriver();
		Actions actions = new Actions(drivers);

		// Create new Account
		AccountCreation_TS18 ac = new AccountCreation_TS18();
		ac.accountCreation(drivers, actions);

		// create Submission
		PolicyIssuance_TS18 sub = new PolicyIssuance_TS18();
		sub.submission18(drivers, actions);

		// Policy Change
		PolicyChange_TS18 pc = new PolicyChange_TS18();
		pc.policyChange18(drivers, actions);

		// PolicyCancellation
		PolicyCancellation_TS18 pcan = new PolicyCancellation_TS18();
		pcan.policyCancellation18(drivers, actions);

		// PolicyReinstatement
		PolicyReinstatement_TS18 prft = new PolicyReinstatement_TS18();
		prft.policyReinstatement18(drivers, actions);

		// policyRewrite
		PolicyRewriteFullTerm_TS18 pre = new PolicyRewriteFullTerm_TS18();
		pre.policyRewriteFullTerm18(drivers, actions);

		// policy Manual Renewal
		PolicyManualRenewal_TS20 ar = new PolicyManualRenewal_TS20();
		ar.policyRenew(drivers, actions);
	}

}
