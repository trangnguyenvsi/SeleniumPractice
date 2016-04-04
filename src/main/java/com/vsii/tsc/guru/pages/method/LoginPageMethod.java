package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.guru.pages.LoginPage;

public class LoginPageMethod {	
		WebDriver driver;
		LoginPage objLogin = new LoginPage();
		
		public LoginPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objLogin);
		}
		
		// Choose DB Demo
//		public void chooseDB(String txtUsername) {
//			objLogin.getDb().;
//			log.debug("Set DB Demo");
//		}
		
		// Enter username in UserID textbox
		public void enterUserID(String txtUsername) {
			objLogin.getUserNametxt().sendKeys(txtUsername);
		}
		
		// Enter password in password textbox
		public void enterPassword(String txtPass) {
			objLogin.getPasswordtxt().sendKeys(txtPass);
		}
		
		// Click login button
		public void clickLogin() {
			objLogin.getLoginbutt().click();
		}
		
//		 Get the title of Login page
//		public String getLoginTitle() {
////			log.debug("Get web title text");
//			return objLogin.getWebTitleText().getText();
//		}
		
		// Log in manager page
		public void loginToManagerPage(String username, String password) {
			objLogin.getUserNametxt().sendKeys(username);
			objLogin.getPasswordtxt().sendKeys(password);
			objLogin.getLoginbutt().click();
		}

		// Get Manager ID in Manager page
//		public String getManagerIDInManagerPage() {
////			log.debug("Get Manager ID in manager page");
//			return objLogin.getManagerID().getText();
//		}
		
}

