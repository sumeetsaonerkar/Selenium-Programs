package officePractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CRM {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.dismiss();
		
		List<WebElement> totalRow = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr"));
		System.out.println("total rows are :-" +totalRow.size());
		int rowcount = totalRow.size();
		
		String bX = "//table[@id='BooksAuthorsTable']/tbody/tr[";
		String aX = "]/td[4]";
		
		for(int i=2; i<=rowcount; i++){
			
			WebElement data = driver.findElement(By.xpath(bX+i+aX));
			System.out.println(data.getText());
		}
		
		
		/*for(int i=4; i<9; i++){
			
			String eee = driver.findElement(By.xpath(bX+i+aX)).getText();
			System.out.println(eee);
			

		}
		*/
		
		/*driver.findElement(By.xpath("//font[text()='Sign Up']//parent::a")).click();
		Select select  = new Select(driver.findElement(By.xpath("//select[@id='payment_plan_id']")));
		select.selectByVisibleText("Free Edition");
		driver.findElement(By.name("first_name")).sendKeys("sumeet");
		driver.findElement(By.name("surname")).sendKeys("saonerkar");
		driver.findElement(By.name("email")).sendKeys("sumeet.saonerkar@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("sumeet.saonerkar@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sumeet");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sumeet");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("djshfhsdfkjhdf");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//div[@class='myButton']")).click();*/
		
		
		

	}

}
