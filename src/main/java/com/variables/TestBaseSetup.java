package com.variables;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;



public class TestBaseSetup {

	private WebDriver driver;

	public WebDriver getDriver() {
		//setDriver();
		return driver;
	}

	protected void setDriver() {
		if (Variables.browserName.equalsIgnoreCase("firefox")) {
			driver = initFirefoxDriver(Variables.url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		} 
		else if (Variables.browserName.equalsIgnoreCase("chrome")) {
			driver = initGoogleCromeDriver(Variables.url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else 
			System.out.println("browser : " + Variables.browserName + " is invalid, Launching Firefox as browser of choice..");
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(Variables.url);
		

		return driver;
	}
	
	private static WebDriver initGoogleCromeDriver(String appURL) {
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "D://Selenium/Guru99/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.navigate().to(Variables.url);
		

		return driver;
	}
	
	
@BeforeClass
	public void initializeTestBaseSetup() {
		try {
			setDriver();
		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	/*@AfterTest
	public void closeDriver() {
		driver.close();
	}*/
}
