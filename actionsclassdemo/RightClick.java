package actionsclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    
	    driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
	    
	   Actions rightClick = new Actions(driver);
	    	    	    
	    WebElement menu = driver.findElement(By.linkText("Download"));
	    rightClick.contextClick(menu).build().perform();
	    
	   WebElement element = driver.findElement(By.linkText("Tooltip"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); 
		
	    
	   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
	    
	}

}
