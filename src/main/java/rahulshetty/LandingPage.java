package rahulshetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Reusable;

public class LandingPage extends Reusable{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
     @FindBy(id="userEmail")
     WebElement username;
     
     @FindBy(id="userPassword")
     WebElement password;
     
     @FindBy(id="login")
     WebElement submit;
     
     @FindBy(css="[class*='flyInOut']")
     WebElement errorMessage;
     
     public ProductCatalogue login(String Email,String pwd) {
    	 username.sendKeys(Email);
    	 password.sendKeys(pwd);
    	 submit.click();
    	 ProductCatalogue pc= new ProductCatalogue(driver);
    	 return pc;
    	 
     }
    public void goTo() {
   	 driver.get("https://rahulshettyacademy.com/client");
     }
    
    public String getErrorMessage() throws InterruptedException  {
    	waitForWebElementToAppear(errorMessage);
    	errorMessage.getText();
    	return errorMessage.getText();
    }

	
	
	

}
