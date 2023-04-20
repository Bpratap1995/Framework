package rahulshetty;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Reusable;

public class CheckOut extends Reusable{
	WebDriver driver;

	public CheckOut(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;
	
	@FindBy(css=".action__submit")
	WebElement submit;
	
   // @FindBy(xpath="(//button[contains(@class,'ta-item')])[2]")
  //  WebElement selectCountry;
   // input[placeholder='Select Country']
   @FindBy(css="input[placeholder='Select Country']")
   WebElement selectCountry;
  By results= By.cssSelector(".ta-results");
    
    public void selectCountry(String country) throws InterruptedException  {
    	  Actions action = new Actions(driver);
    	     action.sendKeys(country,"india").build().perform();
    	     waitForElementToAppear(results);
    	    // selectCountry.click();
    	     JavascriptExecutor js = (JavascriptExecutor) driver;
    	     js.executeScript("arguments[0].click();",selectCountry);
    	     
    }
    public ConfirmationPage submitButton() {
    	//submit.click();
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click();",submit);
    	return new ConfirmationPage(driver);
    }
   

}
