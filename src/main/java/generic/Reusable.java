package generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rahulshetty.CartPage;
import rahulshetty.OrderPage;

public class Reusable {
	
	WebDriver driver;
	
	 public Reusable(WebDriver driver) {
		 this.driver = driver;
		 
	                                   }
	 
	
	 @FindBy(css="[routerlink*='cart']")
	 WebElement CartHeader;
	 
	 @FindBy(css="[routerlink*='myorders']")
	 WebElement Order;
	 
	     public void waitForElementToAppear(By findBy) throws InterruptedException
	     {
	    	Thread.sleep(1000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		 
	     }
	     public void waitForElementToDisappear(WebElement ele) throws InterruptedException {
	    	 
	    	 Thread.sleep(1000);
	    	// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

	       //  wait.until(ExpectedConditions.invisibilityOf( (ele)));
	    	 
	     }
	     public CartPage goToCartPage() {
	    	 CartHeader.click();
	    	 CartPage cp = new CartPage(driver);
	    	 return cp;
	    	 
	     }
	     public OrderPage goToOrder() {
	    	 Order.click();
	    	 OrderPage od = new OrderPage(driver);
	    	 return od;
	    	 
	     }
	     public void waitForWebElementToAppear(WebElement findBy) throws InterruptedException
	     {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.visibilityOf(findBy));
		 
	     }
	     

}
