package ECOM.QA;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.variables.*;

public class TestDay5 extends TestBaseSetup {
		
	private WebDriver driver;
	private HomePage homepage;
	private LoginPage loginpage;
	private CreateAccountPage createaccountpage;
	private MyAccountPage myaccountpage;
	private TVPage tvpage;
	private MyWishListPage mywishlistpage;
	private ShareWishListPage sharewishlistpage;

	// --------
		
	// Home Page

	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}


	@Test

	public void Testsharewishlistfunctionality() throws Exception {
		
		homepage = new HomePage(driver);
			
		loginpage = homepage.clickOnLoginlink();
		
	
		//createaccountpage = loginpage.clickonCreateAnAccount();
		//myaccountpage = createaccountpage.CreateAccount();
		
		//myaccountpage.verifyConfirmationMessage();
		
		myaccountpage = loginpage.Login();
		System.out.println("Login successfull");
		tvpage = myaccountpage.clickonTVLink();
		mywishlistpage = tvpage.AddtoWishListLGTV();
		sharewishlistpage = mywishlistpage.clickonShareWishListLink();
		mywishlistpage = sharewishlistpage.SharingWishList();
		mywishlistpage.verifyWishListShareMessage();		
	}
}