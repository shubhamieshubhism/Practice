package sauceDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends BaseClass {

    @Test
    public void verifyLogin(){
        SauceLogin login = new SauceLogin(driver);
        login.login("standard_user","secret_sauce");
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("inventory"),"Login failed!");
    }
}
