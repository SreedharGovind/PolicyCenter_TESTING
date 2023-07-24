package PolicyCenterTransactions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;
import com.smartims.insurancepractice.policycenter.scenario01.ExcelUtils_TS01;

public class CommonClass {

	public static ChromeDriver getchromedriver() throws IOException {

	
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(co);
			AccountCreationVO pvo = new AccountCreationVO();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(ConstantsClassPC.url);
			pvo.setUsername(ExcelUtils_TS01.getCellValueByLabel("username"));
			pvo.setPassword(ExcelUtils_TS01.getCellValueByLabel("password"));
			driver.findElement(By.name(ConstantsClassPC.supervisor)).sendKeys(pvo.getUsername());
			driver.findElement(By.name(ConstantsClassPC.supervisorpassword)).sendKeys(pvo.getPassword(), Keys.ENTER);
			return driver;
		}

	}


