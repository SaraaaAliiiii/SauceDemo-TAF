package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;

    @BeforeSuite
    @Parameters(("browser"))
    public void startDriver(@Optional("chrome") String browserName){

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterSuite
    public void stopDriver(){
        driver.quit();

    }
}
