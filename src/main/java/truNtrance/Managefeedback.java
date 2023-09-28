package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import truNtrancegeneric.Reusable;

public class Managefeedback extends Reusable{
	WebDriver driver;

	public Managefeedback(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name")
	WebElement name;
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchBtn;
	@FindBy(xpath="//button[@type='button'][@class='btn btn-outline-secondary mb-0']")
	WebElement ResetBtn;
	
	public void managefeedback(String ele) {
		name.sendKeys(ele);
		click(searchBtn);
		click(ResetBtn);
		
	}
	
	
	

}
