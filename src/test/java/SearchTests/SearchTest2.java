package SearchTests;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest2 {
    @Feature("Issues")
    @Step("ищем selenide")
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("#result-stats").shouldHave(text("Результатов: примерно"));
    }

    @Step("Ищем allure")
    @Test
    void successfulSearchAllure() {
        open("https://www.google.com/");
        $("[name=q]").setValue("allure").pressEnter();
        $("#result-stats").shouldHave(text("Результатов: примерно"));
    }
}
