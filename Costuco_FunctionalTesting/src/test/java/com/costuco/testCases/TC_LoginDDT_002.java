package com.costuco.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.costuco.pageObjects.LoginPage;
import com.costuco.utilities.XLUtils;

public class TC_LoginDDT_002 extends Base{
	
	@Test
	
	public void loginDDT(String user, String pwd) throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.closeAlert();
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickLogin();
		
	}
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path= System.getProperty("user.dir")+"/src/test/java/com/costuco/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount= XLUtils.getCellCount(path, "Sheet1" ,1);
		
		String logindata[][] = new String[rownum][colcount];
		
		for(int i=1; i<=rownum; i++)
		{
			for(int j=1 ; j<colcount; j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i,j);
			}
		}
			
				return logindata;
		
	}
	

}
