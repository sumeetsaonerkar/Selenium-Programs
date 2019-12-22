package officePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	
	public void testFrames() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/index.html");
		driver.findElement(By.xpath("//a[@id='iframes']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame("site1");
		
		driver.findElement(By.linkText("Projects")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Frames f = new Frames();
		f.testFrames();

	}

}
