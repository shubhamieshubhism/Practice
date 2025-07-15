package selenium;

import POM.AmazonPOM;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.testng.TestRunner.PriorityWeight.priority;

public class AmazonSearch extends Setup {
    @Test(priority=1)
    public void amazonSearch() throws IOException {
        AmazonPOM pom = new AmazonPOM(driver);
        FileInputStream fis = new FileInputStream("src/main/resources/AmazonSearch.properties");
        Properties prop = new Properties();
        prop.load(fis);

        pom.navigateToAmazon();
        pom.enterSearchKeyword(prop.getProperty("keyword"));
        pom.clickSearch();
    }


}
