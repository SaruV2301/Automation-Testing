package StepDefentions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue = {"StepDefentions"},
monochrome=true
//plugin={"pretty","junit:target/Junitreports/report.XML"},
//plugin={"pretty","json:target/jsonreports/reportsjson.json"},
//plugin={"pretty","html:target/HTMLreports/reporthtml.html"}
)

public class TestRunner {

}
