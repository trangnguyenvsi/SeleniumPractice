package com.vsii.tsc.pages.method;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.TS_CurrentTSPage;

public class TS_CurrentTSMethod {
	WebDriver driver;
	TS_CurrentTSPage objcurTS = new TS_CurrentTSPage();

	public TS_CurrentTSMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objcurTS);
	}

	public void clickMyCurTimesheet() {
		objcurTS.getMnMyCurTimeSheet().click();
	}
	
	public boolean getTSTable() throws InterruptedException {
		boolean isExist=false;
		Thread.sleep(10000);
		DateFormat dateFormat = new SimpleDateFormat("MMM" + " " + "dd");
		Date date = new Date();
		String today = dateFormat.format(date);
		List<WebElement> rows = objcurTS.getTsTable().findElements(By.tagName("tr"));
		for (int rnum = 0; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("th"));
			for (int cnum = 1; cnum < columns.size()-1; cnum++) {				;
				while (columns.get(cnum).getText().substring(4).contains(today)) {
					isExist = true;
					break;
				} 
			}
		}
		return isExist;
	}

// public String getCurrentDate() throws InterruptedException {
// Thread.sleep(10000);
// return objcurTS.getCurrentDate().getText();
// }
	
	public void clickEdit() {
		objcurTS.getBtnEdit().click();
	}
	
	public String getLblStatus() {
		return objcurTS.getLblStatus().getText();
	}
	
	public void clickSubmit() {
		objcurTS.getBtnSubmit().click();
	}
	
	public String getLblNameUser() {
		return objcurTS.getLblNameUser().getText();
	}
	
	public String getLblTimePeriod() {
		return objcurTS.getLblTimePeriod().getText();
	}
}
