package sauceDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseClass {
    @Test
    public void VerifyAddItemToCart(){
        SauceLogin loginPage = new SauceLogin(driver);
        loginPage.login("standard_user","secret_sauce");

        InventryPage inventryPage = new InventryPage(driver);
        String addItemName = inventryPage.firstExpensiveItemToCart();
        inventryPage.goToCart();
        CartPage cartPage = new CartPage(driver);
        String cartItemName = cartPage.getFirstCartItemName();
        Assert.assertEquals(cartItemName,addItemName,"Item in cart Doesn't match");
    }
}
