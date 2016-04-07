package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.vsii.tsc.guru.pages.DetailTaskPage;

public class DetailTaskPageMethod {
	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public DetailTaskPage objDetailTaskPage = new DetailTaskPage();

	// Initialize all web element
	public DetailTaskPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objDetailTaskPage);
	}

	public void inputSummary(String summaryTxt) throws InterruptedException {
		objDetailTaskPage.getSummaryTxt();
		Thread.sleep(1000);
		objDetailTaskPage.getSummaryTxt().clear();
		objDetailTaskPage.getSummaryTxt().sendKeys(summaryTxt);
		Thread.sleep(1000);
		objDetailTaskPage.getSummaryTxt().sendKeys(Keys.TAB);
	}

	public void inputProjectName(String projectNameDrop) throws InterruptedException {
		Thread.sleep(1000);
		objDetailTaskPage.getProjectNameDrop().clear();
		objDetailTaskPage.getProjectNameDrop().sendKeys(projectNameDrop);
		Thread.sleep(1000);
		objDetailTaskPage.getProjectNameDrop().sendKeys(Keys.TAB);
	}

	public void inputAssignTo(String assignToDrop) throws InterruptedException {
		Thread.sleep(1000);
		objDetailTaskPage.getAssignToDrop().clear();
		objDetailTaskPage.getAssignToDrop().sendKeys(assignToDrop);
		Thread.sleep(1000);
		objDetailTaskPage.getAssignToDrop().sendKeys(Keys.TAB);
	}

	public void inputTaskType(String taskTypeDrop) throws InterruptedException {
		Thread.sleep(1000);
		objDetailTaskPage.getTaskTypeDrop().sendKeys(taskTypeDrop);
		Thread.sleep(1000);
		objDetailTaskPage.getTaskTypeDrop().sendKeys(Keys.TAB);
	}

	public void clickIsBill() {
		objDetailTaskPage.getProjectPhaseDrop().click();
	}

	public void inputProjectPhase(String projectPhaseDrop) throws InterruptedException {
		Thread.sleep(1000);
		objDetailTaskPage.getProjectPhaseDrop().sendKeys(projectPhaseDrop);
		Thread.sleep(1000);
		objDetailTaskPage.getProjectPhaseDrop().sendKeys(Keys.TAB);
	}

	public void inputPlanHour(String planHourTxt) {
		objDetailTaskPage.getPlanHourTxt().sendKeys(planHourTxt);
	}

	public void inputDeadline(String deadlineTxt) throws InterruptedException {
		Thread.sleep(1000);
		objDetailTaskPage.getDeadlineTxt().sendKeys(deadlineTxt);
		Thread.sleep(1000);
		objDetailTaskPage.getDeadlineTxt().sendKeys(Keys.TAB);
	}

	public void inputTagOfProject(String tagOfProjectDrop) throws InterruptedException {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(objDetailTaskPage.getTagOfProjectDrop()).click();
		actions.sendKeys(tagOfProjectDrop).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.TAB);
	}

	public void inputProgress(String progress) {
		objDetailTaskPage.getProgress().sendKeys(progress);
	}

	public void inputDescription(String descriptionTxtA) {
		objDetailTaskPage.getDescriptionTxtA().sendKeys(descriptionTxtA);
	}

	public void inputWorkSummary(String workSummaryTxt) {
		objDetailTaskPage.getWorkSummaryTxt().sendKeys(workSummaryTxt);
	}

	public void inputTimeSpent(String timeSpentTxt) {
		objDetailTaskPage.getTimeSpentTxt().clear();
		objDetailTaskPage.getTimeSpentTxt().sendKeys(timeSpentTxt);
	}

	public void inputDate(String dateTxt) {
		objDetailTaskPage.getDateTxt().clear();
		objDetailTaskPage.getDateTxt().sendKeys(dateTxt);
	}

	public void inputDoneBy(String doneByDrop) throws InterruptedException {
		Thread.sleep(1000);
		objDetailTaskPage.getDoneByDrop().clear();
		objDetailTaskPage.getDoneByDrop().sendKeys(doneByDrop);
		Thread.sleep(1000);
		objDetailTaskPage.getDoneByDrop().sendKeys(Keys.TAB);
	}

	public void inputTagOfWork(String tagOfWorkDrop) throws InterruptedException {
		Thread.sleep(1000);
		objDetailTaskPage.getTagOfWorkDrop().sendKeys(tagOfWorkDrop);
	}

	public void clickAddItemButt() {
		objDetailTaskPage.getAddItemButt().click();
	}

	public void clickSaveButt() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objDetailTaskPage.getSaveButt()).perform();
		objDetailTaskPage.getSaveButt();
		objDetailTaskPage.getSaveButt().click();
	}

	public WebElement getSummaryTxt() {
		return objDetailTaskPage.getSummaryTxt();
	}

	public WebElement getSummaryTit() {
		return objDetailTaskPage.getSummaryTit();
	}

	public WebElement getProjectNameDrop() {
		return objDetailTaskPage.getProjectNameDrop();
	}

	public String getErrMessage1() {
		return objDetailTaskPage.getErrMessage1().getText();
	}

	public String getErrMessage2() {
		return objDetailTaskPage.getErrMessage2().getText();
	}

	public void createTask(String summaryTxt, String projectNameDrop, String assignToDrop, String taskTypeDrop,
			String projectPhaseDrop, String planHourTxt, String deadlineTxt, String tagOfProjectDrop,
			String descriptionTxtA, String workSummaryTxt, String timeSpentTxt, String dateTxt, String doneByDrop,
			String tagOfWorkDrop) throws InterruptedException {
		this.inputSummary(summaryTxt);
		this.inputProjectName(projectNameDrop);
		this.inputAssignTo(assignToDrop);
		this.inputTaskType(taskTypeDrop);
		this.clickIsBill();
		this.inputProjectPhase(projectPhaseDrop);
		this.inputPlanHour(planHourTxt);
		this.inputDeadline(deadlineTxt);
		this.inputTagOfProject(tagOfProjectDrop);
		this.inputDescription(descriptionTxtA);
		this.clickAddItemButt();
		this.inputWorkSummary(workSummaryTxt);
		this.inputTimeSpent(timeSpentTxt);
		this.inputDate(dateTxt);
		this.inputDoneBy(doneByDrop);
		this.inputTagOfWork(tagOfWorkDrop);
		this.clickSaveButt();
	}

	public void editSummaryOfTask(String summaryTxt) throws InterruptedException {
		this.inputSummary(summaryTxt);
		this.clickSaveButt();
	}

	public void goToTasks() {
		objDetailTaskPage.getGoToTasks().click();
	}

	public String getErrMessageUserOutside() {
		return objDetailTaskPage.getErrMessageUserOutside().getText();
	}

	public void clickEditButt() throws InterruptedException {
		objDetailTaskPage.getEditButt().click();
		Thread.sleep(3000);
	}

	public WebElement getEditButt() {
		return objDetailTaskPage.getEditButt();
	}

	public WebElement editButt() {
		return objDetailTaskPage.getEditButt();
	}

	public void clickDiscardButt() {
		objDetailTaskPage.getDiscardButt().click();
	}

	public void setSummaryTxt(String summaryTxt) {
		objDetailTaskPage.getSummaryTxt().sendKeys(summaryTxt);
	}

	public void clickRefuseButt() {
		objDetailTaskPage.getRefuseButt().click();
	}

	public void clickApproveButt() {
		objDetailTaskPage.getApproveButt().click();
	}

	public void clickDeleteButt() {
		objDetailTaskPage.getDeleteButt().click();
	}

	public String getWorkSummaryTit() {
		return objDetailTaskPage.getWorkSummaryTit().getText();
	}

	public String getTimeSpentTit() {
		return objDetailTaskPage.getTimeSpentTit().getText();
	}

	public WebElement isWorkSummaryTitExisted() {
		return objDetailTaskPage.getWorkSummaryTit();
	}

	public WebElement isTimeSpentTitExisted() {
		return objDetailTaskPage.getTimeSpentTit();
	}

	public String getStatus() {
		return objDetailTaskPage.getStatusTit().getText();
	}

	public void clickDoneButt() {
		objDetailTaskPage.getDoneButt().click();
	}

	public void clickCancelTaskButt() {
		objDetailTaskPage.getCancelTaskButt().click();
	}

	public void clickReactiveButt() {
		objDetailTaskPage.getReactiveButt().click();
	}

	public void clickEvaluateButt() {
		objDetailTaskPage.getEvaluateButt().click();
	}

	public void clickApproveWorklogButt() {
		objDetailTaskPage.getApproveWorklogButt().click();
	}

	public void clickMoreButt() {
		objDetailTaskPage.getMoreButt().click();
	}

	public void clickPendingButt() {
		objDetailTaskPage.getPendingButt().click();
	}

	public void clickInProgressButt() {
		objDetailTaskPage.getInProgressButt().click();
	}
	
	public WebElement getEvaluateButt() {
		return objDetailTaskPage.getEvaluateButt();
	}
	
	public void clickCancelButt() {
		objDetailTaskPage.getCancelButt().click();
	}
	
	public void clickApproveAllWorkLogs() {
		objDetailTaskPage.getApproveAllWorkLogs().click();
	}
}
