package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationbykrishna.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("registration2")).click();   
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.findElement(By.id("unameSignin")).sendKeys("shdghjshj");
        
        driver.findElement(By.id("pwdSignin")).sendKeys("mmkmmkmmk");
        driver.findElement(By.id("btnsubmitdetails")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        
        
	}

}
