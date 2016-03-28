package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage {
	@FindBy(xpath = ".//*[@class='oe_menu']/li/a/span[contains(text(),'Project')]")
	private WebElement projectLinktxt;

	@FindBy(xpath = ".//*[@class='oe_group_header'][2]")
	private WebElement department;
	
	@FindBy(xpath = ".//*[@class='ui-sortable']/tr[1]")
	private WebElement project;
	
	// Identify TestProject
	@FindBy(xpath=".//*[@class='ui-sortable']/tr[5]")
	private WebElement testProject;
	

	public WebElement getTestProject() {
		return testProject;
	}

	public void setTestProject(WebElement testProject) {
		this.testProject = testProject;
	}
	
	//Identify Task button on Project details
	@FindBy(xpath="//div/div/div[1]/div/div[2]/button[1]")
	private WebElement btnTasks;
	

	public WebElement getBtnTasks() {
		return btnTasks;
	}

	public void setBtnTasks(WebElement btnTasks) {
		this.btnTasks = btnTasks;
	}

	public WebElement getProjectLinktxt() {
		return projectLinktxt;
	}

	public void setProjectLinktxt(WebElement projectLinktxt) {
		this.projectLinktxt = projectLinktxt;
	}

	public WebElement getDepartment() {
		return department;
	}

	public void setDepartment(WebElement department) {
		this.department = department;
	}

	public WebElement getProject() {
		return project;
	}

	public void setProject(WebElement project) {
		this.project = project;
	}
}
