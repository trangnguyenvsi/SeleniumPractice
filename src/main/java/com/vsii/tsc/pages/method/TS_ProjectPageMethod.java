package com.vsii.tsc.pages.method;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.TS_ProjectPage;

public class TS_ProjectPageMethod {
	WebDriver driver;
	TS_ProjectPage objProj = new TS_ProjectPage();

	public TS_ProjectPageMethod(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, objProj);
	}
	
	public void clickMnProject() throws InterruptedException {
		Thread.sleep(2000);
		objProj.getMnProjects().click();
	}
	
	public void clickBtnCreate() {
		objProj.getBtnCreate().click();
	}
}
