package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonPOM {

    WebDriver driver;
    By searchTextField = By.xpath("//input[@id='twotabsearchtextbox']");
    By searchButton = By.id("nav-search-submit-button");

    public AmazonPOM(WebDriver driver){
        this.driver=driver;
    }

    public void navigateToAmazon(){
        driver.get("https://www.amazon.in/");
    }

    public void enterSearchKeyword(String keyword){
        driver.findElement(searchTextField).sendKeys(keyword);
    }
    public void clickSearch(){
        driver.findElement(searchButton).click();
    }
    public void search(String Keyword){
        driver.findElement(searchTextField).sendKeys(Keyword+ Keys.ENTER);
    }
}
