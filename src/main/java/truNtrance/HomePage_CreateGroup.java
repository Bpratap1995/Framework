package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import truNtrancegeneric.Reusable;

public class HomePage_CreateGroup extends Reusable {
	WebDriver driver;

public HomePage_CreateGroup(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "institute_type")
	WebElement Institute_type;
	@FindBy(xpath="//button[@type='button'][text()=' Create New Group ']")
	WebElement CreateNewGroupBTN;
	//
	@FindBy(id="group_code")
	WebElement Group_code;
	@FindBy(id="group_name")
	WebElement Group_name;
	@FindBy(id="group_admin_name")
	WebElement Group_admin_name;
	@FindBy(id="group_admin_mpin")
	WebElement Pin;
	@FindBy(id="group_logo")
	WebElement Logo;
	//@FindBy(xpath="//button[@type='submit'][@id='submitBtn']")
	@FindBy(id="submitBtn")
	
	WebElement SubmitBTN;
	@FindBy(xpath="//button[@type='button'][text()='Close']")
	WebElement Close;


public void clickCreateGroupBtn(int i,String groupcode,String groupname,String groupAdminName,String pin,String path) throws InterruptedException {
	dropdown( Institute_type, i);
	click(CreateNewGroupBTN);
	//Create group page
	 Group_code.sendKeys(groupcode);
	 Group_name.sendKeys(groupname);
	 Group_admin_name.sendKeys(groupAdminName);
	 Pin.sendKeys(pin);
	 Logo.sendKeys(path);
	 Thread.sleep(30000);
	 //click(SubmitBTN);
}
	 //SubmitBTN.click();
	// click(Close);
	 public void clickOnSubmit() {
		 click(SubmitBTN);
		 
	 }
	 
	
}

