package selenium;

import POM.LoginTestIngPOM;
import POM.LogoutPOM;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginTest extends Setup {
    LogoutPOM logout;
    LoginTestIngPOM loginPOM;
    FileInputStream fis;
    Properties prop;

    @Test
    public void login() throws IOException {
        loginPOM = new LoginTestIngPOM(driver);
        logout = new LogoutPOM(driver);
        fis = new FileInputStream("src/main/resources/loginData");
        prop = new Properties();
        prop.load(fis);
        test = extent.createTest("Verify Login and Logout");
        loginPOM.navigateToSite();
        loginPOM.enterUsername(prop.getProperty("shubhamusername"));
        loginPOM.enterPassword(prop.getProperty("shubhampassword"));
        loginPOM.clickLoginIn();
        test.info("Logged in with valid credentials");
        Assert.assertTrue(logout.isLoginButtonVissible(), "Logout button should displayed");
        test.pass("Logout button is visible");
        Assert.assertTrue(logout.getSuccessmessage().contains("Logged In Successfully"), "Success message mismatch");
        logout.logout();
        test.info("Clicked on Logout");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Should redirect to login page after logout");
        test.pass("Redirected to login page after logout");

    }
}
