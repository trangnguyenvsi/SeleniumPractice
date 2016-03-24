package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiuTTM_LoginPage {

	@FindBy(name = "login")
    public
	 WebElement Username_txb;


	@FindBy(name = "password")
	public WebElement Password_txb;	


	@FindBy(name = "submit")
	public WebElement Login_btn;
	}

	
