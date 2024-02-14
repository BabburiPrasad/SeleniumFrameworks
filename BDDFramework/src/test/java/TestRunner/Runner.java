package TestRunner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;


//import org.testng.annotations.DataProvider;



@RunWith(Cucumber.class)
@CucumberOptions( features= "src/test/resources/Features",
glue= {"StepDefinitions","POM"})

public class Runner {
	
	
}
