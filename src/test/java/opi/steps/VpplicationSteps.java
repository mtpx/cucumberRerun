package opi.steps;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;


@Getter
@Setter

public class VpplicationSteps {

    SelenideElement element = $(By.xpath("//a[contains(text(),'Gmail')]"));
    SelenideElement element2 = $(By.xpath("//a[contains(text(),'Gmail')]"));
    SelenideElement element_not_ex = $(By.xpath("//a[contains(text(),'sdfsdfail')]"));



    @Given("^VOpen google site$")
    public void openGoogleSite(){
        Selenide.open("https://www.google.pl");
    }

    @When("^VUser click not existing button$")
    public void userClickNotExistingButton(){

       Random r = new Random();
       int random = r.nextInt(11);
       if (random<4)
           element_not_ex.click();
       else if (random>7)
           element.click();
       else
           element2.click();


    }

    @When("^VUser click existing button$")
    public void userClickExistingButton() throws InterruptedException {
        Random r = new Random();
        int random = r.nextInt(11);
        if (random<4)
            element_not_ex.click();
        else if (random>7)
            element.click();
        else
            element2.click();

    }

}
