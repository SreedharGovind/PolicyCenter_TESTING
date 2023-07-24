package com.smartims.insurancepractice.policycenter.scenario04;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.smartims.insurancepractice.policycenter.policyVO.PolicyRewriteMidTermVO;
import PolicyCenterTransactions.ConstantsClass03;
public class PolicyRewriteMidTerm_TS04 {
	void policyRewrite(ChromeDriver driver,Actions action) throws IOException {
		PolicyRewriteMidTermVO prm = new PolicyRewriteMidTermVO();
		prm.setRewriteMidTermOfferingsSelection(ExcelUtils_TS04.getCellValueByLabel("rewriteMidTermOfferingsSelection"));
		driver.findElement(By.id(ConstantsClass03.transaction)).click();
		driver.findElement(By.xpath("/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[3]/div[4]/div/div[2]")).click();
		driver.findElement(By.name(ConstantsClass03.rewriteofferingselection)).sendKeys(prm.getRewriteMidTermOfferingsSelection(), Keys.TAB);
		driver.findElement(By.id(ConstantsClass03.rewritequote)).click();
		driver.findElement(By.id(ConstantsClass03.rewritebindoption)).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.id(ConstantsClass03.viewpolicy)).click();
}
}