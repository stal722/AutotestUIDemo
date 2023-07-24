package examples;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpathExamples() {
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");

        $("[id=email]").setValue("1");
        $("#email").setValue("1");
        $("input#email").setValue("1");
        $x("//*[@id='email']").setValue("1");

        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        $("[class=login-form").setValue("1");
        $(".login-form").setValue("1");
        $("input.inputtext.login-form").setValue("1");
        $x("//input[@class='inputtext'][@class='login-form']").setValue("1");

        /*
        <div class="inputtext">
            <input type="email" class="login-form">
        </div>
         */
        $(".inputtext .login-form").setValue("1");
        $(".inputtext").$(".login-from").setValue("1");

        //<div>Hello, world!</div>
        $x("//div[text()='Hello, world!']").setValue("1");
        $(byText("Hello, world!")).setValue("1");
        $(withText("oll, wor")).setValue("1");


    }
}
