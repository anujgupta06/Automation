package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	WebDriver dr;

	public LoginPage(WebDriver driver){
		super();

	}
	
	@FindBy (xpath="//input[@placeholder='Username']")
	WebElement user_field;
	@FindBy (xpath="//input[@type='password']")
	WebElement pass_field;
	@FindBy (xpath="//button[@type='submit']")
	WebElement sub_field;
	@FindBy (xpath="//p[text()='ForgotPassword']")
	WebElement ForgetPasswordlink;
	@FindBy (xpath="//a[text()='Logout']")
	WebElement logout_button;
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement user_dropdown;
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']")
	WebElement profile_picture;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement geterrormessage;
	
	public void enterUsername(String user) {
		user_field.sendKeys("admin");
	}
	public void enterPassword(String pass) {
		pass_field.sendKeys("admin123");
	}
	public void subLogin() {
		sub_field.click();
	}
	public void ForgetPassword() {
		ForgetPasswordlink.click();
	}
	public void Dropdown() {
		user_dropdown.click();
	}
	public boolean isLoginSuccessfull(){
		if(profile_picture.isDisplayed()) {
			return true;
		
		}else {
			return false;
		}
		
	}

	public void Checkerrormessage(){
		geterrormessage.click();
	}
	
//	private By username= By.xpath("//input[@placeholder='Username']")	;
//	private By password= By.xpath("//input[@type='password']");
//	private By logoBtN= By.xpath("//button[@type='submit']");
////	
//	public void enterUsername(String user) {
//		driver.findElement(username).sendKeys("admin");
//	}
//	public void enterPassword(String user) {
//		driver.findElement(password).sendKeys("admin123");
//	}
//	public void checkLogin() {
//		driver.findElement(logoBtN).click();
//	}
	
	public void logout() {
		logout_button.click();
	
		
	}
	

}