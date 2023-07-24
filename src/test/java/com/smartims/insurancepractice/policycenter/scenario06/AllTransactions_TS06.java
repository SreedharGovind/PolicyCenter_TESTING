package com.smartims.insurancepractice.policycenter.scenario06;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import PolicyCenterTransactions.CommonClass;
        public class AllTransactions_TS06 {
	    public static void main(String[] args) throws Exception {
		ChromeDriver driver = CommonClass.getchromedriver();
		Actions action = new Actions(driver);
		
		Accountcreation_TS06 createaccount =  new Accountcreation_TS06();
		createaccount.policyCreateAccount(driver, action);
		
		PolicyIssuance_TS06 policyissue = new PolicyIssuance_TS06();
		policyissue.policyIssuance(driver, action);
		
		PolicyChange_TS06 changepolicy = new PolicyChange_TS06();
		changepolicy.policychange(driver, action);
		
		PolicyCancellation_TS06 cancelpolicy = new PolicyCancellation_TS06();
		cancelpolicy.policycancel(driver, action);
		
		PolicyReinstatement_TS06  reinstatepolicy = new PolicyReinstatement_TS06();
		reinstatepolicy.policyreinstate(driver, action);
		
		PolicyManualRenewal_TS06 renew = new PolicyManualRenewal_TS06();
		renew.policyRenew(driver, action);
	

}
}