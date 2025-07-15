package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTestIngPOM {
    WebDriver driver;
    By USERNAME = By.xpath("//input[@name='username']");
    By PASSWORD = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[@id='submit']");
    public LoginTestIngPOM(WebDriver driver){
        this.driver=driver;
    }

    public void navigateToSite(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    public void enterUsername(String username){
        driver.findElement(USERNAME).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(PASSWORD).sendKeys(password);
    }
    public void clickLoginIn(){
        driver.findElement(loginButton).click();
    }

    public void login(String useerName,String passWord){
        enterUsername(useerName);
        enterPassword(passWord);
        clickLoginIn();
    }

}
