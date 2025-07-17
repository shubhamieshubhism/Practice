package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLogin {
    private WebDriver driver;
    private By userName = By.id("user-name");
    private By passWord = By.xpath("//input[@id='password']");
    private By loginButton = By.id("login-button");

    public SauceLogin(WebDriver driver){
        this.driver=driver;
    }

    public void enterUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }
    public void enterPassWord(String password){
        driver.findElement(passWord).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
    public void login(String username, String password){
        enterUserName(username);
        enterPassWord(password);
        clickLogin();
    }
}
