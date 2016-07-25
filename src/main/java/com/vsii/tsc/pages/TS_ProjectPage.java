package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_ProjectPage {
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[3]/ul[1]/li[1]/a/span")
	private WebElement mnProjects;

	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/button[1]")
	private WebElement btnCreate;
	
	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(WebElement btnCreate) {
		this.btnCreate = btnCreate;
	}

	public WebElement getMnProjects() {
		return mnProjects;
	}

	public void setMnProjects(WebElement mnProjects) {
		this.mnProjects = mnProjects;
	}
}
