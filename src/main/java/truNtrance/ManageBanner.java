package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import truNtrancegeneric.Reusable;

public class ManageBanner extends Reusable {
	
	WebDriver driver;
	
	public ManageBanner(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[text()='Add Banner']")
	WebElement AddBannerbtn;
	@FindBy(id="institutes_id")
	WebElement ManageBannerDropdown;
	@FindBy(id="name")
	WebElement AddBannerName;
	@FindBy(id="invalidatecustomFile")
	WebElement AddBannerLogo;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit;
	
	
	public void AddBanner(int i,String bannerName,String logo) {
		click(AddBannerbtn);
		dropdown(ManageBannerDropdown,i);
		AddBannerName.sendKeys(bannerName);
		AddBannerLogo.sendKeys(logo);
		click(Submit);
		
	}
	
	
	

}
