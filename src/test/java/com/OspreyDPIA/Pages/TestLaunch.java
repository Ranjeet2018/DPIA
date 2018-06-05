package com.OspreyDPIA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Base.LaunchBrowser;
import com.Base.TestBase;

public class TestLaunch extends LaunchBrowser {
	
	@Test
	public void loginpage() throws InterruptedException {
		driver.get("https://www.ospreysmart.com/osp/login");
		//driver.get("https://dev.ospreysmart.com/osp/login");
		Thread.sleep(4000);
		//System.out.println(TestBase.p.getProperty("username"));
		///// read user name from property file 
		driver.findElement(By.id("email")).sendKeys(TestBase.p.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(TestBase.p.getProperty("password"));
		//driver.findElement(By.id("password")).sendKeys("Gravicus123");
		//driver.findElement(By.id("submit")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.className("ospDashboard-dpiaHighlight")).click();
		//ele.getText();
		//System.out.println(ele);
		
		//driver.findElement(By.className("filter-newButtonLink")).click();
		Thread.sleep(9000);
				
	}
	@AfterTest
	public void closeBrowser(){
		driver.close();
	
	}

		
	
	
	
	

}
