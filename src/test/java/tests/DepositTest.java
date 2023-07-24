package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DepositTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        //Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://idemo.bspb.ru";
    }

    @Test
    void successOpenDepositTest() {
        open("/");
        $("#login-button").click();
        $("#login-otp-button").click();
        $(".environment.print-hidden").shouldHave(text("Интернет-банк"));
        $("#deposits-index").click();
        $(".page-header").shouldHave(text("Вклады"));
        $("#btn-show-rates").click();
        $(".page-header").shouldHave(text("Открыть новый вклад"));
        $("input[value='USD']").click();
        $("input[value='367']").click();
        $("tr[data-rate-id='10253']").$(byText("1 год")).shouldHave(visible);
        $("tr[data-rate-id='10253']").$(".btn").click();
        $("#deposit-type").$(".uneditable-input").shouldHave(text("Демо депозит №3"));
        $("#duration-select").click();
        $("#duration-select").selectOption("1 год");













    }
}
