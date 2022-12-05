package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void userInfo() throws IOException {
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/user.csv"));
            String line = br.readLine();
            while((line = br.readLine()) !=null){
                String[] array = line.split(splitBy);
                String email = array[0];
                String password = array[1];


                WebElement webEmail = driver.findElement(By.id("email"));
                WebElement webPassword = driver.findElement(By.name("password"));
                webEmail.sendKeys(email);
                webPassword.sendKeys(password);
            }
    }


}

