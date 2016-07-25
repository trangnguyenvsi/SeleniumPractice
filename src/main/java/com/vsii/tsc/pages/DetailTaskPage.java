package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailTaskPage {
	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current']/div/div[3]/div/div[4]/div/div/div[1]/div/h1/span/input")
	private WebElement summaryTxt;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current']/div/div[3]/div/div[4]/div/div/div[1]/div/h1/span/span")
	private WebElement summaryTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current']/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span/div/input")
	private WebElement projectNameDrop;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current']/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/span/div/input")
	private WebElement assignToDrop;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current']/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[4]/td[2]/span/div/input")
	private WebElement taskTypeDrop;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current']/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/span/input")
	private WebElement isBillCheckbox;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current']/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]/span/div/input")
	private WebElement projectPhaseDrop;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current']/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[8]/td[2]/span/input")
	private WebElement planHourTxt;

	@FindBy(xpath = ".//*[@name='date_deadline']")
	private WebElement deadlineTxt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/div/div/div/div[1]")
	private WebElement tagOfProjectDrop;

	@FindBy(xpath = ".//*[@role='progressbar']")
	private WebElement progress;

	@FindBy(xpath = ".//*[@name='description']")
	private WebElement descriptionTxtA;

	@FindBy(xpath = ".//*[contains(text(),'Add an item')]")
	private WebElement addItemButt;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
	private WebElement saveButt;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/a")
	private WebElement discardButt;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/table/tbody/tr[2]/td[1]/div/div[2]/span[1]/div/button")
	private WebElement editButt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/header/button[2]")
	private WebElement doneButt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/header/button[3]")
	private WebElement cancelTaskButt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/header/button[1]")
	private WebElement reactiveButt;

	@FindBy(xpath = "html/body/div[2]/div[11]/div/footer/button[1]/span")
	private WebElement evaluateButt;

	@FindBy(xpath = "html/body/div[2]/div[11]/div/footer/button[2]/span")
	private WebElement cancelButt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/header/button[4]")
	private WebElement approveWorklogButt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div[2]/button")
	private WebElement moreButt;

	@FindBy(xpath = "")
	private WebElement pendingButt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div[2]/ul/li/a[contains(text(),'Approve Worklogs')]")
	private WebElement approveAllWorkLogs;

	@FindBy(xpath = ".//*[@class='oe_form_field_status oe_form_status_clickable']/li[2]/span")
	private WebElement inProgressButt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div/div[4]/div/div/span[1]/input")
	private WebElement workSummaryTxt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div/div[4]/div/div/span[2]/input")
	private WebElement timeSpentTxt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div/div[4]/div/div/span[3]/span/input[2]")
	private WebElement dateTxt;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div/div[4]/div/div/span[4]/div/input")
	private WebElement doneByDrop;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div/div[4]/div/div/div/div/div/textarea")
	private WebElement tagOfWorkDrop;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]")
	private WebElement workSummaryTit;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[2]")
	private WebElement timeSpentTit;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[6]")
	private WebElement statusTit;

	@FindBy(xpath = ".//*[@class='openerp openerp_webclient_container']/div/div[5]/h1")
	private WebElement errMessage1;

	@FindBy(xpath = ".//*[@class='openerp openerp_webclient_container']/div/div[5]/ul/li")
	private WebElement errMessage2;

	@FindBy(xpath = ".//*[@class='oe_breadcrumb_item' and contains(text(), 'Tasks')]")
	private WebElement goToTasks;

	@FindBy(xpath = ".//*[@class='oe_dialog_warning']/tbody/tr/td[2]/p")
	private WebElement errMessageUserOutside;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[9]/button")
	private WebElement refuseButt;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[8]/button")
	private WebElement approveButt;

	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/div/div[3]/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[10]/button")
	private WebElement deleteButt;

	public WebElement getStatusTit() {
		return statusTit;
	}

	public WebElement getDiscardButt() {
		return discardButt;
	}

	public WebElement getSummaryTit() {
		return summaryTit;
	}

	public WebElement getEditButt() {
		return editButt;
	}

	public WebElement getErrMessageUserOutside() {
		return errMessageUserOutside;
	}

	public WebElement getGoToTasks() {
		return goToTasks;
	}

	public WebElement getErrMessage1() {
		return errMessage1;
	}

	public WebElement getErrMessage2() {
		return errMessage2;
	}

	public WebElement getSummaryTxt() {
		return summaryTxt;
	}

	public void setSummaryTxt(WebElement summaryTxt) {
		this.summaryTxt = summaryTxt;
	}

	public WebElement getProjectNameDrop() {
		return projectNameDrop;
	}

	public void setProjectNameDrop(WebElement projectNameDrop) {
		this.projectNameDrop = projectNameDrop;
	}

	public WebElement getAssignToDrop() {
		return assignToDrop;
	}

	public void setAssignToDrop(WebElement assignToDrop) {
		this.assignToDrop = assignToDrop;
	}

	public WebElement getTaskTypeDrop() {
		return taskTypeDrop;
	}

	public void setTaskTypeDrop(WebElement taskTypeDrop) {
		this.taskTypeDrop = taskTypeDrop;
	}

	public WebElement getIsBillCheckbox() {
		return isBillCheckbox;
	}

	public void setIsBillCheckbox(WebElement isBillCheckbox) {
		this.isBillCheckbox = isBillCheckbox;
	}

	public WebElement getProjectPhaseDrop() {
		return projectPhaseDrop;
	}

	public void setProjectPhaseDrop(WebElement projectPhaseDrop) {
		this.projectPhaseDrop = projectPhaseDrop;
	}

	public WebElement getPlanHourTxt() {
		return planHourTxt;
	}

	public void setPlanHourTxt(WebElement planHourTxt) {
		this.planHourTxt = planHourTxt;
	}

	public WebElement getDeadlineTxt() {
		return deadlineTxt;
	}

	public void setDeadlineTxt(WebElement deadlineTxt) {
		this.deadlineTxt = deadlineTxt;
	}

	public WebElement getTagOfProjectDrop() {
		return tagOfProjectDrop;
	}

	public void setTagOfProjectDrop(WebElement tagOfProjectDrop) {
		this.tagOfProjectDrop = tagOfProjectDrop;
	}

	public WebElement getProgress() {
		return progress;
	}

	public void setProgress(WebElement progress) {
		this.progress = progress;
	}

	public WebElement getDescriptionTxtA() {
		return descriptionTxtA;
	}

	public void setDescriptionTxtA(WebElement descriptionTxtA) {
		this.descriptionTxtA = descriptionTxtA;
	}

	public WebElement getAddItemButt() {
		return addItemButt;
	}

	public void setAddItemButt(WebElement addItemButt) {
		this.addItemButt = addItemButt;
	}

	public WebElement getSaveButt() {
		return saveButt;
	}

	public void setSaveButt(WebElement saveButt) {
		this.saveButt = saveButt;
	}

	public WebElement getWorkSummaryTxt() {
		return workSummaryTxt;
	}

	public void setWorkSummaryTxt(WebElement workSummaryTxt) {
		this.workSummaryTxt = workSummaryTxt;
	}

	public WebElement getTimeSpentTxt() {
		return timeSpentTxt;
	}

	public void setTimeSpentTxt(WebElement timeSpentTxt) {
		this.timeSpentTxt = timeSpentTxt;
	}

	public WebElement getDateTxt() {
		return dateTxt;
	}

	public void setDateTxt(WebElement dateTxt) {
		this.dateTxt = dateTxt;
	}

	public WebElement getDoneByDrop() {
		return doneByDrop;
	}

	public void setDoneByDrop(WebElement doneByDrop) {
		this.doneByDrop = doneByDrop;
	}

	public WebElement getTagOfWorkDrop() {
		return tagOfWorkDrop;
	}

	public void setTagOfWorkDrop(WebElement tagOfWorkDrop) {
		this.tagOfWorkDrop = tagOfWorkDrop;
	}

	public WebElement getRefuseButt() {
		return refuseButt;
	}

	public WebElement getApproveButt() {
		return approveButt;
	}

	public WebElement getDeleteButt() {
		return deleteButt;
	}

	public WebElement getWorkSummaryTit() {
		return workSummaryTit;
	}

	public WebElement getTimeSpentTit() {
		return timeSpentTit;
	}

	public WebElement getDoneButt() {
		return doneButt;
	}

	public WebElement getCancelTaskButt() {
		return cancelTaskButt;
	}

	public WebElement getReactiveButt() {
		return reactiveButt;
	}

	public WebElement getEvaluateButt() {
		return evaluateButt;
	}

	public WebElement getApproveWorklogButt() {
		return approveWorklogButt;
	}

	public WebElement getMoreButt() {
		return moreButt;
	}

	public WebElement getPendingButt() {
		return pendingButt;
	}

	public WebElement getInProgressButt() {
		return inProgressButt;
	}

	public WebElement getCancelButt() {
		return cancelButt;
	}

	public WebElement getApproveAllWorkLogs() {
		return approveAllWorkLogs;
	}

}
