package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.variables.*;

public class ViewOrderPage extends BasePage{
	
	WebElement PrintOrderLink;
	
	public ViewOrderPage(WebDriver driver) {
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
	
	PrintOrderLink = getWebElement(Variables.PrintOrderLink);

	}
		
		
		
			public void clickonPrintOrderLink() {
				
				if(PrintOrderLink.isDisplayed()||PrintOrderLink.isEnabled())
					PrintOrderLink.click();
			}
}
