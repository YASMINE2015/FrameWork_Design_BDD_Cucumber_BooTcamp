package com.tutorialsNinja.qa.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

	public WebDriver driver;

	@FindBy(linkText = "My Account")
	private WebElement myAccountDropDown;


	@FindBy(linkText = "Login")
	private WebElement loginOption;

	@FindBy(linkText = "Register")
	private WebElement registerOption;

	@FindBy(name = "search")
	private WebElement searchTextBox;

	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement searchButton;
	
	@FindBy(css = "hidden-xs hidden-sm hidden-md\")")
	private WebElement addToCart;
	
	@FindBy(css = ("input.btn.btn-primary"))
	private WebElement Checkout;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMyAccount() {
		myAccountDropDown.click();
	}

	public LoginPage selectLoginOption() {
		loginOption.click();
		return new LoginPage(driver);
	}

	public RegisterPage selectRegisterOption() {
		registerOption.click();
		return new RegisterPage(driver);
	}

	public void enterProductDetail(String productNameText) {
		searchTextBox.sendKeys(productNameText);
	}

	public SearchProductPage clickOnSearchIcon() {
		searchButton.click();
		return new SearchProductPage(driver);
	}
	public AddToCartPage selectAddToOption() {
		 addToCart.click();
		return new AddToCartPage(driver);
}
	public CheckoutPage selectCheckoutOption() {
		Checkout.click();
		return new CheckoutPage(driver);
		
	}
}
