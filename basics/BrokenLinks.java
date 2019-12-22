package basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	
	@Test
	public void test(){
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
	//	linkList.addAll(driver.findElements(By.tagName("img")));   //will add "a" tag and img as well
	
		
		System.out.println("Linklist & images are :- "+linkList.size());
		
		List<WebElement> activeList = new ArrayList<WebElement>();
		for(int i=0; i<linkList.size(); i++){
			
			if(linkList.get(i).getAttribute("href") != null){
				activeList.add(linkList.get(i));
			}
				}
		System.out.println("active links are :- "+activeList.size());
		
		
	}

}
