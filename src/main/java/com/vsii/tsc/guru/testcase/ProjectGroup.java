package com.vsii.tsc.guru.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.ProjectCreateNew;
import com.vsii.tsc.guru.pages.ProjectGroupPage;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.ProjectGroupPageMethod;
import com.vsii.tsc.utility.TestBase;
import com.vsii.tsc.utility.CommonOperations;



public class ProjectGroup {
 LoginPageMethod objLogin; 
 ProjectGroupPageMethod objProjectGroupMethod;
 ProjectGroupPage objProjectGroup;
 
 @BeforeClass
	public void setupClass() throws NumberFormatException, IOException {
		objLogin = new LoginPageMethod(TestBase.driver);
		objProjectGroupMethod = new ProjectGroupPageMethod(TestBase.driver);
		CommonMethods.checkLogin();
	}
 @Test(priority = 0, description = "Check Project Group")
	public void PM03() throws InterruptedException {
		TestBase.methodName = "PM03";	
		objProjectGroupMethod.clickProjectMenu();
		CommonMethods.waitUntil(objProjectGroupMethod.getLbGroup());
		Thread.sleep(3000);
		Assert.assertEquals(objProjectGroupMethod.getGrouplb(), "Group");
		Assert.assertEquals(objProjectGroupMethod.getProjectName(), "Project Name");
		Assert.assertEquals(objProjectGroupMethod.getProjectManager(), "Project Manager");
		Assert.assertEquals(objProjectGroupMethod.getContact(), "Contact");
		Assert.assertEquals(objProjectGroupMethod.getPlannedTime(), "Planned Time");
		Assert.assertEquals(objProjectGroupMethod.getTotalTime(), "Total Time");
		Assert.assertEquals(objProjectGroupMethod.getSpendTime(), "Time Spent");
		Assert.assertEquals(objProjectGroupMethod.getProjectCode(), "Project Code");
		Assert.assertEquals(objProjectGroupMethod.getProgress(), "Progress");
		Assert.assertEquals(objProjectGroupMethod.getStatus(), "Status");		
 
	}
	
	@AfterMethod
	public void afterMethod() throws Exception {
		CommonOperations.takePicture();
	}

	@AfterClass
	public void teardownClass() {
		objLogin = null;
	}
}
