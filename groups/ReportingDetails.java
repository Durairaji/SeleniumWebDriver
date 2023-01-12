package report;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportingDetails {
	ExtentReports extent;
	ExtentTest test;
	
	String dec=""; String author=" "; String catagory=" ";
	
	
	@BeforeSuite//first run
	public void startingReport() {
		ExtentSparkReporter report = new ExtentSparkReporter("./TestReport.html");
		 extent =new ExtentReports();
		 extent.attachReporter(report);
	}
	
	public void createTest(String dec, String author ,String catagory ) {
		test = extent.createTest(dec);
		test.assignAuthor("Durairaj");
		test.assignCategory("smoke");
	}
	
	
	@BeforeClass // third
	public void creatingStep(String status,String des) {
		
		switch(status.toLowerCase()) {
		case "pass":
			test.pass(des);
			break;
		case "fail":
			test.fail(des);
			break;
		case "info":
			test.info(des);
			break;
		case "warning":
			test.pass(des);
			break;
			
			default:
				System.out.println("status is not defined");
			break;
		}
	}
		
		@AfterSuite //last run
		public void stopingReport() {
			extent.flush();
		
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//
//		ExtentTest test = extent.createTest("TC001-loginTest");
//
//
//		test.assignAuthor("Durairaj");
//		test.assignCategory("smoke");
//		
//		test.pass("enter the username and password");
//		test.pass("type the personal details ");
//		test.pass("login is successful");
//
//
//		ExtentTest test2 = extent.createTest("TC002-payment testcase");
//		test2.fail("payment fail");

