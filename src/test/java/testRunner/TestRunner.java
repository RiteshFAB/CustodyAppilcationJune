package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\WorkSapace\\Custody_Automation\\src\\test\\java\\Features",
		glue="stepDefination",
		dryRun=false,
		monochrome=true,
		tags="@sainty",
		plugin= {"pretty","html:.\\CucumberReport\\facebook1.html"}
		)

public class TestRunner {

}
