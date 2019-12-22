package officePractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRM1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/styling/jqueryUI.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		int count =0;
		
		/*driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sumeetsaonerkar");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("seleniumpractise");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("//div[@id='homebox_CALDAY']");*/
		
		int rowCount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
		System.out.println("Roloumn count is: == " +rowCount);
		
		for(int i=1; i<rowCount; i++){
			int colCount = driver.findElements(By.xpath("//table[@id ='example']/tbody/tr[" + i + "]/td")).size();
			String temp = driver.findElement(By.xpath("//table[@id ='example']/tbody/tr[" + i + "]/td[4]")).getText();
			int age = Integer.parseInt(temp);

			if (age > 40) {
			count++;
			for (int j = 1; j <= colCount; j++) {
			String data = driver.findElement(By.xpath("//table[@id ='example']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
			System.out.print(data + "\t");
			}
			}

			}
			System.out.println("count: "+count);

			// System.out.println(driver.findElement(By.xpath("//tbody")).getText());
		
		
		
	}

}
