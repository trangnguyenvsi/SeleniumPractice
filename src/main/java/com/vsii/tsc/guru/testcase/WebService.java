package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.ProjectsPageMethod;
import com.vsii.tsc.guru.pages.method.TasksPageMethod;
import com.vsii.tsc.guru.pages.method.WebServiceMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.TestBase;

public class WebService {
	LoginPageMethod objLogin;
	WebServiceMethod objService;
	ProjectsPageMethod objProject;
	TasksPageMethod objTasks;
	String username;
	String password;

	@BeforeClass
	public void setupClass() throws Exception {
		objLogin = new LoginPageMethod(TestBase.driver);
		objService = new WebServiceMethod(TestBase.driver);
		objProject = new ProjectsPageMethod(TestBase.driver);
		objTasks = new TasksPageMethod(TestBase.driver);
		objLogin.loginToManagerPage("lienlt", "12345678");
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
	 *  - Name < define>
	 *  - User <define>
	 *  - Webservice Protocol= http
	 *  - Webservice Host=< ip of JIRA>
	 *  - Webserver Post= < port of JIRA>
	 *  - WebService Path : /path/to/JIRA/issues.json? status_id=*
	 *  - Model Name :  vsii_project.vsii_JIRA_connector
	 *  - Decode Method Name: collect_project_worklog
	 *  - Authentication: Basic; Account=JIRA admin; password= JIRA password 
	 *  
	 *  Save new web service and verify if it has been created
	 */
	
	@Test(priority = 1, description = "Create new web service in OpenERP", dataProvider="W01", dataProviderClass = TestData.class)
	public void W01(String txtServiceName, String txtType, String txtProtocol,
			String txtHost, String txtPort, String txtPath, String txtDateTime, String txtAuth, String txtJusername, String txtJPassword, String txtModelName,
			String txtDecodeMethodName) throws IOException {
		// Method name
		TestBase.methodName = "W01";
		// Perform test steps
//		objService.createWebService(txtServiceName, txtType, txtProtocol, txtHost, txtPort, txtPath, txtDateTime, txtAuth, txtJusername, txtJPassword, txtModelName, txtDecodeMethodName);
		objService.clickWebServiceOption();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objService.clickCreateService();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objService.setServiceName(txtServiceName);
//		setUser(txtUser);
		objService.setType(txtType);
		objService.setProtocol(txtProtocol);
		objService.setHost(txtHost);
		objService.setPort(txtPort);
		objService.setPath(txtPath);
		objService.setDateTimeFormat(txtDateTime) ;
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
	 * Navigate to web service screen
	 * Choose a web service
	 * Open the web service
	 * Click run service
	 * 
	 * Open VSII projects module
	 * Check if there are any project from JIRA having synchronized to OpenERP
	 *  (this can be checked by looking at page source) 
	 */
	
	@Test(priority = 2, description = "Run web service and verify if JIRA project is synchronized with OpenERP", dataProvider="W02", dataProviderClass = TestData.class)
	public void W02(String projectKey, String projectName, String projectDepartment, String projectType)throws IOException {
		
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
	
	@Test(priority = 3, description = "Verify the ability of mapping imported project from JIRA with existed OpenERP project work correctly", dataProvider="W03", dataProviderClass = TestData.class)
	public void W03(String projectName, String expectedTaskKey){
		// Method name
		TestBase.methodName = "W03";
		// Perform test steps
		objService.clickVsiiProject();
		objService.clickImportedProject();
		objService.clickEditImportedProject();
		objService.setProjectName(projectName);
		objService.clickNoVerifyChkbox();
		objService.clickSaveImportedProject();
		// Verify imported info
		objProject.clickProjectLink();
		objProject.chooseDepartment();
		objProject.chooseTestProject();
		objProject.clickTaskBtn();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(objTasks.getExtkeyValue(), expectedTaskKey);
		
	}
	
	@Test(priority = 4, description = "Verify importing JIRA project to OpenERP project work correctly")
	public void W04(){
		// Method name
		TestBase.methodName = "W04";

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
		
		// Verify test result
//		System.out.println(objTasks.getWorklogDetail());
		Assert.assertEquals(actual, expected);
	}
}
