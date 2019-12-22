import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sumeet.saonerkar\\Downloads\\sam\\jar files\\geckodriver.exe");
		ProfilesIni prof = new ProfilesIni();
		
		org.openqa.selenium.firefox.FirefoxProfile profile = prof.getProfile("Automation_Testing");
		
		FirefoxOptions o = new  FirefoxOptions();
		o.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(o);
		driver.get("https://www.facebook.com/");
		
		

	}

}
