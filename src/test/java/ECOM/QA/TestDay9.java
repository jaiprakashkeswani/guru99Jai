package ECOM.QA;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.variables.*;


public class TestDay9 extends TestBaseSetup {
		
	private WebDriver driver;
	private HomePage homepage;
	private MobilePage mobilePage;
	private ShoppingCartPage cartpage;
	

	// --------
		
	// Home Page

	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}


	@Test

	public void TestApplyCouponfunctionality() {
		
		homepage = new HomePage(driver);
			
		mobilePage = homepage.clickonMobileLink();
		
				
		cartpage = mobilePage.clickonAddtoCartButtonIPhone();
		
		cartpage.EnterCouponCode();
		
		cartpage.clockonApplyCouponCodelink();
	}
}