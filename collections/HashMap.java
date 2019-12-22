package collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMap {

	public void abc() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		/*	List<WebElement> flights = driver.findElements(By.xpath("//div[@class='pull-left airways-info-sect']/p/span"));
		int temp1 = flights.size();
		System.out.println(temp1);*/
		
	}
	public static void main(String[] args) {
		HashMap a = new HashMap();
		a.abc();
		
		

	}

}
