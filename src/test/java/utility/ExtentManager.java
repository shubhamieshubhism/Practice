package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {
    private static ExtentReports extent;


    public static ExtentReports getInstance() {
        if (extent == null) {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            ExtentSparkReporter sparkreporter = new ExtentSparkReporter("testOutput/Extentreport-" + timeStamp + ".html");
            extent = new ExtentReports();
            extent.attachReporter(sparkreporter);
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("Tester", "shubham");
        }
        return extent;
    }
}
