package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/",glue="gluecode",tags="@smokeTest",publish=true,monochrome=true,dryRun=true)
public class TestRunner {

}



/*
 * Execution flow:
 * 
 * TesRunner--> Hooks (we will write what needs to be executed before and after each test)--> Feature file--> glue code of each step
 * 
 */
