package com.smartims.insurancepractice.policycenter.scenario26;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.ExcelUtils;

public class AllTransactions_TS26 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = ExcelUtils.getChromeDriver();

		Actions actions = new Actions(driver);
		AccountCreation_TS26 create = new AccountCreation_TS26();
		create.AccountCreation(driver, actions);
		System.out.println("Account Created");

		PolicyIssuance_TS26 n = new PolicyIssuance_TS26();
		n.policyCreation(driver, actions);

		PolicyChange_TS26 change = new PolicyChange_TS26();
		change.policychange(driver, actions);

		PolicyChange2_TS26 change2 = new PolicyChange2_TS26();
		change2.policychange(driver, actions);

		PolicyCancellation_TS26 cl = new PolicyCancellation_TS26();
		cl.policyCancellation(driver, actions);

		PolicyReinstatement_TS26 reinstate = new PolicyReinstatement_TS26();
		reinstate.policyReinstatement(driver, actions);

		PolicyRenewal_TS26 renew = new PolicyRenewal_TS26();
		renew.policyRenew(driver, actions);

	}

}
