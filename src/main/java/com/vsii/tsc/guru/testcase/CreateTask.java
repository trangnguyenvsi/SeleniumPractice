package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.DetailTaskPage;
import com.vsii.tsc.guru.pages.method.DetailProjectPageMethod;
import com.vsii.tsc.guru.pages.method.DetailTaskPageMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.ProjectsPageMethod;
import com.vsii.tsc.guru.pages.method.TasksPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class CreateTask {

	LoginPageMethod objLogin;
	ProjectsPageMethod objProjects;
	DetailProjectPageMethod objDetailProject;
	TasksPageMethod objTasksPage;
	DetailTaskPageMethod objDetailTask;

	@BeforeClass
	public void setupClass() throws NumberFormatException, IOException {
		objLogin = new LoginPageMethod(TestBase.driver);
		objProjects = new ProjectsPageMethod(TestBase.driver);
		objDetailProject = new DetailProjectPageMethod(TestBase.driver);
		objTasksPage = new TasksPageMethod(TestBase.driver);
		objDetailTask = new DetailTaskPageMethod(TestBase.driver);

	}

	// @Test(priority = 0)
	public void TM01() throws InterruptedException {
		TestBase.methodName = "TM01";
		objLogin.loginToManagerPage("admin", "12345678");
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		Assert.assertEquals(objTasksPage.getTaskSummaryTit(), "Task Summary");
		Assert.assertEquals(objTasksPage.getProjectNameTit(), "Project");
		Assert.assertEquals(objTasksPage.getAssignToTit(), "Assigned to");
		Assert.assertEquals(objTasksPage.getTaskTypeTit(), "Task Type");
		Assert.assertEquals(objTasksPage.getIsBillTit(), "Is Billed");
		Assert.assertEquals(objTasksPage.getExternalKeyTit(), "External Key");
		Assert.assertEquals(objTasksPage.getPlanHourTit(), "Initially Planned Hour(s)");
		Assert.assertEquals(objTasksPage.getHourSpentTit(), "Hour(s) Spent");
		Assert.assertEquals(objTasksPage.getStageTit(), "Stage");
		Assert.assertEquals(objTasksPage.getStartingDateTit(), "Starting Date");
		Assert.assertEquals(objTasksPage.getEndDateTit(), "Ending Date");
		Assert.assertEquals(objTasksPage.getProgressTit(), "Progress (%)");
	}

	// @Test(priority = 1)
	public void TM02() throws InterruptedException {
		TestBase.methodName = "TM01";
		// objLogin.loginToManagerPage("admin", "12345678");
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.clickCreateBut();

	}

	//@Test(priority = 2, dataProvider = "dpNewTaskErr", dataProviderClass = TestData.class)
	public void TM03(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
			String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
			String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
			String tagOfWorkDrop, String expectUrl) throws InterruptedException {
		TestBase.methodName = "TM03";
		//objLogin.loginToManagerPage("admin", "12345678");
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.clickCreateBut();
		objDetailTask.createTask(summaryTxt, projectNameDrop, assignToDrop, taskTypeDrop, projectPhaseDrop, planHourTxt,
				deadlineTxt, tagOfProjectDrop, descriptionTxtA, workSummaryTxt, timeSpentTxt, dateTxt, doneByDrop,
				tagOfWorkDrop);
		Assert.assertTrue(TestBase.driver.getCurrentUrl().contains(expectUrl));
	}
	
	@Test(priority = 3, dataProvider = "dpNewTask", dataProviderClass = TestData.class)
		public void TM04(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
				String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
				String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
				String tagOfWorkDrop) throws InterruptedException {
			TestBase.methodName = "TM04";
			objLogin.loginToManagerPage("admin", "12345678");
			CommonMethods.waitUntil(objProjects.getProjectLinktxt());
			objProjects.clickProjectLink();
			CommonMethods.waitUntil(objProjects.getDepartment());
			objProjects.chooseDepartment();
			CommonMethods.waitUntil(objProjects.getProject());
			objProjects.chooseProject();
			objDetailProject.clickTasksBut();
			objTasksPage.clickCreateBut();
			objDetailTask.createTask(summaryTxt, projectNameDrop, assignToDrop, taskTypeDrop, projectPhaseDrop, planHourTxt,
					deadlineTxt, tagOfProjectDrop, descriptionTxtA, workSummaryTxt, timeSpentTxt, dateTxt, doneByDrop,
					tagOfWorkDrop);
			objDetailTask.goToTasks();
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
