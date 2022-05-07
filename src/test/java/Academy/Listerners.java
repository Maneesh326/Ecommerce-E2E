package Academy;

import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;

import javax.naming.ldap.ExtendedRequest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;

public class Listerners extends base implements ITestListener {
	private static final String ExtentReporterNG = null;

	public ExtendedRequest test;

	Exports extent=ExtentReporterNG.getReportObject();
	ThreadLocal<ExtendedRequest> extentTest =new ThreadLocal<ExtendedRequest>();

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		((Object) extentTest.get()).fail(result.getThrowable());

		WebDriver driver =null;

		String testMethodName =result.getMethod().getMethodName();

		try {

		driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());

		} catch(Exception e)

		{

		}

		try {

		extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver), result.getMethod().getMethodName());

		} catch (IOException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}

		}
//		WebDriver driver =null;
//
//		String testMethodName =result.getMethod().getMethodName();
//		try {
//			getScreenShotPath(testMethodName,driver);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
// try {
//	driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//} catch (Exception e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
 
	}





	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
