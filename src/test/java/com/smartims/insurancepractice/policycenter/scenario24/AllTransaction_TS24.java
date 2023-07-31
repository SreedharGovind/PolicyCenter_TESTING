package com.smartims.insurancepractice.policycenter.scenario24;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransaction_TS24 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();

		Actions actions = new Actions(driver);
		AccountCreation_TS24 create = new AccountCreation_TS24();
		create.AccountCreation(driver, actions);
		System.out.println("Account Created");

		PolicyIssuance_TS24 n = new PolicyIssuance_TS24();
		n.policyCreation(driver, actions);

		PolicyChange_TS24 change = new PolicyChange_TS24();
		change.policychange(driver, actions);

		PolicyChange2_TS24 change2 = new PolicyChange2_TS24();
		change2.policychange(driver, actions);

		PolicyCancellation_TS24 cl = new PolicyCancellation_TS24();
		cl.policyCancellation(driver, actions);

		PolicyReinstatement_TS24 reinstate = new PolicyReinstatement_TS24();
		reinstate.policyReinstatement(driver, actions);

		PolicyRenewal_TS24 renew = new PolicyRenewal_TS24();
		renew.policyRenew(driver, actions);

	}

}
