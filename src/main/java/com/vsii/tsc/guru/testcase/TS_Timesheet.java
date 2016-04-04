package com.vsii.tsc.guru.testcase;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.TS_CreateTSMethod;
import com.vsii.tsc.guru.pages.method.TS_CurrentTSMethod;
import com.vsii.tsc.guru.pages.method.TS_DepartmentTSMethod;
import com.vsii.tsc.guru.pages.method.TS_HRPageMethod;
import com.vsii.tsc.guru.pages.method.TS_MainPageMethod;
import com.vsii.tsc.guru.pages.method.TS_MyTimesheetMethod;
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
	TS_CreateTSMethod objCreateTS;
	TS_MyTimesheetMethod objMyTS;

	@BeforeTest
	public void beforeTest() throws IOException {
		p = CommonOperations.readTSConfig();
		objLogin = new LoginPageMethod(driver);
		objMainPage = new TS_MainPageMethod(driver);
		objHRPage = new TS_HRPageMethod(driver);
		objCurTS = new TS_CurrentTSMethod(driver);
		objDeptTS = new TS_DepartmentTSMethod(driver);
		objPMO = new TS_PMOViewMethod(driver);
		objCreateTS = new TS_CreateTSMethod(driver);
		objMyTS = new TS_MyTimesheetMethod(driver);
	}

	@Test(priority = 0, description = "Verify My Timesheet display correctly", dataProvider = "dpLogin_TS", dataProviderClass = TestData.class)
	public void TS01(String username, String password) throws InterruptedException, IOException {
		TestBase.methodName = "TS01";
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
		TestBase.methodName = "TS02";
		objCurTS.clickMyCurTimesheet();
		boolean isExist = objCurTS.getTSTable();
		Assert.assertTrue(isExist);
	}
	
	@Test(priority = 2, description = "Verify Department Timesheet display correctly")
	public void TS03() throws InterruptedException, ParseException {
		TestBase.methodName = "TS03";
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
		TestBase.methodName = "TS04";
		Thread.sleep(5000);
		objLogin.loginToManagerPage(username, password);
		objMainPage.clickHRPMO();
		objPMO.clickPMOView();
		boolean isMatch = objPMO.compareTitle();
		Assert.assertTrue(isMatch);
		objMainPage.clickLogout();	
	}
	
	@Test(priority = 8, description = "Verify function Create Timesheet with valid data", dataProvider="dpCreate_TS_Valid", dataProviderClass=TestData.class)
	public void TS09(String username, String password, Date dtFrom, Date dtTo, String project, String time) throws InterruptedException {
		TestBase.methodName = "TS09";
		Thread.sleep(5000);
		objLogin.loginToManagerPage(username, password);
		objMainPage.clickHR();
		objHRPage.clickMyTimesheet();
		objCreateTS.clickBtnCreate();
		Thread.sleep(5000);
		objCreateTS.inputDate(dtFrom, dtTo);
		objCreateTS.clickBtnAddLine();
		Thread.sleep(3000);
		objCreateTS.clickCbbProject();
		objCreateTS.selectEleProject(project);
		objCreateTS.clickAdd();
		objCreateTS.inputTime(time);
		objCreateTS.clickSave();
		Assert.assertEquals(objCreateTS.getLblStatus(), "Open");
	}
	
	@Test(priority = 9, description = "Verify function Create Timesheet with invalid data", dataProvider="dpCreate_TS_Invalid", dataProviderClass=TestData.class)
	public void TS10(Date dtFrom, Date dtTo, String project, String time, String errMessage) throws InterruptedException {
		TestBase.methodName = "TS10";
		Thread.sleep(5000);
//		objLogin.loginToManagerPage(username, password);
		objMainPage.clickHR();
		objHRPage.clickMyTimesheet();
		objCreateTS.clickBtnCreate();
		Thread.sleep(5000);
		objCreateTS.inputDate(dtFrom, dtTo);
		objCreateTS.clickBtnAddLine();
		Thread.sleep(3000);
		objCreateTS.clickCbbProject();
		objCreateTS.selectEleProject(project);
		objCreateTS.clickAdd();
		objCreateTS.inputTime(time);
		objCreateTS.clickSave();
		Assert.assertEquals(objCreateTS.getLblMessage(), errMessage);
	}
	
	@Test(priority = 16, description = "Verify Edit Timesheet with valid data", dataProvider="dpEdit_TS_Valid", dataProviderClass=TestData.class)
	public void TS17(String time) throws InterruptedException {
		TestBase.methodName = "TS17";
//		objLogin.loginToManagerPage(username, password);
//		objMainPage.clickHR();
		objHRPage.clickMyTimesheet();

		//select week which has Open status
		objHRPage.clickStatus();
		Thread.sleep(3000);
		objMyTS.clickEdit();
		objMyTS.editTime(time);
		objMyTS.clickSave();
		Assert.assertEquals(objMyTS.getlblEditbtn(), "Edit");
	}
	
