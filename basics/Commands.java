package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationbykrishna.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);  // dynamic wait
        // this will load the page and then will perform action. if page is loaded in 5 seconds. rest 15 sec it will not wait. will move ahead.
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  // pooling time is 250 miliseconds. i.e every 250 mili seconds he tries         
     // dynamic wait - to find the element till 15 sec. it is applied globally . whenever driver is called everytime implicitlyWait is called.it is applicable to all the elements
      //if driver is interacting 50 elements it is called. if element is found is 5 sec. then it will move ahead.will not wait 15 sec
        driver.findElement(By.id("registration2")).click();                                 
        WebElement fName = driver.findElement(By.id("unameSignin"));
        WebElement pass = driver.findElement(By.id("pwdSignin"));
        WebElement click = driver.findElement(By.id("btnsubmitdetails"));
        
        sendKeys(driver, fName, 10, "adbjksahdk");
        sendKeys(driver, pass, 5, "mmkmmkmmk");
       
        
        
      clickOn(driver, click, 02);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // never use implicit & explicit wait at a time because first implicit wait will call then explicit wait so the total sync wait will be increase 
        // for each element 
        
	}


		public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value){
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
			} 
		
		public static void clickOn(WebDriver driver, WebElement element, int timeout){
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		
}







