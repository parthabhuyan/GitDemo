package qaclickacademy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Add2CartTest {
	
	@Test
	public void cartTest()
	{
		System.out.println("Cart test");
		Assert.assertFalse(false);
	}

	@Test
	public void billTest()
	{
		System.out.println("Bill test");
	}
	
	@Test
	public void paymentTest()
	{
		System.out.println("Payment test");
	}
}
