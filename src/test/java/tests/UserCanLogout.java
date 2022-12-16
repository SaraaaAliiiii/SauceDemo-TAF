package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;

public class UserCanLogout extends TestBase {
    InventoryPage inventoryObject;

    @Test(dependsOnGroups = "checkout")
    public void userLogoutsFromPortal() throws InterruptedException {
        inventoryObject = new InventoryPage(driver);
        inventoryObject.userLogouts();
        Assert.assertEquals("https://www.saucedemo.com/",driver.getCurrentUrl());
    }
}
