package opi;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {
                "pretty", "html:target/cucumber-report/single",
                "json:target/cucumber-report/single/cucumber.json",
                "rerun:rerun.txt","io.qameta.allure.cucumberjvm.AllureCucumberJvm"}        )
public class MainTest {
}
