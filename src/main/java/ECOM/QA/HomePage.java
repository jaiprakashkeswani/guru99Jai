package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.variables.*;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	public WebElement getWebElement(By by) {

		try {
			WebElement w = driver.findElement(by);
			return w;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element Not found");
		}
		return null;
	}

	public String getHomePageTitle() {
		String HomepageTitle = driver.getTitle();
		System.out.println(HomepageTitle);
		return HomepageTitle;
	}

	public boolean verifyHomePageTitle() {
		String expectedTitle = "Home page";
		return getHomePageTitle().equalsIgnoreCase(expectedTitle);
	}

}
