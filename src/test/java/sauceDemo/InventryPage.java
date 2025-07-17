package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventryPage {
    WebDriver driver;
    private By itemContainer = By.xpath("//div[@class='inventory_item']");
    private By priceLocator = By.xpath("//div[@class='inventory_item_price']");
    private By nameLocator = By.xpath("//div[@class='inventory_item_name']");
    private By addToCart = By.xpath("//button[@class='btn_primary btn_inventory']");

    public InventryPage(WebDriver driver){
        this.driver=driver;
    }
    public String firstExpensiveItemToCart(){
        List<WebElement> items = driver.findElements(itemContainer);
        for(WebElement item : items){
            String priceText = item.findElement(priceLocator).getText();
            double price = Double.parseDouble(priceText.replace("$",""));
            String name = item.findElement(nameLocator).getText();
            if(price >20){
                item.findElement(addToCart).click();
                return name;
            }
        }
        return null;
    }

    public void goToCart(){
        driver.findElement(By.xpath("//div[@class='shopping_cart_container']")).click();
    }
}
