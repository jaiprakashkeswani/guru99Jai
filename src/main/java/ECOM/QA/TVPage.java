package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.variables.*;

public class TVPage extends BasePage{
	
	WebElement AddtoWishlistLGTVLink;
	JavascriptExecutor executor = (JavascriptExecutor)driver;	
	public TVPage(WebDriver driver) {
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
	
	AddtoWishlistLGTVLink = getWebElement(Variables.AddtoWishlistLGTVLink);

	}
		
		public MyWishListPage AddtoWishListLGTV() {
				if(AddtoWishlistLGTVLink.isDisplayed()||AddtoWishlistLGTVLink.isEnabled())
					executor.executeScript("arguments[0].click();", AddtoWishlistLGTVLink);
					//AddtoWishlistLGTVLink.click();
				return new MyWishListPage(driver);
			}
}
