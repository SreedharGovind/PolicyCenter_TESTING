package com.smartims.insurancepractice.policycenter.scenario03;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
        public class AllTransactions_TS03 {
		public static void main(String[] args) throws Exception {
			
		ChromeDriver driver = CommonClass.getChromeDriver();
		Actions action = new Actions(driver); 
		
		Accountcreation_TS03 account = new Accountcreation_TS03();
		account.createAccount(driver, action);
		
		PolicySubmission_TS03 policy = new PolicySubmission_TS03();
		policy.policyIssue(driver, action);
		
		PolicyChange_TS03 policychange = new PolicyChange_TS03();
		policychange.policyChange(driver, action);
		
		PolicyCancellation_TS03 policycancel = new PolicyCancellation_TS03();
		policycancel.policyCancellation(driver, action);
		
		PolicyReinstatement_TS03 policyreinstate = new PolicyReinstatement_TS03();
		policyreinstate.policyReinstate(driver, action);
		
		PolicyCancellationFlateRate_TS03 policycancel2 = new PolicyCancellationFlateRate_TS03();
		policycancel2.policyCancellation2(driver, action);	
		
		PolicyAutoRenewal_TS03 policyrenewal = new PolicyAutoRenewal_TS03();
		policyrenewal.policyRenewal(driver, action);
	
		}
}
