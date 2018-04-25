import Pages.LoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.openqa.selenium.remote.BrowserType.CHROME;

public class LoginPageTests {

    private LoginPage loginPage;
    private Selenide driver;

    @Before
    public void setupDownloadPage(){
        System.setProperty("selenide.browser",CHROME);
        loginPage = new LoginPage(driver);
        open(loginPage.getURL());
    }

    @Test
    public void loginTest(){
        loginPage.login();
    }

    @Test
    public void openRegisterScreen(){
        loginPage.clickRegister();
        Assert.assertEquals("Reģistrēties — draugiem.lv",title());
    }

    @After
    public void teardown(){

    }
}
