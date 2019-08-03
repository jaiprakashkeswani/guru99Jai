package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.variables.*;

public class MyAccountPage extends BasePage{
	
	WebElement MyWishListLink = getWebElement(Variables.MyWishListLink);
	WebElement MyOrderLink = getWebElement(Variables.MyOrderLink);
	WebElement ReorderLink = getWebElement(Variables.ReorderLink);
	WebElement RegistrationConfirmationMessage = getWebElement(Variables.RegistrationConfirmationMessage);
	
	public MyAccountPage(WebDriver driver) {
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

	MyWishListLink = getWebElement(Variables.MyWishListLink);
	MyOrderLink = getWebElement(Variables.MyOrderLink);
	ReorderLink = getWebElement(Variables.ReorderLink);
	RegistrationConfirmationMessage = getWebElement(Variables.RegistrationConfirmationMessage);

	}	
		
		
		public void verifyConfirmationMessage() {
			String RegistrationConfirmationMessageText = RegistrationConfirmationMessage.getText();
			if(RegistrationConfirmationMessageText.equalsIgnoreCase("Thank you for registering with Main Website Store."))
			System.out.println("Registration done");
		}
		
			
			
			public MyWishListPage clickonMyWishListLink() {
				if(MyWishListLink.isDisplayed()||MyWishListLink.isEnabled())
					MyWishListLink.click();
				return new MyWishListPage(driver);
		}


				public MyOrdersPage clickonMyOrderLink() {
					if(MyOrderLink.isDisplayed()||MyOrderLink.isEnabled())
					MyOrderLink.click();
				return new MyOrdersPage(driver);
		}
				
				
				
				public ShoppingCartPage clickonReorderLink() {
				if(ReorderLink.isDisplayed()||ReorderLink.isEnabled())
					ReorderLink.click();
				return new ShoppingCartPage(driver);
		}
}
