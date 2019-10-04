package opi.steps;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


@Getter
@Setter

public class ApplicationSteps {

    SelenideElement element = $(".invalid");



    @Given("^Open google site$")
    public void openGoogleSite(){
        Selenide.open("https://www.google.pl");
    }

    @When("^User click not existing button$")
    public void userClickNotExistingButton(){
        $(By.xpath("//a[contains(text(),'Gmail')]")).click();
    }

    @When("^User click existing button$")
    public void userClickExistingButton() throws InterruptedException {
        Thread.sleep(5000);
        try {
            element.shouldBe(Condition.visible).click();
        }catch (com.codeborne.selenide.ex.ElementNotFound e){
            System.out.println("dalej");
        }


    }

}
