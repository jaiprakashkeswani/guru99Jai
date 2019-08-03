package com.variables;

import org.openqa.selenium.By;

public class Variables {
	
	// Home Page
	public static final String browserName = "chrome";
	public static final String url		   = "http://live.guru99.com/";
	public static final By mobileLink	= By.xpath("//a [contains(@href, 'index.php/mobile.html')]");
	//public static final By mobileLink	= By.partialLinkText("MOBILE");
	public static final By accountlink	= By.xpath("//a [contains(@href, '/customer/account/')]");
	public static final By myAccount	= By.xpath(" //a [@title='My Account']");
	public static final By loginlink	= By.xpath("//a [@title='Log In']");
	
	// Mobile Page
	public static final By SORTBYList	= By.xpath("//select[@title='Sort By']"); 
	public static final By SonyMobilePrice = By.id("product-price-1");
	public static final By AddToCartButtonSony = By.xpath("//button [contains(@onclick, 'product/1/')]");
	public static final By AddtoCompareSamsungMobile = By.xpath("//a [contains(@href, 'add/product/3/uenc')]");
	public static final By AddtoCompareSonyMobile = By.xpath("//a [contains(@href, 'add/product/1/uenc')]");
	public static final By CompareButton =By.xpath("//button [@title='Compare']");
	public static final By AddtoCartButtonIPhone =By.xpath("//button [@title='Add to Cart'] [contains(@onclick, '/product/2/form_key/')]");
	
	// Login Page 
	public static final By CreateAccountLink = By.xpath(" //a [contains(@href, 'customer/account/create')]/span");
		
	public static final By LoginButton = By.id("send2");
	public static final By ErrorMessageInvalidLogin = By.xpath("//*[contains(text(),'Invalid login or password.')]");
	
	// Create Account Page
	public static final By FirstNameField = By.id("firstname");
	public static final By LastNameField = By.id("lastname");
	public static final By EmailAddressField = By.id("email_address");
	public static final By PasswordField = By.id("password");
	public static final By ConfirmPasswordField = By.id("confirmation");
	public static final By RegisterButton = By.xpath("//button [@title='Register']");

	//My Account Page
	public static final By TVLink = By.xpath("//a [contains(@href, '/index.php/tv')]");
	public static final By MyWishListLink = By.xpath(".//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a");
	public static final By MyOrderLink = By.xpath("//a [contains(@href, '/sales/order/history/')]");
	public static final By ReorderLink = By.xpath("//a [contains(@href, '/order/reorder/order_id')]");
	public static final By RegistrationConfirmationMessage = By.xpath("//*[contains(text(),' Thank you for registering with Main Website Store.')]");
	
    // My Orders Page
	public static final By ViewOrderLink = By.xpath(".//*[@id='my-orders-table']/tbody/tr/td[6]/span/a[1]");
	
	// My WishList page
	public static final By ShareWishListLink = By.xpath("//button [@title='Share Wishlist']");
	public static final By Wishlistsharemsg = By.xpath("//*[contains(text(),'Your Wishlist has been shared.')]");
	public static final By AddtoCartButton = By.xpath("//button [@title='Add to Cart']");
	
	// Order Confirmation Page
	public static final By OrderIDElement = By.xpath("//a [contains(@href, 'order/view/order_id')]");
	
	// Share WishList Page
	public static final By FriendsEmailAddressfield = By.id("email_address");
	public static final By MessagetobeSharedfield = By.id("message");
	
	// Shopping Cart Page
	public static final By QtyField = By.xpath("//input [contains(@name, 'cart')]");
	public static final By UpdateQtyButton = By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/button");
	public static final By ErrorMessage = By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[2]/p");
	public static final By EmptyCartLink = By.id("empty_cart_button");
	public static final By CartLink = By.xpath(".//*[@id='header']/div/div[2]/div/div/a/span[2]");
	public static final By CartEmptyMsg = By.xpath(".//*[@id='top']/body/div/div/div[2]/div/div/div[1]/h1[1]");
	public static final By CountryDropDown = By.id("country");
	public static final By StateDropDown = By.id("region_id");
	public static final By ZIPField = By.id("postcode");
	public static final By EstimateButton = By.xpath("//button [@title='Estimate']");
	public static final By UpdateTotalButton = By.xpath(".//*[@id='co-shipping-method-form']/div/button");
	public static final By ProceedtoCheckOutButton = By.xpath(".//*[@id='top']/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button");
	public static final By CouponCodeField = By.id("coupon_code");
	public static final By ApplyCouponCodelink = By.xpath("//button[@value='Apply']");
	
	// TV Page
	public static final By AddtoWishlistLGTVLink = By.xpath("//a [contains(@href, 'add/product/4/form_key')]");
	
	// View Order Page
	public static final By PrintOrderLink = By.xpath("//a [contains(@href, 'order/print/order_id')]");
	
	
	// Check Out Page

	// Billing Information Xpath

		public static final By FirstNameFieldonbillingpage = By.id("billing:firstname");
		public static final By LastNameFieldonbillingpage = By.id("billing:lastname");
		public static final By ComapanyField = By.id("billing:company");
		public static final By Address1Field = By.id("billing:street1");
		public static final By CityField = By.id("billing:city");
		public static final By StateDD1 = By.id("billing:region_id");
		public static final By ZipCodeField = By.id("billing:postcode");
		public static final By CountryDD1 = By.id("billing:country_id");
		public static final By TelephoneField = By.id("billing:telephone");
		public static final By BilltoContinueButton = By.xpath(" //button [@title='Continue'] [@onclick='billing.save()']");

		//Shipping Information Xpath
		public static By ShippingContinueButton = By.xpath(".//*[@id='shipping-buttons-container']/button");
		// Shipping Method Xpath
		public static final By ShippingMethodContinueButton = By.xpath(".//*[@id='shipping-method-buttons-container']/button");

		// Payment Information XPath
		public static final By CheckNumberRadioButton = By.xpath(".//*[@id='p_method_checkmo']");
		public static final By PaymentInformationContinueButton = By.xpath("//button [@onclick='payment.save()']");

		// Order Review Xpath
		public static final By PlaceOrderButton = By.xpath("//button [@onclick='review.save();']");
		
		// Login Data Driven Framework 
		public static final By UserIDField = By.id("email");
		public static final By passwordfield = By.id("pass");
		//public static final String Path_TestData = "//C://Users//SDWA-174//workspace//Guru99//src//com//ecom//guru99//base//TestData.xls";
		public static final String Path_TestData ="D:\\jai\\Selenium\\TestData.xlsx";
		public static final String SheetName = "Sheet1";
}
