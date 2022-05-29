package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

(
		
features="src/test/resources/BusinessLogic/Login.feature",		//feature file folder location
tags="@SmokeTest",	
													//type of test to execute(delete this line if you want to execute all test scenarios)
monochrome=true,									//to get proper results in console
plugin="pretty",									//to get all steps in console
//dryRun=false,
													/*Cucumber dry run is used for compilation of the Step Definition and
 													Feature files and to verify the compilation errors. The value of dry run 
 													can be either true or false. The default value of dry run is false and it 
 													is a part of the Test Runner Class file*/
glue="cucumbermap"									//Login.java or glue file folder  name

)


public class RunTest
{
//no code in this body.
}
