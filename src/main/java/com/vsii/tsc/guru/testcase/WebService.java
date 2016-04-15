package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.method.JiraBrowseProjectPageMethod;
import com.vsii.tsc.guru.pages.method.JiraDashBoardMethod;
import com.vsii.tsc.guru.pages.method.JiraLoginPageMethod;
import com.vsii.tsc.guru.pages.method.JiraProjectDetailsPageMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.ProjectCreateNewMethod;
import com.vsii.tsc.guru.pages.method.ProjectsPageMethod;
import com.vsii.tsc.guru.pages.method.TasksPageMethod;
import com.vsii.tsc.guru.pages.method.VSIIProjectPageMethod;
import com.vsii.tsc.guru.pages.method.WebServiceMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
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
	ProjectCreateNewMethod objCreateProjectMethod;
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
		objCreateProjectMethod = new ProjectCreateNewMethod(TestBase.driver);
		Thread.sleep(1000);
		objService.clickProjectMenu();

	}
	
	@Test(priority = 0, dataProvider = "createProject", dataProviderClass = TestData.class)
	public void createERPProject(String projectName, String approvedEffort, String projectType, String commDetails,String PMacc, String PMPass) throws InterruptedException{
		
		// Verify if an empty OpenERP project has been created or not
		// If not, create a new one
		objProject.clickProjectLink();
		Thread.sleep(1000);
		objProject.chooseDepartment();
		String xpath="//td[@data-field='name' and contains(text(),'"+projectName+"')]";
		int size = TestBase.driver.findElements(By.xpath(xpath)).size();
		if(size>0){
			System.out.println("A project named "+projectName+" has already been created! No need to create a new one.");
		}else{
			//Create a new project
			objService.clickProjectMenu();
	        Thread.sleep(1000);
	        CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
	        Thread.sleep(1000);
	        objCreateProjectMethod.clickCreatebtn();
	        Thread.sleep(500);
	        objCreateProjectMethod.createProject(projectName, approvedEffort,projectType, commDetails );
			// Approving Project
	        Thread.sleep(3000);
			objLogin.loginToManagerPage(PMacc, PMPass);
			objService.clickProjectMenuPM();
			objProject.clickProjectLink();
			objCreateProjectMethod.closeOpenOption();
			objProject.chooseDepartment();
			TestBase.driver.findElement(By.xpath(xpath)).click();
			objCreateProjectMethod.clickApprove();
			objCreateProjectMethod.clickCurrentUser();
			objCreateProjectMethod.clickLogout();
			objLogin.loginToManagerPage("lienlt", "12345678");
		}

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
		objService.clickProjectMenu();
		objService.clickWebServiceOption();
        CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
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
	
	@Test(priority = 2, description = "Run web service and verify if JIRA project is synchronized with OpenERP", dataProvider = "W02", dataProviderClass = TestData.class)
	public void W02(String projectKey, String projectName, String projectDepartment, String projectType)
			throws IOException, InterruptedException {

		// Method name
		TestBase.methodName = "W02";

		// Perform test steps
		objService.clickProjectMenu();
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
	public void W03(String projectKey, String projectName, String projectDepartment, String projectType) throws InterruptedException {
		// Method name
		TestBase.methodName = "W03";
		
		// Perform test steps
		objService.clickProjectMenu();
		objService.clickVsiiProject();
		objService.clickImportedProject();
		objVSIIProject.clickEditImportedProject();
		objVSIIProject.setProjectName(projectName);
		objVSIIProject.clickNoVerifyChkbox();
		objVSIIProject.clickSaveImportedProject();
		objService.getProjectKey();
		objService.getProjectName();
		objService.getProjectDepartment();
		objService.getProjectProject();
		objService.getProjectType();

		Assert.assertEquals(objService.getProjectKey(), projectKey);
		Assert.assertEquals(objService.getProjectName(), projectName);
		Assert.assertEquals(objService.getProjectDepartment(), projectDepartment);
		Assert.assertEquals(objService.getProjectProject(), projectName);
		Assert.assertEquals(objService.getProjectType(), projectType);

	}

	@Test(priority = 4, description = "Verify importing JIRA project to OpenERP project work correctly", dataProvider = "W04", dataProviderClass = TestData.class)
	public void W04(String projectName, String timeSpent, String doneBy) throws InterruptedException {
		// Method name
		TestBase.methodName = "W04";

		// Perform test steps
		objService.clickProjectMenu();
		objService.clickWebServiceOption();
		Thread.sleep(2000);
		objService.clickChooseService();
		objService.clickRunningService();
		objService.clickVsiiProject();
		objService.clickImportedProject();

		objProject.clickProjectLink();
		objProject.chooseDepartment();
		String xpath="//td[@data-field='name' and contains(text(),'"+projectName+"')]";
		TestBase.driver.findElement(By.xpath(xpath)).click();
		objProject.clickTaskBtn();
		Thread.sleep(3000);
		objTasks.clickLatestTask();

		// Verify test result
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpent);
		Assert.assertEquals(objTasks.getDoneBy(), doneBy);
	}

	@Test(priority = 5, description = "Verify that when add new worklog in JIRA project webservice importing work correctly", dataProvider = "W05", dataProviderClass = TestData.class)
	public void W05(String jiraBaseUrl, String username, String password, String projectName, String timeSpent,
			String timeSpentOnERP, String doneByOnERP) throws InterruptedException {

		// Method name
		TestBase.methodName = "W05";

		// Perform adding new worklog
		TestBase.driver.get(jiraBaseUrl);
		objJiraLogin.Login(username, password);
		objJiraDashboard.clickProjectDropdownMenu();
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		objService.clickWebServiceOption();
		objService.clickChooseService();
		objService.clickRunningService();
		
		// Verify
		objProject.clickProjectLink();
		objProject.chooseDepartment();
		String xpath="//td[@data-field='name' and contains(text(),'"+projectName+"')]";
		TestBase.driver.findElement(By.xpath(xpath)).click();
		objProject.clickTaskBtn();
		objTasks.clickLatestTask();
		Thread.sleep(500);
		
		// Verify test result
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpentOnERP);
		Assert.assertEquals(objTasks.getDoneBy(), doneByOnERP);

	}

	@Test(priority = 6, description = "Verify that when add new worklog in JIRA project webservice importing work correctly", dataProvider = "W06", dataProviderClass = TestData.class)
	public void W06(String jiraBaseUrl, String username, String password, String projectName, String timeSpent, String timeSpentOnERP,
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		objProject.chooseDepartment();
		Thread.sleep(1000);
		String xpath="//td[@data-field='name' and contains(text(),'"+projectName+"')]";
		TestBase.driver.findElement(By.xpath(xpath)).click();
		objProject.clickTaskBtn();
		objTasks.clickLatestTask();
		Thread.sleep(500);
		
		// Verify test result
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpentOnERP);
		Assert.assertEquals(objTasks.getDoneBy(), doneByOnERP);

	}

	@Test(priority = 7, description = "Verify that when add new worklog in JIRA project webservice importing work correctly", dataProvider = "W07", dataProviderClass = TestData.class)
	public void W07(String jiraBaseUrl, String username, String password, String projectName, String timeSpentOnERP, String doneByOnERP) throws InterruptedException {

		// Method name
		TestBase.methodName = "W07";

		// Perform adding new worklog
		TestBase.driver.get(jiraBaseUrl);
		objJiraDashboard.exeLogOut();
		TestBase.driver.get(jiraBaseUrl);
		objJiraLogin.Login(username, password);
		Thread.sleep(1000);
		objJiraDashboard.clickProjectDropdownMenu();
		Thread.sleep(1000);
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
		String xpath="//td[@data-field='name' and contains(text(),'"+projectName+"')]";
		TestBase.driver.findElement(By.xpath(xpath)).click();
		objProject.clickTaskBtn();
		Thread.sleep(500);
		objTasks.clickLatestTask();
		Thread.sleep(500);

		// Verify test result
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpentOnERP);
		Assert.assertEquals(objTasks.getDoneBy(), doneByOnERP);

	}

	@AfterMethod
	 public void afterMethod(ITestResult testResult) throws Exception {
	  CommonOperations.getMethodTestResult(testResult);
	  CommonOperations.takePicture();
	}
}
