package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.variables.*;

public class MyWishListPage extends BasePage{
	
	WebElement ShareWishListLink;
	WebElement Wishlistsharemsg;
	WebElement AddtoCartButton;
	
	public MyWishListPage(WebDriver driver) {
		super(driver);
		findPageElements();
	}
	
	/*private WebElement getWebElement(By by) {
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
	
	ShareWishListLink = getWebElement(Variables.ShareWishListLink);
	Wishlistsharemsg = getWebElement(Variables.Wishlistsharemsg);
	AddtoCartButton = getWebElement(Variables.AddtoCartButton);

	}
	
		
		public ShareWishListPage clickonShareWishListLink() {
			if(ShareWishListLink.isDisplayed()||ShareWishListLink.isEnabled())
					ShareWishListLink.click();
				return new ShareWishListPage(driver);
			}
		
				
		public void verifyWishListShareMessage() {
				String WishlistshareMessagetext = Wishlistsharemsg.getText();
				if(WishlistshareMessagetext.equalsIgnoreCase("Your Wishlist has been shared."))
				System.out.println("Wishlist Shared");

			}


			public ShoppingCartPage clickonAddtoCartButton() {
				if(AddtoCartButton.isDisplayed()||AddtoCartButton.isEnabled())
					AddtoCartButton.click();
				return new ShoppingCartPage(driver);
			}
}
