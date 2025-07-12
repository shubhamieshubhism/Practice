package otherPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;
import java.time.Duration;

public class CompareDBNUIData {
    public static void main(String[] args) throws SQLException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("url");
        WebElement uiDataElement = driver.findElement(By.xpath("element"));
        String uiData = uiDataElement.getText();
        driver.quit();
        String dbUrl = "url";
        String dbUsername ="username";
        String dbPass = "password";
        String query = "query";
        String dbData="";

        Connection conn = DriverManager.getConnection(dbUrl,dbUsername,dbPass);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if(rs.next()){
            dbData = rs.getString("DataNeedsToBeValidated").trim();
            System.out.println(dbData);
        }
        if(uiData.equalsIgnoreCase(dbData)){
            System.out.println("Match");
        }else {
            System.out.println("No match");
        }

    }
}
