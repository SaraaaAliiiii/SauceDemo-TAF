package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    protected WebDriver driver;

    public PageBase(WebDriver driver) {
      this.driver = driver;
    }

    public Select select;



}