package com.tutorialsNinja.Step_Definition_Files;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {

	

	 public WebDriver driver;

		
		
	 @Before
	public void loginSetup() {
	 	driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("https://tutorialsninja.com/demo");
	 		driver.findElement(By.linkText("My Account")).click();
	 		driver.findElement(By.linkText("Login")).click();
	 	}

	 	@After
	 public void tearDown() {
	 		driver.quit(); 
	 	}


	@Given("User opens the application")
	public void user_opens_the_application() {
		driver = com.tutorialsNinja.qa.driver.Factory.DriverFactory_code.getDriver();

	}



	@When("User enters the valid product {string}")
	public void user_enters_the_valid_product(String validProductText) {
	  driver.findElement(By.name("search")).sendKeys(validProductText); 
	}

	@Given("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
	   driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}

	@Then("User gets valid product info display in SearchPage")
	public void user_gets_valid_product_info_display_in_search_page() {
		driver.findElement(By.linkText("HP LP3065")).isDisplayed();

	}

	@When("User enters the invalid product {string}")
	public void user_enters_the_invalid_product(String invalidProductText) {
		  driver.findElement(By.name("search")).sendKeys(invalidProductText); 
	}

	@Then("User gets warning message")
	public void user_gets_warning_message() {
	  Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'There is no product that matches the search criteria.')]")).isDisplayed());
	}
}
