package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.MyTimesheetPage;
import com.vsii.tsc.utility.TestBase;

public class TimesheetMethod {
	
	WebDriver driver;
	
//	LoginPageMethod objLogin;
	public MyTimesheetPage objMyTimesheet = new MyTimesheetPage();
	
	public TimesheetMethod(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, objMyTimesheet);
	}

	public void clickHumanResources()
	{
		objMyTimesheet.getHumanResources().click();
	}
	
	public void clickMytimesheet()
	{
		objMyTimesheet.getMyTimesheet().click();
	}
	
	public String getEmployeeId()
	{
		return objMyTimesheet.getEmployeeId().getText();
	}
	
	public String getDateFrom()
	{
		return objMyTimesheet.getDateFrom().getText();
	}
	
	public String getDateTo()
	{
		return objMyTimesheet.getDateTo().getText();
	}
	
	public String getDepartmentId()
	{
		return objMyTimesheet.getDepartmentId().getText();
	}
	
	public String getTotalTimesheet()
	{
		return objMyTimesheet.getTotalTimesheet().getText();
	}
	
	public String getStatus()
	{
		return objMyTimesheet.getStatus().getText();
	}
	
	public String getBtnCreate()
	{
		return objMyTimesheet.getBtnCreate().getText();
	}
	
	public String getLnkImport()
	{
		return objMyTimesheet.getLnkImport().getText();
	}
	
}
