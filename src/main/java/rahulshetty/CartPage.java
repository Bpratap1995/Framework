package rahulshetty;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import generic.Reusable;

public class CartPage extends Reusable {
	
    WebDriver driver;
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	@FindBy(css=".totalRow button")
	WebElement checkOutEle;
	@FindBy(css=".cartSection h3")
	private List<WebElement >cartProducts;


public Boolean VerifyProductDisplay(String productName) {
	
	boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
    return match;
	
}
public CheckOut goTOChekout() { 
	checkOutEle.click();
	return new CheckOut(driver);
}
}


