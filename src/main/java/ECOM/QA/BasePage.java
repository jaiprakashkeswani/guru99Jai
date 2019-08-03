package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.variables.*;

public class BasePage {
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		findCommonElements();
	}
	protected WebDriver driver;

	
	public WebElement getWebElement(By by){
		
		try {
			WebElement w = driver.findElement(by);
			return w;
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("Element Not found");
		}
		return null;
	}

	
	WebElement mobileLink;
	WebElement accountlink;
	WebElement MyAccount;
	WebElement Loginlink;
	WebElement CartLink;
	WebElement TVLink;
	
	
	public void findCommonElements(){
		mobileLink = getWebElement(Variables.mobileLink);
		accountlink = getWebElement(Variables.accountlink);
		MyAccount = getWebElement(Variables.myAccount);
		Loginlink = getWebElement(Variables.loginlink);
		CartLink = getWebElement(Variables.CartLink);
		TVLink = getWebElement(Variables.TVLink);
	}
	
	
	
	public MobilePage clickonMobileLink() {
		
		if(mobileLink.isDisplayed()||mobileLink.isEnabled())
			mobileLink.click();
		
		
		return new MobilePage(driver);
	}
	
	
	public LoginPage clickonMyAccountLink() {
		if (accountlink.isDisplayed() || accountlink.isEnabled())
			accountlink.click();
			if(MyAccount.isDisplayed()||MyAccount.isEnabled())
				MyAccount.click();
			return new LoginPage(driver);
	}
	
	public LoginPage clickOnLoginlink() {
		if (accountlink.isDisplayed() || accountlink.isEnabled())
			accountlink.click();
			if(Loginlink.isDisplayed()||Loginlink.isEnabled())
				Loginlink.click();
			return new LoginPage(driver);
		}
	public TVPage clickonTVLink() {
		if(TVLink.isDisplayed()||TVLink.isEnabled())
			TVLink.click();
		return new TVPage(driver);
}

			
}

