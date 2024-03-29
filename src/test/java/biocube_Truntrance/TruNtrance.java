package biocube_Truntrance;

import org.testng.annotations.Test;

import truNtrance.GroupAdminHomePage;
import truNtrance.HomePage;
import truNtrance.HomePage_Add;
import truNtrance.HomePage_AddGroup;
import truNtrance.HomePage_CreateGroup;
import truNtrance.InstituteAdminHomePage;
import truNtrance.LoginPage;
import truNtrance_testcomponents.BaseTest;
import truNtrance.ManageBanner;
import truNtrance.Managefeedback;

public class TruNtrance extends BaseTest {
	String ExpectedTitle="AttendFy";
	@Test(dataProvider="drivenTest")
	public void LoginSuperAdmin(String id,String pin1,String pin2,String pin3,String pin4,String data) throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.dropdown(1);
		lp.Userid(id);
		lp.Mpin(pin1,pin2,pin3,pin4);
		lp.login1();
		Thread.sleep(3000);
		//String Actual_title =driver.getTitle();
		lp.validateLogin(ExpectedTitle,data);
	

	}

	@Test
	public void LoginInstituteAdmin() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(3);
		lp.Userid("nitaambani1");
		lp.Mpin("1", "2", "3", "4");
		lp.login1();

	}

	@Test
	public void LoginGroupAdmin() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(2);
		lp.Userid("nitaambani");
		lp.Mpin("1", "2", "3", "4");
		lp.ClickLoginButton();

	}

	@Test
	public void HmpgCountry() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		hmg.manageCountry("nigeria", "nig");

	}

	@Test
	public void HmpgState() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		hmg.manageState(10, "Lagos", "lgs");

	}

	@Test
	public void HmpgDistrict() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		hmg.manageDistrict(10, 1, "kalia", "kal");
	}

	@Test
	public void HmpgCity() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		hmg.managecity(10, 1, 1, "balia", "bal");

	}

	@Test
	public void InstituteConfig() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		hmg.instituteConfig("nitaambani2", "birla0001", 1);
		hmg.instituteConfig("nitaambani2", "birla0001", 2);

	}

	@Test
	public void managegroup() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		hmg.ManageGroup("Akshay Kaushik", 1);

	}

	@Test
	public void manageClient() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		hmg.manageClient("bhanu", "birla0001", 1, "birla");

	}

	@Test
	public void manageClintAdd() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		hmg.manageClientAdd();

	}

	@Test()
	public void manageClient_Add() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		HomePage_Add hma = hmg.manageClientAdd();
		hma.Hmgadd(1, 2, 11, "gyanashtali", "0001", "g0001", "34.786", " 76.876", "8319366872", "kora,rajasthan",
				" bhanu pratap", "1234", "C:\\Users\\Bhanu Pratap\\Downloads\\DAV.png");

	}

	@Test()
	public void ManageBanner() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		ManageBanner mB = hmg.managebanner();
		mB.AddBanner(11, "gyanasthali", "C:\\Users\\Bhanu Pratap\\Downloads\\DAV.png");

	}

	@Test()
	public void manageFeedback() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		Managefeedback hmf = hmg.manageFeedback();
		hmf.managefeedback("bhanu");

	}

	@Test()
	public void creategroupAdmin() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		HomePage_CreateGroup creategroup = hmg.creategroup();
		creategroup.clickCreateGroupBtn(2, "gyan001", "gyan", "bhanu", "1234",
				"C:\\Users\\Bhanu Pratap\\Downloads\\DAV.png");
		creategroup.clickOnSubmit();

	}

	@Test
	public void addGroupAdmin() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		HomePage hmg = lp.ClickLoginButton();
		HomePage_AddGroup hma = hmg.addGroup();
		hma.addGroup(2, 2, 4, 14, "gyanganaga", "gyan0001", "1233", "34.876", "68.729", "7635476234", "patna",
				"bhanu34", "1234", "C:\\Users\\Bhanu Pratap\\Downloads\\DAV.png");

	}

	@Test
	public void loginGroupAdmin1() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(2);
		lp.Userid("bhanu");
		lp.Mpin("1", "2", "3", "4");
		GroupAdminHomePage groupHome = lp.ClickLoginButtonGroup();
		groupHome.groupAdmin();

	}

	@Test
	public void loginInstituteAdmin() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(3);
		lp.Userid("bhanu");
		lp.Mpin("1", "2", "3", "4");
		InstituteAdminHomePage institute = lp.ClickInstituteAdmin();
		institute.Institute();

	}

}
