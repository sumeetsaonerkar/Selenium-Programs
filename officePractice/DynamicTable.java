package officePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
		String price;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("coloumn count is: == " +col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("row count is: == " +row.size());
		
		WebElement data = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[1]"));
		System.out.println(data.getText());
		
		for(int i=1; i<row.size(); i++){
			
			
			price = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
		}
		
		driver.quit();

	}

}
