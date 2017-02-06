package seleniumCutPiece.extent;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;





public class Extent

{
	ExtentReports report ;
	ExtentTest  test;
	WebDriver driver;
	
	@Test
	public void extentreport()
	{
		
		 report=new ExtentReports(".\\seleniumCutPiece\\reports\\learninReport.html");
		 ExtentTest logger = report.startTest("Smoke");
	
		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "wassup chrome");
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "mazimise browser");
		driver.get("http://localhost:81/orangehrm/symfony/web/index.php/");
		logger.log(LogStatus.PASS, "testcase pass ");
		driver.quit();
		report.endTest(logger);
		report.flush();
		
		
	
	}

}
