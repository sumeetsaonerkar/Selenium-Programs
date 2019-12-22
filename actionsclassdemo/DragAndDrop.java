package actionsclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    
	    driver.switchTo().frame(0);   // it will switch to frame .
	    
	    WebElement source = driver.findElement(By.id("draggable"));
	    WebElement dest =  driver.findElement(By.id("droppable"));
	    
	    Actions dragdrop = new Actions(driver);
	    dragdrop.clickAndHold(source).moveToElement(dest).release().build().perform();
	    
	    

	}

}
