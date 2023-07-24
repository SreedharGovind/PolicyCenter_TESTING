package PolicyCenterTransactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.smartims.insurancepractice.policycenter.policyVO.AccountCreationVO;

public class ExcelUtils {
	public static String getCellValueByLabel(String label) throws IOException {

		String filePath = "C:\\Users\\GovindaSreedhar.Kopp.SMARTIMS\\eclipse-workspace\\PolicyCenter\\Dataexcel\\PolicyCenterData .xlsb.xlsx";
		// String sheetName = "";

		FileInputStream file = new FileInputStream(new File(filePath));
		Workbook workbook = WorkbookFactory.create(file);

		Sheet sheet = workbook.getSheetAt(1);

		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getStringCellValue().equals(label)) {
					String value = row.getCell(cell.getColumnIndex() + 1).getStringCellValue();
					workbook.close();
					return value;
				}
			}
		}
		workbook.close();
		return null;
	}

	public static ChromeDriver getChromeDriver() throws IOException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		AccountCreationVO pvo = new AccountCreationVO();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(ConstantsClassPC.url);
		pvo.setUsername(ExcelUtils.getCellValueByLabel("username"));
		pvo.setPassword(ExcelUtils.getCellValueByLabel("password"));
		driver.findElement(By.name(ConstantsClassPC.supervisor)).sendKeys(pvo.getUsername());
		driver.findElement(By.name(ConstantsClassPC.supervisorpassword)).sendKeys(pvo.getPassword(), Keys.ENTER);
		return driver;
	}
}