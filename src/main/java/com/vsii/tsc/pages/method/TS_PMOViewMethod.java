package com.vsii.tsc.pages.method;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.TS_PMOViewPage;
import com.vsii.tsc.utility.CommonOperations;

public class TS_PMOViewMethod {
	Properties p;
	WebDriver driver;
	TS_PMOViewPage objPMO = new TS_PMOViewPage();

	public TS_PMOViewMethod(WebDriver driver) throws IOException {
		p = CommonOperations.readConfig();
		this.driver = driver;
		PageFactory.initElements(driver, objPMO);
	}
	
	public String getTtlEmp() throws InterruptedException {
		Thread.sleep(2000);
		return objPMO.getTtlEmp().getText();
	}

	public String getTtlDateFrom() throws InterruptedException {
		Thread.sleep(2000);
		return objPMO.getTtlDateFrom().getText();
	}

	public String getTtlDateTo() throws InterruptedException {
		Thread.sleep(2000);
		return objPMO.getTtlDateTo().getText();
	}

	public String getTtlDept() throws InterruptedException {
		Thread.sleep(2000);
		return objPMO.getTtlDept().getText();
	}

	public String getTtlTotalTS() throws InterruptedException {
		Thread.sleep(2000);
		return objPMO.getTtlTotalTS().getText();
	}

	public String getTtlStatus() throws InterruptedException {
		Thread.sleep(2000);
		return objPMO.getTtlStatus().getText();
	}
	
	public void clickPMOView() {
		objPMO.getMnPMOView().click();
	}
	
	public boolean compareTitle(String employee, String dateFrom, String dateTo, String department,
			String totalTimesheet, String status) throws InterruptedException {
		boolean isMatch = false;
		String ttlEmp = getTtlEmp();
		String ttlDateFrom = getTtlDateFrom();
		String ttlDateTo = getTtlDateTo();
		String ttlDepartment = getTtlDept();
		String ttlTotalTS = getTtlTotalTS();
		String ttlStatus = getTtlStatus();

		if (ttlEmp.equals(employee) && ttlDateFrom.equals(dateFrom)
				&& ttlDateTo.equals(dateTo) && ttlDepartment.equals(department)
				&& ttlTotalTS.equals(totalTimesheet)
				&& ttlStatus.equals(status)) {
			isMatch = true;
		} else {
			isMatch = false;
		}
		return isMatch;
	}
}
