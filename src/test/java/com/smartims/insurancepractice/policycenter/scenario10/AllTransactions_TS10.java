package com.smartims.insurancepractice.policycenter.scenario10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS10 {

	public static void main(String[] args) throws Exception {

		ChromeDriver drivers = CommonClass.getchromedriver();
		Actions actions = new Actions(drivers);

		// Create new Account
		AccountCreation_TS10 ac = new AccountCreation_TS10();
		ac.AccountCreation(drivers, actions);

//		// Policy Issuance Transaction
		PolicyIssuance_TS10 issuance = new PolicyIssuance_TS10();
		issuance.submission22(drivers, actions);
		
		PolicyChange_TS10 change = new PolicyChange_TS10();
		change.policyChange(drivers, actions);

		// Policy Cancellation Transaction
		PolicyCancellation_TS10 Cancellation = new PolicyCancellation_TS10();
		Cancellation.policyCancellation(drivers, actions);

		// Policy Reinstatement Transaction
		PolicyReinstatement_TS10 Reinstatement = new PolicyReinstatement_TS10();
		Reinstatement.policyReinstatement(drivers, actions);

//		// Policy Renewal Transaction
		PolicyManaulRenewal_TS10 Renewal = new PolicyManaulRenewal_TS10();
		Renewal.policyRenew(drivers, actions);
		
		// Policy CancellationFlatRate Transaction
		
		PolicyCancellationFlatRate_TS10 cancellationFlatRate = new PolicyCancellationFlatRate_TS10();
		cancellationFlatRate.policyCancellation(drivers, actions);

		
//		// Policy Rewrite Transaction
		PolicyRewriteFullTerm_TS10 rewrite = new PolicyRewriteFullTerm_TS10();
		rewrite.policyRewriteFullTerm(drivers, actions);

	}

}
