package com.Base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LaunchBrowser {
	
	public WebDriver driver;
	
	@BeforeTest
	public void startBrowser() throws IOException {
		File file = new File("/Users/shobharya/Documents/Testing Automation/DPIA/resources/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		 driver.get("https://www.ospreysmart.com/osp/login");
		 TestBase.readData();
	}

}
