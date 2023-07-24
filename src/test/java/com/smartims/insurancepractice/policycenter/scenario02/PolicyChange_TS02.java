package com.smartims.insurancepractice.policycenter.scenario02;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.smartims.insurancepractice.policycenter.policyVO.PolicyChangeVO;

import PolicyCenterTransactions.ConstantsClassPC;

public class PolicyChange_TS02 {
	PolicyChangeVO cvo = new PolicyChangeVO();

	public void policychange(ChromeDriver driver, Actions actions) throws IOException {
		driver.findElement(By.id(ConstantsClassPC.transactionsID)).click();
		driver.findElement(By.xpath(ConstantsClassPC.changePolicy)).click();
		cvo.setPolicyChangeEffectiveDate(ExcelUtils_TS02.getCellValueByLabel("policyChangeEffectiveDate"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeEffectiveDate))
				.sendKeys(cvo.getPolicyChangeEffectiveDate());
		cvo.setPolicyChangeDescription(ExcelUtils_TS02.getCellValueByLabel("policyChangeDescription"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDescription))
				.sendKeys(cvo.getPolicyChangeDescription());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyOfferings)).click();
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyInfo)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeAddAdditionalInsured)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeAdditionalInsured)).click();
		cvo.setPolicyChangeANIFirstname(ExcelUtils_TS02.getCellValueByLabel("policyChangeANIFirstname"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANIFirstname))
				.sendKeys(cvo.getPolicyChangeANIFirstname());
		cvo.setPolicyChangeANILastname(ExcelUtils_TS02.getCellValueByLabel("policyChangeANILastname"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANILastname))
				.sendKeys(cvo.getPolicyChangeANILastname());
		cvo.setPolicyChangeANIDOB(ExcelUtils_TS02.getCellValueByLabel("policyChangeANIDOB"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANIDOB)).sendKeys(cvo.getPolicyChangeANIDOB());
		cvo.setPolicyChangeANIAddressLine1(ExcelUtils_TS02.getCellValueByLabel("policyChangeANIAddressLine1"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANIAddressLine1))
				.sendKeys(cvo.getPolicyChangeANIAddressLine1());
		cvo.setPolicyChangeANIState(ExcelUtils_TS02.getCellValueByLabel("policyChangeANIState"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANIState)).sendKeys(cvo.getPolicyChangeANIState());
		cvo.setPolicyChangeANIZipcode(ExcelUtils_TS02.getCellValueByLabel("policyChangeANIZipcode"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANIZipcode)).sendKeys(cvo.getPolicyChangeANIZipcode());
		cvo.setPolicyChangeANIAddressType(ExcelUtils_TS02.getCellValueByLabel("policyChangeANIAddressType"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANIAddressType))
				.sendKeys(cvo.getPolicyChangeANIAddressType());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANIOk)).click();
		cvo.setPolicyChangeANIRelationship(ExcelUtils_TS02.getCellValueByLabel("policyChangeANIRelationship"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeANIRelationship))
				.sendKeys(cvo.getPolicyChangeANIRelationship());
		driver.findElement(By.xpath(ConstantsClassPC.toPolicyChangeDriver)).click();
		cvo.setPolicyChangeExistingDriverType(ExcelUtils_TS02.getCellValueByLabel("policyChangeExistingDriverType"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriverFirstname)).clear();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDriverFirstname))
				.sendKeys(cvo.getPolicyChangeExistingDriverType());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeDrivertovehicle)).click();
		cvo.setPolicyChangeVehicle1Type(ExcelUtils_TS02.getCellValueByLabel("policyChangeVehicle1Type"));
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeVehicle1Type))
				.sendKeys(cvo.getPolicyChangeVehicle1Type());
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeQuote)).click();
		driver.findElement(By.id(ConstantsClassPC.policyChangeIssue)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeUWToRiskAnalysis)).click();

		driver.findElement(By.xpath(ConstantsClassPC.UWIssueApprove)).click();
		driver.findElement(By.xpath(ConstantsClassPC.UWIssueApproveOk)).click();
		driver.findElement(By.xpath(ConstantsClassPC.UWIssueApprove)).click();
		driver.findElement(By.xpath(ConstantsClassPC.UWIssueApproveOk)).click();
		driver.findElement(By.xpath(ConstantsClassPC.policyChangeIssueAtRiskAnalysis)).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(ConstantsClassPC.viewPolicy)).click();
	}
}
