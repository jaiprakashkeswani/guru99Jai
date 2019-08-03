package ECOM.QA;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.variables.*;


public class TestDay8 extends TestBaseSetup {
		
	private WebDriver driver;
	private HomePage homepage;
	private LoginPage loginpage;
	private MyAccountPage myaccountpage;
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

	public void Testcomparefunctionality() throws Exception {
		
		homepage = new HomePage(driver);
			
		loginpage = homepage.clickOnLoginlink();
		
		myaccountpage = loginpage.Login();		
		
		cartpage = myaccountpage.clickonReorderLink();
		
		cartpage.clearQuantity();
		
		cartpage.EnterQuantity(2);
		
		//cartpage.clickonUpdateQtyButton();
		
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
		Thread.sleep(3000);
		//orderconfirmationpage.PrintOrderID();
	}
}