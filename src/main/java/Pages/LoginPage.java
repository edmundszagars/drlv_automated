package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    Selenide driver;
    private final String URL = "http://www.draugiem.lv";
    private final SelenideElement emailField = $(byId("email"));
    private final SelenideElement pwdField = $(byId("password"));
    private final SelenideElement loginButton = $(byName("login"));
    private final SelenideElement register = $(byId("loginRegister"));

    public void login() {
        emailField.sendKeys("");
        pwdField.sendKeys("");
        loginButton.click();
    }

    public void clickRegister(){
        register.click();
    }

    public String getURL() {
        return URL;
    }

    public LoginPage(Selenide driver) {
        this.driver = driver;
    }

}
