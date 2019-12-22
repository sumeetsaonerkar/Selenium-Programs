package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        
        WebElement month = driver.findElement(By.id("month"));
        Select monthDD = new Select(month);
      //  monthDD.selectByIndex(6);  not recommended as if new index is added it will change the index value
       monthDD.selectByVisibleText("Jun");    // recommended
       
        List<WebElement> list =  monthDD.getOptions();
        int total_month = list.size();
        System.out.println(total_month);
        
        for(WebElement ele:list){
        	 String month_name = ele.getText();
        	 System.out.println(month_name);
        }
        
	}

}
