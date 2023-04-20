package rahulshetty;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import generic.Reusable;

public class OrderPage extends Reusable {
	
    WebDriver driver;
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	
	@FindBy(css="tr td:nth-child(3)")
	private List<WebElement >ProductNames;


public Boolean VerifyOrderDisplay(String productName) {
	
	boolean match =ProductNames.stream().anyMatch(Product->Product.getText().equalsIgnoreCase(productName));
    return match;
	
}


}


