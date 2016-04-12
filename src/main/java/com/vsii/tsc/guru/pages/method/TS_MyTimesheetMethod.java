package com.vsii.tsc.guru.pages.method;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.vsii.tsc.guru.pages.TS_MyTimesheetPage;

public class TS_MyTimesheetMethod {

	WebDriver driver;
	TS_MyTimesheetPage objMyTS = new TS_MyTimesheetPage();

	public TS_MyTimesheetMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objMyTS);
	}
	
	public void clickEdit() throws InterruptedException {
		objMyTS.getBtnEdit().click();
		Thread.sleep(3000);
	}
	
	public void editTime(String time) {
		objMyTS.getTxtTime().sendKeys(time);
	}
	
	public void clickSave() throws InterruptedException {
		objMyTS.getBtnSave().click();
		Thread.sleep(3000);
	}
	
	public String getlblEditbtn() {
		return objMyTS.getBtnEdit().getText();
	}
	
	public void clickDiscard() throws InterruptedException {
		objMyTS.getBtnDiscard().click();
		Thread.sleep(3000);
	}
	
	public String getTotalTS() {
		return objMyTS.getLblTotalTS().getText();
	}
	
	public void clickTS() {
		List<WebElement> rows = objMyTS.getTblMyTS().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < 3; rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 0; cnum < 1; cnum++) {
				columns.get(0).click();
			}
		}
	}

	public boolean compareName() throws InterruptedException {
		Thread.sleep(6000);
		boolean isMatch = false;
		if (objMyTS.getEmpName().getText().equals("Anh-Pham Thi Quynh Anh")) {
			isMatch = true;
		} else {
			isMatch = false;
		}
		return isMatch;
	}

	public boolean compareSummary() throws InterruptedException {
		Thread.sleep(6000);
		boolean isMatch = false;
		List<String> actualList = null;
		List<String> expectedList = null;
		String[] strs = { "08:00","08:00","08:00","08:00","08:00","04:00","00:00","44:00"};
		
		List<WebElement> rows = objMyTS.getTblTSWeekly().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 0; cnum < 1; cnum++) {
				if (columns.get(0).getText().equals("Projects / TSC_General _Non project works")) {
					isMatch = true;
				} else {
					isMatch = false;
				}
			}
		}
		
		for (int rnum = 3; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 1; cnum < columns.size(); cnum++) {	
				for(int i =  0; i < strs.length; i++){
					expectedList = Arrays.asList(strs[i]);
					actualList = Arrays.asList(columns.get(cnum).getText());
					if(actualList.equals(expectedList)) {
						isMatch = true;
					} else {
						isMatch = false;
					}
				}
			}
		}	
		return isMatch;
	}

	public void clickDetails() {
		objMyTS.getTabDetails().click();
	}
	
	public void getTSDetails() {
//		String sbc = driver.findElement(By.partialLinkText("04/04/2016")).getText();
//		System.out.println(sbc);
		List<WebElement> rows = objMyTS.getTblDetails().findElements(By.tagName("tr"));
		for (int rnum = 6; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.xpath("./*"));
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				System.out.println(columns.get(cnum).getText());
			}
		}
	}
	
}
