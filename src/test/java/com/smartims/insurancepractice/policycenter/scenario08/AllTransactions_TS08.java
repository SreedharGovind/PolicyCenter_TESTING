package com.smartims.insurancepractice.policycenter.scenario08;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS08 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();

		Actions actions = new Actions(driver);

		AccountCreation_TS08 create = new AccountCreation_TS08();
		create.AccountCreation(driver, actions);
		System.out.println("Account Created");

		PolicyIssuance_TS08 TC_08 = new PolicyIssuance_TS08();
		System.out.println("Performing Policy Issuance Transaction");
		TC_08.performPolicyIssuanceTransaction(driver, actions);

		PolicyChange_TS08 PC = new PolicyChange_TS08();
		PC.perfromPolicyChange(driver, actions);
		System.out.println("Performing Policy Change Transaction");

		PolicyCancellation_TS08 cl = new PolicyCancellation_TS08();
		cl.policyCancellation(driver, actions);
		System.out.println("cancellation");

		PolicyReinstatement_TS08 reinstate = new PolicyReinstatement_TS08();
		reinstate.policyReinstatement(driver, actions);
		System.out.println(" Reinstatement");

		PolicyManualRenewal_TS08 renew = new PolicyManualRenewal_TS08();
		renew.policyRenew(driver, actions);
		System.out.println("renewal ");

	}

}
