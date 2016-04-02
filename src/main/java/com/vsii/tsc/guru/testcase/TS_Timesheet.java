package com.vsii.tsc.guru.testcase;

import java.io.IOException;
import java.text.ParseException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.TS_CurrentTSMethod;
import com.vsii.tsc.guru.pages.method.TS_DepartmentTSMethod;
import com.vsii.tsc.guru.pages.method.TS_HRPageMethod;
import com.vsii.tsc.guru.pages.method.TS_MainPageMethod;
import com.vsii.tsc.guru.pages.method.TS_PMOViewMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class TS_Timesheet extends TestBase {
	Properties p;
	LoginPageMethod objLogin;
	TS_MainPageMethod objMainPage;
	TS_HRPageMethod objHRPage;
	TS_CurrentTSMethod objCurTS;
	TS_DepartmentTSMethod objDeptTS;
	TS_PMOViewMethod objPMO;

	@BeforeTest
	public void beforeTest() throws IOException {
		p = CommonOperations.readTSConfig();
		objLogin = new LoginPageMethod(driver);
		objMainPage = new TS_MainPageMethod(driver);
		objHRPage = new TS_HRPageMethod(driver);
		objCurTS = new TS_CurrentTSMethod(driver);
		objDeptTS = new TS_DepartmentTSMethod(driver);
		objPMO = new TS_PMOViewMethod(driver);
	}

	@Test(priority = 0, description = "Verify My Timesheet display correctly", dataProvider = "dpLogin_TS", dataProviderClass = TestData.class)
	public void TS01(String username, String password) throws InterruptedException, IOException {
		Thread.sleep(5000);
		objLogin.loginToManagerPage(username, password);
		Thread.sleep(5000);
		objMainPage.clickHR();
		objHRPage.clickMyTimesheet();
		boolean isMatch = objHRPage.compareTitle();
		Assert.assertTrue(isMatch);
	}

	@Test(priority = 1, description = "Verify My Current Timesheet display correctly")
	public void TS02() throws InterruptedException {
		objCurTS.clickMyCurTimesheet();
		boolean isExist = objCurTS.getTSTable();
		Assert.assertTrue(isExist);
	}
	
	@Test(priority = 2, description = "Verify Department Timesheet display correctly")
	public void TS03() throws InterruptedException, ParseException {
		objDeptTS.clickDepartmentTS();
		boolean isTitle = objDeptTS.compareTitle();
		Assert.assertTrue(isTitle);
		boolean isMatch = objDeptTS.getTSMonth();
		Assert.assertTrue(isMatch);
		objDeptTS.clickMonthTS();
		boolean isStatus = objDeptTS.getTSStatus();
		Assert.assertTrue(isStatus);	
		
		objMainPage.clickDrpDwnMenu();
		objMainPage.clickLogout();		
	}
	
	@Test(priority = 3, description = "Verify PMO view display correctly", dataProvider="dp_PMOLoginTS", dataProviderClass=TestData.class)
	public void TS04(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		objLogin.loginToManagerPage(username, password);
		objMainPage.clickHRPMO();
		objPMO.clickPMOView();
		boolean isMatch = objPMO.compareTitle();
		Assert.assertTrue(isMatch);
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
//		driver.close();
	}
}
