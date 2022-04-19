package yatalex;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp(){
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest(){

        String name = "Alex";

        open ("/text-box");

        $("[id=userName]").setValue(name);
        $("[id=userEmail").setValue("alex@alex.com");
        $("[id=currentAddress]").setValue("Street2");
        $("[id=permanentAddress]").setValue("Street3");
        $("[id=submit]").click();


        $("[id=output]").shouldHave(text(name), text("alex@alex.com"),
                text("Street2"), text("Street3"));
        $("[id=output] [id=name]").shouldHave(text(name));
        $("[id=output]").$("[id=name]").shouldHave(text(name));

        $("[id=permanentAddress]").shouldHave(text(name));



    }
}
