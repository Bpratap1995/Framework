package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import truNtrancegeneric.Reusable;

public class InstituteAdminHomePage extends Reusable {
	WebDriver driver;
	

	public InstituteAdminHomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Dashboard']")
	WebElement Dashboard;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Manage Courses']")
	WebElement ManageCourses;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Manage User']")
	WebElement ManageUser;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Assign Class to Student']")
	WebElement AssignClassToStudent;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Assign Class to Teacher']")
	WebElement AssignClassToTeacher;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Assign Class to Assistant']")
	WebElement AssignClassToAssistant;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Assign Class to Staff']")
	WebElement AssignClassToStaff;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Manage Holidays']")
	WebElement Holiday;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Manage Feedback']")
	WebElement Feedback;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Attendance']")
	WebElement Attendance;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()=' Manage Camera']")
	WebElement ManageCamera;
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()=' Manage Live Stream']")
	WebElement ManageLiveStream;
	
	


public void Institute() {
	click(Dashboard);
	click(ManageCourses);
	click(ManageUser);
	click(AssignClassToStudent);
	click(AssignClassToTeacher);
	click(AssignClassToAssistant);
	click(AssignClassToStaff);
	click(Holiday);
	click(Feedback);
	click(Attendance);
	click(ManageCamera);
	click(ManageLiveStream);
	
	
}
}
