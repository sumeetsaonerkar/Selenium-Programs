package actionsclassdemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.sun.xml.bind.v2.runtime.Name;

public class MultipleSelect {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		WebElement wb = driver.findElement(By.id("selenium_suite"));
		Select select = new Select(wb);
		List<WebElement> options=select.getOptions();
		for(int i=0;i<options.size();i++){
			System.out.println(options.get(i).getText());
			}
		
		select.selectByVisibleText("Selenium RC");
		select.selectByIndex(1);
		
		List<WebElement> dis = select.getAllSelectedOptions();
		for(int i=0;i<dis.size();i++){
			System.out.println(dis.get(i).getText());
			}
		
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int listSize = list.size();
		System.out.println(listSize);
		
		
		List<WebElement> list1 = driver.findElements(By.name("selenium_suite"));
		
		
		
		for(int i=0; i<listSize; i++)
		{
			
			WebElement ele = list.get(i);
			String value = ele.getAttribute("value");
			System.out.println(value);
			
			if(value.equalsIgnoreCase("Sedan"))
			{
				
				ele.click();
			}
		}		
			
		/*List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr"));
		int rCount = rowCount.size();
		
		System.out.println(rCount);
		Thread.sleep(2000);
		
		WebElement data = driver.findElement(By.xpath("//*[@id='BooksAuthorsTable']/tbody/tr[2]/td[1]"));
		System.out.println(data.getText());
		
		
		for(int i=2; i<=rCount; i++)
		{
			WebElement data = driver.findElement(By.xpath("//*[@id='BooksAuthorsTable']/tbody/tr["+i+"]/td[1]"));
			String name = data.getText();
			System.out.println(name);
		}
		*/
		//driver.quit();
	}
	}

