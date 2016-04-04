package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.commethods.GetAccountInfo;
import com.vsii.tsc.guru.pages.method.DetailProjectPageMethod;
import com.vsii.tsc.guru.pages.method.DetailTaskPageMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.ProjectsPageMethod;
import com.vsii.tsc.guru.pages.method.TasksPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class CreateTask_Member {
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
		objLogin.loginToManagerPage(GetAccountInfo.getUserName(), GetAccountInfo.getUserPass());
	}

	// @Test(priority = 1)
	public void TM02() throws InterruptedException {
		TestBase.methodName = "TM01";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.clickCreateBut();

	}

	// @Test(priority = 2, dataProvider = "dpNewTaskErr", dataProviderClass =
	// TestData.class)
	public void TM03(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
			String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
			String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
			String tagOfWorkDrop, String expectUrl) throws InterruptedException {
		TestBase.methodName = "TM03";
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

	// @Test(priority = 3, dataProvider = "dpNewTask", dataProviderClass =
	// TestData.class)
	public void TM04(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
			String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
			String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
			String tagOfWorkDrop) throws InterruptedException {
		TestBase.methodName = "TM04";
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
		Thread.sleep(2000);
		objDetailTask.goToTasks();
		Assert.assertEquals(objTasksPage.getTaskSummaryInfo(), summaryTxt);
		Assert.assertEquals(objTasksPage.getProjectNameInfo(), projectNameDrop);
		Assert.assertEquals(objTasksPage.getAssignToInfo(), assignToDrop);
		Assert.assertEquals(objTasksPage.getTaskTypeInfo(), taskTypeDrop);
		Assert.assertEquals(objTasksPage.getPlanHourInfo(), planHourTxt);
	}

	// @Test(priority = 3, dataProvider = "dpNewTask", dataProviderClass =
	// TestData.class)
	public void TM11(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
			String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
			String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
			String tagOfWorkDrop) throws InterruptedException {
		TestBase.methodName = "TM04";
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
		Thread.sleep(2000);
		objDetailTask.clickEditButt();
		Thread.sleep(2000);
		objDetailTask.clickDeleteButt();
		Thread.sleep(3000);
		Assert.assertFalse(objDetailTask.isTimeSpentTitExisted().isDisplayed());
	}

	// @Test
	public void TM14() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.setFirstTaskOfOneUser(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'Done')] and td[contains(text(),'"
						+ GetAccountInfo.getUserFullName() + "')]][1]")));
		objTasksPage.chooseTheFirstTaskOfOneUser();
		CommonMethods.waitUntil(objDetailTask.editButt());
		objDetailTask.clickEditButt();
		Thread.sleep(2000);
		objDetailTask.setSummaryTxt("hehehe123");
		objDetailTask.clickDiscardButt();

		Assert.assertEquals(TestBase.driver.switchTo().alert().getText(),
				"Warning, the record has been modified, your changes will be discarded." + "\n" + "\n"
						+ "Are you sure you want to leave this page ?");
		TestBase.driver.switchTo().alert().dismiss();
	}

	// @Test(priority = 6)
	public void TM15() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		Thread.sleep(2000);
		objTasksPage.clickCreateBut();
		objDetailTask.setSummaryTxt("hehehe123");
		Thread.sleep(2000);
		objDetailTask.clickDiscardButt();
		TestBase.driver.switchTo().alert().dismiss();
	}

	// @Test()
	public void TM16() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		Thread.sleep(2000);
		objTasksPage.clickCreateBut();
		objDetailTask.setSummaryTxt("hehehe123");
		Thread.sleep(2000);
		objDetailTask.clickDiscardButt();
		TestBase.driver.switchTo().alert().accept();
	}

	// @Test(priority = 3, dataProvider = "dpStatusListNotAllowToDone",
	// dataProviderClass = TestData.class)
	public void TM18(String status) throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.setFirstTaskOfOneUser(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'"
						+ status + "')] and td[contains(text(),'" + GetAccountInfo.getUserFullName() + "')]][1]")));
		objTasksPage.chooseTheFirstTaskOfOneUser();
		CommonMethods.waitUntil(objDetailTask.editButt());
		objDetailTask.clickDoneButt();
		Thread.sleep(2000);
		Assert.assertEquals(
				TestBase.driver.findElement(By.xpath("html/body/div[last()]/div[2]/table/tbody/tr/td[2]/p")).getText(),
				"Invalid Action!" + "\n" + "\n" + "Only Project Manager could approve or cancel a task.");
		TestBase.driver.findElement(By.xpath("html/body/div[last()]/div[11]/div/button")).click();
		Thread.sleep(10000);
	}

	// @Test(priority = 3, dataProvider = "dpStatusListNotAllowToDone",
	// dataProviderClass = TestData.class)
	public void TM19(String status) throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.setFirstTaskOfOneUser(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'"
						+ status + "')] and td[contains(text(),'" + GetAccountInfo.getUserFullName() + "')]][1]")));
		objTasksPage.chooseTheFirstTaskOfOneUser();
		CommonMethods.waitUntil(objDetailTask.editButt());
		objDetailTask.clickCancelTaskButt();
		Thread.sleep(2000);
		Assert.assertEquals(
				TestBase.driver.findElement(By.xpath("html/body/div[last()]/div[2]/table/tbody/tr/td[2]/p")).getText(),
				"Invalid Action!" + "\n" + "\n" + "Only Project Manager could approve or cancel a task.");
		TestBase.driver.findElement(By.xpath("html/body/div[last()]/div[11]/div/button")).click();
		Thread.sleep(10000);
	}

	// @Test(priority = 3)
	public void TM24() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.setFirstTaskOfOneUser(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'New')] and td[contains(text(),'"
						+ GetAccountInfo.getUserFullName() + "')]][1]")));
		objTasksPage.chooseTheFirstTaskOfOneUser();
		CommonMethods.waitUntil(objDetailTask.editButt());
		objDetailTask.clickInProgressButt();
		Thread.sleep(2000);
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath(".//*[@class='oe_form_field_status oe_form_status_clickable']/li[@class='oe_active']/span"))
				.getText(), "In Progress");
	}

	//@Test(priority = 3)
	public void TM27() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.setFirstTaskOfOneUser(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'New')] and td[contains(text(),'"
						+ GetAccountInfo.getUserFullName() + "')]][1]")));
		objTasksPage.chooseTheFirstTaskOfOneUser();
		CommonMethods.waitUntil(objDetailTask.editButt());
		objDetailTask.clickMoreButt();
		objDetailTask.clickApproveAllWorkLogs();
		Thread.sleep(10000);
		Assert.assertEquals(
				TestBase.driver.findElement(By.xpath("html/body/div[last()]/div[2]/table/tbody/tr/td[2]/p")).getText(),
				"Invalid Action!" + "\n" + "\n" + "Only Project Manager could Approve Worklogs.");
	}

	@Test(priority = 3, dataProvider = "dpNumberOfTaskWantToSelect", dataProviderClass = TestData.class)
	public void TM28(String number) throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.setFirstTaskOfOneUser(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'New')] and td[contains(text(),'"
						+ GetAccountInfo.getUserFullName() + "')]][1]")));
		for (int i = 1; i <= Integer.parseInt(number); i++) {
			objTasksPage.setCheckboxOfNewTaskOfOneUser(TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'New')] and td[contains(text(),'"+GetAccountInfo.getUserFullName()+"')]]["+i+"]/th")));
			Thread.sleep(1000);
			objTasksPage.clickCheckboxOfNewTaskOfOneUser();
			Thread.sleep(1000);
		}
		objTasksPage.clickMoreButt();
		Assert.assertEquals(TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[1]/a")).getText(), "Export");
		Assert.assertEquals(TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[2]/a")).getText(), "Delete");
		Assert.assertEquals(TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[3]/a")).getText(), "Approve Worklogs");
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
