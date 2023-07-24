package com.smartims.insurancepractice.policycenter.scenario03;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class CommonClass {
	public static ChromeDriver getChromeDriver() {	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		Actions actions = new Actions(driver);
		driver.get("http://localhost:8180/pc/PolicyCenter.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).sendKeys("su", Keys.TAB);
		driver.findElement(By.name("Login-LoginScreen-LoginDV-password")).sendKeys("gw", Keys.ENTER);
		return driver;
	}
}
