package truNtrance;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="employee_id")
	WebElement id;
	
	@FindBy(id="userrole")
	WebElement dropdown;
	
    @FindBy(id="digit")
    WebElement firstdigit;
    
    @FindBy(id="digit-2")
    WebElement seconddigit;
    
    @FindBy(id="digit-3")
    WebElement thirddigit;
    
    @FindBy(id="digit-4")
    WebElement fourthdigit;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement Login;
    
       public void dropdown(int i) {
    	
    	Select s = new Select(dropdown);
		s.selectByIndex(i);
    	 }
       
    
    public void Userid(String email)   {
    	id.sendKeys(email); 	
    }
    
    public void Mpin(String num1,String num2,String num3,String num4) {
    	firstdigit.sendKeys(num1);
    	seconddigit.sendKeys(num2);
    	thirddigit.sendKeys(num3);
    	fourthdigit.sendKeys(num4);
    	
    }
    public void goTo() {
      	 driver.get("https://biopasstest.com:8081/login");
        }
    
    public void ClickLoginButton() {
    	Login.click();
    	
    }

}
