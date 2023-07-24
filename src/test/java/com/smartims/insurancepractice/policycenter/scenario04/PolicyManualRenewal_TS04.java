package com.smartims.insurancepractice.policycenter.scenario04;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyAutoRenewalVO;
import PolicyCenterTransactions.ConstantsClass03;
        public class PolicyManualRenewal_TS04 {
        	void policyrenew(ChromeDriver driver,Actions action) throws IOException, InterruptedException {
        		PolicyAutoRenewalVO aro = new PolicyAutoRenewalVO();
        		aro.setPolicyRenewTermType(ExcelUtils_TS04.getCellValueByLabel("policyRenewTermType"));
        		driver.findElement(By.id(ConstantsClass03.transaction)).click();
        		driver.findElement(By.id("PolicyFile_Summary-PolicyOverviewDashboard-PolicyDetailsDetailViewTile-RenewPolicy")).click();
        		driver.findElement(By.id("RenewalWizard-Next")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.id("RenewalWizard-Next")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.id("RenewalWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-EditPolicyWorkflow")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.id("RenewalWizard-Next")).click();
        		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/div/div[3]/div[2]/div[2]/div/div/div/select")).sendKeys(aro.getPolicyRenewTermType(), Keys.TAB);
        		driver.findElement(By.id("RenewalWizard-LOBWizardStepGroup-RenewalWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote")).click();
        		WebElement bindoptions = driver.findElement(By.id("RenewalWizard-PostQuoteWizardStepSet-RenewalWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions"));
        		action.moveToElement(bindoptions).perform();
        		bindoptions.click();
        		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[7]/div[3]/div[2]/div/div[2]")).click();
        		Alert alert13 = driver.switchTo().alert();
        		alert13.accept();
        		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();       		
}}
