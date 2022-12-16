package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends PageBase{

    public CartPage(WebDriver driver) {
        super(driver);
    }
    WebElement checkoutBtn = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
    WebElement continueShoppingBtn = driver.findElement(By.id("continue-shopping"));

    public void checkoutOrder(){
        checkoutBtn.click();
    }

    public void returnToInventory(){
        continueShoppingBtn.click();
    }
}
