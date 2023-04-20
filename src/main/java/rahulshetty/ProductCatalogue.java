package rahulshetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Reusable;

public class ProductCatalogue extends Reusable {
	
	WebDriver driver;
	
	
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(css=".mb-3")
	List<WebElement>products;
	
	@FindBy(css=".mb-3")
	WebElement spinner;
	
	
	By productsBy =By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMesaage =By.cssSelector("#toast-container");
	
	
	
	
	    public List<WebElement> getProductList() throws InterruptedException{
		waitForElementToAppear(productsBy);
		return products;
		}
	
	    public  WebElement getProductByName(String productName) throws InterruptedException {
		WebElement prod = getProductList().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);
		return prod;
	}
	    
	    public void addProductToCart(String productName) throws InterruptedException {
	    	
	    	WebElement prod = getProductByName(productName);
	    	prod.findElement(addToCart).click();
	    	
	    	waitForElementToAppear(toastMesaage);
	    
	    	waitForElementToDisappear( spinner);
	    
	    }
	
	
	


	





	

}
