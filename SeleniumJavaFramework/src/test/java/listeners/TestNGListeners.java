package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onStart(ITestResult result) {
		
		System.out.println("******* Test Started : " + result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("******* Test was successful : " + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("******* Test failed : " + result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("******* Test was skippd : " + result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	
	public void onFinish(ITestResult context) {
		System.out.println("******* Tests Completed : " + context.getName());
	}
}
