package com.costuco.testCases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.costuco.utilities.ReadConfig;

public class Base {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseUrl=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
		driver = new ChromeDriver();
		
		logger= Logger.getLogger("Costuco");
		PropertyConfigurator.configure("log4j.properties");
	}

	
	@AfterClass
	
	public void teatDown()
	{
		driver.quit();
		logger.info("Done");
	}
}

