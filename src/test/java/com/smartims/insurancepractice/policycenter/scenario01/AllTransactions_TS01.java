package com.smartims.insurancepractice.policycenter.scenario01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllTransactions_TS01 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = PolicyCenterTransactions.CommonClass.getchromedriver();

		Actions actions = new Actions(driver);

		AccountCreation_TS01 create = new AccountCreation_TS01();
		create.accountCreation(driver, actions);
		System.out.println("Account Creation  TS01");

		PolicyIssuance_TS01 n = new PolicyIssuance_TS01();
		n.policyCreation(driver, actions);
		System.out.println("Policy Creation TS01");

		PolicyChange_TS01 c = new PolicyChange_TS01();
		c.policychange(driver, actions);
		System.out.println("Policy Change TS01 ");

		PolicyCancellation_TS01 cl = new PolicyCancellation_TS01();
		cl.policyCancellation(driver, actions);
		System.out.println("Policy Schedule Cancellation TS01");

		PolicyRescindCancellation_TS01 rescind = new PolicyRescindCancellation_TS01();
		rescind.rescindCancellation(driver, actions);
		System.out.println("Policy rescind Cancellation TS01");

		PolicyReinstatement_TS01 reinstate = new PolicyReinstatement_TS01();
		reinstate.policyReinstatement(driver, actions);
		System.out.println("Policy Reinstatement TS01 ");

		PolicyProRataCancellation_TS01 proRata = new PolicyProRataCancellation_TS01();
		proRata.ProRataCancellation(driver, actions);
		System.out.println("Policy ProRataCancellation TS01");

		PolicyRewriteMidTerm_TS01 mid = new PolicyRewriteMidTerm_TS01();
		mid.rewriteMidTerm(driver, actions);
		System.out.println("Policy RewriteMidTerm TS01");

		PolicyAutoRenewal_TS01 renew = new PolicyAutoRenewal_TS01();
		renew.policyRenewal(driver, actions);
		System.out.println(" Policy AutoRenewal TS01");

	}

}
