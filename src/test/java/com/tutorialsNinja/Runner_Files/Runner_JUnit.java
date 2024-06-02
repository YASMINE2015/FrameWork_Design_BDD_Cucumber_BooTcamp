package com.tutorialsNinja.Runner_Files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true,
                 monochrome = true,
                features = {"src/test/resources/feature_files"},
                glue = {"com.tutorialsNinja.Step_Definition_Files","com.bdd.learning.Hooks"},
                tags =" @TutorialsNinjaLogin" + " or @TutorialsNinjaRegister or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart or @TutorialsNinjaCheckout",
               plugin = {"pretty", "html:target/site/cucumber-html","json:target/cucumber1.json"})
               
                 



public class Runner_JUnit {


}
