package Test;

import Base.BaseTest;
import Pages.HomePage;
import org.junit.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void HomeTest(){
        HomePage homePage = new HomePage(driver);

        String URL = "https://www.network.com.tr/";

        homePage.goToUrl(URL);
        homePage.checkUrl();
        homePage.clickLogo();
        homePage.search();
        homePage.clickCartLogo();
    }
}
