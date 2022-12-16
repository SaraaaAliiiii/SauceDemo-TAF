package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage extends PageBase {
    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }
    public WebElement confirmationMsg = driver.findElement(By.cssSelector("#checkout_complete_container > h2"));

    WebElement backHomeBtn = driver.findElement(By.id("back-to-products"));
    public void backToShopping(){
        backHomeBtn.click();
    }
}
