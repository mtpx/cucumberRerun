package opi.steps;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


@Getter
@Setter

public class ApplicationSteps {




    @Given("^Open google site$")
    public void openGoogleSite(){
        Selenide.open("https://www.google.pl");
    }

    @When("^User click not existing button$")
    public void userClickNotExistingButton(){
        $("input[name='not_existing']").click();
    }

    @When("^User click existing button$")
    public void userClickExistingButton(){
        $(By.xpath("//a[contains(text(),'Gmail')]")).click();

    }

}
