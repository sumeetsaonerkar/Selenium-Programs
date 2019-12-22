package readexcelfileoperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUp {
	
	WebDriver driver;
	
	@Test(dataProvider="scanData")
	public void login(String username, String password){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.findElement(By.id("registration2")).click();
		Tc t = new Tc(driver);
		t.login(username, password);
		
		//driver.close();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

	@DataProvider(name="scanData")
	public Object[][] fetchData() throws IOException {
		
		File f = new File("C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\abc.xls");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new HSSFWorkbook(fis); // for loading the workbbok
		Sheet sheet = wb.getSheet("Sheet1");  // for reading the sheet
		int rowCount = sheet.getLastRowNum();  // return count of row 
		//System.out.println(rowCount+1);
		int colCount = sheet.getRow(0).getLastCellNum();  // return count of coloumn
		//System.out.println(colCount);
		
Object data [][] = new Object[rowCount][colCount];
		
		for(int i=1; i<rowCount+1; i++){
			
			String uname = sheet.getRow(i).getCell(0).getStringCellValue();
			String pwd = sheet.getRow(i).getCell(1).getStringCellValue();
		}
		
		return data;
		
	}
	
	

}
