package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import truNtrancegeneric.Reusable;

public class LoginPage extends Reusable {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "employee_id")
	WebElement id;

	@FindBy(id = "userrole")
	WebElement dropdown;

	@FindBy(id = "digit")
	WebElement firstdigit;

	@FindBy(id = "digit-2")
	WebElement seconddigit;

	@FindBy(id = "digit-3")
	WebElement thirddigit;

	@FindBy(id = "digit-4")
	WebElement fourthdigit;

	@FindBy(xpath = "//span[@class='text-danger text-error database_error input-group']")
	WebElement ToastMessage;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;
	
	@FindBy(xpath="//li[@class='nav-item dropdown']")
	WebElement LoginDropDown;
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement Logout;
	

	public void dropdown(int i) {

		Select s = new Select(dropdown);
		s.selectByIndex(i);

	}

	public void Userid(String email) {

		id.sendKeys(email);

	}

	public void Mpin(String num1, String num2, String num3, String num4) {
		
		firstdigit.sendKeys(num1);
		seconddigit.sendKeys(num2);
		thirddigit.sendKeys(num3);
		fourthdigit.sendKeys(num4);
		

	}

	public void goTo() {
		// driver.get("https://biopasstest.com:8081/login");
		// production url
		driver.get("https://biocubetechnology.com:8084/login");
	}

	public void login1() {
		Login.click();
	}

	public HomePage ClickLoginButton() {

		Login.click();
		HomePage hmg = new HomePage(driver);
		return hmg;

	}

	public void toastMessage() throws InterruptedException {
		waitForElementToDisappear(ToastMessage);
		String message = ToastMessage.getText();
		System.out.println(message);
	}
	

	public GroupAdminHomePage ClickLoginButtonGroup() {
		Login.click();
		GroupAdminHomePage gahp = new GroupAdminHomePage(driver);
		return gahp;
	}

	public InstituteAdminHomePage ClickInstituteAdmin() {
		Login.click();
		InstituteAdminHomePage IAHP = new InstituteAdminHomePage(driver);
		return IAHP;
	}
	public void validateLogin(String expectedTitle, String data) {
		//String Actual=driver.getTitle();
		ValidatepopUp(expectedTitle,data, Logout);
		
		
	
	}

}
