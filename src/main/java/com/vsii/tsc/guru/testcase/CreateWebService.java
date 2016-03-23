package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.method.CreateWebServiceMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.TestBase;

public class CreateWebService {
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
	
	
	@Test(priority = 1, description = "Create new web service in OpenERP", dataProvider="newService", dataProviderClass = TestData.class)
	public void W01(String txtServiceName, String txtType, String txtProtocol,
			String txtHost, String txtPort, String txtPath, String txtDateTime, String txtAuth, String txtJusername, String txtJPassword, String txtModelName,
			String txtDecodeMethodName) throws IOException {
		// Method name
		TestBase.methodName = "W01";

		// Perform test steps
		objCreateService.createWebService(txtServiceName, txtType, txtProtocol, txtHost, txtPort, txtPath, txtDateTime, txtAuth, txtJusername, txtJPassword, txtModelName, txtDecodeMethodName);
		// Verify test result
		Assert.assertTrue(TestBase.driver.getCurrentUrl().contains("http://192.168.0.21:8069/?db=VSIIERPdemo#id"));
	}
}
