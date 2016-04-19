package com.vsii.tsc.guru.commethods;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	
	//Check column should not contain duplicate value
	public static boolean colShouldNotDuplicated (WebElement column) {
		boolean isNotDuplicate = true;
		List<WebElement> columns = column.findElements(By.tagName("td"));
		for (int rowNum = 0; rowNum < columns.size()-1; rowNum++) {
			for (int i = 0; i < (columns.size() - rowNum); i++) {
				if(columns.get(rowNum).getText() == columns.get(i).getText()) {
					isNotDuplicate = false;
					break;
				}
			}
		}
		return isNotDuplicate;
	}
	
	//Check column should not contain blank value
	public static boolean colShouldNotBlank (WebElement column) {
		boolean isNotBlank = true;
		List<WebElement> columns = column.findElements(By.tagName("td"));
		for (int rowNum = 0; rowNum < columns.size(); rowNum++) {
			if(columns.get(rowNum).getText().trim().isEmpty()) {
				isNotBlank = false;
			}
		}
		return isNotBlank;
	}
	
	//Accept alert
	public static void acceptPopup () {
		Alert alert = TestBase.driver.switchTo().alert();
		alert.accept();
	}
	
	//Cancel alert
	public static void cancelPopup () {
		Alert alert = TestBase.driver.switchTo().alert();
		alert.dismiss();
	}
	
	//Get alert message
	public static String getAlertMessage () {
		Alert alert = TestBase.driver.switchTo().alert();
		return alert.getText();
	}
	
	//Select option in select box by contains value
	public static void selectOptionByContains(String text, Select selectBox, List<WebElement> optionsInnerText) {
		for(WebElement option: optionsInnerText){
			String textContent = option.getText();
			if(textContent.toLowerCase().contains(text.toLowerCase())) {
				selectBox.selectByVisibleText(textContent);
			}
		}
	}
}