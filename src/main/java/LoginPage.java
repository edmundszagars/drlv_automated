import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    Selenide driver;
    public LoginPage(Selenide driver) {
        this.driver = driver;
    }

    private SelenideElement emailElement = $(byId("email"));
    private SelenideElement passwordElement = $(byId("password"));
    private SelenideElement loginButton = $(".buttonC.radius3");
    private SelenideElement loginErrorMessage = $(".infoMsg.errorIcon.radius3");

    public void login(){
        emailElement.sendKeys("vaga@poop.com");
        passwordElement.sendKeys("vagana");
        loginButton.hover();
    }

    public SelenideElement getLoginErrorMessage() {
        return loginErrorMessage;
    }
}
