package actionsclassdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	
	@Test
	public void datePick() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    
	    driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    //driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr[1]/td[7]")).click();
	    
	  List<WebElement> datesList =   driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td"));
	  System.out.println("total dates are :- "+datesList.size());
	  
	  for(int i=0; i<datesList.size(); i++)
	  {
		  String datePrint = datesList.get(i).getText();
		 if(datePrint.equalsIgnoreCase("30"))
		 {
			 datesList.get(i).click();
			 break;
		 }
	  
	  }
	    
	}

}
