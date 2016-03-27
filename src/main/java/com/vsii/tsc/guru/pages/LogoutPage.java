package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	@FindBy(xpath = ".//*[@class='oe_topbar_name']")
	private WebElement userNametxt;

	@FindBy(xpath = ".//*[@data-menu='logout']")
	private WebElement logoutButt;

	public WebElement getUserNametxt() {
		return userNametxt;
	}

	public WebElement getLogoutButt() {
		return logoutButt;
	}

}
