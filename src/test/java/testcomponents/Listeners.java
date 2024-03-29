package testcomponents;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNg;

public class Listeners extends BaseTest implements ITestListener {
	ExtentTest Test;
	ExtentReports extent=ExtentReporterNg.getReportObject();
	
	ThreadLocal<ExtentTest> tl = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
	
	 Test = extent.createTest(result.getMethod().getMethodName());
	 tl.set(Test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//Status
		tl.get().log(Status.PASS, "Test is pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//To get Error Message
		 tl.get().fail(result.getThrowable());
		//Status
		 tl.get().log(Status.FAIL, "Test is Fail");
		//Screenshot,AttachToReport
		
		
			try {
				driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance()) ;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
		String filepath = null;
			try {
			 filepath=	getScreenshot(result.getMethod().getMethodName(),driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			tl.get().addScreenCaptureFromPath(filepath,result.getMethod().getMethodName() );
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
