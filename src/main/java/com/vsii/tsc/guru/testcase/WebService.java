package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.method.JiraBrowseProjectPageMethod;
import com.vsii.tsc.guru.pages.method.JiraDashBoardMethod;
import com.vsii.tsc.guru.pages.method.JiraLoginPageMethod;
import com.vsii.tsc.guru.pages.method.JiraProjectDetailsPageMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.ProjectsPageMethod;
import com.vsii.tsc.guru.pages.method.TasksPageMethod;
import com.vsii.tsc.guru.pages.method.VSIIProjectPageMethod;
import com.vsii.tsc.guru.pages.method.WebServiceMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.TestBase;

public class WebService {
	LoginPageMethod objLogin;
	WebServiceMethod objService;
	ProjectsPageMethod objProject;
	TasksPageMethod objTasks;
	JiraLoginPageMethod objJiraLogin;
	JiraDashBoardMethod objJiraDashboard;
	JiraProjectDetailsPageMethod objJiraProjectDetail;
	JiraBrowseProjectPageMethod objJiraBrowseProject;
	VSIIProjectPageMethod objVSIIProject;
	String username;
	String password;

	@BeforeClass
	public void setupClass() throws Exception {
		objLogin = new LoginPageMethod(TestBase.driver);
		objService = new WebServiceMethod(TestBase.driver);
		objProject = new ProjectsPageMethod(TestBase.driver);
		objTasks = new TasksPageMethod(TestBase.driver);
		objLogin.loginToManagerPage("lienlt", "12345678");
		objJiraLogin = new JiraLoginPageMethod(TestBase.driver);
		objJiraDashboard = new JiraDashBoardMethod(TestBase.driver);
		objJiraProjectDetail = new JiraProjectDetailsPageMethod(TestBase.driver);
		objJiraBrowseProject = new JiraBrowseProjectPageMethod(TestBase.driver);
		objVSIIProject = new VSIIProjectPageMethod(TestBase.driver);
		objService.clickProjectMenu();

	}

	/*
	 * Open webDriver
	 * 
	 * Navigate to Project module
	 * 
	 * Select Webservice
	 * 
	 * Create new web service with the following info:
	 * 
	 * - Name < define> - User <define> - Webservice Protocol= http - Webservice
	 * Host=< ip of JIRA> - Webserver Post= < port of JIRA> - WebService Path :
	 * /path/to/JIRA/issues.json? status_id=* - Model Name :
	 * vsii_project.vsii_JIRA_connector - Decode Method Name:
	 * collect_project_worklog - Authentication: Basic; Account=JIRA admin;
	 * password= JIRA password
	 * 
	 * Save new web service and verify if it has been created
	 */

	@Test(priority = 1, description = "Create new web service in OpenERP", dataProvider = "W01", dataProviderClass = TestData.class)
	public void W01(String txtServiceName, String txtType, String txtProtocol, String txtHost, String txtPort,
			String txtPath, String txtDateTime, String txtAuth, String txtJusername, String txtJPassword,
			String txtModelName, String txtDecodeMethodName) throws IOException, InterruptedException {
		// Method name
		TestBase.methodName = "W01";
		
		// Perform test steps
		objService.clickWebServiceOption();
		Thread.sleep(100);
		objService.clickCreateService();
		objService.setServiceName(txtServiceName);
		objService.setType(txtType);
		objService.setProtocol(txtProtocol);
		objService.setHost(txtHost);
		objService.setPort(txtPort);
		objService.setPath(txtPath);
		objService.setDateTimeFormat(txtDateTime);
		objService.setAuthMethod(txtAuth);
		objService.setJiraUsername(txtJusername);
		objService.setJiraPassword(txtJPassword);
		objService.setModelName(txtModelName);
		objService.setDecodeMethod(txtDecodeMethodName);
		objService.clickSave();
		
		// Verify test result
		Assert.assertTrue(TestBase.driver.getCurrentUrl().contains("id"));
	}

