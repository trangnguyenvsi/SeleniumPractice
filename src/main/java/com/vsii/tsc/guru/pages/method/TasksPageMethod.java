package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.ProjectsPage;
import com.vsii.tsc.guru.pages.TasksPage;

public class TasksPageMethod {
	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public TasksPage objTasksPage = new TasksPage();

	// Initialize all web element
	public TasksPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objTasksPage);
	}
	
	public void clickCreateBut() {
		objTasksPage.getCreateBut().click();
	}

	public String getTaskSummaryTit() {
		objTasksPage.getTaskSummaryTit();
		return objTasksPage.getTaskSummaryTit().getText();
	}

	public String getProjectNameTit() {
		objTasksPage.getProjectNameTit();
		return objTasksPage.getProjectNameTit().getText();
	}

	public String getAssignToTit() {
		return objTasksPage.getAssignToTit().getText();
	}

	public String getTaskTypeTit() {
		return objTasksPage.getTaskTypeTit().getText();
	}

	public String getIsBillTit() {
		return objTasksPage.getIsBillTit().getText();
	}

	public String getExternalKeyTit() {
		return objTasksPage.getExternalKeyTit().getText();
	}

	public String getPlanHourTit() {
		return objTasksPage.getPlanHourTit().getText();
	}

	public String getHourSpentTit() {
		return objTasksPage.getHourSpentTit().getText();
	}

	public String getStageTit() {
		return objTasksPage.getStageTit().getText();
	}

	public String getStartingDateTit() {
		return objTasksPage.getStartingDateTit().getText();
	}

	public String getEndDateTit() {
		return objTasksPage.getEndDateTit().getText();
	}

	public String getProgressTit() {
		return objTasksPage.getProgressTit().getText();
	}
	


}
