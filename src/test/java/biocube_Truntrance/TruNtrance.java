package biocube_Truntrance;

import org.testng.annotations.Test;
import truNtrance.LoginPage;
import truNtrance_testcomponents.BaseTest;

public class TruNtrance extends BaseTest {
	
	@Test
	public void LoginSuperAdmin() {
		LoginPage lp = new LoginPage(driver);

		lp.dropdown(1);
		lp.Userid("Super999");
		lp.Mpin("4", "3", "2", "1");
		lp.ClickLoginButton();

	}
	
	@Test
	public void LoginInstituteAdmin() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(3);
		lp.Userid("nitaambani1");
		lp.Mpin("1", "2", "3", "4");
		lp.ClickLoginButton();
	}
	@Test
	public void LoginGroupAdmin() {
		LoginPage lp = new LoginPage(driver);
		lp.dropdown(2);
		lp.Userid("nitaambani");
		lp.Mpin("1", "2", "3", "4");
		lp.ClickLoginButton();
	}
	
	
	
	
	
	

	

	

}
