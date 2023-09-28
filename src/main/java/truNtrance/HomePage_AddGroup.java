package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import truNtrancegeneric.Reusable;

public class HomePage_AddGroup extends Reusable {
	WebDriver driver;

	public HomePage_AddGroup(WebDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="institute_type")
	WebElement InstituteType;
	@FindBy(id="uploading_access")
	WebElement UploadingAccess;
	@FindBy(id="group_type")
	WebElement GroupType;
	@FindBy(id="cityid")
	WebElement CityId;
	@FindBy(id="name")
	WebElement id;
	@FindBy(id="reg_no")
	WebElement Registration_number;
	@FindBy(id="passcode")
	WebElement passcode;
	@FindBy(id="collage_lat")
	WebElement Latitude;
	@FindBy(id="collage_lng")
	WebElement Longitude;
	@FindBy(id="contact_no")
	WebElement contactnumber;
	@FindBy(name="address")
	WebElement Address;
	@FindBy(id="institute_admin_name")
	WebElement Instituteadminname;
	@FindBy(id="admin_mpin")
	WebElement AdminMpin;
	@FindBy(id="institute_logo")
	WebElement InstituteLogo;
	@FindBy(id="submitBtn")
	WebElement SubmitBtn;
	
	public void addGroup(int i,int i1,int i2,int i3,String InstituteName,String regNum,String passcode1,String Latitutde1,String longitude1,String contactNumber1,String add,String AdminName,String mpin,String logo) throws InterruptedException {
		dropdown(InstituteType,i);
		dropdown(UploadingAccess,i1);
		dropdown(GroupType,i2);
		dropdown(CityId,i3);
		id.sendKeys(InstituteName);
		Registration_number.sendKeys(regNum);
		passcode.sendKeys(passcode1);
		Latitude.sendKeys(Latitutde1);
		Longitude.sendKeys(longitude1);
		contactnumber.sendKeys(contactNumber1);
		Address.sendKeys(add);
		Instituteadminname.sendKeys(AdminName);
		AdminMpin.sendKeys(mpin);
		//int x=InstituteLogo.getLocation().getX();
		//int y=InstituteLogo.getLocation().getX();
		InstituteLogo.sendKeys(logo);
		Thread.sleep(3000);
		scrollPage(SubmitBtn);
		click(SubmitBtn);
		
		
	}

}
