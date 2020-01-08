package com.costuco.testCases;

import org.testng.annotations.Test;

import com.costuco.pageObjects.LoginPage;

import junit.framework.Assert;


public class TC_LoginTest_001 extends Base {
	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseUrl);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.closeAlert();
		logger.info("Alert closed");
		
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickLogin();
		
		
		if(driver.getTitle().equals("nboard.in | Home"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}

}