	/*
	 * Navigate to web service screen Choose a web service Open the web service
	 * Click run service
	 * 
	 * Open VSII projects module Check if there are any project from JIRA having
	 * synchronized to OpenERP (this can be checked by looking at page source)
	 */

	@Test(priority = 2, description = "Run web service and verify if JIRA project is synchronized with OpenERP", dataProvider = "W02", dataProviderClass = TestData.class)
	public void W02(String projectKey, String projectName, String projectDepartment, String projectType)
			throws IOException, InterruptedException {

		// Method name
		TestBase.methodName = "W02";

		// Perform test steps
		objService.clickWebServiceOption();
		objService.clickChooseService();
		objService.clickRunningService();
		objService.clickVsiiProject();
		objService.clickImportedProject();
		objService.getProjectKey();
		objService.getProjectName();
		objService.getProjectDepartment();
		objService.getProjectProject();
		objService.getProjectType();

		Assert.assertEquals(objService.getProjectKey(), projectKey);
		Assert.assertEquals(objService.getProjectName(), projectName);
		Assert.assertEquals(objService.getProjectDepartment(), projectDepartment);
		Assert.assertEquals(objService.getProjectProject(), "");
		Assert.assertEquals(objService.getProjectType(), projectType);
	}

	/*
	 * 
	 */

	@Test(priority = 3, description = "Verify the ability of mapping imported project from JIRA with existed OpenERP project work correctly", dataProvider = "W03", dataProviderClass = TestData.class)
	public void W03(String projectName, String expectedTaskKey) throws InterruptedException {
		// Method name
		TestBase.methodName = "W03";
		
		// Perform test steps
		objService.clickVsiiProject();
		objService.clickImportedProject();
		objVSIIProject.clickEditImportedProject();
		objVSIIProject.setProjectName(projectName);
		objVSIIProject.clickNoVerifyChkbox();
		objVSIIProject.clickSaveImportedProject();
		
		// Verify imported info
		objProject.clickProjectLink();
		objProject.chooseDepartment();
		objProject.chooseTestProject();
		objProject.clickTaskBtn();
		Thread.sleep(1000);
		Assert.assertEquals(objTasks.getExtkeyValue(), expectedTaskKey);

	}

