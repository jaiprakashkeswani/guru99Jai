package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.variables.*;

public class MobilePage extends BasePage{
	
	WebElement SORTBYList;
	WebElement SonyMobilePrice;
	WebElement AddToCartButtonSony;
	WebElement AddtoCompareSamsungMobile;
	WebElement AddtoCompareSonyMobile;
	WebElement CompareButton;
	WebElement AddtoCartButtonIPhone;
	Actions action = new Actions(driver);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	 
    
	
	public MobilePage(WebDriver driver) {
		super(driver);
		findPageElements();
		findCommonElements();
	}
	
	private void findPageElements() {
		// TODO Auto-generated method stub
		SORTBYList = getWebElement(Variables.SORTBYList); 
		SonyMobilePrice = getWebElement(Variables.SonyMobilePrice); 
		AddToCartButtonSony = getWebElement(Variables.AddToCartButtonSony); 
		AddtoCompareSamsungMobile = getWebElement(Variables.AddtoCompareSamsungMobile); 
		AddtoCompareSonyMobile = getWebElement(Variables.AddtoCompareSonyMobile); 
		CompareButton = getWebElement(Variables.CompareButton); 
		AddtoCartButtonIPhone = getWebElement(Variables.AddtoCartButtonIPhone); 
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


		
	

		
		public String GetMobilePageTitle() {
			String MobilepageTitle = driver.getTitle();
			return MobilepageTitle;
		}
		
		public boolean verifyMobilePageTitle() {
			String expectedTitle = "Mobile";
			return GetMobilePageTitle().equalsIgnoreCase(expectedTitle);
		}
		

		public void selectNamefromSORTBYDropDown() {
			Select selectSORTBY = new Select(SORTBYList);
			selectSORTBY.selectByVisibleText("Name");
		}


		public void GetSonyMobilePrice() {
			String SMPrice = SonyMobilePrice.getText();
		}

		public ShoppingCartPage clickonAddToCartButtonSony() {
			if(AddToCartButtonSony.isDisplayed()||AddToCartButtonSony.isEnabled())
		        
				action.moveToElement(AddToCartButtonSony).build().perform();
			executor.executeScript("arguments[0].click();", AddToCartButtonSony);
				//AddToCartButtonSony.click();
			return new ShoppingCartPage(driver);
		}

			
			public void clickonAddtoCompareSamsungMobile() {
				AddtoCompareSamsungMobile = getWebElement(Variables.AddtoCompareSamsungMobile); 
				if(AddtoCompareSamsungMobile.isDisplayed()||AddtoCompareSamsungMobile.isEnabled())
					action.moveToElement(AddtoCompareSamsungMobile).build().perform();
				executor.executeScript("arguments[0].click();", AddtoCompareSamsungMobile);
					//AddtoCompareSamsungMobile.click();
		}

			public void clickonAddtoCompareSonyMobile() {
				AddtoCompareSonyMobile = getWebElement(Variables.AddtoCompareSonyMobile);
				if(AddtoCompareSonyMobile.isDisplayed()||AddtoCompareSonyMobile.isEnabled())
					action.moveToElement(AddtoCompareSonyMobile).build().perform();
				executor.executeScript("arguments[0].click();", AddtoCompareSonyMobile);
					//AddtoCompareSonyMobile.click();
		}

			public void clickonCompareButton() {
				CompareButton = getWebElement(Variables.CompareButton);
				if(CompareButton.isDisplayed()||CompareButton.isEnabled())
					CompareButton.click();
				
				for(String Comparepopup :driver.getWindowHandles()){
					 driver.switchTo().window(Comparepopup); 
					 System.out.println("Popup values: "+Comparepopup);
					//driver.close();
					 }
		}

			public ShoppingCartPage clickonAddtoCartButtonIPhone() {
				if(AddtoCartButtonIPhone.isDisplayed()||AddtoCartButtonIPhone.isEnabled())
					AddtoCartButtonIPhone.click();
				return new ShoppingCartPage(driver);
}

}
