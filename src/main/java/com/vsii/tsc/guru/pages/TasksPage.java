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
	
	
}
