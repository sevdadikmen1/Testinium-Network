package Test;

import Base.BaseTest;
import Pages.CartPage;
import org.jsoup.Connection;
import org.junit.Test;

public class CartPageTest extends BaseTest {

    @Test
    public void CartTest(){
        CartPage cartPage = new CartPage(driver);

        cartPage.addProductToCart();
        cartPage.navigateToCart();
        cartPage.removeProductToCart();
        cartPage.confirmRemove();
    }
}
