package testNGlistners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	void loginByGmail()
	{
		System.out.println("login by gmail");
		Assert.assertEquals("sumeet", "sumeet");
		
	}
	
	@Test
	void loginByFb()
	{
		
		System.out.println("login by fb");
		
		Assert.assertEquals("sumheleet", "sumeet");
		
	}

}
