package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demowebshop.tricentis.com";
    }

    @Test
    void fillFormTest() {

        String email = "3qatest@qa.ru";

        open("/register");
        $(".page-title").shouldHave(text("Register"));
        $("#gender-male").click();
        $("#FirstName").setValue("Sergey");
        $("#LastName").setValue("Ivanov");
        $("#Email").setValue(email);
        $("#Password").setValue("qwerty");
        $("#ConfirmPassword").setValue("qwerty");
        $("#register-button").click();

        $(".result").shouldHave(text("Your registration completed"));
        $(".account").shouldHave(text(email));








    }
}
