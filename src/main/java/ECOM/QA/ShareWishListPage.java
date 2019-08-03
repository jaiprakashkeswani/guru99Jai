package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.variables.*;

public class ShareWishListPage extends BasePage{
	
	WebElement FriendsEmailAddressfield;
	WebElement MessagetobeSharedfield;
	WebElement ShareWishListLink;
	JavascriptExecutor executor = (JavascriptExecutor)driver;	
	
	public ShareWishListPage(WebDriver driver) {
		super(driver);
		findPageElements();
	}
	
/*	private WebElement getWebElement(By by) {
		try {
			WebElement w = driver.findElement(by);
			return w;
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("Element Not found");
		}
		return null;
	}*/
	
	private void findPageElements() {
	
	FriendsEmailAddressfield = getWebElement(Variables.FriendsEmailAddressfield);
	MessagetobeSharedfield = getWebElement(Variables.MessagetobeSharedfield);
	ShareWishListLink = getWebElement(Variables.ShareWishListLink);

	}
		
		
		
		
			public MyWishListPage SharingWishList() {
				
				FriendsEmailAddressfield.sendKeys("jaiprakash1091@gmail.com");

			
				MessagetobeSharedfield.sendKeys("TV Information");

				
				if(ShareWishListLink.isDisplayed()||ShareWishListLink.isEnabled())
					executor.executeScript("arguments[0].click();", ShareWishListLink);
					//ShareWishListLink.click();
				return new MyWishListPage(driver);
		}
}
