package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ProjectGroupPage {
	
  @FindBy (xpath ="html/body/div[1]/table/tbody/tr[2]/td/ul/li[2]/a/span")
  private WebElement menuProject;
	
  public WebElement getMenuProject() {
	return menuProject;
}

public void setMenuProject(WebElement menuProject) {
	this.menuProject = menuProject;
}

  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[1]")
  private WebElement lbGroup;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[4]/div")
  private WebElement lbProjectName;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[5]/div")
  private WebElement lbProjectManager;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[6]/div")
  private WebElement Contact;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[7]/div")
  private WebElement lbPlannedTime;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[8]/div")
  private WebElement lbTotalTime;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[9]/div")
  private WebElement lbTimeSpent;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[10]/div")
  private WebElement lbProjectCode;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[11]/div")
  private WebElement lbProgress;
  
  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[12]/div")
  private WebElement lbStatus;
  
  @FindBy (xpath = ".//*[contains(text(),'VSII (5)')]")
  private WebElement lbFirstGroup;
  
  @FindBy (xpath = ".//th[contains(text(),'VSII / TSC')]")
  private WebElement lbSecondGroup;
  
  @FindBy (xpath = ".//th[contains(text(),'VSII / IPC')]")
  private WebElement lbThirdGroup;
  
  @FindBy (xpath = ".//th[contains(text(),'VSII / ITD')]")
  private WebElement lb4thGroup;
  
  @FindBy (xpath = ".//th[contains(text(),'VSII / JPD')]")
  private WebElement lb5thGroup;
  
  @FindBy (xpath = ".//th[contains(text(),'VSII / ICC')]")
  private WebElement lb6thGroup;
  
  @FindBy (xpath = ".//th[contains(text(),'VSII / BSC')]")
  private WebElement lb7thGroup;

public WebElement getLbGroup() {
	return lbGroup;
}

public void setLbGroup(WebElement lbGroup) {
	this.lbGroup = lbGroup;
}

public WebElement getLbProjectName() {
	return lbProjectName;
}

public void setLbProjectName(WebElement lbProjectName) {
	this.lbProjectName = lbProjectName;
}

public WebElement getLbProjectManager() {
	return lbProjectManager;
}

public void setLbProjectManager(WebElement lbProjectManager) {
	this.lbProjectManager = lbProjectManager;
}

public WebElement getContact() {
	return Contact;
}

public void setContact(WebElement contact) {
	Contact = contact;
}

public WebElement getLbPlannedTime() {
	return lbPlannedTime;
}

public void setLbPlannedTime(WebElement lbPlannedTime) {
	this.lbPlannedTime = lbPlannedTime;
}

public WebElement getLbTotalTime() {
	return lbTotalTime;
}

public void setLbTotalTime(WebElement lbTotalTime) {
	this.lbTotalTime = lbTotalTime;
}

public WebElement getLbTimeSpent() {
	return lbTimeSpent;
}

public void setLbTimeSpent(WebElement lbTimeSpent) {
	this.lbTimeSpent = lbTimeSpent;
}

public WebElement getLbProjectCode() {
	return lbProjectCode;
}

public void setLbProjectCode(WebElement lbProjectCode) {
	this.lbProjectCode = lbProjectCode;
}

public WebElement getLbProgress() {
	return lbProgress;
}

public void setLbProgress(WebElement lbProgress) {
	this.lbProgress = lbProgress;
}

public WebElement getLbStatus() {
	return lbStatus;
}

public void setLbStatus(WebElement lbStatus) {
	this.lbStatus = lbStatus;
}

public WebElement getLbFirstGroup() {
	return lbFirstGroup;
}

public void setLbFirstGroup(WebElement lbFirstGroup) {
	this.lbFirstGroup = lbFirstGroup;
}

public WebElement getLbSecondGroup() {
	return lbSecondGroup;
}

public void setLbSecondGroup(WebElement lbSecondGroup) {
	this.lbSecondGroup = lbSecondGroup;
}

public WebElement getLbThirdGroup() {
	return lbThirdGroup;
}

public void setLbThirdGroup(WebElement lbThirdGroup) {
	this.lbThirdGroup = lbThirdGroup;
}

public WebElement getLb4thGroup() {
	return lb4thGroup;
}

public void setLb4thGroup(WebElement lb4thGroup) {
	this.lb4thGroup = lb4thGroup;
}

public WebElement getLb5thGroup() {
	return lb5thGroup;
}

public void setLb5thGroup(WebElement lb5thGroup) {
	this.lb5thGroup = lb5thGroup;
}

public WebElement getLb6thGroup() {
	return lb6thGroup;
}

public void setLb6thGroup(WebElement lb6thGroup) {
	this.lb6thGroup = lb6thGroup;
}

public WebElement getLb7thGroup() {
	return lb7thGroup;
}

public void setLb7thGroup(WebElement lb7thGroup) {
	this.lb7thGroup = lb7thGroup;
}
  
}
