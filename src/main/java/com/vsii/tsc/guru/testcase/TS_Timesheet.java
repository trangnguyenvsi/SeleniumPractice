package com.vsii.tsc.guru.testcase;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.method.TS_TaskMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.TS_CreateTSMethod;
import com.vsii.tsc.guru.pages.method.TS_CurrentTSMethod;
import com.vsii.tsc.guru.pages.method.TS_DepartmentTSMethod;
import com.vsii.tsc.guru.pages.method.TS_HRPageMethod;
import com.vsii.tsc.guru.pages.method.TS_MainPageMethod;
import com.vsii.tsc.guru.pages.method.TS_MyTimesheetMethod;
import com.vsii.tsc.guru.pages.method.TS_PMOViewMethod;
import com.vsii.tsc.guru.pages.method.TS_TSToValidateMethod;
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
	TS_TaskMethod objTask;
	TS_TSToValidateMethod objTSValid;

	@BeforeTest
	public void beforeTest() throws IOException {
		p = CommonOperations.readConfig();
		objLogin = new LoginPageMethod(driver);
		objMainPage = new TS_MainPageMethod(driver);
		objHRPage = new TS_HRPageMethod(driver);
		objCurTS = new TS_CurrentTSMethod(driver);
		objDeptTS = new TS_DepartmentTSMethod(driver);
		objPMO = new TS_PMOViewMethod(driver);
		objCreateTS = new TS_CreateTSMethod(driver);
		objMyTS = new TS_MyTimesheetMethod(driver);
		objTask = new TS_TaskMethod(driver);
		objTSValid = new TS_TSToValidateMethod(driver);
	}

	@Test(priority = 0, description = "Verify My Timesheet display correctly", dataProvider = "dpLogin_TS", dataProviderClass = TestData.class)
	public void TS01(String username, String password, String employee, String dateFrom, String dateTo, String department,
			String totalTimesheet, String status, String createBtn, String importBtn) throws InterruptedException, IOException {
		TestBase.methodName = "TS01";
		Thread.sleep(5000);
		objLogin.loginToManagerPage(username, password);
		Thread.sleep(5000);
		objMainPage.clickHR();
		objHRPage.clickMyTimesheet();
		boolean isMatch = objHRPage.compareTitle(employee, dateFrom, dateTo, department, totalTimesheet, status, createBtn, importBtn);
		Assert.assertTrue(isMatch);
	}
	
	

	@Test(priority = 1, description = "Verify My Current Timesheet display correctly")
	public void TS02() throws InterruptedException {
		TestBase.methodName = "TS02";
		objCurTS.clickMyCurTimesheet();
		boolean isExist = objCurTS.getTSTable();
		Assert.assertTrue(isExist);
	}

	@Test(priority = 2, description = "Verify Department Timesheet display correctly", dataProvider = "dpLogin_PMO_TS", dataProviderClass = TestData.class)
	public void TS03(String employee, String dateFrom, String dateTo, String department,
			String totalTimesheet, String status) throws InterruptedException, ParseException {
		TestBase.methodName = "TS03";
		objDeptTS.clickDepartmentTS();
		boolean isTitle = objDeptTS.compareTitle(employee, dateFrom, dateTo, department, totalTimesheet, status);
		Assert.assertTrue(isTitle);
		boolean isMatch = objDeptTS.getTSMonth();
		Assert.assertTrue(isMatch);
		objDeptTS.clickMonthTS();
		boolean isStatus = objDeptTS.getTSStatus();
		Assert.assertTrue(isStatus);

		objMainPage.clickDrpDwnMenu();
		objMainPage.clickLogout();
	}

	@Test(priority = 3, description = "Verify PMO view display correctly", dataProvider = "dp_PMOLoginTS", dataProviderClass = TestData.class)
	public void TS04(String username, String password, String employee, String dateFrom, String dateTo, String department,
			String totalTimesheet, String status) throws InterruptedException {
		TestBase.methodName = "TS04";
		Thread.sleep(5000);
		objMainPage.clickDrpDwnMenu();
		objMainPage.clickLogout();
		Thread.sleep(2000);
		objLogin.clearText();
		objLogin.loginToManagerPage(username, password);
		objMainPage.clickHRPMO();
		objPMO.clickPMOView();
		boolean isMatch = objPMO.compareTitle(employee, dateFrom, dateTo, department, totalTimesheet, status);
		Assert.assertTrue(isMatch);
//		objMainPage.clickLogout();
	}

	@Test(priority = 4, description = "Verify user can view his own timesheet display correctly when his worklogs has not approved yet", dataProvider = "dpLogin_PM_TS", dataProviderClass = TestData.class)
	public void TS05(String username, String password) throws InterruptedException {
//		objLogin.loginToManagerPage(username, password);
		objMainPage.clickMnHREmp();
		objHRPage.clickMyTS();
		Thread.sleep(10000);
		objMyTS.clickTS();
		boolean isMatchName = objMyTS.compareName();
		boolean isMatchSummary = objMyTS.compareSummary();
		Assert.assertTrue(isMatchName);
		Assert.assertTrue(isMatchSummary);
		objMyTS.clickDetails();
		objMyTS.getTSDetails();
	}

	
	@Test(priority = 8, description = "Verify function Create Timesheet with valid data", dataProvider = "dpCreate_TS_Valid", dataProviderClass = TestData.class)
	public void TS09(String username, String password, Date dtFrom, Date dtTo, String project, String time)
			throws InterruptedException {
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

	@Test(priority = 9, description = "Verify function Create Timesheet with invalid data", dataProvider = "dpCreate_TS_Invalid", dataProviderClass = TestData.class)
	public void TS10(Date dtFrom, Date dtTo, String project, String time, String errMessage)
			throws InterruptedException {
		TestBase.methodName = "TS10";
		Thread.sleep(5000);
		// objLogin.loginToManagerPage(username, password);
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

	@Test(priority = 16, description = "Verify Edit Timesheet with valid data", dataProvider = "dpEdit_TS_Valid", dataProviderClass = TestData.class)
	public void TS17(String time) throws InterruptedException {
		TestBase.methodName = "TS17";
		// objLogin.loginToManagerPage(username, password);
		// objMainPage.clickHR();
		objHRPage.clickMyTimesheet();

		// select week which has Open status
		objHRPage.clickStatus();
		Thread.sleep(3000);
		objMyTS.clickEdit();
		objMyTS.editTime(time);
		objMyTS.clickSave();
		Assert.assertEquals(objMyTS.getlblEditbtn(), "Edit");
	}

	// The expectation is not exist
	public void TS18() throws InterruptedException {
		// TestBase.methodName = "TS18";
		//// objLogin.loginToManagerPage(username, password);
		//// objMainPage.clickHR();
		// objHRPage.clickMyTimesheet();
		//
		// //select week which has Open status
		// objHRPage.clickStatus();
		// Thread.sleep(3000);
		// objMyTS.clickEdit();
		// objMyTS.editTime(time);
		// objMyTS.clickSave();
		// Assert.assertEquals(objMyTS.getlblEditbtn(), "Edit");
	}

	@Test(priority = 18, description = "Verify Edit Timesheet with valid data", dataProvider = "dpEdit_TS_Valid", dataProviderClass = TestData.class)
	public void TS19(String time) throws InterruptedException {
		TestBase.methodName = "TS19";
		// objLogin.loginToManagerPage(username, password);
		// objMainPage.clickHR();
		objHRPage.clickMyTimesheet();

		// select week which has Open status
		objHRPage.clickStatus();
		Thread.sleep(3000);
		objMyTS.clickEdit();
		objMyTS.editTime(time);
		objMyTS.clickDiscard();

		Assert.assertEquals(objMyTS.getTotalTS(), objMyTS.getTotalTS());

		objMainPage.clickLogout();
	}

	@Test(priority = 19, description = "Verify that discard of Delete Timesheet work correctly", dataProvider = "dpDismis_TS_Single", dataProviderClass = TestData.class)
	public void TS21(String nameUser, String timeDel) throws InterruptedException {
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

	@Test(priority = 20, description = "Verify that  Delete Timesheet work correctly", dataProvider = "dpDel_TS_Single", dataProviderClass = TestData.class)
	public void TS20(String username, String password, String nameUser, String timeDel) throws InterruptedException {
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

	@Test(priority = 21, description = "Verify that  Delete multiple Timesheets work correctly", dataProvider = "dpDel_TS_Multi", dataProviderClass = TestData.class)
	public void TS22(String nameUser, String timeDel, String i) throws InterruptedException {
		TestBase.methodName = "TS22";
		objMainPage.clickHR();
		objDeptTS.clickDepartmentTS();
		objDeptTS.clickLstMonth();
		objDeptTS.selectMultiUser(nameUser, timeDel, i);
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

	@Test(priority = 23, description = "Verify that Waiting for Approval timesheet display correctly")
	public void TS24() throws InterruptedException {
		TestBase.methodName = "TS24";
		objMainPage.clickHR();
		objTSValid.clickTSToValidate();
		objTSValid.checkUserSubmit();

		boolean isSubmit = objTSValid.checkUserSubmit();
		Assert.assertTrue(isSubmit);
	}

	@Test(priority = 24, description = "Verify function Approve Timesheet work correctly")
	public void TS25() throws InterruptedException {
		TestBase.methodName = "TS25";
		objMainPage.clickHR();
		objTSValid.clickTSToValidate();
		objTSValid.clickUserToApprove();
		objTSValid.clickBtnApprove();

		boolean isApproved = objTSValid.checkApproved();
		Assert.assertTrue(isApproved);
	}

	@Test(priority = 25, description = "Verify function Approve multiple Timesheets work correctly", dataProvider = "dpSelect_User_Multi", dataProviderClass = TestData.class)
	public void TS26(String nameUser, String date, String i) throws InterruptedException {
		TestBase.methodName = "TS26";
		objMainPage.clickHR();
		objTSValid.clickTSToValidate();
		objTSValid.clickBtnX();
		objTSValid.clickMultiUserToApprove(nameUser, date, i);
//		objTSValid.setChkboxToDel(driver.findElement(By
//				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[td[contains(text(),"
//						+ nameUser + ")] and td[contains(text()," + date + ")] and td[contains(text(),'Waiting Approval')]]/th")));
		
		objTSValid.clickChkboxToDel();
		objTSValid.clickBtnMore();
		objTSValid.clickBtnApproveMulti();

		Assert.assertEquals(driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[td[contains(text(),"
						+ nameUser + ")] and td[contains(text()," + date + ")]]/td[6]"))
				.getText(), "Approved");
	}

	@Test(priority = 26, description = "Verify function Approve multiple Timesheets which is not in Wait for approval work correctly", dataProvider = "dpSelect_User_Multi", dataProviderClass = TestData.class)
	public void TS27(String nameUser, String date, String i) throws InterruptedException {
		TestBase.methodName = "TS27";
//		objMainPage.clickHR();
//		objTSValid.clickTSToValidate();
//		objTSValid.clickBtnX();
//		objTSValid.setChkboxToDel(driver.findElement(By
//				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[td[contains(text(),"
//						+ nameUser + ")] and td[contains(text()," + date + ")] and (td[contains(text()," + status + ")]]/th")));
		objTSValid.selectUserNotWaitingApp(i);
		objTSValid.clickChkboxToDel();
		objTSValid.clickBtnMore();
		objTSValid.clickBtnApproveMulti();

		Assert.assertEquals(driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[td[contains(text(),"
						+ nameUser + ")] and td[contains(text()," + date + ")]]")).isDisplayed(), true);
		objMainPage.clickLogout();
	}

	@Test(priority = 26, description = "Verify that Approved timesheet display correctly", dataProvider = "", dataProviderClass = TestData.class)
	public void TS28(String username, String password) throws InterruptedException {
		TestBase.methodName = "TS27";
		objLogin.loginToManagerPage(username, password);
		objMainPage.clickHR();
		objHRPage.clickMyTimesheet();

		
		objMainPage.clickLogout();
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		// driver.close();
	}
}
