package com.vsii.tsc.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vsii.tsc.pages.ProjectGroupPage;
import com.vsii.tsc.pages.ProjectListPage;

public class ProjectListPageMethod {
	 WebDriver driver;
	 
	 public ProjectListPage objProjectGroup = new ProjectListPage();
	 
	//Initialize all web element
		public ProjectListPageMethod(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, objProjectGroup);
		}
	public void clickDepartment(){
		objProjectGroup.getLbDepartement();
		objProjectGroup.getLbDepartement().click();
		
	}	
		
	public String getlbProject1(){
		return objProjectGroup.getLbProject1().getText();	
	}	
		
	public String getlbProject2(){
		return objProjectGroup.getLbProject2().getText();	
	}	
		
	public String getlbProject3(){
		return objProjectGroup.getLbProject3().getText();	
	}	
	
	public String getlbProject4(){
		return objProjectGroup.getLbProject4().getText();	
	}
		
}
