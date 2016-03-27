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
import com.vsii.tsc.guru.commethods.GetAccountInfo;
import com.vsii.tsc.guru.pages.DetailTaskPage;
import com.vsii.tsc.guru.pages.method.DetailProjectPageMethod;
import com.vsii.tsc.guru.pages.method.DetailTaskPageMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.LogoutPageMethod;
import com.vsii.tsc.guru.pages.method.ProjectsPageMethod;
import com.vsii.tsc.guru.pages.method.TasksPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class CreateTask_PM {

	LoginPageMethod objLogin;
	ProjectsPageMethod objProjects;
	DetailProjectPageMethod objDetailProject;
	TasksPageMethod objTasksPage;
	DetailTaskPageMethod objDetailTask;
	LogoutPageMethod objLogout;

	@BeforeClass
	public void setupClass() throws NumberFormatException, IOException {
		objLogin = new LoginPageMethod(TestBase.driver);
		objProjects = new ProjectsPageMethod(TestBase.driver);
		objDetailProject = new DetailProjectPageMethod(TestBase.driver);
		objTasksPage = new TasksPageMethod(TestBase.driver);
		objDetailTask = new DetailTaskPageMethod(TestBase.driver);
		objLogout = new LogoutPageMethod(TestBase.driver);
		objLogin.loginToManagerPage(GetAccountInfo.getPMName(), GetAccountInfo.getPMPass());
	}

	// @Test(priority = 0)
	public void TM01() throws InterruptedException {
		TestBase.methodName = "TM01";
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

	// @Test(priority = 4, dataProvider = "dpNewTaskUserOutside",
	// dataProviderClass = TestData.class)
	public void TM05(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
			String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
			String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
			String tagOfWorkDrop, String errMessageUserOutside) throws InterruptedException {
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
		Assert.assertEquals(objDetailTask.getErrMessageUserOutside(), errMessageUserOutside);
	}

	// @Test(priority = 5, dataProvider = "dpNewTaskEdit", dataProviderClass =
	// TestData.class)
	public void TM06(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
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
		objTasksPage.chooseOneExistedTask();
		objDetailTask.clickEditButt();
		objDetailTask.editSummaryOfTask(summaryTxt);
		Thread.sleep(2000);
		Assert.assertEquals(objDetailTask.getSummaryTit().getText(), summaryTxt);
	}

	// @Test(priority = 6)
	public void TM07() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.chooseOneExistedTask();
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
	public void TM08() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.chooseOneExistedTask();
		CommonMethods.waitUntil(objDetailTask.editButt());
		objDetailTask.clickEditButt();
		Thread.sleep(2000);
		objDetailTask.setSummaryTxt("hehehe123");
		objDetailTask.clickDiscardButt();
		TestBase.driver.switchTo().alert().dismiss();
	}

	// @Test(priority = 6)
	public void TM09() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.chooseOneExistedTask();
		CommonMethods.waitUntil(objDetailTask.editButt());
		objDetailTask.clickEditButt();
		CommonMethods.waitUntil(objDetailTask.getEditButt());
		objDetailTask.setSummaryTxt("hehehe123");
		objDetailTask.clickDiscardButt();
		TestBase.driver.switchTo().alert().accept();
	}

	// @Test(priority = 3, dataProvider = "dpNewTaskPM", dataProviderClass =
	// TestData.class)
	public void TM12(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
			String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
			String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
			String tagOfWorkDrop) throws InterruptedException {
		TestBase.methodName = "TM12";
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
		Thread.sleep(4000);
		objDetailTask.clickEditButt();
		Thread.sleep(2000);
		objDetailTask.clickRefuseButt();
		Thread.sleep(7000);
		Assert.assertEquals(objDetailTask.getStatus(), "Refused");
	}

	// @Test(priority = 3, dataProvider = "dpNewTaskPM", dataProviderClass =
	// TestData.class)
	public void TM13(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
			String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
			String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
			String tagOfWorkDrop) throws InterruptedException {
		TestBase.methodName = "TM13";
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
		objDetailTask.clickApproveButt();
		Thread.sleep(7000);
		Assert.assertEquals(objDetailTask.getStatus(), "Approved");
	}

	// @Test
	public void TM17() throws InterruptedException {
		TestBase.methodName = "TM13";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.chooseTheFirstNewTask();
		Thread.sleep(5000);
		objDetailTask.clickDoneButt();
		Thread.sleep(3000);
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath(".//*[@class='oe_form_field_status oe_form_status_clickable']/li[@class='oe_active']/span"))
				.getText(), "Done");

	}

	// @Test
	public void TM19() throws InterruptedException {
		TestBase.methodName = "TM13";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.chooseTheFirstNewTask();
		Thread.sleep(5000);
		objDetailTask.clickCancelTaskButt();
		Thread.sleep(3000);
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath(".//*[@class='oe_form_field_status oe_form_status_clickable']/li[@class='oe_active']/span"))
				.getText(), "Cancelled");
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/header/button[1]/span"))
				.getText(), "Reactivate");
	}

	// @Test
	public void TM21() throws InterruptedException {
		TestBase.methodName = "TM13";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.chooseTheFirstCancelTask();
		Thread.sleep(5000);
		objDetailTask.clickReactiveButt();
		Thread.sleep(3000);
		Assert.assertEquals(TestBase.driver.findElement(By.xpath(".//*[@class='oe_form_nosheet']/div")).getText(),
				"Reevaluation Task");
		Assert.assertEquals(TestBase.driver
				.findElement(By.xpath(".//*[@class='oe_form_nosheet']/table/tbody/tr/td[1]/label")).getText(),
				"Remaining Hour(s)");
		Assert.assertEquals(
				TestBase.driver.findElement(By.xpath(".//*[@class='oe_form_nosheet']/table/tbody/tr/td[2]/span/input"))
						.getAttribute("type"),
				"text");
		Assert.assertEquals(
				TestBase.driver.findElement(By.xpath("html/body/div[2]/div[11]/div/footer/button[1]/span")).getText(),
				"Evaluate");
		Assert.assertEquals(
				TestBase.driver.findElement(By.xpath("html/body/div[2]/div[11]/div/footer/button[2]/span")).getText(),
				"Cancel");
		objDetailTask.clickCancelButt();
	}

	// @Test
	public void TM22() throws InterruptedException {
		TestBase.methodName = "TM13";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.chooseTheFirstCancelTask();
		Thread.sleep(5000);
		objDetailTask.clickReactiveButt();
		Thread.sleep(3000);
		objDetailTask.clickEvaluateButt();
		Thread.sleep(7000);
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath(".//*[@class='oe_form_field_status oe_form_status_clickable']/li[@class='oe_active']/span"))
				.getText(), "In Progress");
	}

	// @Test
	public void TM23() throws InterruptedException {
		TestBase.methodName = "TM13";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		objTasksPage.chooseTheFirstCancelTask();
		Thread.sleep(5000);
		objDetailTask.clickReactiveButt();
		Thread.sleep(3000);
		objDetailTask.clickCancelButt();
		Thread.sleep(7000);
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath(".//*[@class='oe_form_field_status oe_form_status_clickable']/li[@class='oe_active']/span"))
				.getText(), "Cancelled");
	}

	// @Test(priority = 3, dataProvider = "dpNumberOfTaskWantToSelect",
	// dataProviderClass = TestData.class)
	public void TM29(String number) throws InterruptedException {
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
			objTasksPage.setCheckboxOfNewTaskOfOneUser(TestBase.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'New')] and td[contains(text(),'Trang')]]["
							+ i + "]/th")));
			Thread.sleep(1000);
			objTasksPage.clickCheckboxOfNewTaskOfOneUser();
			Thread.sleep(1000);
		}
		objTasksPage.clickMoreButt();
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[1]/a"))
				.getText(), "Share");
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[2]/a"))
				.getText(), "Embed");
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[3]/a"))
				.getText(), "Export");
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[4]/a"))
				.getText(), "Delete");
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[5]/a"))
				.getText(), "Approve Worklogs");
	}

	// @Test(priority = 3, dataProvider = "dpNumberOfTaskWantToSelect",
	// dataProviderClass = TestData.class)
	public void TM30(String number) throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects.getProjectLinktxt());
		objProjects.clickProjectLink();
		CommonMethods.waitUntil(objProjects.getDepartment());
		objProjects.chooseDepartment();
		CommonMethods.waitUntil(objProjects.getProject());
		objProjects.chooseProject();
		objDetailProject.clickTasksBut();
		for (int i = 1; i <= Integer.parseInt(number); i++) {
			objTasksPage.setCheckboxOfNewTaskOfOneUser(TestBase.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'New')] and td[contains(text(),'Trang')]]["
							+ i + "]/th")));
			Thread.sleep(1000);
			objTasksPage.clickCheckboxOfNewTaskOfOneUser();
			Thread.sleep(1000);
		}
		objTasksPage.clickMoreButt();
		objTasksPage.clickDeleteButt();
		Assert.assertEquals(TestBase.driver.switchTo().alert().getText(),
				"Do you really want to remove these records?");
	}

	@Test(priority = 3, dataProvider = "dpTaskAdminDelete", dataProviderClass = TestData.class)
	public void TM31(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
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
		Thread.sleep(10000);
		objDetailTask.goToTasks();
		Thread.sleep(7000);
		objTasksPage.setCheckboxOfNewTaskOfOneUser(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'"
						+ summaryTxt + "')]][1]/th")));
		Thread.sleep(1000);
		objTasksPage.clickCheckboxOfNewTaskOfOneUser();
		Thread.sleep(1000);
		objTasksPage.clickMoreButt();
		objTasksPage.clickDeleteButt();
		TestBase.driver.switchTo().alert().accept();
		Thread.sleep(10000);
		Assert.assertFalse(TestBase.driver.findElements(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'"
						+ summaryTxt + "')]][1]/th")).size()>0);
	}
	
	//@Test(priority = 3, dataProvider = "dpTaskAdminDelete", dataProviderClass = TestData.class)
	public void TM32(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
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
		Thread.sleep(10000);
		objDetailTask.goToTasks();
		Thread.sleep(7000);
		objTasksPage.setCheckboxOfNewTaskOfOneUser(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'"
						+ summaryTxt + "')]][1]/th")));
		Thread.sleep(1000);
		objTasksPage.clickCheckboxOfNewTaskOfOneUser();
		Thread.sleep(1000);
		objTasksPage.clickMoreButt();
		objTasksPage.clickDeleteButt();
		TestBase.driver.switchTo().alert().dismiss();
		Thread.sleep(10000);
		Assert.assertTrue(TestBase.driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'"
						+ summaryTxt + "')]][1]/th")).isDisplayed());
		objTasksPage.clickMoreButt();
		objTasksPage.clickDeleteButt();
		TestBase.driver.switchTo().alert().accept();
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		CommonOperations.takePicture();
	}

	@AfterClass
	public void teardownClass() {
		objLogin = null;
		objLogout.performLogout();
	}
}
