package readexcelfileoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc {
	
	WebDriver driver;
	
	public Tc(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void login(String uname, String pwd){
		
		enterUser(uname);
		enterPwd(pwd);
		submit();
		
	}
	void enterUser(String uname){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("unameSignin")));
		ele.sendKeys(uname);
		
	}
	void enterPwd(String pwd){
		
		driver.findElement(By.id("pwdSignin")).sendKeys(pwd);
	}
void submit(){
	
	driver.findElement(By.id("btnsubmitdetails")).click();
	
}
}
