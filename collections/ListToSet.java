package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListToSet {
	
	
	public void convert(){
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();*/
		//driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		List<String> listItems = new ArrayList<String>();
		listItems.add("sumeet");
		listItems.add("prachi");
		listItems.add("shraddha");
		listItems.add("devansh");
		listItems.add("sumeet");
		System.out.println(listItems);
		
		// set dosen't allow duplicate elements 
		Set<String> setList = new HashSet<String>(listItems);
		System.out.println(setList);
		
		
	}

	public static void main(String[] args) {
		ListToSet a = new ListToSet();
		a.convert();

		

	}

}
