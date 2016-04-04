package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
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
	
}
