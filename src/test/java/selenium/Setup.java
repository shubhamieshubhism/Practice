package selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utility.DriverManager;
import utility.ExtentManager;

public class Setup {
    protected WebDriver driver;
    protected ExtentReports extent;
    protected static ExtentTest test;

    @Parameters("browser")
    @BeforeTest
    public void setup(@Optional("chrome") String browser) {
        /*if(browser.contains("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (browser.contains("edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        } else if (browser.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else{
            throw new IllegalArgumentException("Invalid browser "+browser);
        }
        driver.manage().window().maximize();*/
        driver = DriverManager.initDriver(browser);
        extent = ExtentManager.getInstance();

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
        DriverManager.quitDriver();
        extent.flush();

    }
}
