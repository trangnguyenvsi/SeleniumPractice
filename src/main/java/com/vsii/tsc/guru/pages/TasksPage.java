package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage {
	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/table/tbody/tr[2]/td[1]/div/div/button[1]")
	private WebElement createBut;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[2]/div")
	private WebElement taskSummaryTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[3]/div")
	private WebElement projectNameTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[4]/div")
	private WebElement assignToTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[5]/div")
	private WebElement taskTypeTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[6]/div")
	private WebElement isBillTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[7]/div")
	private WebElement externalKeyTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[8]/div")
	private WebElement planHourTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[9]/div")
	private WebElement hourSpentTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[10]/div")
	private WebElement stageTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[11]/div")
	private WebElement startingDateTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[12]/div")
	private WebElement endDateTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div/div/table/thead/tr/th[13]/div")
	private WebElement progressTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[1]")
	private WebElement taskSummaryInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[2]")
	private WebElement projectNameInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[3]")
	private WebElement assignToInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[4]")
	private WebElement taskTypeInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[5]")
	private WebElement isBillInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[6]")
	private WebElement externalKeyInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[7]")
	private WebElement planHourInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[8]")
	private WebElement hourSpentInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[9]")
	private WebElement stageInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[10]")
	private WebElement startingDateInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[11]")
	private WebElement endDateInfo;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[1]/div/table/tbody/tr[1]/td[12]")
	private WebElement progressInfo;

	@FindBy(xpath = "html/body/div/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'New')]][1]")
	private WebElement firstNewTask;

	@FindBy(xpath = "html/body/div/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'Cancelled')]][1]")
	private WebElement firstCancelTask;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'')]][1]")
	private WebElement firstTaskOfOneUser;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[td[contains(text(),'')] and td[contains(text(),'')]][1]")
	private WebElement firstNewTaskOfOneUser;
	
	@FindBy(xpath = "")
	private WebElement checkboxOfNewTaskOfOneUser;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/button")
	private WebElement moreButt;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[4]/a")
	private WebElement deleteButt;

	public WebElement getFirstNewTask() {
		return firstNewTask;
	}

	public WebElement getFirstCancelTask() {
		return firstCancelTask;
	}

	public WebElement getCreateBut() {
		return createBut;
	}

	public void setCreateBut(WebElement createBut) {
		this.createBut = createBut;
	}

	public WebElement getTaskSummaryTit() {
		return taskSummaryTit;
	}

	public WebElement getProjectNameTit() {
		return projectNameTit;
	}

	public WebElement getAssignToTit() {
		return assignToTit;
	}

	public WebElement getTaskTypeTit() {
		return taskTypeTit;
	}

	public WebElement getIsBillTit() {
		return isBillTit;
	}

	public WebElement getExternalKeyTit() {
		return externalKeyTit;
	}

	public WebElement getPlanHourTit() {
		return planHourTit;
	}

	public WebElement getHourSpentTit() {
		return hourSpentTit;
	}

	public WebElement getStageTit() {
		return stageTit;
	}

	public WebElement getStartingDateTit() {
		return startingDateTit;
	}

	public WebElement getEndDateTit() {
		return endDateTit;
	}

	public WebElement getProgressTit() {
		return progressTit;
	}

	public WebElement getTaskSummaryInfo() {
		return taskSummaryInfo;
	}

	public WebElement getProjectNameInfo() {
		return projectNameInfo;
	}

	public WebElement getAssignToInfo() {
		return assignToInfo;
	}

	public WebElement getTaskTypeInfo() {
		return taskTypeInfo;
	}

	public WebElement getIsBillInfo() {
		return isBillInfo;
	}

	public WebElement getExternalKeyInfo() {
		return externalKeyInfo;
	}

	public WebElement getPlanHourInfo() {
		return planHourInfo;
	}

	public WebElement getHourSpentInfo() {
		return hourSpentInfo;
	}

	public WebElement getStageInfo() {
		return stageInfo;
	}

	public WebElement getStartingDateInfo() {
		return startingDateInfo;
	}

	public WebElement getEndDateInfo() {
		return endDateInfo;
	}

	public WebElement getProgressInfo() {
		return progressInfo;
	}

	public WebElement getFirstTaskOfOneUser() {
		return firstTaskOfOneUser;
	}

	public void setFirstTaskOfOneUser(WebElement firstTaskOfOneUser) {
		this.firstTaskOfOneUser = firstTaskOfOneUser;
	}

	public WebElement getCheckboxOfNewTaskOfOneUser() {
		return checkboxOfNewTaskOfOneUser;
	}

	public void setCheckboxOfNewTaskOfOneUser(WebElement checkboxOfNewTaskOfOneUser) {
		this.checkboxOfNewTaskOfOneUser = checkboxOfNewTaskOfOneUser;
	}

	public WebElement getMoreButt() {
		return moreButt;
	}

	public WebElement getDeleteButt() {
		return deleteButt;
	}

	// Identify Task External Key Value 
		@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[1]")
		private WebElement taskNameValue;

		public WebElement getTaskNameValue() {
			return taskNameValue;
		}

		public void setExtKeyValue(WebElement taskNameValue) {
			this.taskNameValue = taskNameValue;
		}
		
		// Identify latest tasks record
		@FindBy(xpath="//table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]")
		private WebElement latestTaskRecord;
		
		public WebElement getLatestTaskRecord() {
			return latestTaskRecord;
		}

		public void setLatestTaskRecord(WebElement latestTaskRecord) {
			this.latestTaskRecord = latestTaskRecord;
		}

		// Identify new worklog row in Task detail window
		@FindBy(xpath="//div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]")
		private WebElement worklogDetail;

		public WebElement getWorklogDetail() {
			return worklogDetail;
		}

		public void setWorklogDetail(WebElement worklogDetail) {
			this.worklogDetail = worklogDetail;
		}

		// Identify "Time spent" section
		@FindBy(xpath="//table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[2]")
		private WebElement timeSpent;
		
		public WebElement getTimeSpent() {
			return timeSpent;
		}

		public void setTimeSpent(WebElement timeSpent) {
			this.timeSpent = timeSpent;
		}

		// Identify "Done By" section
		@FindBy(xpath="//div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[4]")
		private WebElement doneBy;
		
		public WebElement getDoneBy() {
			return doneBy;
		}

		public void setDoneBy(WebElement doneBy) {
			this.doneBy = doneBy;
		}
	
}
