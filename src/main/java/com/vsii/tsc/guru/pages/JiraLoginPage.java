package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraLoginPage {
	
	// Identify Web element username
	@FindBy(name = "os_username")
	private WebElement webUsername;
	
	// Identify Web element password
	@FindBy(name = "os_password")
	private WebElement webPassword;
	
	//Identify Web element remember login
	@FindBy(name = "os_cookie")
	private WebElement webRemember;
	
	// Identify WebElement login button
	@FindBy(name = "login")
	private WebElement webLogin;

	public WebElement getWebUsername() {
		return webUsername;
	}
	public void setWebUsername(WebElement webUsername) {
		this.webUsername = webUsername;
	}

	public WebElement getWebPassword() {
		return webPassword;
	}
	public void setWebPassword(WebElement webPassword) {
		this.webPassword = webPassword;
	}

	public WebElement getWebRemember() {
		return webRemember;
	}
	public void setWebRemember(WebElement webRemember) {
		this.webRemember = webRemember;
	}

	public WebElement getWebLogin() {
		return webLogin;
	}
	public void setWebLogin(WebElement webLogin) {
		this.webLogin = webLogin;
	}
}
