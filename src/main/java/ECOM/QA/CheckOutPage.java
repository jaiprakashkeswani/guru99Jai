package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.variables.*;

public class CheckOutPage extends BasePage {
	
	// Billing Information Xpath
		WebElement FirstNameFieldonbillingpage;
		WebElement LastNameFieldonbillingpage;
		WebElement ComapanyField;
		WebElement Address1Field;
		WebElement CityField;
		WebElement StateDD1;
		WebElement ZipCodeField;
		WebElement CountryDD1;
		WebElement TelephoneField;
		WebElement BilltoContinueButton;
		
		// Shipping Information Xpath
		WebElement ShippingContinueButton;
		
		// Shipping Method Xpath
		
		WebElement ShippingMethodContinueButton;
		
		// Payment Information XPath
		
		WebElement CheckNumberRadioButton;
		WebElement PaymentInformationContinueButton;
		
		// Order Review Xpath
		WebElement PlaceOrderButton;
		
		
	public CheckOutPage(WebDriver driver) {
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
	// -----
	// Billing Information Xpath
	FirstNameFieldonbillingpage 		= super.getWebElement(Variables.FirstNameFieldonbillingpage);
	LastNameFieldonbillingpage 			= getWebElement(Variables.LastNameFieldonbillingpage);
	ComapanyField 						= getWebElement(Variables.ComapanyField);
	Address1Field = getWebElement(Variables.Address1Field);
	CityField = getWebElement(Variables.CityField);
	StateDD1 = getWebElement(Variables.StateDD1);
	ZipCodeField = getWebElement(Variables.ZipCodeField);
	CountryDD1 = getWebElement(Variables.CountryDD1);
	TelephoneField = getWebElement(Variables.TelephoneField);
	BilltoContinueButton = getWebElement(Variables.BilltoContinueButton);
	
	//Shipping Information Xpath
	ShippingContinueButton = getWebElement(Variables.ShippingContinueButton);
	
	// Shipping Method Xpath
	
	ShippingMethodContinueButton = getWebElement(Variables.ShippingMethodContinueButton);
	
	// Payment Information XPath
	
	CheckNumberRadioButton = getWebElement(Variables.CheckNumberRadioButton);
	PaymentInformationContinueButton = getWebElement(Variables.PaymentInformationContinueButton);
	
	// Order Review Xpath
	PlaceOrderButton = getWebElement(Variables.PlaceOrderButton);
	}	
		
			
		public void enterBillingInformation() {
				
				if(FirstNameFieldonbillingpage.isDisplayed())
					FirstNameFieldonbillingpage.sendKeys("test");

				
				if(LastNameFieldonbillingpage.isDisplayed())
					LastNameFieldonbillingpage.sendKeys("name");
				
				
				if(ComapanyField.isDisplayed())
					ComapanyField.sendKeys("Company");

				
				if(Address1Field.isDisplayed())
					Address1Field.sendKeys("test street 10");

				
				if(CityField.isDisplayed())
					CityField.sendKeys("New York");

				
					Select StateDD = new Select(StateDD1);
					StateDD.selectByVisibleText("New York");

				
				if(ZipCodeField.isDisplayed())
					ZipCodeField.sendKeys("10010");

				
					Select Country = new Select(CountryDD1);
					Country.selectByVisibleText("United States");

				
				if(TelephoneField.isDisplayed())
					TelephoneField.sendKeys("1234567890");
				
				}

			public void clickonBilltoContinueButton() {
				
				if(BilltoContinueButton.isDisplayed()||BilltoContinueButton.isEnabled())
					BilltoContinueButton.click();
				}
			
public void clickonShippingContinueButton() {
	
	
				if(ShippingContinueButton.isDisplayed()||ShippingContinueButton.isEnabled())
					ShippingContinueButton.click();
				
				
				
				}
		
			public void clickonShippingMethodContinueButton() {
				
				ShippingMethodContinueButton = getWebElement(Variables.ShippingMethodContinueButton);
				if(ShippingMethodContinueButton.isDisplayed()||ShippingMethodContinueButton.isEnabled())
					ShippingMethodContinueButton.click();
				}

			public void clickonCheckNumberRadioButton() {
				CheckNumberRadioButton = getWebElement(Variables.CheckNumberRadioButton);
				if(CheckNumberRadioButton.isDisplayed()||CheckNumberRadioButton.isEnabled())
					CheckNumberRadioButton.click();
				}
		
			public void clickonPaymentInformationContinueButton() {
				
				if(PaymentInformationContinueButton.isDisplayed()||PaymentInformationContinueButton.isEnabled())
					PaymentInformationContinueButton.click();
				}

			public OrderConfirmationPage clickonPlaceOrderButton() {
				PlaceOrderButton = getWebElement(Variables.PlaceOrderButton);
				if(PlaceOrderButton.isDisplayed()||PlaceOrderButton.isEnabled())
					PlaceOrderButton.click();
				return new OrderConfirmationPage(driver);
				}
}
