package com.vsii.tsc.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vsii.tsc.pages.ProjectGroupPage;

public class ProjectGroupPageMethod {
 WebDriver driver;
 
 public ProjectGroupPage objProjectGroup = new ProjectGroupPage();
 
//Initialize all web element
	public ProjectGroupPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objProjectGroup);
	}
	public void clickProjectMenu (){
		objProjectGroup.getMenuProject();
		objProjectGroup.getMenuProject().click();		
	}
 public String getGrouplb (){
	 return objProjectGroup.getLbGroup().getText();
 }
 public String getProjectName (){
	 return objProjectGroup.getLbProjectName().getText();
 }
 public String getProjectManager (){
	 return objProjectGroup.getLbProjectManager().getText();
 }
 public String getContact (){
	 return objProjectGroup.getContact().getText();
 }
 public String getPlannedTime (){
	 return objProjectGroup.getLbPlannedTime().getText();
 }
 public String getTotalTime (){
	 return objProjectGroup.getLbTotalTime().getText();
 }
 
 public String getSpendTime (){
	 return objProjectGroup.getLbTimeSpent().getText();
 }
 public String getProjectCode (){
	 return objProjectGroup.getLbProjectCode().getText();
 }
 
 public String getProgress (){
	 return objProjectGroup.getLbProgress().getText();
 }
 public String getStatus (){
	 return objProjectGroup.getLbStatus().getText();
 }
 
 public WebElement getLbGroup() {
		return objProjectGroup.getLbGroup();
	}
}

