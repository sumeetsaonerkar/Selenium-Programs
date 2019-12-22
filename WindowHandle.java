import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	  //  driver.manage().window().maximize();
	    
	    String parent = driver.getWindowHandle(); // return type is alpha numeric string
	    System.out.println(parent);
	   
	   Set<String>  allWindowsCount = driver.getWindowHandles();  //return type is Set<string>
	   System.out.println("windows opened :-" +allWindowsCount.size());
	   
	   ArrayList<String> tabs = new ArrayList<>(allWindowsCount);
	   
	   driver.switchTo().window(tabs.get(2));
	   driver.switchTo().window(parent);
	   driver.manage().window().maximize();
	   driver.switchTo().window(tabs.get(2));
	   driver.manage().window().maximize();
	  
	 //  driver.close();
	
	   
	   
	 /*  for(String child : windowsCount)
	   {
		   if(!parent.equalsIgnoreCase(child))
		   {
			   driver.switchTo().window(child);
			   System.out.println(driver.getTitle());
			   
		   }
		   driver.switchTo().window(parent);
	   }*/
	  
	}

}
