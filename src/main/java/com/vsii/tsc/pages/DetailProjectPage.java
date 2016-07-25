package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailProjectPage {
	
	@FindBy(xpath = ".//*[@class='oe_button oe_form_button']/span[contains(text(),'Tasks')]")
	private WebElement tasksBut;

	public WebElement getTasksBut() {
		return tasksBut;
	}

	public void setTasksBut(WebElement tasksBut) {
		this.tasksBut = tasksBut;
	}
}
