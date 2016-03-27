package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.commethods.CommonMethods;
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
		TestBase.methodName = "TS01";
		objLogin = new LoginPageMethod(TestBase.driver);	
//		//login user member
		objLogin.loginToManagerPage("anhptq", "12345678");
		CommonMethods.waitUntil(objMyTSPage.getHumanResources());
		//click Human resources
		objMyTSPage.getHumanResources().click();
		CommonMethods.waitUntil(objMyTSPage.getMyTimesheet());
		//click My timesheet
		objMyTSPage.getMyTimesheet().click();
	}
	
	public String getEmployeeId()
	{
		objMyTSPage.getEmployeeId();
		return objMyTSPage.getEmployeeId().getText();
	}
	
	public String getDateFrom()
	{
		objMyTSPage.getDateFrom();
		return objMyTSPage.getDateFrom().getText();
	}
	
	public String getDateTo()
	{
		objMyTSPage.getDateTo();
		return objMyTSPage.getDateTo().getText();
	}
	
	public String getDepartmentId()
	{
		objMyTSPage.getDepartmentId();
		return objMyTSPage.getDepartmentId().getText();
	}
	
	public String getStatus()
	{
		objMyTSPage.getStatus();
		return objMyTSPage.getStatus().getText();
	}
	
	public String getBtnCreate()
	{
		objMyTSPage.getBtnCreate();
		return objMyTSPage.getBtnCreate().getText();
	}
	
	public String getLnkImport()
	{
		objMyTSPage.getLnkImport();
		return objMyTSPage.getLnkImport().getText();
	}
	
	public String getTotalTimesheet()
	{
		objMyTSPage.getTotalTimesheet();
		return objMyTSPage.getTotalTimesheet().getText();
	}
}