	@Test(priority = 4, description = "Verify importing JIRA project to OpenERP project work correctly", dataProvider = "W04", dataProviderClass = TestData.class)
	public void W04(String timeSpent, String doneBy) throws InterruptedException {
		// Method name
		TestBase.methodName = "W04";

		// Perform test steps
		objService.clickWebServiceOption();
		objService.clickChooseService();
		objService.clickRunningService();
		objService.clickVsiiProject();
		objService.clickImportedProject();

		objProject.clickProjectLink();
		objProject.chooseDepartment();
		objProject.chooseTestProject();
		objProject.clickTaskBtn();

		objTasks.clickLatestTask();

		// Verify test result
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpent);
		Assert.assertEquals(objTasks.getDoneBy(), doneBy);
	}

	@Test(priority = 5, description = "Verify that when add new worklog in JIRA project webservice importing work correctly", dataProvider = "W05", dataProviderClass = TestData.class)
	public void W05(String jiraBaseUrl, String username, String password, String timeSpent, String startTime,
			String timeSpentOnERP, String doneByOnERP) throws InterruptedException {

		// Method name
		TestBase.methodName = "W05";

		// Perform adding new worklog
		TestBase.driver.get(jiraBaseUrl);
		objJiraLogin.Login(username, password);
		objJiraDashboard.clickProjectDropdownMenu();
		objJiraDashboard.clickAllProjects();

		objJiraBrowseProject.clickChooseProject();
		objJiraProjectDetail.clickChooseTask();
		objJiraProjectDetail.clickOnMore();
		objJiraProjectDetail.addWorklogOption();
		objJiraProjectDetail.setTimeSpent(timeSpent);
		objJiraProjectDetail.clickSubmitWorklog();
		
		// Run service to update info
		TestBase.driver.get(TestBase.p.getProperty("baseUrl"));
		objService.clickProjectMenu();
		objService.clickWebServiceOption();
		objService.clickChooseService();
		objService.clickRunningService();
		
		// Verify
		objProject.clickProjectLink();
		objProject.chooseDepartment();
		objProject.chooseTestProject();
		objProject.clickTaskBtn();
		objTasks.clickLatestTask();
		Thread.sleep(500);
		
		// Verify test result
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpentOnERP);
		Assert.assertEquals(objTasks.getDoneBy(), doneByOnERP);

	}

	@Test(priority = 6, description = "Verify that when add new worklog in JIRA project webservice importing work correctly", dataProvider = "W06", dataProviderClass = TestData.class)
	public void W06(String jiraBaseUrl, String username, String password, String timeSpent, String timeSpentOnERP,
			String doneByOnERP) throws InterruptedException {

		// Method name
		TestBase.methodName = "W06";

		// Perform adding new worklog
		TestBase.driver.get(jiraBaseUrl);
		objJiraDashboard.exeLogOut();
		TestBase.driver.get(jiraBaseUrl);
		objJiraLogin.Login(username, password);
		objJiraDashboard.clickProjectDropdownMenu();
		objJiraDashboard.clickAllProjects();

		objJiraBrowseProject.clickChooseProject();
		objJiraProjectDetail.clickChooseTask();
		objJiraProjectDetail.clickOnMore();
		objJiraProjectDetail.addWorklogOption();
		objJiraProjectDetail.setTimeSpent(timeSpent);
		objJiraProjectDetail.clickSubmitWorklog();

		// Run service to update info
		TestBase.driver.get(TestBase.p.getProperty("baseUrl"));
		objService.clickProjectMenu();
		objService.clickWebServiceOption();
		objService.clickChooseService();
		objService.clickRunningService();

		// Verify
		objProject.clickProjectLink();
		Thread.sleep(500);
		objProject.chooseDepartment();
		objProject.chooseTestProject();
		objProject.clickTaskBtn();
		objTasks.clickLatestTask();
		Thread.sleep(500);
		
		// Verify test result
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpentOnERP);
		Assert.assertEquals(objTasks.getDoneBy(), doneByOnERP);

	}

	@Test(priority = 7, description = "Verify that when add new worklog in JIRA project webservice importing work correctly", dataProvider = "W07", dataProviderClass = TestData.class)
	public void W07(String jiraBaseUrl, String username, String password, String timeSpentOnERP, String doneByOnERP) throws InterruptedException {

		// Method name
		TestBase.methodName = "W07";

		// Perform adding new worklog
		TestBase.driver.get(jiraBaseUrl);
		objJiraDashboard.exeLogOut();
		TestBase.driver.get(jiraBaseUrl);
		objJiraLogin.Login(username, password);
		objJiraDashboard.clickProjectDropdownMenu();
		objJiraDashboard.clickAllProjects();

		objJiraBrowseProject.clickChooseProject();
		objJiraProjectDetail.clickChooseTask();
		objJiraProjectDetail.clickWorklogTab();
		objJiraProjectDetail.clickDeleteWorklogOption();
		objJiraProjectDetail.submitDeleteWorklog();

		// Run service to update info
		TestBase.driver.get(TestBase.p.getProperty("baseUrl"));
		objService.clickProjectMenu();
		objService.clickWebServiceOption();
		objService.clickChooseService();
		objService.clickRunningService();

		// Verify
		objProject.clickProjectLink();
		objProject.chooseDepartment();
		objProject.chooseTestProject();
		objProject.clickTaskBtn();
		Thread.sleep(500);
		objTasks.clickLatestTask();
		Thread.sleep(500);

		// Verify test result
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpentOnERP);
		Assert.assertEquals(objTasks.getDoneBy(), doneByOnERP);

	}

}
