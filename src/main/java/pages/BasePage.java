package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

public class BasePage {

	WebDriver dr;
	
	protected WebDriverWait wait;
	
	public BasePage(){
		this.dr=dr;
		PageFactory.initElements(dr, this);
		this.wait=new WebDriverWait(dr,Duration.ofSeconds(12));
		
	}
	
	public void waitForVisi(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForPresence(Locator loc) {
		wait.until(ExpectedConditions.presenceOfElementLocated((By) loc));
	}
	
	public void waitforClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void scroll(WebElement element) {
		((JavascriptExecutor) dr).executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	
	
}
