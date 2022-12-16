package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends PageBase{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));

    public void addToCart(){
        addToCartBtn.click();
    }
    public void GoToCart(){
        cartIcon.click();
    }
}
