package rahulshetty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import rahulshetty.CartPage;
import rahulshetty.CheckOut;
import rahulshetty.ConfirmationPage;
import rahulshetty.OrderPage;
import rahulshetty.ProductCatalogue;
import testcomponents.BaseTest;

public class StandAlone extends BaseTest {
	String productName = "ZARA COAT 3";

	@Test(dataProvider="getData")
	public void submit(HashMap<String,String>input) throws InterruptedException, IOException {

		//ProductCatalogue pc = lp.login("bpratap924@gmail.com", "Biocube@123");
		
		ProductCatalogue pc = lp.login(input.get("email"),input.get("password"));
		List<WebElement> products = pc.getProductList();
		pc.addProductToCart(productName);
		CartPage cp = pc.goToCartPage();

		Boolean match = cp.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckOut co = cp.goTOChekout();
		co.selectCountry("india");
		ConfirmationPage cnfmpage = co.submitButton();
		// String CnfirmationMessage=cnfmpage.getConfirmationMessage();
		// Assert.assertTrue( CnfirmationMessage.equalsIgnoreCase("THANKYOU FOR THE
		// ORDER."));

	}
	
	@Test(dependsOnMethods = { "submit" })
	public void ProductVerification() {
		ProductCatalogue pc = lp.login("bpratap924@gmail.com", "Biocube@123");
		OrderPage od = pc.goToOrder();
		Assert.assertTrue(od.VerifyOrderDisplay(productName));

	}


	@DataProvider
	public Object[][] getData() throws IOException {
		
		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\rahulshettyacademy\\data\\PurchaseOrder.json");
		return new Object[][] {{data.get(0)},{data.get(1)}};
		
	}
	

}
