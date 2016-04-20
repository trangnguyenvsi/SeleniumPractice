package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.VSIIProjectPage;

public class VSIIProjectPageMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElement object
	public VSIIProjectPage objVsiiProjectPage = new VSIIProjectPage();

	// Initialize all web element
	public VSIIProjectPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objVsiiProjectPage);
	}

	// Click Edit imported project
	public void clickEditImportedProject() {
		try {
			objVsiiProjectPage.getEditProjectBtn().click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			objVsiiProjectPage.getEditProjectBtn().click();
		}
	}

	// Input Project name to "Project" dropdown
	public void setProjectName(String projectName) throws InterruptedException {
		objVsiiProjectPage.getProjectDropdown().clear();
		objVsiiProjectPage.getProjectDropdown().click();
		objVsiiProjectPage.getProjectDropdown().sendKeys(projectName);
		Thread.sleep(1000);
		objVsiiProjectPage.getProjectDropdown().sendKeys(Keys.TAB);
	}

	// Click "No verify worklog" check box if it is checked, leave it empty if
	// it has not been checked
	public void clickNoVerifyChkbox() throws InterruptedException {
		WebElement checkBox = objVsiiProjectPage.getNoVerifyWorklogchkbx();
		if (checkBox.isSelected()) {
			checkBox.click();
		}
		Thread.sleep(1000);
	}

	// Click Save project
	public void clickSaveImportedProject() {
		objVsiiProjectPage.getSaveBtn().click();
	}
	
	
	public void editVSIIProject(String firstProjectName) throws InterruptedException{

		clickEditImportedProject();
		setProjectName(firstProjectName);
		clickNoVerifyChkbox();
		clickSaveImportedProject();
	}
}
