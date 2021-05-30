package com.Massmutual.TestRunner;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features={"./src/test/resources/FeatureFiles"},
		glue={"com.Massmutual.Stepdefinition"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:./TestResult/CombinedResults.html"},
		tags={"@Scenario"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File("./src/test/resources/Manager/extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}

	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		String resultPath="TestResult/CombinedResults.html";
		File file = new File(resultPath);
		if(!file.exists())
		{
			try 
			{
				file.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			file.delete();
			try {
				file.createNewFile();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}