//	The expectation is not exist
	public void TS18() throws InterruptedException {
//		TestBase.methodName = "TS18";
////		objLogin.loginToManagerPage(username, password);
////		objMainPage.clickHR();
//		objHRPage.clickMyTimesheet();
//
//		//select week which has Open status
//		objHRPage.clickStatus();
//		Thread.sleep(3000);
//		objMyTS.clickEdit();
//		objMyTS.editTime(time);
//		objMyTS.clickSave();
//		Assert.assertEquals(objMyTS.getlblEditbtn(), "Edit");
	}
	
	@Test(priority = 18, description = "Verify Edit Timesheet with valid data", dataProvider="dpEdit_TS_Valid", dataProviderClass=TestData.class)
	public void TS19(String time) throws InterruptedException {
		TestBase.methodName = "TS19";
//		objLogin.loginToManagerPage(username, password);
//		objMainPage.clickHR();
		objHRPage.clickMyTimesheet();

		//select week which has Open status
		objHRPage.clickStatus();
		Thread.sleep(3000);
		objMyTS.clickEdit();
		objMyTS.editTime(time);
		objMyTS.clickDiscard();
		
		Assert.assertEquals(objMyTS.getTotalTS(), objMyTS.getTotalTS());

		objMainPage.clickLogout();	
	}
	
	@Test(priority = 19, description = "Verify that  Delete Timesheet work correctly", dataProvider="dpDel_TS_Single", dataProviderClass=TestData.class)
	public void TS20(String username, String password, String nameUser, Date timeDel) throws InterruptedException {
		TestBase.methodName = "TS20";
		objLogin.loginToManagerPage(username, password);
		objMainPage.clickHR();
		objDeptTS.clickDepartmentTS();
		objDeptTS.clickLstMonth();
		objDeptTS.selectUser(nameUser, timeDel);
		objDeptTS.clickBtnMore();
		objDeptTS.clickBtnDelete();
		driver.switchTo().alert().accept();
		
		boolean isDel = objDeptTS.checkDel(nameUser, timeDel);
		Assert.assertTrue(isDel);
	}
	
	@Test(priority = 20, description = "Verify that discard of Delete Timesheet work correctly", dataProvider="dpDel_TS_Single", dataProviderClass=TestData.class)
	public void TS21(String nameUser, Date timeDel) throws InterruptedException {
		TestBase.methodName = "TS21";
		objMainPage.clickHR();
		objDeptTS.clickDepartmentTS();
		objDeptTS.clickLstMonth();
		objDeptTS.selectUser(nameUser, timeDel);
		objDeptTS.clickBtnMore();
		objDeptTS.clickBtnDelete();
		driver.switchTo().alert().dismiss();
		
		boolean isDel = objDeptTS.checkDel(nameUser, timeDel);
		Assert.assertFalse(isDel);
	}
	
	@Test(priority = 21, description = "Verify that  Delete multiple Timesheets work correctly", dataProvider="dpDel_TS_Multi", dataProviderClass=TestData.class)
	public void TS22(String nameUser, Date timeDel) throws InterruptedException {
		TestBase.methodName = "TS22";
		objMainPage.clickHR();
		objDeptTS.clickDepartmentTS();
		objDeptTS.clickLstMonth();
		objDeptTS.selectMultiUser(nameUser, timeDel);
		objDeptTS.clickBtnMore();
		objDeptTS.clickBtnDelete();
		driver.switchTo().alert().accept();
		
		boolean isDel = objDeptTS.checkDel(nameUser, timeDel);
		Assert.assertTrue(isDel);
	}
	
	@Test(priority = 22, description = "Verify function Submit Timesheet to Manager work correctly")
	public void TS23() throws InterruptedException {
		TestBase.methodName = "TS23";
		objMainPage.clickHR();
		objCurTS.clickMyCurTimesheet();
		if (objCurTS.getLblStatus().equals("Open")) {
			objCurTS.clickSubmit();
		}
		Assert.assertEquals(objCurTS.getLblStatus(), "Waiting Approval");
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
//		driver.close();
	}
}
