package actionsclassdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void main(String[] args) throws InterruptedException { 
				
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		   //driver.get("http://mrbool.com/introducing-javascript-6-arrow-functions/36854");
		    driver.get("https://www.gtpl.net/");
		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		    
		    // mouse hover 
		    Actions mouseHover = new Actions(driver);
		   // mouseHover.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		    
		    mouseHover.moveToElement(driver.findElement(By.xpath("//li[@class='dropdown first dropdown']/a[@class='nolink dropdown-toggle']"))).build().perform();
		    Thread.sleep(2000);
		    mouseHover.moveToElement(driver.findElement(By.xpath("//a[text()='Broadband ']"))).build().perform();
		    
		}
			
	}
	
   
