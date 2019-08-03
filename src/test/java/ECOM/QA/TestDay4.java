package ECOM.QA;

import com.variables.*;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.variables.*;


public class TestDay4 extends TestBaseSetup {
		
	private WebDriver driver;
	private HomePage homepage;
	private MobilePage mobilePage;
	
	// --------
		
	// Home Page

	@BeforeMethod
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}


	@Test

		public void Testcomparefunctionality() throws IOException {
		
			homepage = new HomePage(driver);
			
			mobilePage = homepage.clickonMobileLink();				// Mobile Page
			mobilePage.clickonAddtoCompareSamsungMobile();
			mobilePage.clickonAddtoCompareSonyMobile();
			mobilePage.clickonCompareButton();	
			File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			
			//try {
			 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(srcFile, new File("D:/jai/Selenium/compareproductwindow.png"));
			//}
			 
		/*	catch (IOException e)
			 {
			  System.out.println(e.getMessage());
			 
			 }*/
		}
}