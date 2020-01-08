package com.costuco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	
	@FindBy(xpath="//*[@id=\"mat-dialog-0\"]/home-banner/div/div[1]/div[2]/button/span/mat-icon")
	@CacheLookup
	WebElement closeAlert;
	
	@FindBy(xpath="//*[@id=\"mat-input-2\"]")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//*[@id='mat-input-3']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"login\"]/mat-toolbar/mat-toolbar-row/form/div[1]/button")
	@CacheLookup
	WebElement clickLogin;
		
	public void closeAlert()
	{
		closeAlert.click();
	}
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() throws InterruptedException
	{
		clickLogin.click();
		Thread.sleep(4000);
	}
	
	
}

