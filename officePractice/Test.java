package officePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		 
		int row = driver.findElements(By.xpath("//*[@id='BooksAuthorsTable']/tbody/tr")).size();
		 System.out.println(row);
		int coloumn = driver.findElements(By.xpath("//*[@id='BooksAuthorsTable']/tbody/tr[2]/td")).size();
		 System.out.println(coloumn);
		 
		 for(int i=2; i<row; i++){
			 for(int j=1; j<coloumn; j++){
				WebElement ele =  driver.findElement(By.xpath("//*[@id='BooksAuthorsTable']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(ele.getText()+"\t");
				
			 }
		 }
		 
		 driver.close();
		 
	}
}
