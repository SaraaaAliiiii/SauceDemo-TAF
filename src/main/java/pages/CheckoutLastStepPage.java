package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutLastStepPage extends PageBase {
    public CheckoutLastStepPage(WebDriver driver) {
        super(driver);
    }
    WebElement backToInventoryBtn = driver.findElement(By.id("cancel"));
    WebElement finishBtn = driver.findElement(By.id("finish"));
    public WebElement totalLbl = driver.findElement(By.cssSelector("#checkout_summary_container > div > div.summary_info > div.summary_total_label"));

    public void finishOrder(){
        finishBtn.click();
    }
}
