package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	// Identify Web element username
			@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div[3]/form/ul/li[5]/input")
			private WebElement userNametxt;

			// Identify Web element password
			//@FindBy(name = "password")
			@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div[3]/form/ul/li[7]/input")
			private WebElement passwordtxt;

			
			@FindBy(xpath ="/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div[3]/div[1]/img[@src='/web/static/src/img/logo2.png']")
			private WebElement pageTitle;
			
//			// Identify Web element title text
//			@FindBy(className = "barone")
//			private WebElement webTitleText;
//
//			// Identify Reset button
//			@FindBy(name = "btnReset")
//			private WebElement webReset;

			
			// Identify Submit button
			//@FindBy(name = "btnLogin")
			@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div[3]/form/div/select")
			private WebElement db;
			
			// Identify Submit button
			//@FindBy(name = "btnLogin")
			@FindBy(xpath = ".//*[@name='submit']")
			private WebElement loginbutt;

			// Identify UserID Alert
			@FindBy(id = "message23")
			private WebElement webAlertUserID;

			// Identify Password Alert
			@FindBy(id = "message18")
			private WebElement webAlertPassword;
			
			// Identify Manger ID
			@FindBy(xpath="html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
			private WebElement managerID;

//			public WebElement getManagerID() {
//				return managerID;
//			}
//
//			public void setManagerID(WebElement managerID) {
//				this.managerID = managerID;
//			}

//			public WebElement getWebUsername() {
//				return userNametxt;
//			}

			
			public WebElement getUserNametxt() {
				return userNametxt;
			}

			public void setUserNametxt(WebElement userNametxt) {
				this.userNametxt = userNametxt;
			}

			public WebElement getPasswordtxt() {
				return passwordtxt;
			}

			public void setPasswordtxt(WebElement passwordtxt) {
				this.passwordtxt = passwordtxt;
			}

			public WebElement getDb() {
				return db;
			}

			public void setDb(WebElement db) {
				this.db = db;
			}

			public WebElement getLoginbutt() {
				return loginbutt;
			}

			public void setLoginbutt(WebElement loginbutt) {
				this.loginbutt = loginbutt;
			}

			public WebElement getPageTitle() {
				return pageTitle;
			}

			public void setPageTitle(WebElement pageTitle) {
				this.pageTitle = pageTitle;
			}

//			public WebElement getWebTitleText() {
//				return webTitleText;
//			}
//
//			public void setWebTitleText(WebElement webTitleText) {
//				this.webTitleText = webTitleText;
//			}
//
//			public WebElement getWebReset() {
//				return webReset;
//			}
//
//			public void setWebReset(WebElement webReset) {
//				this.webReset = webReset;
//			}

//			public WebElement getWebLogin() {
//				return loginbutt;
//			}

//			public void setWebLogin(WebElement loginbutt) {
//				this.loginbutt = loginbutt;
//			}

//			public WebElement getWebAlertUserID() {
//				return webAlertUserID;
//			}
//
//			public void setWebAlertUserID(WebElement webAlertUserID) {
//				this.webAlertUserID = webAlertUserID;
//			}
//
//			public WebElement getWebAlertPassword() {
//				return webAlertPassword;
//			}
//
//			public void setWebAlertPassword(WebElement webAlertPassword) {
//				this.webAlertPassword = webAlertPassword;
//			}
//			
//			@FindBy(linkText="Log out")
//			private WebElement webLogOut;
//
//			public WebElement getWebLogOut() {
//				return webLogOut;
//			}
//
//			public void setWebLogOut(WebElement webLogOut) {
//				this.webLogOut = webLogOut;
//			}
}
