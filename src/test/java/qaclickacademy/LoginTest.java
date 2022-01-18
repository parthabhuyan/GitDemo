package qaclickacademy;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public static void testUsername()
	{
		System.out.println("testUserName");
	}

	@Test
	public static void testPassword()
	{
		System.out.println("testPassword");
	}

	// Adding test case to verify the blank username and    password
		@Test
	public static void testBlank()
	{
		System.out.println("test blank username and password");
	}



}
