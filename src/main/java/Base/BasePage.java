package Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By by) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void click(By by){
        WebElement element = findElement(by);
        element.click();
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public void scrollDown(By by){
        WebElement element = findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public Boolean isDisplayed(By by) {
        return findElement(by).isDisplayed();
    }

    public void clickOnRandomProduct(By by) {
        List<WebElement> products = findElements(by);
        Random r = new Random();
        int low = 1;
        int high = products.size();
        int result = r.nextInt(high-low) + low;
        products.get(result).click();
    }
}

