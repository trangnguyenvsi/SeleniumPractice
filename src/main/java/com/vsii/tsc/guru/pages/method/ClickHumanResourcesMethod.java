package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.MyTimesheetPage;
import com.vsii.tsc.utility.TestBase;

public class ClickHumanResourcesMethod {
	WebDriver driver;
	
	LoginPageMethod objLogin;
	public MyTimesheetPage objMyTSPage = new MyTimesheetPage();
	
	
	
	public ClickHumanResourcesMethod(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, objMyTSPage);
	}

	public void clickHumanResources()
	{
		TestBase.methodName = "TM01";
		objLogin = new LoginPageMethod(TestBase.driver);		
		objLogin.loginToManagerPage("anhptq", "12345678");
		objMyTSPage.getHumanResources().click();
	}
}
