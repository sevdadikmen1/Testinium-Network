package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }


    public void addProductToCart(){
        wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("button[class='product__button -addToCart btn -black']"))).click();
    }

    public void navigateToCart(){
        click(By.xpath(("xpath=//a[contains(@href,'/cart') and @class='button -primary header__basket--checkout header__basketModal -checkout']")));
    }

    public void removeProductToCart(){
        click(By.cssSelector("button[class='cartItem__button -remove']"));
    }

    public void confirmRemove(){
        click(By.cssSelector("button[class='-modal n-button large block text-center -primary']"));
    }
}
