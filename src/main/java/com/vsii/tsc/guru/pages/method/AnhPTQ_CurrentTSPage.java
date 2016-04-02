package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnhPTQ_CurrentTSPage {

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[5]/ul[3]/li[1]/a/span")
	private WebElement mnMyCurTimeSheet;

	@FindBy(className = "oe_timesheet_weekly")
	private WebElement tsTable;

	public WebElement getTsTable() {
		return tsTable;
	}

	public void setTsTable(WebElement tsTable) {
		this.tsTable = tsTable;
	}

	public WebElement getMnMyCurTimeSheet() {
		return mnMyCurTimeSheet;
	}

	public void setMnMyCurTimeSheet(WebElement mnMyCurTimeSheet) {
		this.mnMyCurTimeSheet = mnMyCurTimeSheet;
	}

}
