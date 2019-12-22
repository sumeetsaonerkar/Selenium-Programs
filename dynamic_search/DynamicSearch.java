package dynamic_search;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicSearch {
  
	
	@Test
	public void search() throws InterruptedException{       
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("FromTag")).sendKeys("pun");
		Thread.sleep(5000);
		
		List<WebElement> fromNames = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	
		System.out.println(fromNames.size());
		
		for(WebElement ele : fromNames){
			System.out.println(ele.getText());
			
			if(ele.getText().trim().equals("Punta Gorda, BZ - Punta Gorda (PND)"))
				ele.click();
			
		}
		
		List<WebElement> toNames = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
		System.out.println(toNames.size());
		
		for(WebElement ele1 : toNames){
			
			System.out.println(ele1.getText());
			
			if(ele1.getText().trim().equals("Dubai, AE - Al Maktoum International Airport (DWC)"));
			ele1.click();
		}
	
	}

}


