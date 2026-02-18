package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.Read_Properties_File;

public class BaseTest {
	public WebDriver dr;
	public WebDriverWait wait;
	
	@BeforeSuite
	public void Setup() throws IOException
	{
		dr=new ChromeDriver();
		wait = new WebDriverWait(dr,Duration.ofSeconds(10));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//		dr.get(Read_Properties_File.readProperty().getProperty("Base_URL"));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterSuite
	public void closure() {
//		dr.quit();
	}
}
