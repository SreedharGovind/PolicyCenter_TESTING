package com.smartims.insurancepractice.policycenter.scenario02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PolicyCenterTransactions.CommonClass;

public class AllTransaction_TS02 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();

		Actions actions = new Actions(driver);
		AccountCreation_TS02 create = new AccountCreation_TS02();
		create.accountCreation(driver, actions);
		System.out.println("Account Created");

		PolicyIssuance_TS02 n = new PolicyIssuance_TS02();
		n.policyCreation(driver, actions);
		System.out.println("Policy Created");

		PolicyChange_TS02 change = new PolicyChange_TS02();
		change.policychange(driver, actions);
		System.out.println("Policy Changed");

		PolicyCancellation_TS02 cl = new PolicyCancellation_TS02();
		cl.policyCancellation(driver, actions);
		System.out.println("cancellation");

		PolicyReinstatement_TS02 reinstate = new PolicyReinstatement_TS02();
		reinstate.policyReinstatement(driver, actions);
		System.out.println(" Reinstatement");

		PolicyProRataCancellation_TS02 proRata = new PolicyProRataCancellation_TS02();
		proRata.ProRataCancellation(driver, actions);
		System.out.println(" ProRataCancellation");

		PolicyRewriteMidTerm_TS02 mid = new PolicyRewriteMidTerm_TS02();
		mid.rewriteMidTerm(driver, actions);
		System.out.println("PolicyRewriteMidTerm");

		PolicyManualRenewal_TS02 renew = new PolicyManualRenewal_TS02();
		renew.policyRenew(driver, actions);
		System.out.println("renewal ");
	}
	
	//todo:1234567890
	

}
