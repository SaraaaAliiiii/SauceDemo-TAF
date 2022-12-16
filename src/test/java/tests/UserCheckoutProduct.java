package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutInfoPage;
import pages.CheckoutLastStepPage;
import pages.ConfirmationPage;

public class UserCheckoutProduct extends TestBase{
    CartPage cartObject;
    CheckoutInfoPage checkout1Object;
    CheckoutLastStepPage checkout2Object;
    ConfirmationPage confrimObject;

    @Test(priority = 1, groups = "checkout", dependsOnGroups = "AddItemToCart")
    public void userCheckoutsAProduct(){
        cartObject = new CartPage(driver);
        cartObject.checkoutOrder();
        Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html",driver.getCurrentUrl());
    }
    @Test(priority = 2, groups = "checkout", dependsOnGroups = "AddItemToCart")
    public void userEntersHisInfo(){
        checkout1Object = new CheckoutInfoPage(driver);
        checkout1Object.CheckoutInfo("Tom","Smith","12345");
        checkout1Object.ContinueToCheckout();
    }
    @Test(priority = 3, groups = "checkout", dependsOnGroups = "AddItemToCart")
    public void UserConfirmsOrder(){
        checkout2Object = new CheckoutLastStepPage(driver);
        Assert.assertTrue(checkout2Object.totalLbl.isDisplayed());
        checkout2Object.finishOrder();
    }

    @Test(priority = 4, groups = "checkout", dependsOnGroups = "AddItemToCart")
    public void UserAssertsOrderIsPlaced() throws InterruptedException {
        confrimObject = new ConfirmationPage(driver);
        Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html",driver.getCurrentUrl());
        Assert.assertTrue(confrimObject.confirmationMsg.isDisplayed());
        Thread.sleep(2000);
    }
    @Test(priority = 5, groups = "checkout", dependsOnGroups = "AddItemToCart")
    public void returnToHomepage(){
        confrimObject.backToShopping();
    }


}
