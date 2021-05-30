package com.Massmutual.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityMethods {
	
	public static WebDriver browserInitiate()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    return driver;
	}

}
