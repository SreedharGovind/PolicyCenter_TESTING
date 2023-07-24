package com.smartims.insurancepractice.policycenter.scenario25;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransactions_TS25 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();

		Actions actions = new Actions(driver);

		AccountCreation_TS25 create = new AccountCreation_TS25();
		create.AccountCreation(driver, actions);

		PolicyIssuance_TS25 n = new PolicyIssuance_TS25();
		n.policyCreation(driver, actions);

		PolicyChange_TS25 c = new PolicyChange_TS25();
		c.policychange(driver, actions);

		Cancellation_TS25 cl = new Cancellation_TS25();
		cl.policyCancellation(driver, actions);

		PolicyReinstatement_TS25 reinstate = new PolicyReinstatement_TS25();
		reinstate.policyReinstatement(driver, actions);

		PolicyAutoRenewal_TS25 renew = new PolicyAutoRenewal_TS25();
		renew.policyRenewal(driver, actions);

	}

}
