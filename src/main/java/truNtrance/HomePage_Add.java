package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import truNtrancegeneric.Reusable;

public class HomePage_Add extends Reusable {
	WebDriver driver;

	public HomePage_Add(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "institute_type")
	WebElement Institute_type;
	@FindBy(id = "uploading_access")
	WebElement Uploading_access;
	@FindBy(id = "cityid")
	WebElement CityId;
	@FindBy(id = "name")
	WebElement InstituteName;
	@FindBy(id = "reg_no")
	WebElement RegNum;
	@FindBy(id = "passcode")
	WebElement passcode;
	@FindBy(id = "collage_lat")
	WebElement latitude;
	@FindBy(id = "collage_lng")
	WebElement longitude;
	@FindBy(id = "contact_no")
	WebElement Contactnumber;
	@FindBy(xpath = "//textarea[@class='form-control']")
	WebElement Address;
	@FindBy(id = "institute_admin_name")
	WebElement InstituteAdminName;
	@FindBy(id = "admin_mpin")
	WebElement Mpin;
	@FindBy(id="institute_logo")
	WebElement Logo;
	@FindBy(id = "submitBtn")
	WebElement save;

	public void Hmgadd(int i, int i1, int i2, String ele, String regnum, String passcode1, String  lat,
			String  longitude1, String  num, String address, String instAdmName,String mpin,String logo) throws InterruptedException {
		dropdown(Institute_type, i);
		dropdown(Uploading_access, i1);
		dropdown(CityId, i2);
		InstituteName.sendKeys(ele);
		RegNum.sendKeys(regnum);
		passcode.sendKeys(passcode1);
		latitude.sendKeys(lat);
		longitude.sendKeys(longitude1);
		Contactnumber.sendKeys(num);
		Address.sendKeys(address);
		InstituteAdminName.sendKeys(instAdmName);
		Mpin.sendKeys(mpin);
		//C:\\Users\\Bhanu Pratap\\Downloads\\DAV.png
		Logo.sendKeys(logo);
		Thread.sleep(3000);
		save.click();

	}

}
