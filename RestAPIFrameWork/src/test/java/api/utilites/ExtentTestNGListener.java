package api.utilites;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentTestNGListener implements ITestListener {

    private static ExtentReports extent;
    public ExtentTest test; 
   public ExtentSparkReporter sparkReporter;
   // private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    // Initialize ExtentReports
    private static ExtentReports getExtentReports() {
        if (extent == null) {
           
        }
        return extent;
    }

    public void onStart(ITestContext context) {
    	String timeStamp =new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    	String reportpath=System.getProperty("user.dir")+"\\reports\\"+"Testreports-"+timeStamp+".html";
    	System.out.println("time stamp is "+timeStamp);
    	
    	 sparkReporter = new ExtentSparkReporter(reportpath);
         sparkReporter.config().setReportName("Automation Test Results");
         sparkReporter.config().setDocumentTitle("Test Execution Report");
         sparkReporter.config().setTheme(Theme.DARK);

         extent = new ExtentReports();
         extent.attachReporter(sparkReporter);
         extent.setSystemInfo("Tester", "Daniel George");
         extent.setSystemInfo("Environment", "QA");
         extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent = getExtentReports();
    }

    public void onTestStart(ITestResult result) {
      test= extent.createTest(result.getMethod().getMethodName());
       // extentTest.set(test);
    }

    public void onTestSuccess(ITestResult result) {
       // extentTest.get().log(Status.PASS, "Test Passed: " + result.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test Failed: " + result.getMethod().getMethodName());
        test.log(Status.FAIL, result.getThrowable());

        // Add screenshot if available
        String screenshotPath = "path/to/screenshot.png"; // Replace with actual path
        test.addScreenCaptureFromPath(screenshotPath, "Failure Screenshot");
    }

    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Skipped: " + result.getMethod().getMethodName());
    }

    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush();
        }
    }
}

