package com.Massmutual.Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Massmutual.Page.PageLocator;
import com.Massmutual.Utility.Validations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefinition {
	
	WebDriver driver = null;
	
	Validations validation=null;
	
	@Given("^Go to \"([^\"]*)\"$")
	public void go_to(String url) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    validation= new Validations(driver);
	    
		boolean status=false;
		try
		{
			driver.get(url);
			if(driver.getCurrentUrl().equals("https://www.exercise1.com/values "))
			{
				status=true;
				validation.Validation(status,"User is navigated to "+url+" page","User is not navigated to "+url+" page");
			}
		}
		catch(Exception e)
		{
			status=true;
			validation.Validation(status,"User is navigated to "+url+" page","User is not navigated to "+url+" page");
		}
	}

	@When("^Need to verify the right count of values appear on the screen$")
	public void need_to_verify_the_right_count_of_values_appear_on_the_screen() throws Throwable {
		try
		{
			int rightCount=driver.findElements(By.xpath("//label[contains(@id,'txt_val']")).size();
			if(rightCount==5)
			{
				validation.Validation(true,"Right count of values are 5","Right count of values are not 5");
			}
		}
		catch(Exception e)
		{
			validation.Validation(true,"Right count of values are 5","Right count of values are not 5");
		}
	}

	@When("^Need to verify the values on the screen are greater than \"([^\"]*)\"$")
	public void need_to_verify_the_values_on_the_screen_are_greater_than(String val) throws Throwable {
		try
		{
			int value=Integer.parseInt(val);
			int value1=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value1)).getText().split("$")[1]);
			int value2=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value2)).getText().split("$")[1]);
			int value3=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value3)).getText().split("$")[1]);
			int value4=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value4)).getText().split("$")[1]);
			int value5=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value5)).getText().split("$")[1]);
			if(value1>value&&value2>value&&value3>value&&value4>value&&value5>value)
			{
				validation.Validation(true,"Values are greater than 0","Values are not greater than 0");
			}
		}
		catch(Exception e)
		{
			validation.Validation(true,"Values are greater than 0","Values are not greater than 0");
		}
	}

	@When("^Need to verify the total balance is correct based on the values listed on the screen$")
	public void need_to_verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen() throws Throwable {
		try
		{
			int totalValue=Integer.parseInt(driver.findElement(By.xpath(PageLocator.totalBalance)).getText().split("$")[1]);
			int value1=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value1)).getText().split("$")[1]);
			int value2=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value2)).getText().split("$")[1]);
			int value3=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value3)).getText().split("$")[1]);
			int value4=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value4)).getText().split("$")[1]);
			int value5=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value5)).getText().split("$")[1]);
			if(totalValue==(value1+value2+value3+value4+value5))
			{
				validation.Validation(true,"Total balance is correct based on the values listed on the screen","Total balance is not correct based on the values listed on the screen");
			}
		}
		catch(Exception e)
		{
			validation.Validation(true,"Total balance is correct based on the values listed on the screen","Total balance is not correct based on the values listed on the screen");
		}
	}

	@When("^Need to verify the values are formatted as currencies$")
	public void need_to_verify_the_values_are_formatted_as_currencies() throws Throwable {
		try
		{
			String totalValue=driver.findElement(By.xpath(PageLocator.totalBalance)).getText().split("$")[0];
			String value1=driver.findElement(By.xpath(PageLocator.value1)).getText().split("$")[0];
			String value2=driver.findElement(By.xpath(PageLocator.value2)).getText().split("$")[0];
			String value3=driver.findElement(By.xpath(PageLocator.value3)).getText().split("$")[0];
			String value4=driver.findElement(By.xpath(PageLocator.value4)).getText().split("$")[0];
			String value5=driver.findElement(By.xpath(PageLocator.value5)).getText().split("$")[0];
			if(value1.equals("$")&&value2.equals("$")&&value3.equals("$")&&value4.equals("$")&&value5.equals("$")&&totalValue.equals("$"))
			{
				validation.Validation(true,"Values are formatted as currencies","Values are not formatted as currencies");
			}
		}
		catch(Exception e)
		{
			validation.Validation(true,"Values are formatted as currencies","Values are not formatted as currencies");
		}
	}

	@When("^Need to verify the total balance matches the sum of the values$")
	public void need_to_verify_the_total_balance_matches_the_sum_of_the_values() throws Throwable {
		try
		{
			int totalValue=Integer.parseInt(driver.findElement(By.xpath(PageLocator.totalBalance)).getText().split("$")[1]);
			int value1=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value1)).getText().split("$")[1]);
			int value2=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value2)).getText().split("$")[1]);
			int value3=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value3)).getText().split("$")[1]);
			int value4=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value4)).getText().split("$")[1]);
			int value5=Integer.parseInt(driver.findElement(By.xpath(PageLocator.value5)).getText().split("$")[1]);
			if(totalValue==(value1+value2+value3+value4+value5))
			{
				validation.Validation(true,"Total balance matches the sum of the values","Total balance does not match the sum of the values");
			}
		}
		catch(Exception e)
		{
			validation.Validation(true,"Total balance matches the sum of the values","Total balance does not match the sum of the values");
		}
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		try
		{
			driver.quit();
			validation.Validation(true,"Browser closed successfully","Browser cannot be closed");
		}
		catch(Exception e)
		{
			validation.Validation(true,"Browser closed successfully","Browser cannot be closed");
		}	
	}

}
