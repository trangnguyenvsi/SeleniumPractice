
/*
 * 	Check if JIRA project is existed
 * 		if(yes){
 * 			Click on the first project
 * 			Get projectName, projectKey and store in variables
 * 			Check if any task has been created
 * 			if(yes){
 * 				Click on the first task
 * 				Get taskName and timeSpent, stored in variables
 * 						=>> Perform integration in OpenERP
 * 				else{
 * 					Create worklog with given info from DataProvider
 * 						=>> Perform integration in OpenERP
 * 					}
 * 			else{
 * 				Create new task
 * 				Create new worklog with given info from DataProvider
 * 						=>> Perform integration in OpenERP
 * 			}
 * 		else{
 * 			Create new project
 * 			Create new task
 * 			Create new worklog with given info from DataProvider
 * 						=>> Perform integration in OpenERP
 * 	}  
 */



package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
	ProjectCreateNewMethod objErpProject;
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
		objErpProject = new ProjectCreateNewMethod(TestBase.driver);
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
	 * Name < define>
	 * User <define>
	 * Webservice Protocol= http
	 * Webservice Host=< ip of JIRA>
	 * Webserver Port= < port of JIRA>
	 * WebService Path: /path/to/JIRA/issues.json? status_id=*
	 * Model Name: vsii_project.vsii_JIRA_connector
	 * Decode Method Name: collect_project_worklog
	 * Authentication: Basic; 
	 * Account=JIRA admin;
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
	public void W03(String projectName, String approvedEffort, String projectType, String commDetails, String expectedTaskKey) throws InterruptedException {
		// Method name
		TestBase.methodName = "W03";
		
		// Verify if an empty OpenERP project has been created		
		objProject.clickProjectLink();
		Thread.sleep(1000);
		objProject.chooseDepartment();
		String xpath="//td[@data-field='name' and contains(text(),'"+projectName+"')]";
		int size = TestBase.driver.findElements(By.xpath(xpath)).size();
		if(size>0){
			// Perform test steps
			objService.clickVsiiProject();
			objService.clickImportedProject();
			objVSIIProject.clickEditImportedProject();
			objVSIIProject.setProjectName(projectName);
			objVSIIProject.clickNoVerifyChkbox();
			objVSIIProject.clickSaveImportedProject();
		}else{
			// if required project is not exist, create a new one
			objErpProject.createProject(projectName, approvedEffort, projectType, commDetails);
			// Perform test steps
			objService.clickVsiiProject();
			objService.clickImportedProject();
			objVSIIProject.clickEditImportedProject();
			objVSIIProject.setProjectName(projectName);
			objVSIIProject.clickNoVerifyChkbox();
			objVSIIProject.clickSaveImportedProject();
		}
		
		// Verify imported info
		objProject.clickProjectLink();
		objProject.chooseDepartment();
		objProject.chooseTestProject();
		objProject.clickTaskBtn();
		Thread.sleep(1000);
		Assert.assertEquals(objTasks.getExtkeyValue(), expectedTaskKey);

	}

	
	/*
	 * 1. Check if JIRA project is imported successfully in to VSIIProject
	 * if (yes){
	 * 		Run service and verify result
	 * 		} else {
	 * 			Check if the required empty OpenERP project has been created
	 * 			if (yes) {
	 * 				Edit VSIIProject to map the newly created one with the imported one
	 * 				Run service and verify result
	 * 			}else{
	 * 			Create new project
	 * 			Edit VSIIProject to map the newly created one with the imported one
	 * 			Run service and verify result
	 * 		}
	 */
	@Test(priority = 4, description = "Verify importing JIRA project to OpenERP project work correctly", dataProvider = "W04", dataProviderClass = TestData.class)
	public void W04(String projectName, String approvedEffort, String projectType, String commDetails, String timeSpent, String doneBy) throws InterruptedException {
		// Method name
		TestBase.methodName = "W04";

		//Check if JIRA project is imported successfully in to VSIIProject
		objService.clickVsiiProject();
//		objService.clickImportedProject();
		String xpath2="//td[@data-field='project_id' and contains(text(),'"+projectName+"')]";
		int size2 = TestBase.driver.findElements(By.xpath(xpath2)).size();
		if(size2>0){
			// Perform test steps
			objService.clickWebServiceOption();
			objService.clickChooseService();
			objService.clickRunningService();
		}else{
			objProject.clickProjectLink();
			Thread.sleep(1000);
			objProject.chooseDepartment();
			String xpath="//td[@data-field='name' and contains(text(),'"+projectName+"')]";
			int size = TestBase.driver.findElements(By.xpath(xpath)).size();
			if(size>0){
				//Edit imported project in Project/VSIIProject 
				objService.clickVsiiProject();
				objService.clickImportedProject();
				objVSIIProject.clickEditImportedProject();
				objVSIIProject.setProjectName(projectName);
				objVSIIProject.clickNoVerifyChkbox();
				objVSIIProject.clickSaveImportedProject();
				
				// Run service 
				objService.clickWebServiceOption();
				objService.clickChooseService();
				objService.clickRunningService();
				
			}else{
				// if required project is not exist, create a new one
				objErpProject.createProject(projectName, approvedEffort, projectType, commDetails);
				
				//Edit imported project in Project/VSIIProject 
				objService.clickVsiiProject();
				objService.clickImportedProject();
				objVSIIProject.clickEditImportedProject();
				objVSIIProject.setProjectName(projectName);
				objVSIIProject.clickNoVerifyChkbox();
				objVSIIProject.clickSaveImportedProject();
				
				// Run service 
				objService.clickWebServiceOption();
				objService.clickChooseService();
				objService.clickRunningService();
				
			}
		}
		
		// Verify test result
		objProject.clickProjectLink();	// Click on Project section in left side-bar
		objProject.chooseDepartment();
		objProject.chooseTestProject();
		objProject.clickTaskBtn();
		objTasks.clickLatestTask();
		Assert.assertEquals(objTasks.getTimeSpent(), timeSpent);
		Assert.assertEquals(objTasks.getDoneBy(), doneBy);
	}
	
	/*
	 * Check if JIRA project is existed 
	 * if(yes){
	 * 		Check if Execute Test task has been created
	 * 		if(yes){
	 * 			Check if any worklog has been recorded on the task
	 * 			if((yes){
	 * 				
	 * 				} 
	 * 			}
	 * 
	 * 		}
	 */

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
		Thread.sleep(500);
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




