package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage extends PageBase{
    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    WebElement menuBtn = driver.findElement(By.id("react-burger-menu-btn"));

    WebElement ProductNameLink = driver.findElement(By.id("item_5_img_link"));
    WebElement cartIcon = driver.findElement(By.id("shopping_cart_container"));

    public WebElement cartHeader = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));

    WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));

    WebElement sortingMenu = driver.findElement(By.className("product_sort_container"));
    public void GoToProductDetailsPage(){
        ProductNameLink.click();
    }
    public void goToCart(){
        cartIcon.click();
    }

    public void sortProductsBy(){
        select = new Select(sortingMenu);
        select.selectByVisibleText("Name (Z to A)");
    }
    public void userLogouts() throws InterruptedException {
        menuBtn.click();
        Thread.sleep(1000);
        logoutLink.click();
    }
}
