package com.vsii.tsc.guru.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vsii.tsc.guru.pages.method.ProjectCreateNewMethod;
import com.vsii.tsc.guru.pages.method.ProjectGroupPageMethod;
import com.vsii.tsc.guru.pages.LoginPage;
import com.vsii.tsc.guru.pages.ProjectCreateNew;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.utility.TestBase;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.guru.commethods.CommonMethods;

public class CreateNewProject {
	LoginPageMethod objLogin;
	ProjectCreateNewMethod objCreateProjectMethod;
	ProjectCreateNew objCreateProject;

	@BeforeClass
	public void setupClass() throws Exception {
		objLogin = new LoginPageMethod(TestBase.driver);
		objCreateProjectMethod = new ProjectCreateNewMethod(TestBase.driver);
		CommonMethods.checkLogin();
	}

	@Test(priority = 0, description = "Create New Project with valid data", dataProvider = "dpNewProject", dataProviderClass = TestData.class)
	public void PM06(String projectName, String refContract, String projectCode, String privacy, String projectManager,
			String appEffort, String department, String projectType, String commDetails, String customer)
					throws Exception {

		TestBase.methodName = "PM06";
		CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
		objCreateProjectMethod.clickProjectmn();
		CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
		Thread.sleep(1000);
		objCreateProjectMethod.clickCreatebtn();
		objCreateProjectMethod.createNewProject(projectName, refContract, projectCode, privacy, projectManager,
				appEffort, department, projectType, commDetails, customer);
		Assert.assertTrue(objCreateProjectMethod.CreateSuccess().contains("Submit to Review"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//	@Test(priority = 1, description = "Create New Project with invalid data", dataProvider = "dpInvalidCreate1", dataProviderClass = TestData.class)
	public void PM07(String projectName, String refContract, String projectCode, String privacy, String projectManager,
			String appEffort, String department, String projectType, String commDetails, String customer)
					throws Exception {
//		String popuptext = objCreateProjectMethod.getPopupText();
		TestBase.methodName = "PM07";
		CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
		objCreateProjectMethod.clickProjectmn();
		CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
		objCreateProjectMethod.clickCreatebtn();
		objCreateProjectMethod.createNewProject(projectName, refContract, projectCode, privacy, projectManager,
				appEffort, department, projectType, commDetails, customer);
		Assert.assertTrue(objCreateProjectMethod.getPopupText().contains("Access Denied"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
//	@Test(priority = 2, description = "Create New Project with leaving required fields blank", dataProvider = "dpInvalidCreate2", dataProviderClass = TestData.class)
	public void PM08(String projectName, String refContract, String projectCode, String privacy, String projectManager,
			String appEffort, String department, String projectType, String commDetails, String customer)
					throws Exception {

		TestBase.methodName = "PM08";
		CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
		objCreateProjectMethod.clickProjectmn();
		CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
		objCreateProjectMethod.clickCreatebtn();
		objCreateProjectMethod.createNewProject(projectName, refContract, projectCode, privacy, projectManager,
		appEffort, department, projectType, commDetails, customer);
		Assert.assertTrue(objCreateProjectMethod.getPopupText().contains("Following fields are invalid"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
