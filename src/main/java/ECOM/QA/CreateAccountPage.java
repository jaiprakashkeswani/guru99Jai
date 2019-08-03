package ECOM.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.variables.*;

public class CreateAccountPage extends BasePage {
	
	WebElement FirstNameField;
	WebElement LastNameField;
	WebElement EmailAddressField;
	WebElement PasswordField;
	WebElement ConfirmPasswordField;
	WebElement RegisterButton;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		findPageElements();
	}
	
	/*private WebElement getWebElement(By by) {
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
	FirstNameField = getWebElement(Variables.FirstNameField);
	LastNameField = getWebElement(Variables.LastNameField);
	EmailAddressField = getWebElement(Variables.EmailAddressField);
	PasswordField = getWebElement(Variables.PasswordField);
	ConfirmPasswordField = getWebElement(Variables.ConfirmPasswordField);
	RegisterButton = getWebElement(Variables.RegisterButton);
	}

		
		
			public MyAccountPage CreateAccount() {
				if(FirstNameField.isDisplayed())
					FirstNameField.sendKeys("Jai");

				if(LastNameField.isDisplayed())
					LastNameField.sendKeys("Keswani");

				if(EmailAddressField.isDisplayed())
					EmailAddressField.sendKeys("test@test.com");

				if(PasswordField.isDisplayed())
					PasswordField.sendKeys("password");

				if(ConfirmPasswordField.isDisplayed())
					ConfirmPasswordField.sendKeys("password");
			
				if(RegisterButton.isDisplayed()||RegisterButton.isEnabled())
					RegisterButton.click();
				return new MyAccountPage(driver);
			}
			
		}
