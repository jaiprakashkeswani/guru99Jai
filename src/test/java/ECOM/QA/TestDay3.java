package ECOM.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.variables.*;


public class TestDay3 extends TestBaseSetup {

	private WebDriver driver;
	private HomePage homepage;
	private MobilePage mobilePage;
	private ShoppingCartPage cartpage;
	// --------

	// Home Page

	@BeforeMethod
	public void setUp() {
		driver = getDriver();
		
		driver.navigate().to(Variables.url);
	}

	@Test

	public void TestShoppingCartPage() throws InterruptedException {

		homepage = new HomePage(driver);
		
		Thread.sleep(3000);
	//	LoginPage loginPage = homepage.clickOnLoginlink();

		mobilePage = homepage.clickonMobileLink(); // Mobile Page
		cartpage = mobilePage.clickonAddToCartButtonSony(); // Shopping Cart
															// Page
		cartpage.clearQuantity();
		cartpage.EnterQuantity(1000);
		//Thread.sleep(30000);
		cartpage.clickonUpdateQtyButton();
		//cartpage.verifyErrorMessage();
		Thread.sleep(30000);
		System.out.println("Before cart click");
		cartpage.clockonEmptyCartLink();
		System.out.println("a cart click");
		
	    Thread.sleep(3000);
		cartpage.verifyCartEmptyMessage();
	}
}
