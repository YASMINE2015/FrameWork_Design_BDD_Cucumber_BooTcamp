package com.tutorialsNinja.qa.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public WebDriver driver;

	@FindBy(id = "input-firstname")
	private WebElement firstNameTextBox;

	@FindBy(id = "input-lastname")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "input-company")
	private WebElement companyTextBox;

	@FindBy(id = "input-address1")
	private WebElement address1TextBox;

	@FindBy(id = "input-address2")
	private WebElement address2TextBox;

	@FindBy(id = "input-city")
	private WebElement cityTextBox;

	@FindBy(id = "input-postcode")
	private WebElement postcodeTextBox;

	@FindBy(id= "input-country")
	private WebElement countryTextBox;

	@FindBy(id = "input-state")
	private WebElement stateCheckBox;

	@FindBy(id = "button-payment-address")
	private WebElement continueButton;

	@FindBy(id = "button-shipping-address")
	private WebElement  continueButton1;
	
	@FindBy(id = "button-payment-method")
	private WebElement duplicatepaymentWarningMessage;
	
	@FindBy(name = "agree")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(id="button-confirm")
	private WebElement  confirmPasswordTextBox;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void enterFirstName(String firstnametext) {
		firstNameTextBox.sendKeys(firstnametext);
	}

	public void enterLastName(String lastnametext) {
		lastNameTextBox.sendKeys(lastnametext);
	}

	public void enterAddress1(String address1text) {
		address1TextBox.sendKeys(address1text);
	}


	public void enterAddress2(String address2text) {
		address2TextBox.sendKeys(address2text);
	}

	public void enterCity(String citytext) {
		cityTextBox.sendKeys(citytext);
	}
	
	public void enterPostcode(String postcodetext) {
		postcodeTextBox.sendKeys(postcodetext);
	}
	
	public void enterCountry(String countrytext) {
		countryTextBox.sendKeys(countrytext);
		
	}
	public void enterState(String statetext) {
		stateCheckBox.sendKeys(statetext);
	}
	public void clickOnPaymentAddressButton() {
		
	}
	
public void clickOnShippingAddressButton() {
		
	}
public void clickOnPaymentMethodButton1() {
	
}

	
	public void clickOnPrivacyPolicyCheckBox() {
		privacyPolicyCheckBox.click();
	}

	public CheckoutPage clickOnConfirmButton(WebElement confirmButton) {
		confirmButton.click();
		return new CheckoutPage(driver);
	}

	public String retrieveDuplicateCheckoutWarning() {
		String duplicatecheckoutWarning = duplicatepaymentWarningMessage.getText();
		return duplicatecheckoutWarning;

	}

}
