package opi.steps;

        import com.codeborne.selenide.Configuration;
        import com.codeborne.selenide.Selenide;
        import com.codeborne.selenide.logevents.SelenideLogger;
        import cucumber.api.java.After;
        import cucumber.api.java.Before;
        import io.qameta.allure.selenide.AllureSelenide;
        import org.apache.log4j.xml.DOMConfigurator;
        import java.io.IOException;
        import static com.codeborne.selenide.Selenide.close;

public class Hook {

    @Before
    public void initialize() throws IOException {
        //DOMConfigurator.configure("log4j.xml");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1600x900";
        Configuration.timeout = 12500;
        Configuration.startMaximized=false;
        Configuration.holdBrowserOpen = false;
        Configuration.reportsFolder = "allure-results";
        Selenide.clearBrowserCookies();
        System.setProperty("file.encoding","UTF-8");
    }
    @After
    public void tearDown(){
        close();
    }


}
