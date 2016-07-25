package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ISMS_LoginPage {

	@FindBy(name = "login")
    public
	 WebElement Username_txb;


	@FindBy(name = "password")
	public WebElement Password_txb;	


	@FindBy(name = "submit")
	public WebElement Login_btn;
	}

	
