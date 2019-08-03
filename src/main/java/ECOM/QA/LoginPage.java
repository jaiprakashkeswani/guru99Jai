package ECOM.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.variables.*;

public class LoginPage extends BasePage{

	WebElement CreateAccountLink;
	WebElement UserIDField;
	WebElement passwordfield;
	WebElement LoginButton;
	WebElement ErrorMessageInvalidLogin;
	
	
	
	
	public LoginPage(WebDriver driver) {
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

	CreateAccountLink = getWebElement(Variables.CreateAccountLink);
	UserIDField = getWebElement(Variables.UserIDField);
	passwordfield = getWebElement(Variables.passwordfield);
	LoginButton = getWebElement(Variables.LoginButton);
	ErrorMessageInvalidLogin = getWebElement(Variables.ErrorMessageInvalidLogin);
	}
		
		
		public CreateAccountPage clickonCreateAnAccount() {
				if(CreateAccountLink.isDisplayed()||CreateAccountLink.isEnabled())
					CreateAccountLink.click();
				return new CreateAccountPage(driver);
		}
			
			public boolean verifyLogin() {
				enterUserName("test");
				enterPassword("pass");
				clickOnLogin();
				return getErrorMessage().contains("incorrect");
			}
			
			public MyAccountPage Login() throws Exception {
				
				ExcelUtils.setExcelFile(Variables.Path_TestData, Variables.SheetName);
				
				System.out.println("data taken");
				
				enterUserName(ExcelUtils.getCellData(1,0));
				//enterUserName("test@test.com");
				enterPassword(ExcelUtils.getCellData(1,1));
				//enterPassword("password");
				clickOnLogin();
				return new MyAccountPage(driver);
				
			}
			
			public void enterUserName(String userName) {
				if(UserIDField.isDisplayed())
					UserIDField.sendKeys(userName);
			}
			
			public void enterPassword(String password) {
				if(passwordfield.isDisplayed())
					passwordfield.sendKeys(password);
			}
			
			public void clickOnLogin() {
				if(LoginButton.isDisplayed())
					LoginButton.click();
			}
			
			public String getErrorMessage() {
				String strErrorMsg = null;
				if(ErrorMessageInvalidLogin.isDisplayed()&&ErrorMessageInvalidLogin.isEnabled())
					strErrorMsg = ErrorMessageInvalidLogin.getText();
				return strErrorMsg;
			}
}
