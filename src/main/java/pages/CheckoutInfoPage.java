package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInfoPage extends PageBase{
    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }
    WebElement firstNameTxt = driver.findElement(By.id("first-name"));
    WebElement lastNameTxt = driver.findElement(By.id("last-name"));
    WebElement zipCodeTxt = driver.findElement(By.id("postal-code"));
    WebElement continueBtn = driver.findElement(By.id("continue"));
    WebElement backToCartBtn = driver.findElement(By.id("cancel"));
    public void CheckoutInfo(String firstName, String lastName, String zipCode){
        firstNameTxt.sendKeys(firstName);
        lastNameTxt.sendKeys(lastName);
        zipCodeTxt.sendKeys(zipCode);
    }
    public void ContinueToCheckout(){
        continueBtn.click();
    }
}
