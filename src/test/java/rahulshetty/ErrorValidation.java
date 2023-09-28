package rahulshetty;

import org.testng.Assert;
import org.testng.annotations.Test;

import testcomponents.BaseTest;

public class ErrorValidation extends BaseTest {

	@Test(groups= {"ErrorHandling"})
	public void submitOrder() throws InterruptedException {

		String productName = "ZARA COAT 3";

		lp.login("bpratap924@gmail.com", "Biocube@123");
		String ele = lp.getErrorMessage();
		System.out.println(ele);
		Assert.assertEquals("Login- Successfully", ele);

	}
}
