package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.variables.*;

public class OrderConfirmationPage extends BasePage{
	
	WebElement OrderIDElement;
	
	public OrderConfirmationPage(WebDriver driver) {
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
	
	OrderIDElement = getWebElement(Variables.OrderIDElement);

	}
		
		
		
			public void PrintOrderID() {
				String OrderID = OrderIDElement.getText();
			System.out.printf("Your Order Number is ",  OrderID);
			}
}
