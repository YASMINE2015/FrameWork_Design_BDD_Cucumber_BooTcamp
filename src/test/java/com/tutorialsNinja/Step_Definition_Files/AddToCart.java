package com.tutorialsNinja.Step_Definition_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	
	
	public WebDriver driver;
	 

		
		
		 @Before
		 public void loginSetup() {
		 	driver = new ChromeDriver();
		 		driver.manage().window().maximize();
		 		driver.get("https://tutorialsNinja.com/demo");
		 		driver.findElement(By.linkText("My Account")).click();
		 		driver.findElement(By.linkText("Login")).click();
		 	}

		 	@After
		 	public void tearDown() {
		 		driver.quit(); 
		 	}

	@Given("the user is on the homepage")
   public void the_user_is_on_the_homepage1() {
	driver.get("https://tutorialsNinja.com/demo");
		 	    
}
	@When("the user searches for {string}")
	public void the_user_searches_for1(String string) {
		   driver.findElement(By.name("search")).sendKeys(string);
	        driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
	    	
		
	}
	@When("the user selects the first search result")
	public void the_user_selects_the_first_search_result() {
	     driver.findElement(By.cssSelector(".product-layout .product-thumb")).click();
	     	
	}
	@When("the user adds the item to the cart")
	public void the_user_adds_the_item_to_the_cart1() {
	    driver.findElement(By.id("button-cart")).click();
	        
	}
   @When("the user adds a single item to the cart")
	public void the_user_adds_the_item_to_the_cart() {
		 driver.findElement(By.id("button-cart")).click();
	}
	

	@Then("the cart should contain {int} item")
	public void the_cart_should_contain_item(Integer int1) {
		 driver.findElement(By.id("cart-total")).click();
	    
	}

 @When("the user removes the item from the cart")
	public void the_user_removes_the_item_from_the_cart() {
	    driver.findElement(By.id("cart")).click();

	}

	@Then("the cart should be empty")
	public void the_cart_should_be_empty1() {
		 driver.findElement(By.id("cart-total")).getText();
		 

	}



@Given("the user is on the homepage")
public void the_user_is_on_the_homepage() {
	driver.get("https://tutorialsNinja.com/demo");   
}

@When("the user searches for {string}")
public void the_user_searches_for(String string) {
	  driver.findElement(By.name("search")).sendKeys(string);
      driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
  	 
}

@When("the user selects the first search result")
public void the_user_selects_the_first_search_result1() {
	 driver.findElement(By.cssSelector(".product-layout .product-thumb")).click();
	      
}

@When("the user adds multiple items to the cart")
public void the_user_adds_the_item_to_the_cart11() {
	    driver.findElement(By.id("button-cart")).click();   
}
@Then("the cart should contain 2 items")
	public void the_cart_should_contain_item1(Integer int1) {
		 driver.findElement(By.id("cart-total")).click();
	    }
@When("the user removes the item from the cart")
public void the_user_removes_the_items_from_the_cart1() {
	
	    driver.findElement(By.id("cart")).click();   
}

@Then("the cart should be empty")
public void the_cart_should_be_empty() {
	driver.findElement(By.id("cart-total")).getText();   
}
}









