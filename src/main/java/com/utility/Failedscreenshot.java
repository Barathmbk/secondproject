package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Baseclass.Baseclass;

public class Failedscreenshot extends Baseclass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		screenshot(methodName);
		
	}

	
	


	


}
