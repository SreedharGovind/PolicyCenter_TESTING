package PolicyCenterTransactions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

public class CommonClass {

	public static final String excelFilePath = "PolicyCenterDataNew.xlsx";

	public static ChromeDriver getchromedriver() throws IOException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		AccountCreationVO pvo = new AccountCreationVO();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(ConstantsClassPC.url);
		pvo.setUsername(ExcelUtilCredentials.getCellValueByLabel("username"));
		pvo.setPassword(ExcelUtilCredentials.getCellValueByLabel("password"));
		driver.findElement(By.name(ConstantsClassPC.supervisor)).sendKeys(pvo.getUsername());
		driver.findElement(By.name(ConstantsClassPC.supervisorpassword)).sendKeys(pvo.getPassword(), Keys.ENTER);
		return driver;
	}

}
