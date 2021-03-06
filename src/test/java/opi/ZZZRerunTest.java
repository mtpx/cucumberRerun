package opi;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={ "@target/arerun.txt","@target/grerun.txt","@target/vrerun.txt","@target/xrerun.txt","@target/yrerun.txt",
                "@target/zrerun.txt"},
        plugin = {
                "pretty", "html:target/cucumber-report/single",
                "json:target/cucumber-report/single/cucumber.json",
                "rerun:rerun.txt","io.qameta.allure.cucumberjvm.AllureCucumberJvm"}        )
public class ZZZRerunTest {
}
