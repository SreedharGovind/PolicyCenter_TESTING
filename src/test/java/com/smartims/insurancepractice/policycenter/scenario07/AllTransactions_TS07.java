package com.smartims.insurancepractice.policycenter.scenario07;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS07 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();

		Actions actions = new Actions(driver);

		AccountCreation_TS07 create = new AccountCreation_TS07();
		create.AccountCreation(driver, actions);
		System.out.println("Account Creation Successful");

		PolicyIssuance_TS07 n = new PolicyIssuance_TS07();
		n.policyCreation(driver, actions);
		System.out.println("Policy Created");

		PolicyChange_TS07 c = new PolicyChange_TS07();
		c.policychange(driver, actions);
		System.out.println("Policy Change Transaction");

		PolicyAutoRenewal_TS07 renew = new PolicyAutoRenewal_TS07();
		renew.policyRenewal(driver, actions);
		System.out.println("Performing Auto Policy Renewal Transaction");

		PolicyCancellation_TS07 cl = new PolicyCancellation_TS07();
		cl.policyCancellation(driver, actions);
		System.out.println("cancellation");

		PolicyRescindCancellation_TS07 rescind = new PolicyRescindCancellation_TS07();
		rescind.rescindCancellation(driver, actions);
		System.out.println("cancellation");

		PolicyReinstatement_TS07 reinstate = new PolicyReinstatement_TS07();
		reinstate.policyReinstatement(driver, actions);
		System.out.println("PolicyReinstatement");

	}
}
