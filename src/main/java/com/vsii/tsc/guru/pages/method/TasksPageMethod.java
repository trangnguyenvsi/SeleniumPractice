package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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
	
	public String getTaskSummaryInfo() {
		return objTasksPage.getTaskSummaryInfo().getText();
	}

	public String getProjectNameInfo() {
		return objTasksPage.getProjectNameInfo().getText();
	}

	public String getAssignToInfo() {
		return objTasksPage.getAssignToInfo().getText();
	}

	public String getTaskTypeInfo() {
		return objTasksPage.getTaskTypeInfo().getText();
	}

	public String getIsBillInfo() {
		return objTasksPage.getIsBillInfo().getText();
	}

	public String getExternalKeyInfo() {
		return objTasksPage.getExternalKeyInfo().getText();
	}

	public String getPlanHourInfo() {
		return objTasksPage.getPlanHourInfo().getText();
	}

	public String getHourSpentInfo() {
		return objTasksPage.getHourSpentInfo().getText();
	}

	public String getStageInfo() {
		return objTasksPage.getStageInfo().getText();
	}

	public String getStartingDateInfo() {
		return objTasksPage.getStartingDateInfo().getText();
	}

	public String getEndDateInfo() {
		return objTasksPage.getEndDateInfo().getText();
	}

	public String getProgressInfo() {
		return objTasksPage.getProgressInfo().getText();
	}
	
	public void chooseOneExistedTask() throws InterruptedException {
		objTasksPage.getTaskSummaryInfo().click();
		Thread.sleep(3000);
	}
	
	public void chooseTheFirstNewTask() {
		objTasksPage.getFirstNewTask().click();
	}
	
	public void chooseTheFirstCancelTask() {
		objTasksPage.getFirstCancelTask().click();
	}
	
	public void chooseTheFirstTaskOfOneUser() {
		objTasksPage.getFirstTaskOfOneUser().click();;
	}

	public void setFirstTaskOfOneUser(WebElement firstTaskOfOneUser) {
		objTasksPage.setFirstTaskOfOneUser(firstTaskOfOneUser);
	}
	
	public void clickCheckboxOfNewTaskOfOneUser() {
		objTasksPage.getCheckboxOfNewTaskOfOneUser().click();
	}

	public void setCheckboxOfNewTaskOfOneUser(WebElement checkboxOfNewTaskOfOneUser) {
		objTasksPage.setCheckboxOfNewTaskOfOneUser(checkboxOfNewTaskOfOneUser);
	}
	
	public void clickMoreButt() {
		objTasksPage.getMoreButt().click();
	}
	
	public void clickDeleteButt() {
		objTasksPage.getDeleteButt().click();
	}
	
	// Get task external key value
		public String getTaskNameValue(){
			return objTasksPage.getTaskNameValue().getText();
		}
		
		//Click on the latest task record
		public void clickLatestTask(){
			objTasksPage.getLatestTaskRecord().click();
		}
		
		// Get worklog time spent in Text
		public String getTimeSpent(){
			try{
				return objTasksPage.getTimeSpent().getText();
			}catch(org.openqa.selenium.StaleElementReferenceException ex){

				return objTasksPage.getTimeSpent().getText();
			}

		}
		
		// Get worklog done by in text
		public String getDoneBy(){
			return objTasksPage.getDoneBy().getText();
		}
}
