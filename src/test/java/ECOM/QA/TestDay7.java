package ECOM.QA;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.variables.*;



public class TestDay7 extends TestBaseSetup {
		
	private WebDriver driver;
	private HomePage homepage;
	private LoginPage loginpage;
	private MyAccountPage myaccountpage;
	private MyOrdersPage myorderspage;
	private ViewOrderPage vieworderpage;
	

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
		
		myorderspage = myaccountpage.clickonMyOrderLink();
		
		vieworderpage = myorderspage.clickonViewOrderLink();
		
		vieworderpage.clickonPrintOrderLink();
		
	}
}