package testNG;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test(priority=1, description="will login into the  app")
	public void loginApp(){
		System.out.println("enter  world");
	}
	
	@Test(priority=2, description="will show details")
	public void enterDetails(){
		System.out.println("details world");
	}
	
	@Test(priority=3, description="logout done")
	public void logout(){
		System.out.println("successfull logout");
	}
	
	
}
