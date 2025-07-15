package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LogoutPOM {
    WebDriver driver;
    WebDriverWait wait;
    By successfullMessage = By.xpath("//h1[.='Logged In Successfully']");
    By logoutButton = By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']");

    public LogoutPOM(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoginButtonVissible() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutButton));
        return driver.findElement(logoutButton).isDisplayed();
    }

    public String getSuccessmessage() {
        return driver.findElement(successfullMessage).getText();
    }

    public void logout() {
        driver.findElement(logoutButton).click();
    }
}
