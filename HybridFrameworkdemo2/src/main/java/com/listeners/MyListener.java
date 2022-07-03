package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utiliy.DriverUtils;

public class MyListener extends BaseClass implements ITestListener{

	public void onFinish(ITestContext context) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		 test.log(Status.FAIL, "Test failed eith name as"+result.getName());
		String path=DriverUtils.getScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		 test.log(Status.SKIP, "Test skipped eith name as"+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		 test.log(Status.PASS, "Test Passed eith name as"+result.getName());
		
	}

} 
