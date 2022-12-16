package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class UserCanLogin extends TestBase{
    LoginPage loginObject;
    String username = "standard_user";
    String password = "secret_sauce";

    @Test
    public void userLoginsSuccessfully(){
        loginObject = new LoginPage(driver);
        loginObject.login(username,password);
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());
    }
}
