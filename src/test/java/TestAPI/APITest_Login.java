package TestAPI;
import Pages.LoginPage;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class APITest_Login {
	
	 private ExtentReports extent;
	 private ExtentTest test;
	 
	 @BeforeMethod
	    public void setUp() {
	        // Initialize ExtentReports
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/ExtentReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	    }
	
	
    @Test
    public void testLogin() {
        
    	LoginPage Logintest =new LoginPage();
    	Logintest.login("MohamedAdel", "P@ssw0rd");
    }
    
    
    @AfterMethod
    public void tearDown() {
        // Flush ExtentReports and close the report
        extent.flush();
    }

}
