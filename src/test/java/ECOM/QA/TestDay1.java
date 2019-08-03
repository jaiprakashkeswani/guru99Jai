package ECOM.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.variables.*;


public class TestDay1 extends TestBaseSetup {
	private WebDriver driver;
	private HomePage homepage;
	private MobilePage mobilePage;

	@BeforeTest
	public void setUp() {
		driver = getDriver();
	}

	

	// Home Page
	@Test
	public void verifyHomePage() {
		System.out.println("Verifying Home Page.....");
		homepage = new HomePage(driver);

		Assert.assertTrue(homepage.verifyHomePageTitle(), "Home page");
	}

	// Mobile Page
	@Test
	public void verifyMobilePage() {
		System.out.println("Verifying Mobile Page.....");
		homepage = new HomePage(driver);

		mobilePage = homepage.clickonMobileLink();
		Assert.assertTrue(mobilePage.verifyMobilePageTitle(), "Mobile Page Title Not Matching");
	}
	
	@Test
	public void selectsortbydropdown() {
		homepage = new HomePage(driver);
		mobilePage = homepage.clickonMobileLink();
		mobilePage.selectNamefromSORTBYDropDown();
	}

	
}
