package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.MyTimesheetPage;
import com.vsii.tsc.guru.pages.method.ClickHumanResourcesMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class Timesheet {

	LoginPageMethod objLogin;
	ClickHumanResourcesMethod objClickHumanResources;
	MyTimesheetPage objMyTimesheet;
	
	@BeforeClass
	public void setupClass() throws NumberFormatException, IOException {
		
		objClickHumanResources = new ClickHumanResourcesMethod(TestBase.driver);		
	}
	
	 @Test(priority = 1)
		public void TS01() throws InterruptedException {
			objClickHumanResources.clickHumanResources();
		 
//		 	TestBase.methodName = "TS01";
//			objLogin = new LoginPageMethod(TestBase.driver);	
//			//login user member
//			objLogin.loginToManagerPage("anhptq", "12345678");
//			CommonMethods.waitUntil(objMyTimesheet.getHumanResources());
//			//click Human resources
//			objMyTimesheet.getHumanResources().click();
////			CommonMethods.waitUntil(objMyTimesheet.getMyTimesheet());
//			//click My timesheet
//			objMyTimesheet.getMyTimesheet().click();
		 
			Assert.assertEquals(objMyTimesheet.getEmployeeId(),"Employee");
			Assert.assertEquals(objMyTimesheet.getDateFrom(),"Date from");
			Assert.assertEquals(objMyTimesheet.getDateTo(),"Date to");
			Assert.assertEquals(objMyTimesheet.getDepartmentId(),"Department");
			Assert.assertEquals(objMyTimesheet.getTotalTimesheet(),"Total Timesheet");
			Assert.assertEquals(objMyTimesheet.getStatus(),"Status");
			Assert.assertEquals(objMyTimesheet.getBtnCreate(),"Create");
			Assert.assertEquals(objMyTimesheet.getLnkImport(),"Import");
		}
	
	 
	 @AfterClass
		public void logout() throws NumberFormatException, IOException {
			objLogin = null;	
		}
}
