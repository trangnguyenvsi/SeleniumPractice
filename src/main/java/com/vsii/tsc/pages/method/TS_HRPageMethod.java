package com.vsii.tsc.pages.method;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vsii.tsc.pages.TS_HRPage;
import com.vsii.tsc.utility.CommonOperations;

public class TS_HRPageMethod {
	Properties p;
	WebDriver driver;
	TS_HRPage objHR = new TS_HRPage();

	public TS_HRPageMethod(WebDriver driver) throws IOException {
		this.driver = driver;
		p = CommonOperations.readConfig();
		PageFactory.initElements(driver, objHR);
	}

	public void clickMyTimesheet() throws InterruptedException {
		Thread.sleep(2000);
		objHR.getMnMyTimeSheet().click();
	}

	public String getTtlEmployee() throws InterruptedException {
		Thread.sleep(2000);
		return objHR.getTtlEmployee().getText();
	}

	public String getTtlDateFrom() throws InterruptedException {
		Thread.sleep(2000);
		return objHR.getTtlDateFrom().getText();
	}

	public String getTtlDateTo() throws InterruptedException {
		Thread.sleep(2000);
		return objHR.getTtlDateTo().getText();
	}

	public String getTtlDepartment() throws InterruptedException {
		Thread.sleep(2000);
		return objHR.getTtlDepartment().getText();
	}

	public String getTtlTotalTimesheet() throws InterruptedException {
		Thread.sleep(2000);
		return objHR.getTtlTotalTimesheet().getText();
	}

	public String getTtlStatus() throws InterruptedException {
		Thread.sleep(2000);
		return objHR.getTtlStatus().getText();
	}

	public String getBtnCreate() throws InterruptedException {
		Thread.sleep(2000);
		return objHR.getBtnCreate().getText();
	}

	public String getBtnImport() throws InterruptedException {
		Thread.sleep(2000);
		return objHR.getBtnImport().getText();
	}

	public boolean compareTitle(String employee, String dateFrom, String dateTo, String department,
			String totalTimesheet, String status, String createBtn, String importBtn) throws InterruptedException {
		boolean isMatch = false;
		String ttlEmployee = getTtlEmployee();
		String ttlDateFrom = getTtlDateFrom();
		String ttlDateTo = getTtlDateTo();
		String ttlDepartment = getTtlDepartment();
		String ttlTotalTimesheet = getTtlTotalTimesheet();
		String ttlStatus = getTtlStatus();
		String btnCreate = getBtnCreate();
		String btnImport = getBtnImport();

		if (ttlEmployee.equals(employee) && ttlDateFrom.equals(dateFrom)
				&& ttlDateTo.equals(dateTo) && ttlDepartment.equals(department)
				&& ttlTotalTimesheet.equals(totalTimesheet)
				&& ttlStatus.equals(status) && btnCreate.equals(createBtn)
				&& btnImport.equals(importBtn)) {
			isMatch = true;
		} else {
			isMatch = false;
		}
		return isMatch;
	}

	public void clickStatus() throws InterruptedException {
		Thread.sleep(2000);
		String status = objHR.getLblStatus().getText();
		if (status.equals("Open")) {
			objHR.getLblStatus().click();
		}
	}

	public void clickMyTS() throws InterruptedException {
		objHR.getMnMyTimeSheetEmp().click();
	}
}
