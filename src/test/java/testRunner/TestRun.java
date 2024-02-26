package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//FeatureFiles/"},
		//features = { ".//FeatureFiles/CourseSearch.feature" },
	    //features = {".//FeatureFiles/LanguageLearning.feature"},
		// features = {".//FeatureFiles/Enterprise.feature"},
		// features =
		// {".//FeatureFiles/CourseSearch.feature",".//FeatureFiles/Enterprise.feature"},
		// features = {"@target/rerun.txt"},

		glue = "stepDefinitions",

		plugin = { "pretty", "html:reports/myreport.html", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				//"rerun:target/rerun:txt"}

		dryRun = false, monochrome = true, publish = false

// tags="@sanity"
// tags="@sanity and @regression"
// tags="@sanity or @regression"
// tags="@sanity and not @regression"
)
public class TestRun {

}
