package ECOM.QA;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.variables.*;


public class TestDay6 extends TestBaseSetup {
		
	private WebDriver driver;
	private HomePage homepage;
	private LoginPage loginpage;
	private MyAccountPage myaccountpage;
	private MyWishListPage mywishlistpage;
	private ShoppingCartPage cartpage;
	private CheckOutPage checkoutpage;
	private OrderConfirmationPage orderconfirmationpage;

	// --------
		
	// Home Page

	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}


	@Test

	public void Testplaceorderfromwishlistfunctionality() throws Exception {
		
		homepage = new HomePage(driver);
			
		loginpage = homepage.clickOnLoginlink();
		
		myaccountpage = loginpage.Login();
	
		// myaccountpage.verifyConfirmationMessage();		
		
		mywishlistpage = myaccountpage.clickonMyWishListLink();
		
		cartpage = mywishlistpage.clickonAddtoCartButton();

		cartpage.SelectCountryfromCountryDropDown();
		cartpage.SelectStatefromStateDropDown();
		cartpage.EnterZipCode();
		
		
		Thread.sleep(3000);
		
		cartpage.clockonEstimateButton();
		//cartpage.clockonUpdateTotalButton();
		Thread.sleep(3000);
		checkoutpage = cartpage.clockonProceedtoCheckOutButton();
	
		//checkoutpage.enterBillingInformation();
		
		checkoutpage.clickonBilltoContinueButton();
		
		Thread.sleep(3000);
		
		//checkoutpage.clickonShippingContinueButton();
		
		Thread.sleep(3000);
		
		checkoutpage.clickonShippingMethodContinueButton();
		
		Thread.sleep(3000);
		checkoutpage.clickonCheckNumberRadioButton();
		
		checkoutpage.clickonPaymentInformationContinueButton();
		
		Thread.sleep(3000);
		
		orderconfirmationpage = checkoutpage.clickonPlaceOrderButton();
	

		orderconfirmationpage.PrintOrderID();
		
	}
}