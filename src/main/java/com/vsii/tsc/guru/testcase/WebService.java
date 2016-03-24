package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.method.CreateWebServiceMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.TestBase;

public class WebService {
	LoginPageMethod objLogin;
	CreateWebServiceMethod objCreateService;
	String username;
	String password;

	@BeforeClass
	public void setupClass() throws Exception {
		objLogin = new LoginPageMethod(TestBase.driver);
		objCreateService = new CreateWebServiceMethod(TestBase.driver);
		objLogin.loginToManagerPage("lienlt", "12345678");
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
	
	@Test(priority = 1, description = "Create new web service in OpenERP", dataProvider="newService", dataProviderClass = TestData.class)
	public void W01(String txtServiceName, String txtType, String txtProtocol,
			String txtHost, String txtPort, String txtPath, String txtDateTime, String txtAuth, String txtJusername, String txtJPassword, String txtModelName,
			String txtDecodeMethodName) throws IOException {
		// Method name
		TestBase.methodName = "W01";

		// Perform test steps
		objCreateService.createWebService(txtServiceName, txtType, txtProtocol, txtHost, txtPort, txtPath, txtDateTime, txtAuth, txtJusername, txtJPassword, txtModelName, txtDecodeMethodName);
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
	
	@Test(priority = 2, description = "Run web service and verify if JIRA project is synchronized with OpenERP")
	public void W02(){
		
	}
}