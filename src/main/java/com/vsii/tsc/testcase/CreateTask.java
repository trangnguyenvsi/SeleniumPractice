package com.vsii.tsc.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.com.methods.GetAccountInfo;
import com.vsii.tsc.pages.method.DetailProjectPageMethod;
import com.vsii.tsc.pages.method.DetailTaskPageMethod;
import com.vsii.tsc.pages.method.LoginPageMethod;
import com.vsii.tsc.pages.method.LogoutPageMethod;
import com.vsii.tsc.pages.method.ProjectsPageMethod;
import com.vsii.tsc.pages.method.TasksPageMethod;
import com.vsii.tsc.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class CreateTask {
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
		
	}
	
    @BeforeGroups("PM")
    public void beforeGroupsPM() throws InterruptedException
    {
		objLogin.loginToManagerPage(GetAccountInfo.getPMName(), GetAccountInfo.getPMPass());
    }
    @BeforeGroups("Member")
    public void beforesGroupsMember() throws InterruptedException
    {
		objLogin.loginToManagerPage(GetAccountInfo.getUserName(), GetAccountInfo.getUserPass());
    }
	
	@Test(priority = 0, groups = "PM")
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

	@Test(priority = 1, groups = "PM", dataProvider = "dpNewTaskUserOutside", dataProviderClass = TestData.class)
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
		TestBase.driver.findElement(By.xpath("html/body/div[last()]/div[11]/div/button")).click();
		objProjects.clickProjectLink();
		TestBase.driver.switchTo().alert().accept();
	}

	@Test(priority = 2, groups = "PM", dataProvider = "dpNewTaskEdit", dataProviderClass = TestData.class)
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

	@Test(priority = 3, groups = "PM")
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
		objProjects.clickProjectLink();
		TestBase.driver.switchTo().alert().accept();
	}

	@Test(priority = 4, groups = "PM")
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
		objProjects.clickProjectLink();
		TestBase.driver.switchTo().alert().accept();
	}

	@Test(priority = 5, groups = "PM")
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
		objDetailTask.setSummaryTxt("hehehe123");
		objDetailTask.clickDiscardButt();
		TestBase.driver.switchTo().alert().accept();
	}

	@Test(priority = 6, groups = "PM", dataProvider = "dpNewTask", dataProviderClass = TestData.class)
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
		Thread.sleep(7000);
		objDetailTask.clickEditButt();
		Thread.sleep(5000);
		objDetailTask.clickRefuseButt();
		Thread.sleep(7000);
		Assert.assertEquals(objDetailTask.getStatus(), "Refused");
	}

	@Test(priority = 7, groups = "PM", dataProvider = "dpNewTask", dataProviderClass = TestData.class)
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
		Thread.sleep(7000);
		objDetailTask.clickEditButt();
		Thread.sleep(5000);
		objDetailTask.clickApproveButt();
		Thread.sleep(7000);
		Assert.assertEquals(objDetailTask.getStatus(), "Approved");

	}

	@Test(priority = 8, groups = "PM")
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

	@Test(priority = 9, groups = "PM")
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

	@Test(priority = 10, groups = "PM")
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
				TestBase.driver.findElement(By.xpath("html/body/div[4]/div[11]/div/footer/button[1]/span")).getText(),
				"Evaluate");
		Assert.assertEquals(
				TestBase.driver.findElement(By.xpath("html/body/div[4]/div[11]/div/footer/button[2]/span")).getText(),
				"Cancel");
		objDetailTask.clickCancelButt();
	}

	@Test(priority = 11, groups = "PM")
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

	@Test(priority = 12, groups = "PM")
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

	@Test(priority = 13, groups = "PM", dataProvider = "dpNumberOfTaskWantToSelect", dataProviderClass = TestData.class)
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

	@Test(priority = 14, groups = "PM", dataProvider = "dpNumberOfTaskWantToSelect", dataProviderClass = TestData.class)
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

	@Test(priority = 15, groups = "PM", dataProvider = "dpTaskAdminDelete", dataProviderClass = TestData.class)
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
						+ summaryTxt + "')]][1]/th"))
				.size() > 0);
	}

	@Test(priority = 16, groups = "PM", dataProvider = "dpTaskAdminDelete", dataProviderClass = TestData.class)
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
						+ summaryTxt + "')]][1]/th"))
				.isDisplayed());
		objTasksPage.clickMoreButt();
		objTasksPage.clickDeleteButt();
		TestBase.driver.switchTo().alert().accept();
	}


	@Test(priority = 17, groups = "Member")
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

	@Test(priority = 18, groups = "Member", dataProvider = "dpNewTaskErr", dataProviderClass = TestData.class)
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
		objProjects.clickProjectLink();
		TestBase.driver.switchTo().alert().accept();
	}

	@Test(priority = 19, groups = "Member", dataProvider = "dpNewTask", dataProviderClass = TestData.class)
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
		Thread.sleep(7000);
		objDetailTask.goToTasks();
		Assert.assertEquals(objTasksPage.getTaskSummaryInfo(), summaryTxt);
		Assert.assertEquals(objTasksPage.getProjectNameInfo(), projectNameDrop);
		Assert.assertEquals(objTasksPage.getAssignToInfo(), assignToDrop);
		Assert.assertEquals(objTasksPage.getTaskTypeInfo(), taskTypeDrop);
		Assert.assertEquals(objTasksPage.getPlanHourInfo(), planHourTxt);
	}

	@Test(priority = 20, groups = "Member", dataProvider = "dpNewTask", dataProviderClass = TestData.class)
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
		Thread.sleep(5000);
		objDetailTask.clickEditButt();
		Thread.sleep(2000);
		objDetailTask.clickDeleteButt();
		Thread.sleep(3000);
		Assert.assertFalse(TestBase.driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[2]")).size()>0);
		objProjects.clickProjectLink();
		TestBase.driver.switchTo().alert().accept();
	}

	@Test(priority = 21, groups = "Member")
	public void TM14() throws InterruptedException {
		TestBase.methodName = "TM04";
		CommonMethods.waitUntil(objProjects
				
				.getProjectLinktxt());
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
		objProjects.clickProjectLink();
		TestBase.driver.switchTo().alert().accept();
	}

	@Test(priority = 22, groups = "Member")
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
		objProjects.clickProjectLink();
		TestBase.driver.switchTo().alert().accept();
	}

	@Test(priority = 23, groups = "Member")
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
		objDetailTask.setSummaryTxt("Test: No Task is created when clicking discard");
		Thread.sleep(2000);
		objDetailTask.clickDiscardButt();
		TestBase.driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Assert.assertFalse(TestBase.driver.findElements(By.xpath(".//*[contains(text(),'Test: No Task is created when clicking discard')]")).size()>0);
	}

	@Test(priority = 24, groups = "Member", dataProvider = "dpStatusListNotAllowToDone", dataProviderClass = TestData.class)
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

	@Test(priority = 25, groups = "Member", dataProvider = "dpStatusListNotAllowToDone", dataProviderClass = TestData.class)
	public void TM20(String status) throws InterruptedException {
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

	@Test(priority = 26, groups = "Member")
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

	@Test(priority = 27, groups = "Member")
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
		TestBase.driver.findElement(By.xpath("html/body/div[last()]/div[11]/div/button")).click();
	}

	@Test(priority = 28, groups = "Member", dataProvider = "dpNumberOfTaskWantToSelect", dataProviderClass = TestData.class)
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
			objTasksPage.setCheckboxOfNewTaskOfOneUser(TestBase.driver.findElement(By
					.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'New')] and td[contains(text(),'"
							+ GetAccountInfo.getUserFullName() + "')]][" + i + "]/th")));
			Thread.sleep(1000);
			objTasksPage.clickCheckboxOfNewTaskOfOneUser();
			Thread.sleep(1000);
		}
		objTasksPage.clickMoreButt();
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[1]/a"))
				.getText(), "Export");
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[2]/a"))
				.getText(), "Delete");
		Assert.assertEquals(TestBase.driver
				.findElement(By
						.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[3]/a"))
				.getText(), "Approve Worklogs");
	}

    @AfterMethod
	public void afterMethod(ITestResult testResult) throws Exception {
		CommonOperations.getMethodTestResult(testResult);
		CommonOperations.takePicture();
	}
    
    @AfterGroups("PM")
    public void afterGroupsPM() throws InterruptedException
    {
    	objLogout.performLogout();
    }
    @AfterGroups("Member")
    public void afterGroupsMember() throws InterruptedException
    {
    	objLogout.performLogout();
    }

	@AfterClass
	public void teardownClass() throws InterruptedException {
		objLogin = null;
	}
}
