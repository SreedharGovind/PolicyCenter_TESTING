package com.smartims.insurancepractice.policycenter.scenario23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransaction_TS23 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();

		Actions actions = new Actions(driver);

		AccountCreation_TS23 create = new AccountCreation_TS23();
		create.AccountCreation(driver, actions);
		System.out.println("Account Created");

		PolicyIssuance_TS23 n = new PolicyIssuance_TS23();
		n.policyCreation(driver, actions);
		System.out.println("Policy Created");

		PolicyChange_TS23 change = new PolicyChange_TS23();
		change.policychange(driver, actions);
		System.out.println("Policy Changed");

		PolicyCancellation_TS23 cl = new PolicyCancellation_TS23();
		cl.PolicyCancellation(driver, actions);
		System.out.println("cancellation");

		PolicyReinstatement_TS23 reinstate = new PolicyReinstatement_TS23();
		reinstate.policyReinstatement(driver, actions);
		System.out.println(" Reinstatement");

		PolicyAutoRenewal_TS23 renew = new PolicyAutoRenewal_TS23();
		renew.policyRenewal(driver, actions);

	}

}
