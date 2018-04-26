import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.BrowserType.CHROME;

public class LoginPageTests {

    Selenide selenide;
    LoginPage loginPage;
    @Before
    public void setup(){
        System.setProperty("selenide.browser",CHROME);
        loginPage = new LoginPage(selenide);
        open("https://www.draugiem.lv/");

    }
    @Test
    public void login(){
        loginPage.login();
    }

    @After
    public void teardown(){
        close();
    }
}
