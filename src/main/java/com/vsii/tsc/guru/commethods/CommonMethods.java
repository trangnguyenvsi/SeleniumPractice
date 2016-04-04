package com.vsii.tsc.guru.commethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vsii.tsc.guru.pages.method.JiraLoginPageMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class CommonMethods {
  
	//Check login to OpenERP or not
	public static void checkLogin(){
		LoginPageMethod objLogin;
		objLogin = new LoginPageMethod(TestBase.driver);
		if(TestBase.driver.findElements(By.name("uid")).size()!=0){
			objLogin.loginToManagerPage("lienlt", "12345678");
		}
	}
	
	public static void waitUntil(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public static void waitUntilElementLocated(String elementLocated) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementLocated)));
	}
	
	/*
	*
	*	quyentx Jira common methods
	*
	*/
	
	//Check login to Jira
	public static void checkJiraLoginAdmin(){
		JiraLoginPageMethod objJiraLogin;
		objJiraLogin = new JiraLoginPageMethod(TestBase.driver);
		if(TestBase.driver.findElements(By.name("os_username")).size()!=0){
			objJiraLogin.Login("admin", "123456@a");
		}
	}
	
	// Login to Jira as member
	public static void loginToJiraMember(){
		JiraLoginPageMethod objJiraLogin;
		objJiraLogin = new JiraLoginPageMethod(TestBase.driver);
		if(TestBase.driver.findElements(By.name("os_username")).size()!=0){
			objJiraLogin.Login("quyentx", "fqevqt272");
		}
	}
	
	// Click on Jira home
	public static void clickJiraHome(){
		TestBase.driver.findElement(By.id("home_link")).click();
	}
}
