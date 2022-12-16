package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.ProductDetailsPage;

public class UserAddsAnItemToCart extends TestBase{
    InventoryPage inventoryObject;
    ProductDetailsPage productDetailsObject;


    @Test(priority = 1, groups = "AddItemToCart")
    public void UserReSortsProducts(){
        inventoryObject = new InventoryPage(driver);
        inventoryObject.sortProductsBy();
    }
    @Test(priority = 2, groups = "AddItemToCart")
    public void AddItemToCart(){
        inventoryObject.GoToProductDetailsPage();
        productDetailsObject = new ProductDetailsPage(driver);
        productDetailsObject.addToCart();
        productDetailsObject.GoToCart();
        Assert.assertEquals("https://www.saucedemo.com/cart.html",driver.getCurrentUrl());
    }
}
