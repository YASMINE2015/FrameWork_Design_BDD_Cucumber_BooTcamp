package com.tutorialsNinja.Runner_Files;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(dryRun = false, 
                 monochrome = true, 
                 features = { "src/test/resources/feature_files" }, 
                 glue = {"com.tutorialsNinja.Step_Definition_Files","com.bdd.learning.Hooks" }, 
                 plugin = { "pretty", "html:target/site/testNG-html", "json:target/cucumber1.json" },
                 tags = " \"@TutorialsNinjaLogin or @TutorialsNinjaRegister or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart or @TutorialsNinjaCheckout\",")
public class Runner_TestNG extends AbstractTestNGCucumberTests{

}

