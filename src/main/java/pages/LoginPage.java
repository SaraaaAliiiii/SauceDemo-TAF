package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    WebElement usernameTxt = driver.findElement(By.id("user-name"));
    WebElement passwordTxt = driver.findElement(By.id("password"));
    WebElement loginBtn = driver.findElement(By.id("login-button"));

    public void login(String username, String password){
        usernameTxt.sendKeys(username);
        passwordTxt.sendKeys(password);
        loginBtn.click();
    }
}
