package com.vsii.tsc.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.pages.ProjectCreateNew;
import com.vsii.tsc.pages.method.LoginPageMethod;
import com.vsii.tsc.pages.method.ProjectCreateNewMethod;
import com.vsii.tsc.pages.method.ProjectGroupPageMethod;
import com.vsii.tsc.pages.method.ProjectListPageMethod;
import com.vsii.tsc.utility.TestBase;

public class ProjectList {
	LoginPageMethod objLogin;
	ProjectListPageMethod objProjectList;
	ProjectCreateNewMethod objCreateProjectMethod;
	ProjectCreateNew objCreateProject;
	ProjectGroupPageMethod objProjectGroupMethod;

	@BeforeClass
	public void setupClass() throws Exception {
		objLogin = new LoginPageMethod(TestBase.driver);
		objProjectList = new ProjectListPageMethod(TestBase.driver);
		CommonMethods.checkLogin();
	}
	
	@Test(priority = 0, description = "Check Project List With Role Manager: View TSC")
	public void PM01() throws InterruptedException {
		TestBase.methodName = "PM01";	
		objProjectGroupMethod.clickProjectMenu();
		CommonMethods.waitUntil(objProjectGroupMethod.getLbGroup());
		Thread.sleep(3000);	
		objProjectList.clickDepartment();
		Assert.assertEquals(objProjectList.getlbProject1(), "TSC_General _Non project works");
		Assert.assertEquals(objProjectList.getlbProject2(), "Laplink 07");
		Assert.assertEquals(objProjectList.getlbProject3(), "VIB-IP3");
		Assert.assertEquals(objProjectList.getlbProject4(), "Vpbank testing");
		
	}
	
}
