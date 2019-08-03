package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.variables.*;

public class ShoppingCartPage extends BasePage{
	
	WebElement QtyField;
	WebElement UpdateQtyButton;
	WebElement ErrorMessage;
	WebElement EmptyCartLink;
	
	WebElement CartEmptyMsg;
	WebElement CountryDropDown;
	WebElement StateDropDown;
	WebElement ZIPField;
	WebElement EstimateButton;
	WebElement UpdateTotalButton;
	WebElement ProceedtoCheckOutButton;
	WebElement CouponCodeField;
	WebElement ApplyCouponCodelink;
	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		findPageElements();
		findCommonElements();
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
	
	QtyField = getWebElement(Variables.QtyField);
	UpdateQtyButton = getWebElement(Variables.UpdateQtyButton);
	ErrorMessage = getWebElement(Variables.ErrorMessage);
	EmptyCartLink = getWebElement(Variables.EmptyCartLink);
	
	CartEmptyMsg = getWebElement(Variables.CartEmptyMsg);
	CountryDropDown = getWebElement(Variables.CountryDropDown);
	StateDropDown = getWebElement(Variables.StateDropDown);
	ZIPField = getWebElement(Variables.ZIPField);
	EstimateButton = getWebElement(Variables.EstimateButton);
	UpdateTotalButton = getWebElement(Variables.UpdateTotalButton);
	ProceedtoCheckOutButton = getWebElement(Variables.ProceedtoCheckOutButton);
	CouponCodeField = getWebElement(Variables.CouponCodeField);
	ApplyCouponCodelink = getWebElement(Variables.ApplyCouponCodelink);
		
	}
		
		

		public void clearQuantity() {
			if(QtyField.isDisplayed())
				QtyField.clear();
		}

		public void EnterQuantity(int i) {
			if(QtyField.isDisplayed())
				QtyField.sendKeys("1000");
		}

			public void clickonUpdateQtyButton() {
				if(UpdateQtyButton.isDisplayed()||UpdateQtyButton.isEnabled())
					UpdateQtyButton.click();
		}
			
			public void verifyErrorMessage() {
				String ErrorMessageText = ErrorMessage.getText();
				if(ErrorMessageText.equalsIgnoreCase("* The maximum quantity allowed for purchase is 500."))
				System.out.println("Quantity cannot be increased to 1000");

			}
			
			public void clockonEmptyCartLink() {
				EmptyCartLink = getWebElement(Variables.EmptyCartLink);
				if(EmptyCartLink.isDisplayed()||EmptyCartLink.isEnabled())
					EmptyCartLink.click();
			}

			public void verifyCartEmptyMessage() {
				
				CartEmptyMsg = getWebElement(Variables.CartEmptyMsg);
				
				String CartEmptyMsgText= CartEmptyMsg.getText();
			
				if(CartEmptyMsgText.equalsIgnoreCase("Shopping Cart is Empty"))
				System.out.println("Cart Emptied");

			}
			
			public void SelectCountryfromCountryDropDown() {
				
				Select CountryDD = new Select(CountryDropDown);
				CountryDD.selectByVisibleText("United States");
				
			}

			public void SelectStatefromStateDropDown() {
				
				Select StateDD = new Select(StateDropDown);
				StateDD.selectByVisibleText("New York");
				
			}

			public void EnterZipCode() {
				if(ZIPField.isDisplayed()||ZIPField.isEnabled())
					ZIPField.sendKeys("10010");
			}

			public void clockonEstimateButton() {
				if(EstimateButton.isDisplayed()||EstimateButton.isEnabled())
					EstimateButton.click();
			}

			public void clockonUpdateTotalButton() {
				
				if(UpdateTotalButton.isDisplayed()||UpdateTotalButton.isEnabled())
					UpdateTotalButton.click();
			}	


			public CheckOutPage clockonProceedtoCheckOutButton() {
				ProceedtoCheckOutButton = getWebElement(Variables.ProceedtoCheckOutButton);
				if(ProceedtoCheckOutButton.isDisplayed()||ProceedtoCheckOutButton.isEnabled())
					ProceedtoCheckOutButton.click();
				return new CheckOutPage(driver);
			}
			
			public void EnterCouponCode() {
				if(CouponCodeField.isDisplayed()||CouponCodeField.isEnabled())
					CouponCodeField.sendKeys("GURU50");
			}
			
			public void clockonApplyCouponCodelink() {
				if(ApplyCouponCodelink .isDisplayed()||ApplyCouponCodelink .isEnabled())
					ApplyCouponCodelink .click();
			}

}
