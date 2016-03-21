package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailTaskPage {
	@FindBy(xpath = ".//*[@placeholder='Task summary...']")
	private WebElement summaryTxt;
	
	@FindBy(xpath = ".//*[@id='oe-field-input-99']")
	private WebElement projectNameDrop;
	
	@FindBy(xpath = ".//*[@id='oe-field-input-100']")
	private WebElement assignToDrop;
	
	@FindBy(xpath = ".//*[@id='oe-field-input-102']")
	private WebElement taskTypeDrop;
	
	@FindBy(xpath = ".//*[@id='oe-field-input-103']")
	private WebElement isBillCheckbox;
	
	@FindBy(xpath = ".//*[@id='oe-field-input-104']")
	private WebElement projectPhaseDrop;
	
	@FindBy(xpath = ".//*[@id='oe-field-input-106']")
	private WebElement planHourTxt;
	
	@FindBy(xpath = ".//*[@name='date_deadline']")
	private WebElement deadlineTxt;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/div/div/div/div[3]")
	private WebElement tagOfProjectDrop;
	
	@FindBy(xpath = ".//*[@role='progressbar']")
	private WebElement progress;
	
	@FindBy(xpath = ".//*[@name='description']")
	private WebElement descriptionTxtA;
	
	@FindBy(xpath = ".//*[contains(text(),'Add an item')]")
	private WebElement addItemButt;
	
	@FindBy(xpath = ".//*[@class='oe_view_manager oe_view_manager_current'][2]/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
	private WebElement saveButt;
	
	@FindBy(xpath = ".//*[@id='notebook_page_110']/div[2]/div/div/div/div/div/div/div[4]/div/div/span[1]/input")
	private WebElement workSummaryTxt;
	
	@FindBy(xpath = ".//*[@id='notebook_page_110']/div[2]/div/div/div/div/div/div/div[4]/div/div/span[2]/input")
	private WebElement timeSpentTxt;
	
	@FindBy(xpath = ".//*[@id='notebook_page_110']/div[2]/div/div/div/div/div/div/div[4]/div/div/span[3]/span/input[2]")
	private WebElement dateTxt;
	
	@FindBy(xpath = ".//*[@id='notebook_page_110']/div[2]/div/div/div/div/div/div/div[4]/div/div/span[4]/div/input")
	private WebElement doneByDrop;
	
	@FindBy(xpath = ".//*[@id='notebook_page_110']/div[2]/div/div/div/div/div/div/div[4]/div/div/div/div/div/div[3]")
	private WebElement tagOfWorkDrop;
	
	@FindBy(xpath = ".//*[@class='openerp openerp_webclient_container']/div/div[5]/h1")
	private WebElement errMessage1;
	
	@FindBy(xpath = ".//*[@class='openerp openerp_webclient_container']/div/div[5]/ul/li")
	private WebElement errMessage2;
	
	@FindBy(xpath = ".//*[@data-id='breadcrumb_86']")
	private WebElement goToTasks;

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
	
}
