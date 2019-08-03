package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.variables.*;

public class MyOrdersPage extends BasePage{
	
	WebElement ViewOrderLink;
	
	public MyOrdersPage(WebDriver driver) {
		super(driver);
		findPageElements();
	}
	
/*	private WebElement getWebElement(By by) {
		try {
			WebElement w = driver.findElement(by);
			return w;
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("Element Not found");
		}
		return null;
	}*/
	
	private void findPageElements() {

	ViewOrderLink = getWebElement(Variables.ViewOrderLink);

	}	
		
		
		
			
				
	public ViewOrderPage clickonViewOrderLink() {
				
				if(ViewOrderLink.isDisplayed()||ViewOrderLink.isEnabled())
					ViewOrderLink.click();
				return new ViewOrderPage(driver);
		}
}
