package com.tutorialsNinja.qa.driver.Hooks;





import org.openqa.selenium.WebDriver;

import com.tutorialsNinja.qa.Utilities.Util;
import com.tutorialsNinja.qa.driver.Factory.DriverFactory_code;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class MyHooks {

	public WebDriver driver;
	


	@Before
	public void setup() {
		DriverFactory_code.initializeBrowser("chrome");
		driver = DriverFactory_code.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(Util.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(Util.PAGELOAD_TIME_WAIT));
		driver.manage().timeouts().scriptTimeout(java.time.Duration.ofSeconds(Util.SCRIPT_TIME_WAIT));
		driver.manage().window().maximize();
		driver.get(("https://tutorialsninja.com/demo"));

	}


	@After
	public void tearDown() {
		driver.quit();
	}

}
