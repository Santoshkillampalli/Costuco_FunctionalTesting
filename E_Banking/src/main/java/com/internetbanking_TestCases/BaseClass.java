package com.internetbanking_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{

	public  String baseUrl="http://www.demo.guru99.com/V4/index.php";
	public  String username="mngr240195";
	public  String password="ugugUjy";
	public static WebDriver driver;

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
