package com.tutorialsNinja.Step_Definition_Files;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutTest{
	 public WebDriver driver;

		
		
	 @Before
	public void loginSetup() {
	 	driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("https://tutorialsninja.com/demo");
	 		driver.findElement(By.linkText("My Account")).click();
	 		driver.findElement(By.linkText("Checkout")).click();
	 	}

	 	@After
	 public void tearDown() {
	 		driver.quit(); 
	 	}
    @Given("User navigates to CheckoutPage")
    public void user_navigates_to_checkout_page() {
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
  
    }

    @When("User enters all Checkout info")
    public void user_enters_all_Checkout_Info() {
    	driver.findElement(By.id("input-firstname")).sendKeys("firstname");
		driver.findElement(By.id("input-lastname")).sendKeys("lastname");
		driver.findElement(By.id("input-address1")).sendKeys("address1");
		driver.findElement(By.id("input-city")).sendKeys("city");
		driver.findElement(By.id("input-postcode")).sendKeys("postcode");
		driver.findElement(By.id("input-state")).sendKeys("state");
	} 
    

    @And("User selects existing address for Delivery Details")
    public void user_selects_existing_address_for_delivery_details() {
        driver.findElement(By.id("button-payment-address"));
        
    }

    @And("User selects existing address for Delivery Method")
    public void user_selects_existing_address_for_delivery_method() {
    	 driver.findElement(By.id("button-shipping-address"));
         
    }

    @And("User selects existing address for Payment Method")
    public void user_selects_existing_address_for_payment_method() {
    	 driver.findElement(By.id("button-payment-method"));
    }

    @And("User selects Privacy Policy checkbox")
    public void user_selects_privacy_policy_checkbox() {
    	driver.findElement(By.name("agree"));
    }
    @When("User clicks on confirm Order")
    public void user_clicks_on_confirm_order() {
    	driver.findElement(By.name("button-confirm"));
    }

    @Then("User confirms the order and completes the checkout")
    public void user_confirms_order_and_completes_checkout() {
    	driver.findElement(By.xpath("//div[contains(@class, 'Your order has been placed!')]"));  
    }

    @Then("User gets warning message for All Checkout information fields")
    public void user_gets_warning_message_for_all_Checkout_information_fields() {
        
			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText().contains("Warning:You must agree to the Privacy Policy!"));
			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(), 'First Name must be between 1 and 32 characters!')]")).getText().contains("First Name must be between 1 and 32 characters!"));
			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(), 'Last Name must be between 1 and 32 characters!')]")).getText().contains("Last Name must be between 1 and 32 characters!"));
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),' Warning:  Address is already registered!")).getText().contains(" Warning:  Address is already registered!"));
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),  'Payment method does not appear to be valid!')]")).getText().contains("state must be between mash with the address!"));
			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(), 'Delivery ;must be valid{!')]")).getText().contains("Delivery must be valid"));
		  	
    
    
    }	
	
	
	
	
		
		
		
	}
	

