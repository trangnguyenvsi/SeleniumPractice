package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage {
	@FindBy(xpath = ".//*[@class='oe_menu']/li[3]/a/span")
	private WebElement projectLinktxt;

	@FindBy(xpath = ".//*[@class='oe_group_header'][2]")
	private WebElement department;
	
	@FindBy(xpath = ".//*[@class='ui-sortable']/tr[1]")
	private WebElement project;

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
