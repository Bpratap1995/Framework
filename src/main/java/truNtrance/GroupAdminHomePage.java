package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import truNtrancegeneric.Reusable;

public class GroupAdminHomePage extends Reusable {
	WebDriver driver;
	public GroupAdminHomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Dashboard']")
	WebElement Dashboard;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Manage Client']")
	WebElement ManageClient;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Attendance']")
	WebElement Attendance;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Manage Feedback']")
	WebElement ManageFeedback;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()=' Manage Camera']")
	WebElement ManageCamera;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()=' Manage Live Stream']")
	WebElement ManageLiveStream;
	
	public void  groupAdmin() throws InterruptedException {
		click(Dashboard);
		click(ManageClient);
		click(Attendance);
		click(ManageFeedback);
		click(ManageCamera);
		click(ManageLiveStream);
		
		
	}
	

	
	
	

}
