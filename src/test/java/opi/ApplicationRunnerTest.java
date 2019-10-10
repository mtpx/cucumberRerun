package opi;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Application.feature",
        plugin = {
                "pretty", "html:target/cucumber-report/single",
                "json:target/cucumber-report/single/cucumber.json",
                "rerun:arerun.txt","io.qameta.allure.cucumberjvm.AllureCucumberJvm"}        )
public class ApplicationRunnerTest {
}
