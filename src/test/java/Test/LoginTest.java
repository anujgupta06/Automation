package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void SucLogin_test() {
		LoginPage login=new LoginPage(dr);
		login.enterUsername("username");
		login.enterPassword("password");
		login.checkLogin();
		login.profileclick();
		
	}
}
