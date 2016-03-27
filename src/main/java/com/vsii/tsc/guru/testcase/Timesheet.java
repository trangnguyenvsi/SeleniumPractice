package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.MyTimesheetPage;
import com.vsii.tsc.guru.pages.method.TimesheetMethod;
import com.vsii.tsc.guru.pages.method.DepartmentTimesheetMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class Timesheet {

	LoginPageMethod objLogin;
	TimesheetMethod objMyTimesheet;
	MyTimesheetPage objTS = new MyTimesheetPage();
	DepartmentTimesheetMethod objDepartment;
	
	@BeforeClass
	public void setupClass() throws NumberFormatException, IOException {

		objLogin = new LoginPageMethod(TestBase.driver);	
		objMyTimesheet = new TimesheetMethod(TestBase.driver);		
	}
	
	 @Test(priority = 1)
		public void TS01() throws InterruptedException {
		 	TestBase.methodName = "TS01";
			objLogin.loginToManagerPage("anhptq", "12345678");
			
			CommonMethods.waitUntil(objTS.getHumanResources());
			objMyTimesheet.clickHumanResources();
			CommonMethods.waitUntil(objTS.getMyTimesheet());
			objMyTimesheet.clickMytimesheet();
			
			Assert.assertEquals(objMyTimesheet.getEmployeeId(),"Employee");
			Assert.assertEquals(objMyTimesheet.getDateFrom(),"Date from");
			Assert.assertEquals(objMyTimesheet.getDateTo(),"Date to");
			Assert.assertEquals(objMyTimesheet.getDepartmentId(),"Department");
			Assert.assertEquals(objMyTimesheet.getTotalTimesheet(),"Total Timesheet");
			Assert.assertEquals(objMyTimesheet.getStatus(),"Status");
			Assert.assertEquals(objMyTimesheet.getBtnCreate(),"Create");
			Assert.assertEquals(objMyTimesheet.getLnkImport(),"Import");
		}
	
		public void TS03() throws InterruptedException {
		 	TestBase.methodName = "TS03";
			objLogin.loginToManagerPage("lienlt", "12345678");
			
			CommonMethods.waitUntil(objTS.getHumanResources());
			objMyTimesheet.clickHumanResources();
			CommonMethods.waitUntil(objTS.getMyTimesheet());
			objDepartment.clickDepartment();
			
			Assert.assertEquals(objDepartment.getEmployeeD(),"Employee");
			Assert.assertEquals(objDepartment.getDateFromD(),"Date from");
			Assert.assertEquals(objDepartment.getDateToD(),"Date to");
			Assert.assertEquals(objDepartment.getDepartmentIdD(),"Department");
			Assert.assertEquals(objDepartment.getTotalTimesheetD(),"Total Timesheet");
			Assert.assertEquals(objDepartment.getStatusD(),"Status");
		}
	 
	 
	 @AfterClass
		public void logout() throws NumberFormatException, IOException {
			objLogin = null;	
		}
}
