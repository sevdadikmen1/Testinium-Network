package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public String URL = "https://www.network.com.tr/";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void navigateTo(){
        goToUrl(URL);
    }

    public void checkUrl(){
        Assert.assertEquals(URL, getUrl() );
    }

    public void clickLogo(){
        click(By.cssSelector("img[class='header__logoImg']"));
    }

    public void clickCartLogo(){
        click(By.cssSelector("button[class='header__basketTrigger js-basket-trigger -desktop']"));
    }

    public void search(){
        String search_string = "ceket";
        WebElement element = findElement(By.xpath("input[@id='search' and @name='searchKey']"));
        Assert.assertEquals(element.isDisplayed(), true);

        element.sendKeys(search_string);
        findElement(By.xpath("form[@id='search-form' and @method='GET' and @action='/search' and" +
                "@class='o-header__searchInput header__searchForm' ]")).click();

    }
}
