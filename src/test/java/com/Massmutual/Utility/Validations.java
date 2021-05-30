package com.Massmutual.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

public class Validations{
	
	WebDriver driver=null;
	
	public Validations(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Validation(boolean status, String stepPass,String stepFail) throws IOException
	{
		if(status==true)
		{
			Assert.assertEquals(status, true, stepPass);
			Reporter.addStepLog(stepPass);
			
		}
		else
		{
			Assert.assertEquals(status, true, stepFail);
			Reporter.addStepLog(stepFail);
			
		}
	}
}
