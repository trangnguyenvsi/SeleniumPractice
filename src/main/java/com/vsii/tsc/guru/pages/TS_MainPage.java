package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_MainPage {
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[2]/td/ul/li[5]/a/span")
	private WebElement mnHR;

	@FindBy(xpath="html/body/div[1]/table/tbody/tr[2]/td/ul/li[3]/a/span")
	private WebElement mnHRPMO;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[2]/td/span")
	private WebElement drpdwnMenu;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[2]/td/span/ul/li[5]/a")
	private WebElement btnLogout;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[2]/td/ul/li[3]/a/span")
	private WebElement mnHREmp;
	
	public WebElement getMnHREmp() {
		return mnHREmp;
	}

	public void setMnHREmp(WebElement mnHREmp) {
		this.mnHREmp = mnHREmp;
	}
	
	public WebElement getDrpdwnMenu() {
		return drpdwnMenu;
	}

	public void setDrpdwnMenu(WebElement drpdwnMenu) {
		this.drpdwnMenu = drpdwnMenu;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(WebElement btnLogout) {
		this.btnLogout = btnLogout;
	}

	public WebElement getMnHRPMO() {
		return mnHRPMO;
	}

	public void setMnHRPMO(WebElement mnHRPMO) {
		this.mnHRPMO = mnHRPMO;
	}

	public WebElement getMnHR() {
		return mnHR;
	}

	public void setMnHR(WebElement mnHR) {
		this.mnHR = mnHR;
	}

}
