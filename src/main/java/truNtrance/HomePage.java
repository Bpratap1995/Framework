package truNtrance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import truNtrancegeneric.Reusable;

public class HomePage extends Reusable {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// _Dashboard
	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement Dashboardbtn;
	// Click on manage country
	@FindBy(xpath = "//span[normalize-space()='Manage Country/State/District/City']")
	WebElement manageCountry;
	// Create manage country
	@FindBy(id = "country_name")
	WebElement countryName;
	@FindBy(id = "country_code")
	WebElement countrycode;
	@FindBy(xpath = "//div[@class='row mb-4']//div[3]//button[1]")
	WebElement save;
	// Create manage state
	@FindBy(id = "country_id")
	WebElement countryId_dropdown;
	@FindBy(id = "state_name")
	WebElement stateName;
	@FindBy(id = "state_code")
	WebElement stateCode;
	@FindBy(xpath = "//div[@class='row mb-4']//div[4]//button[1]")
	WebElement stateSave;
	// create manage district
	@FindBy(id = "district_country_id")
	WebElement district_Country_Dropdown;
	@FindBy(id = "district_state_id")
	WebElement district_State_dropdown;
	@FindBy(id = "district_name")
	WebElement districtname;
	@FindBy(id = "district_code")
	WebElement districtcode;
	@FindBy(xpath = "//div[5]//button[1]")
	WebElement district_save;
	// Create city
	@FindBy(id = "city_country_id")
	WebElement city_country_dropdown;
	@FindBy(id = "city_state_id")
	WebElement city_state_dropdown;
	@FindBy(id = "city_district_id")
	WebElement city_district_dropdown;
	@FindBy(name = "city_name")
	WebElement cityName;
	@FindBy(id = "city_code")
	WebElement cityCode;
	@FindBy(xpath = "(//button[@class='btn bg-gradient-primary w-100 my-4 mb-2'][normalize-space()='save'])[4]")
	WebElement CitySavebtn;
	// Institute configuration
	@FindBy(xpath = "//span[text()='Institute Configuration']")
	WebElement Instconfig;
	@FindBy(id = "inst_adminid")
	WebElement inst_adminid;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchbtn;
	@FindBy(xpath = "//button[text()='Reset']")
	WebElement resetbtn;
	@FindBy(id = "instcode")
	WebElement instCode;
	@FindBy(id = "status")
	WebElement status;
	// Manage GRoup
	@FindBy(xpath = "//span[text()='Manage Group']")
	WebElement Manage_Group;
	@FindBy(id = "name")
	WebElement Nametextbox;
	@FindBy(id = "status")
	WebElement manageDropdown;
	@FindBy(xpath = "//button[@class='btn bg-gradient-primary mb-0']")
	WebElement managesearchbtn;
	@FindBy(xpath = "//button[@class='btn btn-outline-secondary mb-0']")
	WebElement ManageResetbtn;
	// Manage Client
	@FindBy(xpath = "//span[text()='Manage Client']")
	WebElement manageClientclick;
	@FindBy(id = "inst_adminid")
	WebElement Institute_adminId;
	@FindBy(id = "instcode")
	WebElement InstituteCode;
	@FindBy(id = "status")
	WebElement Institute_Status_Dropdown;
	@FindBy(id = "type_name")
	WebElement Instutute_Type_dropdown;
	@FindBy(id = "institute_name")
	WebElement InstituteName;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement Institute_search_btn;
	@FindBy(xpath = "//button[text()='Reset']")
	WebElement Institute_reset_btn;
	@FindBy(xpath = "//a[text()='Add Client']")
	WebElement ADD_Btn;
	//Manage Banner
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Manage Banner']")
	WebElement manage_banner;
	//ManageFeedback
	@FindBy(xpath="//span[@class='nav-link-text ms-1'][text()='Manage Feedback']")
	WebElement managefeedback;

	public void dashboard(WebElement element) {

		click(Dashboardbtn);

	}

	public void manageCountry(String country, String countrycode1) {
		click(manageCountry);
		countryName.sendKeys(country);
		countrycode.sendKeys(countrycode1);
		save.click();
	}

	public void manageState(int i, String state, String stateCode1) {
		click(manageCountry);
		scrollPage(countryId_dropdown);
		dropdown(countryId_dropdown, i);
		stateName.sendKeys(state);
		stateCode.sendKeys(stateCode1);
		stateSave.click();

	}

	public void manageDistrict(int i, int i1, String districtname1, String districtcode1) throws InterruptedException {
		click(manageCountry);
		scrollPage(district_Country_Dropdown);
		dropdown(district_Country_Dropdown, i);
		Thread.sleep(3000);
		dropdown(district_State_dropdown, i1);
		districtname.sendKeys(districtname1);
		districtcode.sendKeys(districtcode1);
		district_save.click();

	}

	public void managecity(int i, int i1, int i2, String cityname, String citycode) throws InterruptedException {
		click(manageCountry);
		scrollPage(city_country_dropdown);
		dropdown(city_country_dropdown, i);
		Thread.sleep(3000);
		dropdown(city_state_dropdown, i1);
		Thread.sleep(3000);
		dropdown(city_district_dropdown, i2);
		Thread.sleep(3000);
		cityName.sendKeys(cityname);
		cityCode.sendKeys(citycode);
		CitySavebtn.click();

	}

	public void instituteConfig(String admin_id, String Inst_code, int i) {

		click(Instconfig);
		inst_adminid.sendKeys(admin_id);
		searchbtn.click();
		resetbtn.click();
		instCode.sendKeys(Inst_code);
		searchbtn.click();
		resetbtn.click();
		dropdown(status, i);
		searchbtn.click();
		resetbtn.click();
	}

	public void ManageGroup(String name, int i) {
		click(Manage_Group);
		Nametextbox.sendKeys(name);
		dropdown(manageDropdown, i);
		click(managesearchbtn);
		click(ManageResetbtn);

	}

	public void manageClient(String adminId, String Instcode, int i, String InstName) {
		click(manageClientclick);
		Institute_adminId.sendKeys(adminId);
		click(Institute_search_btn);
		click(Institute_reset_btn);
		InstituteCode.sendKeys(Instcode);
		click(Institute_search_btn);
		click(Institute_reset_btn);
		dropdown(Institute_Status_Dropdown, i);
		click(Institute_search_btn);
		click(Institute_reset_btn);
		dropdown(Instutute_Type_dropdown, i);
		click(Institute_search_btn);
		click(Institute_reset_btn);
		InstituteName.sendKeys(InstName);
		click(Institute_search_btn);

	}

	public HomePage_Add manageClientAdd() {
		click(manageClientclick);
		click(ADD_Btn);
		HomePage_Add hma = new HomePage_Add(driver);
		return hma;
	}
	public ManageBanner managebanner() {
		click(manage_banner);
		ManageBanner mb= new ManageBanner(driver);
		return mb;
	}
	public Managefeedback manageFeedback() {
		click(managefeedback);
		Managefeedback mf = new Managefeedback(driver);
		return mf;
		
	}
	public HomePage_CreateGroup creategroup() {
		click(manageClientclick);
		click(ADD_Btn);
		HomePage_CreateGroup hmag = new HomePage_CreateGroup(driver);
		return hmag;
		
	}
	public HomePage_AddGroup addGroup() {
		click(manageClientclick);
		click(ADD_Btn);
		HomePage_AddGroup hag =new HomePage_AddGroup(driver);
		return hag;
	}

}
