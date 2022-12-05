package Test;

import Base.BaseTest;
import Pages.LoginPage;
import org.junit.Test;


import java.io.IOException;

public class LoginPageTest extends BaseTest {

    @Test
    public void LoginTest() throws IOException {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.userInfo();
    }
}
